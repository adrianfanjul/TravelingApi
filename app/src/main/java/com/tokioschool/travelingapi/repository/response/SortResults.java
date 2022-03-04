package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SortResults{

	@SerializedName("options")
	private List<OptionsItem> options;

	@SerializedName("distanceOptionLandmarkId")
	private double distanceOptionLandmarkId;

	public List<OptionsItem> getOptions(){
		return options;
	}

	public double getDistanceOptionLandmarkId(){
		return distanceOptionLandmarkId;
	}
}