package edu.awieclawski.bmi.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller // landing page for results
public class ResultController {

	@RequestMapping(value = "/displayresult", method = RequestMethod.GET)
	public String showResult(Model model, @SessionAttribute("sessionresult") final String resultReceived) {
		if (resultReceived != null) {
			model.addAttribute("resultreceived", resultReceived);
		} else {
			return "redirect:/home";
		}
		return "/personresult";
	}

}
