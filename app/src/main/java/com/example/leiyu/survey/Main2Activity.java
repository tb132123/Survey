package com.example.leiyu.survey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt2=(Button)findViewById(R.id.button2);
        EditText et2=(EditText)findViewById(R.id.editText2);

        bt2.setOnClickListener(v->{
            String str=et2.getText().toString().trim();
            int age=0;
            try {
               age=Integer.parseInt(str);
            }catch (Exception e){Toast.makeText(this.getApplicationContext(),"please check your age !",Toast.LENGTH_LONG).show();}

            if(age<=0||age>200){
                Toast.makeText(this.getApplicationContext(),"please check your age !",Toast.LENGTH_LONG).show();
                return;
            }else{
                Intent intent=new Intent(this,Main3Activity.class);
                String name=this.getIntent().getStringExtra("name").toString();
                //Log.d("msg",name);
                intent.putExtra("data2",name+","+age);
                this.startActivity(intent);

            }
        });
    }
}
