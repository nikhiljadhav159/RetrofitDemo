package com.nikhilj.library.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CompanyResponse {

    @SerializedName("symbol")
    @Expose
    private String symbol="N/A";
    @SerializedName("companyName")
    @Expose
    private String companyName="N/A";
    @SerializedName("website")
    @Expose
    private String website="N/A";
    @SerializedName("CEO")
    @Expose
    private String cEO="N/A";
    @SerializedName("exchange")
    @Expose
    private String exchange="N/A";
    @SerializedName("industry")
    @Expose
    private String industry="N/A";
    @SerializedName("description")
    @Expose
    private String description="N/A";
    @SerializedName("issueType")
    @Expose
    private String issueType="N/A";
    @SerializedName("sector")
    @Expose
    private String sector="N/A";
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;

    public CompanyResponse() {
    }

    public CompanyResponse(String symbol, String companyName, String exchange, String industry, String website, String description, String cEO, String issueType, String sector, List<String> tags) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.exchange = exchange;
        this.industry = industry;
        this.website = website;
        this.description = description;
        this.cEO = cEO;
        this.issueType = issueType;
        this.sector = sector;
        this.tags = tags;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return "Company Name : "+companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getWebsite() {
        return "Company Website : "+website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCEO() {
        return "Company CEO : "+cEO;
    }

    public void setCEO(String cEO) {
        this.cEO = cEO;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
