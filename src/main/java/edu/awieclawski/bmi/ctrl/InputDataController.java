package edu.awieclawski.bmi.ctrl;

import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import edu.awieclawski.bmi.base.I_Human;
import edu.awieclawski.bmi.dctr.Comments;
import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;
import edu.awieclawski.bmi.sppt.BigDecimalEditor;
import edu.awieclawski.bmi.tbl.I_Man;
import edu.awieclawski.bmi.tbl.I_Woman;


@Controller
@SessionAttributes({ "sessionperson", "ismale", "head" }) // Woman or Man instance
public class InputDataController {

	@RequestMapping(value = "/man", method = RequestMethod.GET)
	public ModelAndView showMan(Model model) {
		model.addAttribute("ismale", I_Man.IS_MAN);
		model.addAttribute("head", I_Man.SEX);
		return new ModelAndView("/upform", "man", new Man());
	}

	@RequestMapping(value = "/upman", method = RequestMethod.POST, params = "submit")
	public String submitMan(@Valid @ModelAttribute("man") final Man man, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "/upform";
		}
		model.addAttribute("sessionperson", man);
		return "redirect:/displayman";
	}

	@RequestMapping(value = "/upman", method = RequestMethod.POST, params = "reset")
	public String cancelMan(Model model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		// sets all values to minimum ones
		model.addAttribute("man", new Man(I_Human.AGE_MIN, I_Human.WGHT_MIN, I_Human.HGHT_MIN));
		return "/upform";
	}

	@RequestMapping(value = "/woman", method = RequestMethod.GET)
	public ModelAndView showWoman(Model model) {
		model.addAttribute("ismale", I_Woman.IS_MAN);
		model.addAttribute("head", I_Woman.SEX);
		return new ModelAndView("/upform", "woman", new Woman());
	}

	@RequestMapping(value = "/upwoman", method = RequestMethod.POST, params = "submit")
	public String submitWoman(@Valid @ModelAttribute("woman") final Woman woman, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "/upform";
		}
		model.addAttribute("sessionperson", woman);
		return "redirect:/displaywoman";
	}

	@RequestMapping(value = "/upwoman", method = RequestMethod.POST, params = "reset")
	public String cancelWoman(Model model) {
		model.addAttribute("message", Comments.CANCEL.getDescription());
		// sets all values to minimum ones
		model.addAttribute("woman", new Woman(I_Human.AGE_MIN, I_Human.WGHT_MIN, I_Human.HGHT_MIN));
		return "/upform";
	}
	

	/**
	 * Enables dedicated control before data conversion to BigDecimal format
	 * 
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(BigDecimal.class, new BigDecimalEditor());
	}

}
