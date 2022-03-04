package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class ChoicesItem{

	@SerializedName("label")
	private String label;

	@SerializedName("value")
	private String value;

	@SerializedName("selected")
	private boolean selected;

	@SerializedName("id")
	private double id;

	public String getLabel(){
		return label;
	}

	public String getValue(){
		return value;
	}

	public boolean isSelected(){
		return selected;
	}

	public double getId(){
		return id;
	}
}