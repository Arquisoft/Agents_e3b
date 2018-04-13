package asw.db_management;

import asw.db_management.model.Agent;

public interface GetAgent {
	/**
	 * Permite la solicitud la de información para el usuario.
	 */
	public Agent getAgentEmail(String email);
	
	
	/**
	 * Permite la solicitud la de información para el usuario.
	 */
	public Agent getAgentIdent(String ident);
	
	
}
