package edu.awieclawski.bmi.ctrl;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.awieclawski.bmi.dctr.Comments;
import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;

@Controller
@SessionAttributes("sessionperson") // Woman or Man instance
public class InputDataController {

	@RequestMapping(value = "/man", method = RequestMethod.GET)
	public ModelAndView showMan(Model model) {
		model.addAttribute("ismale", true);
		return new ModelAndView("/upform", "man", new Man());
	}

	@RequestMapping(value = "/upman", method = RequestMethod.POST, params = "submit")
	public String submitMan(@Valid @ModelAttribute("man") final Man man, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			model.addAttribute("ismale", true); // very important to correct handle form partials
			return "/upform";
		}
		model.addAttribute("sessionperson", man);
		return "redirect:/confirmman";
	}

	@RequestMapping(value = "/upman", method = RequestMethod.POST, params = "cancel")
	public String cancelMan(@Valid @ModelAttribute("man") final Man man, BindingResult result, ModelMap model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		model.addAttribute("ismale", true);
		return "/upform";
	}

	@RequestMapping(value = "/woman", method = RequestMethod.GET)
	public ModelAndView showWoman(Model model) {
		model.addAttribute("ismale", false);
		return new ModelAndView("/upform", "woman", new Woman());
	}

	@RequestMapping(value = "/upwoman", method = RequestMethod.POST, params = "submit")
	public String submitWoman(@Valid @ModelAttribute("woman") final Woman woman, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			model.addAttribute("ismale", false); // very important to correct handle form partials
			return "/upform";
		}
		model.addAttribute("sessionperson", woman);
		return "redirect:/confirmwoman";
	}

	@RequestMapping(value = "/upwoman", method = RequestMethod.POST, params = "cancel")
	public String cancelWoman(@Valid @ModelAttribute("woman") final Woman woman, BindingResult result, ModelMap model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		model.addAttribute("ismale", false); 
		return "/upform";
	}
	
}
