package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Query{

	@SerializedName("destination")
	private Destination destination;

	public Destination getDestination(){
		return destination;
	}
}