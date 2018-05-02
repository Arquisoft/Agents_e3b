package es.uniovi.asw.e3b.agents.web_service.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RepuestaAuthREST")
public class RespuestaAuthREST {

	private String mensaje;

	public RespuestaAuthREST() {}

	public RespuestaAuthREST(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
