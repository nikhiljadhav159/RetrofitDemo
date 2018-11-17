package com.nikhilj.library.interfaces;



import com.nikhilj.library.models.CompanyResponse;
import com.nikhilj.library.models.ExpectedResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("{name}/company")
    Call<CompanyResponse> getCompanyDetails(@Path("name") String name);

    @GET("{name}/batch?types=company,price")
    Call<ExpectedResponse> getExpectedDetails(@Path("name") String name);
}
