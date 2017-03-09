package com.example.leiyu.survey;

import android.content.Intent;
import android.os.Bundle;
import java.util.regex.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {
    private String email=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button next=(Button)findViewById(R.id.button7);
        EditText editText=(EditText)findViewById(R.id.editText3);

        next.setOnClickListener(v->{
            email=editText.getText().toString().trim();
            if(email==null){
                Toast.makeText(this.getApplicationContext(),"please input job!",Toast.LENGTH_LONG).show();
                return;
            }else if(!this.isValid(email)){
                Toast.makeText(this.getApplicationContext(),"Please enter a valid address!",Toast.LENGTH_LONG).show();
            }else{
                Intent intent=new Intent(this,Main12Activity.class);
                String data=this.getIntent().getStringExtra("data");
                data=data+","+email;
                Log.d("msg",data);
                intent.putExtra("data",data);
                this.startActivity(intent);

            }


        });

    }


    public boolean isValid(String str){
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(str);
        boolean isMatched = matcher.matches();
        return  isMatched;
    }

}
