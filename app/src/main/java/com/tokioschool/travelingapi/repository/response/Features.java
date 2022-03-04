package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Features{

	@SerializedName("paymentPreference")
	private boolean paymentPreference;

	@SerializedName("noCCRequired")
	private boolean noCCRequired;

	@SerializedName("freeCancellation")
	private boolean freeCancellation;

	public boolean isPaymentPreference(){
		return paymentPreference;
	}

	public boolean isNoCCRequired(){
		return noCCRequired;
	}

	public boolean isFreeCancellation(){
		return freeCancellation;
	}
}