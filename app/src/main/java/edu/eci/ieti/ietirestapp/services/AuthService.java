package edu.eci.ieti.ietirestapp.services;

import edu.eci.ieti.ietirestapp.model.LoginWrapper;
import edu.eci.ieti.ietirestapp.model.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {
    String API_ROUTE = "auth";
    @POST(API_ROUTE)
    public Call<Token> login(@Body LoginWrapper lw);
}
