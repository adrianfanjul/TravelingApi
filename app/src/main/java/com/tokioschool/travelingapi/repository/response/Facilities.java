package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Facilities{

	@SerializedName("applied")
	private boolean applied;

	@SerializedName("items")
	private List<ItemsItem> items;

	public boolean isApplied(){
		return applied;
	}

	public List<ItemsItem> getItems(){
		return items;
	}
}