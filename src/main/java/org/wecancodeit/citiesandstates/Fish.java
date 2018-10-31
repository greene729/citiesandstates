package org.wecancodeit.citiesandstates;

import javax.persistence.Embeddable;

@Embeddable
public class Fish {

	private String name;
	private String binomialNomenclature;
	private String imageURL;
	public Fish() {
		
	}
	public Fish(String name, String binomialNomenclature, String imageURL) {
		super();
		this.name = name;
		this.binomialNomenclature = binomialNomenclature;
		this.imageURL = imageURL;
	}
	public String getName() {
		return name;
	}
	public String getBinomialNomenclature() {
		return binomialNomenclature;
	}
	public String getImageURL() {
		return imageURL;
	}
	
		
}
