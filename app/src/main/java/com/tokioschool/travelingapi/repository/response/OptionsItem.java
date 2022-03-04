package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class OptionsItem{

	@SerializedName("enhancedChoices")
	private List<Object> enhancedChoices;

	@SerializedName("itemMeta")
	private String itemMeta;

	@SerializedName("label")
	private String label;

	@SerializedName("choices")
	private List<ChoicesItem> choices;

	@SerializedName("selectedChoiceLabel")
	private String selectedChoiceLabel;

	public List<Object> getEnhancedChoices(){
		return enhancedChoices;
	}

	public String getItemMeta(){
		return itemMeta;
	}

	public String getLabel(){
		return label;
	}

	public List<ChoicesItem> getChoices(){
		return choices;
	}

	public String getSelectedChoiceLabel(){
		return selectedChoiceLabel;
	}
}