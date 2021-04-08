package com.sujina.jinasmarthome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btnBedroom;
    String[] s1 = {"Morning","I'm Out","Back Home"};

    int[] images = {R.drawable.ic_sunrise_icon,R.drawable.ic_out_icon,R.drawable.ic_back_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recy_home);
        recyclerView = findViewById(R.id.recy_home);
        btnBedroom = findViewById(R.id.btn_bedroom);
        MyAdapter myAdapter = new MyAdapter(this,s1,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        /*navigation*/
        btnBedroom.setOnClickListener(v->{
            Intent intent = new Intent(this,Bedroom.class);
            startActivity(intent);
        });
    }
}