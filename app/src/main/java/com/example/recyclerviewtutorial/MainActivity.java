package com.example.recyclerviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ArrayList<modal> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name,number;


        RecyclerView recyclerView=findViewById(R.id.rcview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
      arrayList.add(new modal(R.drawable.a ,"Aman","123456789"));
        arrayList.add(new modal(R.drawable.b ,"Rajjev","1239"));
        arrayList.add(new modal(R.drawable.c ,"Ajay","89"));
        arrayList.add(new modal(R.drawable.j ,"Deepak","12789"));
        arrayList.add(new modal(R.drawable.e ,"naman","189"));
        arrayList.add(new modal(R.drawable.f ,"ram","1239"));
        arrayList.add(new modal(R.drawable.h ,"Gopal","123456789"));
        arrayList.add(new modal(R.drawable.i ,"Krishna","126789"));
        arrayList.add(new modal(R.drawable.c ,"Dhoni","89"));
        arrayList.add(new modal(R.drawable.j ,"ravindra","12789"));
        arrayList.add(new modal(R.drawable.e ,"Rohit","189"));
        arrayList.add(new modal(R.drawable.b ,"Rajjev","1239"));
        arrayList.add(new modal(R.drawable.c ,"Ajay","89"));
        arrayList.add(new modal(R.drawable.j ,"Deepak","12789"));
        MyContactAdapter myContactAdapter=new MyContactAdapter(this ,arrayList);
        recyclerView.setAdapter(myContactAdapter);


    }
}