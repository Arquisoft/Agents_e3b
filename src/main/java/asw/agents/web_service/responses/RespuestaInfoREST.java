package asw.agents.web_service.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import asw.db_management.model.Agent;
import asw.agents.util.Utilidades;

@XmlRootElement(name = "agent")
public class RespuestaInfoREST {	
	
	private String firstName;
	private String lastName;
	private int edad;
	private String ID;
	private String email;
	
	public RespuestaInfoREST() {}
	
	public RespuestaInfoREST(Agent agent){
		setFirstName(agent.getNombre());
		setLastName(agent.getApellidos());
		setEdad(Utilidades.getEdad(agent.getFechaNacimiento()));
		setID(agent.getDNI());
		setEmail(agent.getEmail());
	}

	public String getFirstName() {
		return firstName;
	}

	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEdad() {
		return edad;
	}

	@XmlElement
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getID() {
		return ID;
	}

	@XmlElement
	public void setID(String iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

}
