package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class OptimizedThumbUrls{

	@SerializedName("srpDesktop")
	private String srpDesktop;

	public String getSrpDesktop(){
		return srpDesktop;
	}
}