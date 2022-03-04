package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class LandmarksItem{

	@SerializedName("distance")
	private String distance;

	@SerializedName("label")
	private String label;

	public String getDistance(){
		return distance;
	}

	public String getLabel(){
		return label;
	}
}