package edu.awieclawski.bmi.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import edu.awieclawski.bmi.dctr.I_UOMs;
import edu.awieclawski.bmi.prsn.Man;
import edu.awieclawski.bmi.prsn.Woman;
import edu.awieclawski.bmi.tbl.I_Man;
import edu.awieclawski.bmi.tbl.I_Woman;

@Controller // landing page for results
public class ConfirmController {

	@RequestMapping(value = "/confirmman", method = RequestMethod.GET)
	public String showMan(Model model,@SessionAttribute("sessionperson") Man manReceived) {
        model.addAttribute("age", manReceived.getAge());
        model.addAttribute("height", manReceived.getHeight());
        model.addAttribute("weight", manReceived.getWeight());
        model.addAttribute("agemtr", I_UOMs.MTR_AGE);
        model.addAttribute("heightmtr", I_UOMs.MTR_HGHT);
        model.addAttribute("weightmtr", I_UOMs.MTR_WGHT);
        model.addAttribute("sex", I_Man.SEX);
		// TODO Calculate BMI & ResultsView
		return "/confirmview";
	}
	
	@RequestMapping(value = "/confirmwoman", method = RequestMethod.GET)
	public String showWoman(Model model,@SessionAttribute("sessionperson") Woman womanReceived) {
        model.addAttribute("age", womanReceived.getAge());
        model.addAttribute("height", womanReceived.getHeight());
        model.addAttribute("weight", womanReceived.getWeight());
        model.addAttribute("agemtr", I_UOMs.MTR_AGE);
        model.addAttribute("heightmtr", I_UOMs.MTR_HGHT);
        model.addAttribute("weightmtr", I_UOMs.MTR_WGHT);
        model.addAttribute("sex", I_Woman.SEX);
		// TODO Calculate BMI & ResultsView
		return "/confirmview";
	}
}
