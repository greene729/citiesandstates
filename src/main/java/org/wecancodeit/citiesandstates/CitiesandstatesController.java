package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CitiesandstatesController {

	@Resource
	CityRepository cityRepo;
	@Resource
	StateRepository stateRepo;
	
	@GetMapping("/")
	public String getHome() {
		return "redirect:/states";
	}
	
	@GetMapping("/states")
	public String getStates(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "states";
	}
	
	@GetMapping("/states/{abbr}")
	public String getState(@PathVariable(value = "abbr") String abbr, Model model) {
		model.addAttribute("state", stateRepo.findByAbbreviationIgnoreCase(abbr));
		return "state";
	}
	
	@GetMapping("/states/{abbr}/add-city")
	public String getAddCity(Model model) {
		return "add-city";
	}
	
}
