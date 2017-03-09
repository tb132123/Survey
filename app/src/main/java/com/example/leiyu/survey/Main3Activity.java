package com.example.leiyu.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private String sex=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RadioGroup group =(RadioGroup)findViewById(R.id.group);
        group.setOnCheckedChangeListener((g,i)->{
            RadioButton ra=(RadioButton)findViewById(i);
            sex=ra.getText().toString();
        });

        Button next=(Button)findViewById(R.id.button3);
        next.setOnClickListener(v->{
            if(sex==null){
                Toast.makeText(this.getApplicationContext(),"please choose one !",Toast.LENGTH_LONG).show();
                return;
            }else{

               String data= this.getIntent().getStringExtra("data2");
                data=data+","+sex;
                Intent intent=new Intent(this,Main4Activity.class);
                intent.putExtra("data",data);
                this.startActivity(intent);
                this.finish();
            }
        });
    }

}
