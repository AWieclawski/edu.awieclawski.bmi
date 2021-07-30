package edu.awieclawski.bmi.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;

@Controller // landing page for results
public class ConfirmationController {

	@RequestMapping(value = "/displayman", method = RequestMethod.GET)
	public String showMan(Model model, @SessionAttribute("sessionperson") Man manReceived) {
		if (manReceived != null) {
			model.addAttribute("age", manReceived.getAge());
			model.addAttribute("hght", manReceived.getHeight());
			model.addAttribute("wght", manReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		// TODO Calculate BMI & ResultsView
		return "/confirmview";
	}

	@RequestMapping(value = "/confirmman", method = RequestMethod.POST, params = "submit")
	public String submitMan(@SessionAttribute("sessionperson") Man manReceived, Model model) {
		if (manReceived != null) {
			System.out.println("manReceived=" + manReceived.toString());
		} else {
			System.out.println("No manReceived=" + manReceived);
		}
		return "redirect:/manresult";
	}

	@RequestMapping(value = "/displaywoman", method = RequestMethod.GET)
	public String showWoman(Model model, @SessionAttribute("sessionperson") Woman womanReceived) {
		if (womanReceived != null) {
			model.addAttribute("age", womanReceived.getAge());
			model.addAttribute("hght", womanReceived.getHeight());
			model.addAttribute("wght", womanReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		// TODO Calculate BMI & ResultsView
		return "/confirmview";
	}

	@RequestMapping(value = "/confirmwoman", method = RequestMethod.POST, params = "submit")
	public String submitWoman(@SessionAttribute("sessionperson") Woman womanReceived, Model model) {
		if (womanReceived != null) {
			System.out.println("womanReceived=" + womanReceived.toString());
		} else {
			System.out.println("No womanReceived=" + womanReceived);
		}
		return "redirect:/womanresult";
	}
}
