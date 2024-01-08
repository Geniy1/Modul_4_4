package com.example.demointent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demointent.model.User;

public class DetailActivity2 extends AppCompatActivity {
    static final String TAG= DetailActivity2.class.toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);
        initViews();
        }
        void initViews(){
            TextView tv_detail=findViewById(R.id.tv_detail);
            User user=(User)getIntent().getSerializableExtra("user");
            Log.d(TAG,user.toString());
            tv_detail.setText(user.toString());
        }


    }

