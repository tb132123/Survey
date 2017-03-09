package com.example.leiyu.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class Main12Activity extends AppCompatActivity {
    private  String data=null,txt=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView tt=(TextView)findViewById(R.id.textView12) ;

        Button yes=(Button)findViewById(R.id.button10);
        Button no=(Button)findViewById(R.id.button11);

        data=this.getIntent().getStringExtra("data").toString();
        String word[]=data.split("[,]");
         txt="Name:"+word[0]+"\nAge:"+word[1]+"\nGender:"+word[2]+"\nStudent?:"+word[3]+
                "\nPrefer country:"+word[4]+"\nPrefer sports:"+word[5]+"\nLike programe?:"+word[6]+
                "\nFavorite movie:"+word[7]+"\nPrefer system:"+word[8]+"\nExpect job:"+word[9]+
                "\nEmail:"+word[10];
        tt.setText(txt);

        yes.setOnClickListener(v->{

            try {
                //write file to local
                FileOutputStream fos= this.getBaseContext().openFileOutput("info.txt", Context.MODE_PRIVATE);
                fos.write(txt.getBytes("UTF-8"));
                fos.flush();
                fos.close();
            }catch (Exception e){
                Toast.makeText(this,"some wrong !",Toast.LENGTH_LONG).show();
            };

            Intent intent=new Intent(this,Main13Activity.class);
            this.startActivity(intent);
        });
        no.setOnClickListener(v->{
            Intent intent=new Intent(this,MainActivity.class);
            this.startActivity(intent);
        });
    }

}
