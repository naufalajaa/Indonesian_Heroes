package com.example.indonesian_heroes;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indonesian_heroes.adapter.AdapterListPahlawan;
import com.example.indonesian_heroes.api.Apipahlawan;
import com.example.indonesian_heroes.api.Retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListPahlawan;
    private AdapterListPahlawan adapter;
    private List<DaftarPahlawanItem> items = new ArrayList<>();
    private Apipahlawan apipahlawan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListPahlawan = findViewById(R.id.rvListPahlawan);

        adapter = new AdapterListPahlawan(this, items);

        rvListPahlawan.setLayoutManager(new GridLayoutManager(this, 1));
        rvListPahlawan.setAdapter(adapter);

        apipahlawan = Retrofit.getRetrofit().create(Apipahlawan.class);

        getAllPahlawan();
    }

    private void getAllPahlawan() {
        Call<Pahlawan> api = apipahlawan.getAllPahlawan();

        api.enqueue(new Callback<Pahlawan>() {
            @Override
            public void onResponse(Call<Pahlawan> call, Response<Pahlawan> response) {
                if (response.isSuccessful() && response.body() != null) {
                    adapter.setItems(response.body().getDaftarPahlawan());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<Pahlawan> call, Throwable t) {
                // Handle failure
            }
        });
    }
}