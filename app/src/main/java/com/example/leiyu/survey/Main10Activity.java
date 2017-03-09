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
import android.widget.EditText;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button next=(Button)findViewById(R.id.button7);
        EditText editText=(EditText)findViewById(R.id.editText3);

        next.setOnClickListener(v->{
            String str=editText.getText().toString().trim();
            if(str.length()==0){
                Toast.makeText(this.getApplicationContext(),"please input job!",Toast.LENGTH_LONG).show();
                return;
            }else{
                String data=this.getIntent().getStringExtra("data");
                Intent intent=new Intent(this,Main11Activity.class);

                data=data+","+str;
                Log.d("msg",data);
                intent.putExtra("data",data);
                this.startActivity(intent);

            }
        });
    }

}
