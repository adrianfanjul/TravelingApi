package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Badging{

	@SerializedName("hotelBadge")
	private HotelBadge hotelBadge;

	public HotelBadge getHotelBadge(){
		return hotelBadge;
	}
}