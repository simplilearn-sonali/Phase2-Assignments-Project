package com.simplilearn.dto;

public class Flight {
    private String place1;
    private String place2;
    private Integer price;
    private Integer id;
    private String airline;

    public Flight(String place1, String place2, Integer price, Integer id, String airline) {
        this.place1 = place1;
        this.place2 = place2;
        this.price = price;
        this.id = id;
        this.airline = airline;
    }



    public void setPlace1(String place1) {
        this.place1 = place1;
    }

    public void setPlace2(String place2) {
        this.place2 = place2;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace1() {
        return place1;
    }

    public String getPlace2() {
        return place2;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
