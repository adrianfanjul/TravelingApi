package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Item{

	@SerializedName("value")
	private String value;

	public String getValue(){
		return value;
	}
}