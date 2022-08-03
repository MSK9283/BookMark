package com.example.bookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        TextView profile_setting = findViewById(R.id.profile_setting);
        TextView favorites_setting = findViewById(R.id.favorites_setting);
        TextView SetreadReminder_setting = findViewById(R.id.SetReadReminder_setting);
        Button Deleteinfo_button = findViewById(R.id.DeleteInfo_Button);

        Deleteinfo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}