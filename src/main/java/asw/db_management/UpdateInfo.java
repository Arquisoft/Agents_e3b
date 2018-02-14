package asw.db_management;

import asw.db_management.model.Participant;

public interface UpdateInfo {
	/**
	 * Permite la solicitud de cambio de contraseña
	 */
	public void updatePassword(Participant participant, String password, String newPassword);
	
	public void updateEmail(Participant participant, String email);
}
