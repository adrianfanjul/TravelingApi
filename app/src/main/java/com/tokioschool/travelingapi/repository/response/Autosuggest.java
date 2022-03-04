package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Autosuggest{

	@SerializedName("additionalUrlParams")
	private AdditionalUrlParams additionalUrlParams;

	public AdditionalUrlParams getAdditionalUrlParams(){
		return additionalUrlParams;
	}
}