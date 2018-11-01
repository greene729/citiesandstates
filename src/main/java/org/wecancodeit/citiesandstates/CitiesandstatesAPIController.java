package org.wecancodeit.citiesandstates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitiesandstatesAPIController {

	@Autowired
	StateRepository stateRepo;

	@GetMapping("/api/states")
	public Iterable<State> getStates() {
		return stateRepo.findAll();
	}
 
	@GetMapping("/api/states/{abbr}")
	public State getStates(@PathVariable(value = "abbr") String abbr) {
		return stateRepo.findByAbbreviationIgnoreCase(abbr);
	}

}
