package com.example.aberchrombie.af.retrofitService;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Content {
    @SerializedName("elementType")
    public String elementType;
    @SerializedName("target")
    public String target;
    @SerializedName("title")
    public String contentTitle;
}