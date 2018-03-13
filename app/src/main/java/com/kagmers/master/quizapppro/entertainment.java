package com.kagmers.master.quizapppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class entertainment extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        b1=(Button)findViewById(R.id.buzz);
        b2=(Button)findViewById(R.id.t2);
    }
    public void next(View view){
        Intent i = new Intent(this,End_section.class);
        startActivity(i);

    }
    public void noway(View view){
        Toast.makeText(this,"No way",Toast.LENGTH_SHORT).show();
    }
}

