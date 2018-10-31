package org.wecancodeit.citiesandstates;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CitiesandstatesPopulator implements CommandLineRunner {

	@Resource
	CityRepository cityRepository;

	@Resource
	StateRepository stateRepository;

	@Override
	public void run(String... args) throws Exception {

	}

}
