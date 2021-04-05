package com.simplilearn.dto;

public class Details {
    private String name;
    private String email;
    private String phone;
    private String source;
    private String dest;
    private Integer nop;
    private String dot;
    private Integer price;
    private String airlines;
    private String id;

    public Details(String name, String email, String phone, String source, String dest, Integer nop, String dot, Integer price, String airlines, String id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.source = source;
        this.dest = dest;
        this.nop = nop;
        this.dot = dot;
        this.price = price;
        this.airlines = airlines;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public Integer getNop() {
        return nop;
    }

    public void setNop(Integer nop) {
        this.nop = nop;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
