package com.example.bookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Bookdetail_card extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetail_card);
        ImageView card_image = findViewById(R.id.card_image);
        TextView card_title = findViewById(R.id.card_title);
        TextView card_author = findViewById(R.id.card_auther);
        TextView card_ranking = findViewById(R.id.card_ranking);

    }
}