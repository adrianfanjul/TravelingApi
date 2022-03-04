package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class AdditionalUrlParams{

	@SerializedName("destination-id")
	private String destinationId;

	@SerializedName("q-destination")
	private String qDestination;

	@SerializedName("resolved-location")
	private String resolvedLocation;

	public String getDestinationId(){
		return destinationId;
	}

	public String getQDestination(){
		return qDestination;
	}

	public String getResolvedLocation(){
		return resolvedLocation;
	}
}