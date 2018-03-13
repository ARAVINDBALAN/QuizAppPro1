package com.kagmers.master.quizapppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class science extends AppCompatActivity {
    Button h2,el1,el2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        h2= (Button)findViewById(R.id.h2o);
        el1=(Button)findViewById(R.id.el1);
        el2=(Button)findViewById(R.id.el2);
    }
    public void next(View view){
        Intent i = new Intent(this,End_section.class);
        startActivity(i);

    }
    public void noway(View view){
        Toast.makeText(this,"No way",Toast.LENGTH_SHORT).show();
    }
}
