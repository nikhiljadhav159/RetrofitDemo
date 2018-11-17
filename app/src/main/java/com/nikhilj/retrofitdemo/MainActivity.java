package com.nikhilj.retrofitdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.View;

import com.nikhilj.library.GetStockDetails;
import com.nikhilj.library.interfaces.ResponseCallBack;
import com.nikhilj.library.models.ExpectedResponse;
import com.nikhilj.retrofitdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.pbMain.setIndeterminate(true);
        binding.pbMain.setVisibility(View.GONE);
        final GetStockDetails getStockDetails = new GetStockDetails(new ResponseCallBack() {
            @Override
            public void onSuccess(ExpectedResponse response) {
                binding.svMain.setActivated(true);
                binding.pbMain.setVisibility(View.GONE);
                binding.setStock(response);
            }
        });

        binding.svMain.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                binding.svMain.setActivated(false);
                binding.pbMain.setVisibility(View.VISIBLE);
                getStockDetails.callForData(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                binding.setStock(new ExpectedResponse());
                return false;
            }
        });
    }
}
