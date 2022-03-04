package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SearchResults{

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("totalCount")
	private int totalCount;

	@SerializedName("results")
	private List<ResultsItem> results;

	public Pagination getPagination(){
		return pagination;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}