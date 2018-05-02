package es.uniovi.asw.e3b.agents;

import es.uniovi.asw.e3b.agents.web_service.request.PeticionInfoREST;
import es.uniovi.asw.e3b.agents.web_service.responses.RespuestaAuthREST;
import es.uniovi.asw.e3b.agents.web_service.responses.RespuestaInfoREST;
import org.springframework.http.ResponseEntity;

public interface GetAgentInfo {

	public ResponseEntity<RespuestaInfoREST> getPOSTpetition(PeticionInfoREST peticion);

	public ResponseEntity<RespuestaAuthREST> autenticarAgente(PeticionInfoREST peticionAutenticarAgente);

}
