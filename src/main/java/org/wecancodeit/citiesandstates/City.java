package org.wecancodeit.citiesandstates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long id;
	private String cityName;
	private Long pop;
	@JsonIgnore
	@ManyToOne
	private State state;

	public City() {

	}

	public City(String cityName, Long pop, State state) {
		this.cityName = cityName;
		this.pop = pop;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return cityName;
	}

	public Long getPop() {
		return pop;
	}

	public State getState() {
		return state;
	}
}
