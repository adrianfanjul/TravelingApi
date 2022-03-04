package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Destination{

	@SerializedName("id")
	private String id;

	@SerializedName("value")
	private String value;

	@SerializedName("resolvedLocation")
	private String resolvedLocation;

	public String getId(){
		return id;
	}

	public String getValue(){
		return value;
	}

	public String getResolvedLocation(){
		return resolvedLocation;
	}
}