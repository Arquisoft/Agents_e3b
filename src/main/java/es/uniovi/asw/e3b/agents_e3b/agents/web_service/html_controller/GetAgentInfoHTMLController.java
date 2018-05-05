package es.uniovi.asw.e3b.agents_e3b.agents.web_service.html_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import es.uniovi.asw.e3b.agents_e3b.agents.util.Assert;
import es.uniovi.asw.e3b.agents_e3b.agents.web_service.responses.errors.ErrorResponse;
import es.uniovi.asw.e3b.agents_e3b.db_management.GetAgent;
import es.uniovi.asw.e3b.agents_e3b.db_management.model.Agent;

import javax.servlet.http.HttpSession;

@Controller
public class GetAgentInfoHTMLController {

	@Autowired
	private GetAgent getAgent;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicalicerLogin(Model model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getLogin(HttpSession session, @RequestParam String email, @RequestParam String password,
			Model model) {

		Assert.isEmailEmpty(email);
		Assert.isEmailValid(email);
		Assert.isPasswordEmpty(password);

		Agent agent = getAgent.getAgent(email);

		Assert.isAgentNull(agent);
		Assert.isPasswordCorrect(password, agent);

		session.setAttribute("agent", agent);

		return "datosAgent";

	}

	@ExceptionHandler(ErrorResponse.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String handleErrorResponseNotFound(ErrorResponse excep, Model model) {
		model.addAttribute("error", excep.getMessageStringFormat());

		return "error";
	}
}
