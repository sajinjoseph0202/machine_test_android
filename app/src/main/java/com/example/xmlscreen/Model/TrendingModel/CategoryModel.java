package com.example.xmlscreen.Model.TrendingModel;

import com.google.gson.annotations.SerializedName;

public class CategoryModel {
    @SerializedName("name")
    private String name;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

}
