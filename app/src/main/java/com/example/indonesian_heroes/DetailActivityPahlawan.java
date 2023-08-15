package com.example.indonesian_heroes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.indonesian_heroes.R;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivityPahlawan extends AppCompatActivity {

    @BindView(R.id.imagePahlawan)
    ImageView imagePahlawan;

    @BindView(R.id.tvAsal)
    TextView tvAsal;

    @BindView(R.id.tvUsia)
    TextView tvUsia;

    @BindView(R.id.tvLahir)
    TextView tvLahir;

    @BindView(R.id.tvWafat)
    TextView tvWafat;

    @BindView(R.id.tvMakam)
    TextView tvMakam;

    @BindView(R.id.tvRiwayat)
    TextView tvRiwayat;

    @BindView(R.id.tvKategori)
    TextView tvKategori;

    private Context context;

    String id;


    //get api untuk di detail actifity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pahlawan);

        ButterKnife.bind(this);

        Bundle mBundle=getIntent().getExtras();
        tvKategori.setText(mBundle.getString("kategori"));

        tvAsal.setText(mBundle.getString("asal"));

        tvUsia.setText(mBundle.getString("usia"));


        tvLahir.setText("Lahir        : " + mBundle.getString("lahir"));

        tvWafat.setText("Gugur        : " +mBundle.getString("wafat"));

        tvMakam.setText("Lokasi Makan : " +mBundle.getString("makam"));

        tvRiwayat.setText("Riwayat    : " +mBundle.getString("riwayat"));

        Picasso.with(context)
                .load(mBundle.getString("image")).resize(100,100)
                .into(imagePahlawan);
    }
}