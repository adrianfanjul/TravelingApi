package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Landmarks{

	@SerializedName("distance")
	private List<Object> distance;

	@SerializedName("selectedOrder")
	private List<Object> selectedOrder;

	@SerializedName("items")
	private List<ItemsItem> items;

	public List<Object> getDistance(){
		return distance;
	}

	public List<Object> getSelectedOrder(){
		return selectedOrder;
	}

	public List<ItemsItem> getItems(){
		return items;
	}
}