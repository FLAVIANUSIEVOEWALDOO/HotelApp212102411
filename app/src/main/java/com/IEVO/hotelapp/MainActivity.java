package com.IEVO.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://cf.bstatic.com/xdata/images/hotel/max1024x768/534754413.jpg?k=d69104a8dcc3f98b8adaf1f2808873ced116b5ba663f3886c75126a6974fb73b&o=&hp=1";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}