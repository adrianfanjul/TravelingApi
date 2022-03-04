package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Range{

	@SerializedName("min")
	private Min min;

	@SerializedName("max")
	private Max max;

	@SerializedName("increments")
	private int increments;

	public Min getMin(){
		return min;
	}

	public Max getMax(){
		return max;
	}

	public int getIncrements(){
		return increments;
	}
}