package com.example.leiyu.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button bt1=(Button)findViewById(R.id.button);
        EditText dt1=(EditText)findViewById(R.id.editText);

        bt1.setOnClickListener(v->{
            String name=dt1.getText().toString().trim();
            if(name.length()==0){
                Toast.makeText(this.getApplicationContext(),"name can't be null\ntry again!",Toast.LENGTH_LONG).show();
                return;
            }else{
                Intent intent=new Intent(this,Main2Activity.class);
                intent.putExtra("name",name);
                this.startActivity(intent);

            }
        });
    }


}
