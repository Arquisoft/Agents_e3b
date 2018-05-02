package test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import es.uniovi.asw.e3b.Application;
import es.uniovi.asw.e3b.db_management.GetAgent;
import es.uniovi.asw.e3b.db_management.model.Agent;
import es.uniovi.asw.e3b.agents.util.Utilidades;
import es.uniovi.asw.e3b.agents.web_service.request.PeticionChangeEmailREST;
import es.uniovi.asw.e3b.agents.web_service.request.PeticionChangePasswordREST;
import es.uniovi.asw.e3b.agents.web_service.request.PeticionInfoREST;


public class MainTest {

	@Test
	public void testAssert() {
		new Assert();
		assertThat(Assert.isEmailEmpty("notEmpty"), equalTo(false));
		assertThat(Assert.isPasswordEmpty("notEmpty"), equalTo(false));
		assertThat(Assert.isEmailValid("user@domain.org"), equalTo(true));
		assertThat(Assert.isAgentNull(new Agent("nombre","password","location","email","ident","kind")), equalTo(false));
		assertThat(Assert.isEmailEmpty("email"), equalTo(false));
		assertThat(Assert.isSameEmail("email", "otherEmail"), equalTo(true));
		assertThat(Assert.isSamePassword("password", "otherPassword"), equalTo(true));
	}
}
