package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Currency{

	@SerializedName("symbol")
	private String symbol;

	@SerializedName("code")
	private String code;

	@SerializedName("format")
	private String format;

	@SerializedName("separators")
	private String separators;

	public String getSymbol(){
		return symbol;
	}

	public String getCode(){
		return code;
	}

	public String getFormat(){
		return format;
	}

	public String getSeparators(){
		return separators;
	}
}