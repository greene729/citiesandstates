package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CitiesandstatesPopulator implements CommandLineRunner {

	@Resource
	CityRepository cityRepo;

	@Resource
	StateRepository stateRepo;

	@Override
	public void run(String... args) throws Exception {
		Fish walleye = new Fish("Walleye","Stizsostedion vitreum","./images/walleye.jpeg");
		State ohio = new State("Ohio","OH","With God All things are possible", walleye,"/states/oh/cities");
		ohio = stateRepo.save(ohio);
		City columbus = new City("Columbus",879170L,ohio);
		columbus = cityRepo.save(columbus);

	}

}
