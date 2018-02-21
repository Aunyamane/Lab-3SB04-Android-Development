package com.example.kaneki.ch1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ImageView imgv = (ImageView) findViewById(R.id.imageView2);
        imgv.setImageResource(R.drawable.p7);
        imgv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent imgv = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(imgv);
            }
        });
    }
}




