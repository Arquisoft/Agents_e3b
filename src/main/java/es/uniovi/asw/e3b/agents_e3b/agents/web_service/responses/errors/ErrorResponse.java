package es.uniovi.asw.e3b.agents_e3b.agents.web_service.responses.errors;

public abstract class ErrorResponse extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public abstract String getMessageJSONFormat();

	public abstract String getMessageStringFormat();

}
