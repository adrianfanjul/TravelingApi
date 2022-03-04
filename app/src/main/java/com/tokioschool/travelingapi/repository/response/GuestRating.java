package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class GuestRating{

	@SerializedName("range")
	private Range range;

	public Range getRange(){
		return range;
	}
}