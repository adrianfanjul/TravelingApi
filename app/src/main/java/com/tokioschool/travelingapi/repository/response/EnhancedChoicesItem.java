package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EnhancedChoicesItem{

	@SerializedName("itemMeta")
	private String itemMeta;

	@SerializedName("label")
	private String label;

	@SerializedName("choices")
	private List<ChoicesItem> choices;

	public String getItemMeta(){
		return itemMeta;
	}

	public String getLabel(){
		return label;
	}

	public List<ChoicesItem> getChoices(){
		return choices;
	}
}