package com.tokioschool.travelingapi.repository.response;

import com.google.gson.annotations.SerializedName;

public class Filters{

	@SerializedName("applied")
	private boolean applied;

	@SerializedName("accessibility")
	private Accessibility accessibility;

	@SerializedName("landmarks")
	private Landmarks landmarks;

	@SerializedName("welcomeRewards")
	private WelcomeRewards welcomeRewards;

	@SerializedName("paymentPreference")
	private PaymentPreference paymentPreference;

	@SerializedName("themesAndTypes")
	private ThemesAndTypes themesAndTypes;

	@SerializedName("neighbourhood")
	private Neighbourhood neighbourhood;

	@SerializedName("price")
	private Price price;

	@SerializedName("name")
	private Name name;

	@SerializedName("accommodationType")
	private AccommodationType accommodationType;

	@SerializedName("starRating")
	private StarRating starRating;

	@SerializedName("guestRating")
	private GuestRating guestRating;

	@SerializedName("facilities")
	private Facilities facilities;

	public boolean isApplied(){
		return applied;
	}

	public Accessibility getAccessibility(){
		return accessibility;
	}

	public Landmarks getLandmarks(){
		return landmarks;
	}

	public WelcomeRewards getWelcomeRewards(){
		return welcomeRewards;
	}

	public PaymentPreference getPaymentPreference(){
		return paymentPreference;
	}

	public ThemesAndTypes getThemesAndTypes(){
		return themesAndTypes;
	}

	public Neighbourhood getNeighbourhood(){
		return neighbourhood;
	}

	public Price getPrice(){
		return price;
	}

	public Name getName(){
		return name;
	}

	public AccommodationType getAccommodationType(){
		return accommodationType;
	}

	public StarRating getStarRating(){
		return starRating;
	}

	public GuestRating getGuestRating(){
		return guestRating;
	}

	public Facilities getFacilities(){
		return facilities;
	}
}