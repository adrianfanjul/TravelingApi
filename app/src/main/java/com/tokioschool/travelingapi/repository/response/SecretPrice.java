package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class SecretPrice{

	@SerializedName("dealText")
	private String dealText;

	public String getDealText(){
		return dealText;
	}
}