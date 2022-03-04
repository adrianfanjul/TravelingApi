package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Min{

	@SerializedName("defaultValue")
	private int defaultValue;

	@SerializedName("value")
	private int value;

	public int getDefaultValue(){
		return defaultValue;
	}

	public int getValue(){
		return value;
	}
}