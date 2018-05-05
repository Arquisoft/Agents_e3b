package es.uniovi.asw.e3b.agents_e3b.db_management;

import es.uniovi.asw.e3b.agents_e3b.db_management.model.Agent;

public interface UpdateInfo {
	/**
	 * Permite la solicitud de cambio de contraseña
	 */
	public void updatePassword(Agent agent, String password, String newPassword);
	
	public void updateEmail(Agent agent, String email);
}
