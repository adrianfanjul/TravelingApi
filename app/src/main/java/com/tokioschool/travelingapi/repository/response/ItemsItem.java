package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class ItemsItem{

	@SerializedName("label")
	private String label;

	@SerializedName("value")
	private String value;

	public String getLabel(){
		return label;
	}

	public String getValue(){
		return value;
	}
}