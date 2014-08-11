package com.example.searchmyhouse.app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.Color;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<Items> {

    ArrayList<Items> data = new ArrayList<Items>();
    private Context context;
    private int resource;
    private String[] color;

    public CustomListAdapter(Context context, int resource, ArrayList<Items> items, String[] color){
        super(context, resource, items);
        this.context = context;
        this.data = items;
        this.resource = resource;
        this.color = color;
    }


    @Override
    public View getView (int position, View convertView, ViewGroup parent){

        ViewHolder holder;
        View v;
        v = convertView;
        Items item = data.get(position);
        if(v == null){
            holder = new ViewHolder();
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            v = inflater.inflate(resource, parent, false);
            //convertView.setBackgroundColor(Color.BLUE);
            holder.text = (TextView)v.findViewById(R.id.firstLine);
            v.setTag(holder);

        }else{
            holder = (ViewHolder)v.getTag();
        }
        holder.text.setText(item.getText());
        v.setBackgroundColor(Color.parseColor(color[position]));
        return v;
    }

    public class ViewHolder{
        TextView text;
    }


}
