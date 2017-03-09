package com.example.leiyu.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.*;

public class Main6Activity extends AppCompatActivity {
    private List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button next=(Button)findViewById(R.id.button5);
        CheckBox ck1=(CheckBox)findViewById(R.id.checkBox);
        CheckBox ck2=(CheckBox)findViewById(R.id.checkBox2);
        CheckBox ck3=(CheckBox)findViewById(R.id.checkBox3);
        CheckBox ck4=(CheckBox)findViewById(R.id.checkBox4);
        CheckBox ck5=(CheckBox)findViewById(R.id.checkBox5);
        CheckBox ck6=(CheckBox)findViewById(R.id.checkBox6);

        ck1.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }

        });
        ck2.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }
        });
        ck3.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }
        });
        ck4.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }
        });
        ck5.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }
        });
        ck6.setOnCheckedChangeListener((v,ckecked)->{
            if(ckecked){
                list.add(v.getText().toString());
            }else if(list.contains(v.getText().toString())){
                list.remove(v.getText().toString());
                return;
            }
        });

        next.setOnClickListener(v->{
            String data=this.getIntent().getStringExtra("data");
            String temp="";
            if(list.size()==0){
                Toast.makeText(this,"please choose one!",Toast.LENGTH_LONG).show();
                return;
            }else{
                for(String s:list){
                    temp=temp+"-"+s;
                }
            }
            temp=temp.substring(1,temp.length());
            data=data+","+temp;


            Intent intent=new Intent(this,Main7Activity.class);
            intent.putExtra("data",data);
            this.startActivity(intent);
        });

    }

}
