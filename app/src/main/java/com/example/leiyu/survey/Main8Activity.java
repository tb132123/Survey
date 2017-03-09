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

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Button next=(Button)findViewById(R.id.button7);
        EditText editText=(EditText)findViewById(R.id.editText3);

        next.setOnClickListener(v->{
            String str=editText.getText().toString().trim();
            if(str.length()==0){
                Toast.makeText(this.getApplicationContext(),"please input name!",Toast.LENGTH_LONG).show();
                return;
            }else{
                String data=this.getIntent().getStringExtra("data");
                Intent intent=new Intent(this,Main9Activity.class);

                data=data+","+str;
                intent.putExtra("data",data);
                this.startActivity(intent);

            }
        });

    }

}
