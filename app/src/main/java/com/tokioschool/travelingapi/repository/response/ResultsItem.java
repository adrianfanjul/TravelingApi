package com.tokioschool.travelingapi.repository.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultsItem{

	@SerializedName("ratePlan")
	private RatePlan ratePlan;

	@SerializedName("address")
	private Address address;

	@SerializedName("coordinate")
	private Coordinate coordinate;

	@SerializedName("guestReviews")
	private GuestReviews guestReviews;

	@SerializedName("landmarks")
	private List<LandmarksItem> landmarks;

	@SerializedName("optimizedThumbUrls")
	private OptimizedThumbUrls optimizedThumbUrls;

	@SerializedName("pimmsAttributes")
	private String pimmsAttributes;

	@SerializedName("providerType")
	private String providerType;

	@SerializedName("messaging")
	private Messaging messaging;

	@SerializedName("welcomeRewards")
	private WelcomeRewards welcomeRewards;

	@SerializedName("urls")
	private Urls urls;

	@SerializedName("geoBullets")
	private List<Object> geoBullets;

	@SerializedName("supplierHotelId")
	private int supplierHotelId;

	@SerializedName("neighbourhood")
	private String neighbourhood;

	@SerializedName("deals")
	private Deals deals;

	@SerializedName("name")
	private String name;

	@SerializedName("badging")
	private Badging badging;

	@SerializedName("isAlternative")
	private boolean isAlternative;

	@SerializedName("id")
	private int id;

	@SerializedName("starRating")
	private double starRating;

	@SerializedName("vrBadge")
	private String vrBadge;

	public RatePlan getRatePlan(){
		return ratePlan;
	}

	public Address getAddress(){
		return address;
	}

	public Coordinate getCoordinate(){
		return coordinate;
	}

	public GuestReviews getGuestReviews(){
		return guestReviews;
	}

	public List<LandmarksItem> getLandmarks(){
		return landmarks;
	}

	public OptimizedThumbUrls getOptimizedThumbUrls(){
		return optimizedThumbUrls;
	}

	public String getPimmsAttributes(){
		return pimmsAttributes;
	}

	public String getProviderType(){
		return providerType;
	}

	public Messaging getMessaging(){
		return messaging;
	}

	public WelcomeRewards getWelcomeRewards(){
		return welcomeRewards;
	}

	public Urls getUrls(){
		return urls;
	}

	public List<Object> getGeoBullets(){
		return geoBullets;
	}

	public int getSupplierHotelId(){
		return supplierHotelId;
	}

	public String getNeighbourhood(){
		return neighbourhood;
	}

	public Deals getDeals(){
		return deals;
	}

	public String getName(){
		return name;
	}

	public Badging getBadging(){
		return badging;
	}

	public boolean isIsAlternative(){
		return isAlternative;
	}

	public int getId(){
		return id;
	}

	public double getStarRating(){
		return starRating;
	}

	public String getVrBadge(){
		return vrBadge;
	}
}