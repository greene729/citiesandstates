package org.wecancodeit.citiesandstates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long pop;
	@ManyToOne
	private State state;

	public City() {

	}

	public City(String name, Long pop, State state) {
		this.name = name;
		this.pop = pop;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getPop() {
		return pop;
	}

	public State getState() {
		return state;
	}
}
