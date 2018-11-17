package com.nikhilj.library;

import com.google.gson.Gson;
import com.nikhilj.library.interfaces.ApiInterface;
import com.nikhilj.library.interfaces.ResponseCallBack;
import com.nikhilj.library.models.ExpectedResponse;

import java.net.UnknownHostException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetStockDetails {
    private ResponseCallBack responseCallBack;
    private ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

    public GetStockDetails(ResponseCallBack responseCallBack) {
        this.responseCallBack = responseCallBack;
    }

    public void callForData(final String query) {
        Call<ExpectedResponse> companyResponseCall = apiInterface.getExpectedDetails(query);
        companyResponseCall.enqueue(new Callback<ExpectedResponse>() {
            @Override
            public void onResponse(Call<ExpectedResponse> call, Response<ExpectedResponse> response) {
                ExpectedResponse companyResponse = response.body();
                if (companyResponse == null) {
                    companyResponse = new ExpectedResponse();
                    companyResponse.setException("No stock found for " + query + ".");
                }
                responseCallBack.onSuccess(companyResponse);
            }

            @Override
            public void onFailure(Call<ExpectedResponse> call, Throwable t) {
                ExpectedResponse expectedResponse = new ExpectedResponse();
                if (t instanceof UnknownHostException) {
                    expectedResponse.setException("Please check your Internet connection.");
                } else if (t instanceof NullPointerException) {
                    expectedResponse.setException("No stock found for " + query + ".");
                } else {
                    expectedResponse.setException("Something went wrong, please try later...");
                }
                responseCallBack.onSuccess(expectedResponse);
            }
        });
    }
}
