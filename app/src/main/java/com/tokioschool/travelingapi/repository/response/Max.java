package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Max{

	@SerializedName("defaultValue")
	private int defaultValue;

	public int getDefaultValue(){
		return defaultValue;
	}
}