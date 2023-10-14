package com.msku.example.week2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Animal> animalList;

    public Adapter(Activity activity, List<Animal> animals){
        layoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.animalList = animals;
    }

    @Override
    public int getCount() {
        return animalList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Animal animal = animalList.get(position);

        View row = layoutInflater.inflate(R.layout.listviewcard, null);
        TextView textView = row.findViewById(R.id.myTextView);
        ImageView imageView = row.findViewById(R.id.myImage);

        textView.setText(animal.getText());
        imageView.setImageResource(animal.getImage());
        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), animal.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        return row;
    }
}
