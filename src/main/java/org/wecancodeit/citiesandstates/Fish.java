package org.wecancodeit.citiesandstates;

import javax.persistence.Embeddable;

@Embeddable
public class Fish {

	private String fishName;
	private String binomialNomenclature;
	private String imageURL;
	public Fish() {
		
	}
	public Fish(String fishName, String binomialNomenclature, String imageURL) {
		this.fishName = fishName;
		this.binomialNomenclature = binomialNomenclature;
		this.imageURL = imageURL;
	}
	public String getName() {
		return fishName;
	}
	public String getBinomialNomenclature() {
		return binomialNomenclature;
	}
	public String getImageURL() {
		return imageURL;
	}
	
		
}
