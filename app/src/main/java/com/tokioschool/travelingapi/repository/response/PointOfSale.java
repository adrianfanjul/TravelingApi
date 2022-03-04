package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class PointOfSale{

	@SerializedName("currency")
	private Currency currency;

	public Currency getCurrency(){
		return currency;
	}
}