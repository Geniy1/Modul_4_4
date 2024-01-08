package com.example.demointent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    static final String TAG=DetailActivity.class.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        }
        void initViews(){
            TextView tv_detail=findViewById(R.id.tv_detail);
            String name=getIntent().getStringExtra("name");
            Log.d(TAG,name);
            tv_detail.setText(name);
        }


    }

