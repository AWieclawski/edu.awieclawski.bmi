package edu.awieclawski.bmi.ctrl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.awieclawski.bmi.base.I_Human;
import edu.awieclawski.bmi.dctr.Comments;
import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;

@Controller // data presentation
@SessionAttributes("sessionresult") // person result
public class ConfirmationController {

	private final static Logger LOGGER = Logger.getLogger(ConfirmationController.class.getName());

// man	

	@RequestMapping(value = "/displayman", method = RequestMethod.GET)
	public String showMan(Model model, @SessionAttribute("sessionperson") Man manReceived) {
		if (manReceived != null) {
			model.addAttribute("age", manReceived.getAge());
			model.addAttribute("hght", manReceived.getHeight());
			model.addAttribute("wght", manReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		return "/confirmview";
	}

	@RequestMapping(value = "/confirmman", method = RequestMethod.POST, params = "confirm")
	public String submitMan(@SessionAttribute("sessionperson") Man manReceived, Model model) {
		if (manReceived != null) {
			model.addAttribute("sessionresult", manReceived.getCommentBMI());
		} else {
			LOGGER.log(Level.SEVERE, " -- No manReceived=" + manReceived);
		}
		return "redirect:/displayresult";
	}

	@RequestMapping(value = "/confirmman", method = RequestMethod.POST, params = "cancel")
	public String cancelMan(Model model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		// sets all values to minimum ones
		model.addAttribute("man", new Man(I_Human.AGE_MIN, I_Human.WGHT_MIN, I_Human.HGHT_MIN));
		return "/upform";
	}

// woman

	@RequestMapping(value = "/displaywoman", method = RequestMethod.GET)
	public String showWoman(Model model, @SessionAttribute("sessionperson") Woman womanReceived) {
		if (womanReceived != null) {
			model.addAttribute("age", womanReceived.getAge());
			model.addAttribute("hght", womanReceived.getHeight());
			model.addAttribute("wght", womanReceived.getWeight());
		} else {
			return "redirect:/home";
		}
		return "/confirmview";
	}

	@RequestMapping(value = "/confirmwoman", method = RequestMethod.POST, params = "confirm")
	public String submitWoman(@SessionAttribute("sessionperson") Woman womanReceived, Model model) {
		if (womanReceived != null) {
			model.addAttribute("sessionresult", womanReceived.getCommentBMI());
		} else {
			LOGGER.log(Level.SEVERE, " -- No womanReceived=" + womanReceived);
		}
		return "redirect:/displayresult";
	}

	@RequestMapping(value = "/confirmwoman", method = RequestMethod.POST, params = "cancel")
	public String cancelWoman(Model model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		// sets all values to minimum ones
		model.addAttribute("woman", new Woman(I_Human.AGE_MIN, I_Human.WGHT_MIN, I_Human.HGHT_MIN));
		return "/upform";
	}
}
