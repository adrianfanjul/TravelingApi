package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Price{

	@SerializedName("applied")
	private boolean applied;

	@SerializedName("multiplier")
	private int multiplier;

	@SerializedName("range")
	private Range range;

	@SerializedName("label")
	private String label;

	@SerializedName("summary")
	private String summary;

	@SerializedName("current")
	private String current;

	@SerializedName("exactCurrent")
	private double exactCurrent;

	@SerializedName("info")
	private String info;

	@SerializedName("old")
	private String old;

	public boolean isApplied(){
		return applied;
	}

	public int getMultiplier(){
		return multiplier;
	}

	public Range getRange(){
		return range;
	}

	public String getLabel(){
		return label;
	}

	public String getSummary(){
		return summary;
	}

	public String getCurrent(){
		return current;
	}

	public double getExactCurrent(){
		return exactCurrent;
	}

	public String getInfo(){
		return info;
	}

	public String getOld(){
		return old;
	}
}