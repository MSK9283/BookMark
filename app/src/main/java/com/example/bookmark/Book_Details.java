package com.example.bookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        ImageView bookdetail_image = findViewById(R.id.bookdetail_image);
        TextView bookdetail_title = findViewById(R.id.bookdetail_title);
        TextView bookdetail_author = findViewById(R.id.bookdetail_author);
        TextView bookdetail_rating = findViewById(R.id.bookdetail_rating);
        TextView bookdetail_description = findViewById(R.id.bookdetail_description);
    }
}