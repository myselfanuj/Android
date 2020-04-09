package com.anujsingh.retrofitapk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts") //posts(name) should be same as json file relative url
    Call<List<Post>> getPosts();  //    to get data from the server


}
