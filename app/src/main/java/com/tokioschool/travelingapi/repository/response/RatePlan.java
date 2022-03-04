package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class RatePlan{

	@SerializedName("features")
	private Features features;

	@SerializedName("price")
	private Price price;

	@SerializedName("type")
	private String type;

	public Features getFeatures(){
		return features;
	}

	public Price getPrice(){
		return price;
	}

	public String getType(){
		return type;
	}
}