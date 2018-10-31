package org.wecancodeit.citiesandstates;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue
	private Long id;
	private String abbreviation;
	private String motto;
	@Embedded
	private Fish fish;
	private String citiesURL;
	@OneToMany (mappedBy = "state")
	private Collection<City> cities;

	public State() {
	}

	public State(String abbreviation, String motto, Fish fish, String citiesURL) {
		this.abbreviation = abbreviation;
		this.motto = motto;
		this.fish = fish;
		this.citiesURL = citiesURL;
	}

	public Collection<City> getCities() {
		return cities;
	}
	public Long getId() {
		return id;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public String getMotto() {
		return motto;
	}

	public Fish getFish() {
		return fish;
	}

	public String getCitiesURL() {
		return citiesURL;
	}

}
