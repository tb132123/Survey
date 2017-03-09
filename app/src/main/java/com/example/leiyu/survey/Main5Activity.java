package com.example.leiyu.survey;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {
    private List<String> list_data=new ArrayList<>();
    private String contry=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView list = new ListView(this);
        this.set_data();

        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list_data));

        this.setContentView(list);

        list.setOnItemClickListener((a, b, c, d) -> {
            contry = list_data.get(c);
            new AlertDialog.Builder(this).setTitle("You like this contry :" + contry + " ?")
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            send_data();

                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
        });



    }


    public void set_data(){
        list_data.add("China.PR");
        list_data.add("Russia");
        list_data.add("America");
        list_data.add("Korea");
        list_data.add("Italy");
        list_data.add("Netherlands");
        list_data.add("Espain");
        list_data.add("Deutschland");
        list_data.add("Japan");
        list_data.add("Brazil");
        list_data.add("Argentina");
        list_data.add("Chile");
        list_data.add("Belgium");
        list_data.add("Czech Rep");
        list_data.add("Denmark");
        list_data.add("other");
    }

    public void send_data() {

            Intent intent = new Intent(this, Main6Activity.class);
            String data = this.getIntent().getStringExtra("data");
            data = data + "," + contry;

            intent.putExtra("data", data);
            this.startActivity(intent);

    }

}
