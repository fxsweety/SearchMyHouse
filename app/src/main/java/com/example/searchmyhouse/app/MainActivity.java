package com.example.searchmyhouse.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private ArrayList<Items> items  = new ArrayList<Items>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setValues();

    }

    private void setValues(){
        items.add(new Items("Organize"));
        items.add(new Items("Search"));
    }

    @Override
    public void onResume(){
        super.onResume();
        final ListView listview = (ListView) findViewById(R.id.listview);
        String[] colors = {"#ffffBB", "#ff654d","#ffffff","#ffffff","#ffffff","#ffffff"};
        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.listitem_main, items, colors);
        listview.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



}
