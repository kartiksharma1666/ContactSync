package com.example.contactsyncapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("users/today")
    Call<List<Contact>> getTodaysContacts(@Query("date") String date);
}
