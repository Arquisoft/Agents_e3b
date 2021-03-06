package es.uniovi.asw.e3b.agents_e3b.agents.util;

import es.uniovi.asw.e3b.agents_e3b.agents.factory.ErrorFactory;
import es.uniovi.asw.e3b.agents_e3b.agents.factory.ErrorFactory.Errors;
import es.uniovi.asw.e3b.agents_e3b.db_management.model.Agent;

public class Assert {

	/**
	 * 
	 * @param email
	 * @return excepcion si esta vacio
	 */
	public static boolean isEmailEmpty(String email) {
		if(email.trim().isEmpty())
			throw ErrorFactory.getError(Errors.REQUIRED_EMAIL);
		else
			return false;
	}
	
	public static boolean isPasswordEmpty(String password) {
		if(password.trim().isEmpty())
			throw ErrorFactory.getError(Errors.REQUIRED_PASSWORD);
		else
			return false;
	}

	/**
	 * Comprobacion de si el correo es valido
	 * @param email
	 * @return true si es valido.
	 */
	public static boolean isEmailValid(String email) {
		String[] mailSplit = email.split("@");
		if (mailSplit.length != 2) {
			throw ErrorFactory.getError(Errors.WRONG_EMAIL_STYLE);
		}
		mailSplit = email.split("\\.");
		if (mailSplit.length != 2 || mailSplit[0].length() == 0 || mailSplit[1].length() == 0) {
			throw ErrorFactory.getError(Errors.WRONG_EMAIL_STYLE);
		}
		return true;
	}
	
	/**
	 * 
	 * @param agent
	 * @return devuelve false si no es null o excepcion
	 */
	public static boolean isAgentNull(Agent agent){
		if (agent == null) {
			throw ErrorFactory.getError(Errors.USER_NOT_FOUND);
		}
		return false;		
	}
	
	public static boolean isPasswordCorrect(String password,Agent agent){
		if (!password.equals(agent.getPassword())) {
			throw ErrorFactory.getError(Errors.INCORRECT_PASSWORD_DO_NOT_MATCH);
		}
		return true;
	}
	
	public static boolean isSamePassword(String password, String password2){
		if (password.equals(password2)) {
			throw ErrorFactory.getError(Errors.INCORRECT_PASSWORD);
		}
		return true;
	}

	public static boolean isSameEmail(String email, String email2){
		if (email.equals(email2)) {
			throw ErrorFactory.getError(Errors.SAME_EMAIL);
		}
		return true;
	}


	public static boolean isLoginCorrect(String password, Agent agent, String kind) {
		if (!password.equals(agent.getPassword())) {
			throw ErrorFactory.getError(Errors.INCORRECT_PASSWORD_DO_NOT_MATCH);
		}
		if(!agent.getKind().equals(kind)){
			throw ErrorFactory.getError(Errors.INCORRECT_KIND_DO_NOT_MATCH);
		}
		return true;
	}
}
