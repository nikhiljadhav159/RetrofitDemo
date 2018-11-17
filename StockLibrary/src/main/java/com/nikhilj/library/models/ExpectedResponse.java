package com.nikhilj.library.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Observable;

public class ExpectedResponse {
    @SerializedName("company")
    @Expose
    private CompanyResponse company;
    @SerializedName("price")
    @Expose
    private Double price=0.0;
    private String exception;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public CompanyResponse getCompany() {
        return company;
    }

    public void setCompany(CompanyResponse company) {
        this.company = company;
    }

    public String getPrice() {
        if(price==0.0){
            return "";
        }else {
            return "Stock Price : " + price;
        }
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ExpectedResponse() {
    }

    public ExpectedResponse(CompanyResponse company, Double price, String exception) {
        this.company = company;
        this.price = price;
        this.exception = exception;
    }
}
