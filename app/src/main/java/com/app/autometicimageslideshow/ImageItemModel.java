package com.app.autometicimageslideshow;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Saurabh on 22-06-2016.
 */
public class ImageItemModel {
    @SerializedName("id")
    private int Id;

    @SerializedName("imageurl")
    private String ImageUrl;



    @SerializedName("pictures_result")
    public List<ImageItemModel> results;

    public ImageItemModel(int id,String imageUrl) {
       Id=id;
       ImageUrl=imageUrl;

    }

    public int getId() {
        return Id;
    }

    public String getImageUrl() {
        return ImageUrl;
    }





    public List<ImageItemModel> getResults() {
        return results;
    }


}
