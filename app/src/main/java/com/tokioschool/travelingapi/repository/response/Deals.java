package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Deals{

	@SerializedName("priceReasoning")
	private String priceReasoning;

	@SerializedName("secretPrice")
	private SecretPrice secretPrice;

	@SerializedName("specialDeal")
	private SpecialDeal specialDeal;

	public String getPriceReasoning(){
		return priceReasoning;
	}

	public SecretPrice getSecretPrice(){
		return secretPrice;
	}

	public SpecialDeal getSpecialDeal(){
		return specialDeal;
	}
}