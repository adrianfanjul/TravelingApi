package com.tokioschool.travelingapi.domain.hotels;

public class HotelModel {
    private int hotelId;
    private String hotelName;
    private int starRating;
    private AdressModel adressModel;
    private String urlImage;

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getStarRating() {
        return starRating;
    }

    public AdressModel getAdressModel() {
        return adressModel;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public void setAdressModel(AdressModel adressModel) {
        this.adressModel = adressModel;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
