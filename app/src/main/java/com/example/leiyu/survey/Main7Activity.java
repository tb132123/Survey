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

public class Main7Activity extends AppCompatActivity {
    private String insIntes=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button next=(Button)findViewById(R.id.button6);
        RadioGroup group=(RadioGroup)findViewById(R.id.group2);

        group.setOnCheckedChangeListener((g,i)->{
            RadioButton ra=(RadioButton)findViewById(i);
            insIntes=ra.getText().toString();
        });


        next.setOnClickListener(v->{
            if(insIntes==null){
                Toast.makeText(this.getApplicationContext(),"please choose one !",Toast.LENGTH_LONG).show();
                return;
            }else{

                String data= this.getIntent().getStringExtra("data").toString();
                data=data+","+insIntes;
                Log.d("msg",data);
                Intent intent=new Intent(this,Main8Activity.class);
                intent.putExtra("data",data);
                this.startActivity(intent);
            }
        });
    }

}
