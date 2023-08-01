package com.example.xmlscreen.Model.TrendingModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TrendingData {
    private long id;
    private String description;
    private String hsCode;
    @SerializedName("volume")
    private String volume;
    private String marketType;
    private boolean isCertified;
    private boolean isTraceable;
    private String priceValidity;
    private String moq;
    private boolean isTrending;
    private String traceid;
    private String batchid;
    private String storageID;
    @SerializedName("category")
    private CategoryModel category;
    @SerializedName("name")
    private CategoryModel name;
    private ArrayList<ImageModel> images;
    private ArrayList<ProductIncoterm> productIncoterms;
    private PackageMaterial packageMaterial;
    private PackageMaterial unitValue;
    private CategoryModel unit;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getHsCode() { return hsCode; }
    public void setHsCode(String value) { this.hsCode = value; }

    public String getVolume() { return volume; }
    public void setVolume(String value) { this.volume = value; }

    public String getMarketType() { return marketType; }
    public void setMarketType(String value) { this.marketType = value; }

    public boolean getIsCertified() { return isCertified; }
    public void setIsCertified(boolean value) { this.isCertified = value; }

    public boolean getIsTraceable() { return isTraceable; }
    public void setIsTraceable(boolean value) { this.isTraceable = value; }

    public String getPriceValidity() { return priceValidity; }
    public void setPriceValidity(String value) { this.priceValidity = value; }

    public String getMoq() { return moq; }
    public void setMoq(String value) { this.moq = value; }

    public boolean getIsTrending() { return isTrending; }
    public void setIsTrending(boolean value) { this.isTrending = value; }

    public String getTraceid() { return traceid; }
    public void setTraceid(String value) { this.traceid = value; }

    public String getBatchid() { return batchid; }
    public void setBatchid(String value) { this.batchid = value; }

    public String getStorageID() { return storageID; }
    public void setStorageID(String value) { this.storageID = value; }

    public CategoryModel getCategoryModel() { return category; }
    public void setCategoryModel(CategoryModel value) { this.category = value; }

    public CategoryModel getName() { return name; }
    public void setName(CategoryModel value) { this.name = value; }

    public ArrayList<ImageModel> getImages() { return images; }
    public void setImages(ArrayList<ImageModel> value) { this.images = value; }

    public ArrayList<ProductIncoterm> getProductIncoterms() { return productIncoterms; }
    public void setProductIncoterms(ArrayList<ProductIncoterm> value) { this.productIncoterms = value; }

    public PackageMaterial getPackageMaterial() { return packageMaterial; }
    public void setPackageMaterial(PackageMaterial value) { this.packageMaterial = value; }

    public PackageMaterial getUnitValue() { return unitValue; }
    public void setUnitValue(PackageMaterial value) { this.unitValue = value; }

    public CategoryModel getUnit() { return unit; }
    public void setUnit(CategoryModel value) { this.unit = value; }
}
