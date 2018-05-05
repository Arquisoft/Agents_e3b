package es.uniovi.asw.e3b.agents_e3b.agents;

import org.springframework.http.ResponseEntity;

import es.uniovi.asw.e3b.agents_e3b.agents.web_service.request.PeticionChangeEmailREST;
import es.uniovi.asw.e3b.agents_e3b.agents.web_service.request.PeticionChangePasswordREST;
import es.uniovi.asw.e3b.agents_e3b.agents.web_service.responses.RespuestaChangeInfoREST;

public interface ChangeInfo {
	/**
	 * Cambio de contraseña
	 *
	 * @param datos requeridos (email, password, newPassword)
	 * @return 
	 */
	public ResponseEntity<RespuestaChangeInfoREST> changePassword(PeticionChangePasswordREST datos);

	/**
	 * Cambio de email
	 * 
	 * @param datos requeridos (email, password, newEmail)
	 * @return respuesta en xml o json
	 */
	public ResponseEntity<RespuestaChangeInfoREST> changeEmail(PeticionChangeEmailREST datos);
}
