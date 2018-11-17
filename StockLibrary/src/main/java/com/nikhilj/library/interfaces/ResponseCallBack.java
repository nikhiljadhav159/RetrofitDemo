package com.nikhilj.library.interfaces;


import com.nikhilj.library.models.ExpectedResponse;

public interface ResponseCallBack {

    void onSuccess(ExpectedResponse response);

    /*void onFailure(String exception);*/
}
