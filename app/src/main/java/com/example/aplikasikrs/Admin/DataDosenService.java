package com.example.aplikasikrs.Admin;

import com.example.aplikasikrs.Admin.Model.Dosen;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DataDosenService {
    @GET("/api/progmob/dosen/{nim_progmob}")
    Call<ArrayList<Dosen>> getDosenAll(@Path("nim_progmob") String nim_progmob);
}
