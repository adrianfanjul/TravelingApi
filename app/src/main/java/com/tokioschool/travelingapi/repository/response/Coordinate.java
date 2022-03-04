package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Coordinate{

	@SerializedName("lon")
	private double lon;

	@SerializedName("lat")
	private double lat;

	public double getLon(){
		return lon;
	}

	public double getLat(){
		return lat;
	}
}