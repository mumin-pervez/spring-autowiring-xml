package com.mumin.beans;

public class Address {
  private int adId;
  private String village;
  private String upazila;
  private String district;
  private String division;

  public int getAdId() {
    return adId;
  }

  public void setAdId(int adId) {
    this.adId = adId;
  }

  public String getVillage() {
    return village;
  }

  public void setVillage(String village) {
    this.village = village;
  }

  public String getUpazila() {
    return upazila;
  }

  public void setUpazila(String upazila) {
    this.upazila = upazila;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  @Override
  public String toString() {
    return village+", "+upazila+", "+district+", "+division;
  }
}
