package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class ResponseSearchHotels{

	@SerializedName("sortResults")
	private SortResults sortResults;

	@SerializedName("pointOfSale")
	private PointOfSale pointOfSale;

	@SerializedName("query")
	private Query query;

	@SerializedName("header")
	private String header;

	@SerializedName("filters")
	private Filters filters;

	@SerializedName("searchResults")
	private SearchResults searchResults;

	public SortResults getSortResults(){
		return sortResults;
	}

	public PointOfSale getPointOfSale(){
		return pointOfSale;
	}

	public Query getQuery(){
		return query;
	}

	public String getHeader(){
		return header;
	}

	public Filters getFilters(){
		return filters;
	}

	public SearchResults getSearchResults(){
		return searchResults;
	}
}