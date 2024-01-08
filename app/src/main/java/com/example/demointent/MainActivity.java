package com.example.demointent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.demointent.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }
    void initviews(){
        Button b_detail=findViewById(R.id.b_detail);
        b_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity();
            }
        });

        Button b_detail2=findViewById(R.id.b_serializable);
        b_detail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user=new User(43,"Odinayev Golibjon");
                openDetailActivity2();
            }
        });

    }

    void openDetailActivity() {
        Intent intent=new Intent(this,DetailActivity.class);
        intent.putExtra("name","Odinayev Golibjon");
        startActivity(intent);
    }
     void openDetailActivity2() {
        Intent intent=new Intent(this,DetailActivity2.class);
        intent.putExtra("user","name");
        startActivity(intent);
    }


}