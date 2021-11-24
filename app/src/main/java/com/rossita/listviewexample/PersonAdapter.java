package com.rossita.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Person> {

    private final Context context;
    private final ArrayList<Person> list;


    public PersonAdapter(@NonNull Context context, ArrayList<Person> list) {
        super(context, R.layout.list_row,list);
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.list_row,parent,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvAge = view.findViewById(R.id.tvAge);
        TextView tvSmart = view.findViewById(R.id.tvSmart);

        tvName.setText(list.get(position).getName());
        tvAge.setText("" + list.get(position).getAge());

        if (list.get(position).isSmart()){
            tvSmart.setText("Is smart");
        }else{
            tvSmart.setText("Is not");
        }

        return view;
    }
}
