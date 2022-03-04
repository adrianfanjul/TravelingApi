package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class HotelBadge{

	@SerializedName("label")
	private String label;

	@SerializedName("type")
	private String type;

	public String getLabel(){
		return label;
	}

	public String getType(){
		return type;
	}
}