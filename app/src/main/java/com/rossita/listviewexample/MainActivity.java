package com.rossita.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvListy;
    ArrayList<Person> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvListy = findViewById(R.id.lvListy);
        list = new ArrayList<>();

//        Person person1 = new Person("First",20,false);
        list.add(new Person("First",21,false));
        list.add(new Person("Second",22,true));
        list.add(new Person("Third",23,true));
        list.add(new Person("Fourth",24,false));
        list.add(new Person("Fifth",25,true));

        PersonAdapter adapter = new PersonAdapter(this,list);
        lvListy.setAdapter(adapter);

    }
}
