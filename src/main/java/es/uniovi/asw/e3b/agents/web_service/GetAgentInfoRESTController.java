package es.uniovi.asw.e3b.agents.web_service;

import es.uniovi.asw.e3b.agents.GetAgentInfo;
import es.uniovi.asw.e3b.agents.util.Assert;
import es.uniovi.asw.e3b.agents.web_service.request.PeticionInfoREST;
import es.uniovi.asw.e3b.agents.web_service.responses.RespuestaAuthREST;
import es.uniovi.asw.e3b.agents.web_service.responses.RespuestaInfoREST;
import es.uniovi.asw.e3b.agents.web_service.responses.errors.ErrorResponse;
import es.uniovi.asw.e3b.db_management.GetAgent;
import es.uniovi.asw.e3b.db_management.model.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GetAgentInfoRESTController implements GetAgentInfo {

	@Autowired
	private GetAgent getAgent;

	@Override
	@RequestMapping(value = "/user", method = RequestMethod.POST, headers = { "Accept=application/json",
			"Accept=application/xml" }, produces = { "application/json", "text/xml" })
	public ResponseEntity<RespuestaInfoREST> getPOSTpetition(@RequestBody(required = true) PeticionInfoREST peticion) {

		Assert.isEmailEmpty(peticion.getLogin());
		Assert.isEmailValid(peticion.getLogin());
		Assert.isPasswordEmpty(peticion.getPassword());

		Agent agent = getAgent.getAgent(peticion.getLogin());

		Assert.isAgentNull(agent);

		Assert.isLoginCorrect(peticion.getPassword(), agent, peticion.getKind()); // comprueba password y kind


		/*
		 * Añadimos la información al modelo, para que se muestre en la pagina
		 * html: datosParticipant
		 */

		return new ResponseEntity<RespuestaInfoREST>(new RespuestaInfoREST(agent), HttpStatus.OK);
	}

	/**
	 * Compruebo que se introducen correctamente los datos del agente a comprobar.
	 * @param peticionAutenticarAgente
	 * @return
	 */
	@Override
	@RequestMapping(value = "/auth", method = RequestMethod.POST, headers = { "Accept=application/json"},  produces = { "application/json"} )
	public ResponseEntity <RespuestaAuthREST> autenticarAgente(@RequestBody(required = true) PeticionInfoREST peticionAutenticarAgente) {
		if(!Assert.isEmailEmpty(peticionAutenticarAgente.getLogin()) &&
				Assert.isEmailValid(peticionAutenticarAgente.getLogin()) &&
				!Assert.isPasswordEmpty(peticionAutenticarAgente.getPassword()) &&
				!peticionAutenticarAgente.getKind().isEmpty()
				){
			Agent agent = getAgent.getAgent(peticionAutenticarAgente.getLogin());

			if(!Assert.isAgentNull(agent) && Assert.isLoginCorrect(peticionAutenticarAgente.getPassword(), agent, peticionAutenticarAgente.getKind())){
				return new ResponseEntity <RespuestaAuthREST>(new RespuestaAuthREST("correct login"), HttpStatus.OK);
			}
		}

		return new ResponseEntity <RespuestaAuthREST>(new RespuestaAuthREST("incorrect login"), HttpStatus.OK);
	}

	@ExceptionHandler(ErrorResponse.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String handleErrorResponses(ErrorResponse error) {
		return error.getMessageJSONFormat();
	}
}
