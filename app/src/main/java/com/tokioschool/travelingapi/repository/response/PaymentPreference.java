package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PaymentPreference{

	@SerializedName("items")
	private List<ItemsItem> items;

	public List<ItemsItem> getItems(){
		return items;
	}
}