package edu.awieclawski.bmi.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;

@Controller // landing page for results
public class ResultController {

	@RequestMapping(value = "/manresult", method = RequestMethod.GET)
	public String showMan(Model model, @SessionAttribute("sessionperson") Man manReceived) {
		if (manReceived != null) {
			model.addAttribute("age", manReceived.getAge());
			model.addAttribute("hght", manReceived.getHeight());
			model.addAttribute("wght", manReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		// TODO Calculate BMI & ResultsView
		return "/personresult";
	}

	@RequestMapping(value = "/womanresult", method = RequestMethod.GET)
	public String showWoman(Model model, @SessionAttribute("sessionperson") Woman womanReceived) {
		if (womanReceived != null) {
			model.addAttribute("age", womanReceived.getAge());
			model.addAttribute("hght", womanReceived.getHeight());
			model.addAttribute("wght", womanReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		// TODO Calculate BMI & ResultsView
		return "/personresult";
	}

}
