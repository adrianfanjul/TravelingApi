package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class WelcomeRewards{

	@SerializedName("label")
	private String label;

	@SerializedName("items")
	private List<ItemsItem> items;

	@SerializedName("collect")
	private boolean collect;

	public String getLabel(){
		return label;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public boolean isCollect(){
		return collect;
	}
}