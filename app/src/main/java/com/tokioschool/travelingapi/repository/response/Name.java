package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Name{

	@SerializedName("item")
	private Item item;

	@SerializedName("autosuggest")
	private Autosuggest autosuggest;

	public Item getItem(){
		return item;
	}

	public Autosuggest getAutosuggest(){
		return autosuggest;
	}
}