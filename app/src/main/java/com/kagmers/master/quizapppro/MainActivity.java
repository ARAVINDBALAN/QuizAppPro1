package com.kagmers.master.quizapppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button ent,sci,his1,ex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ent = (Button)findViewById(R.id.enter);
        sci = (Button)findViewById(R.id.science);
        his1 = (Button)findViewById(R.id.history);
        ex=(Button)findViewById(R.id.exit);
    }
    public void enter(View view){
        Intent i = new Intent(this,entertainment.class);
        startActivity(i);

    }
    public void hist(View v){
        Intent i = new Intent(this,history.class);
        startActivity(i);
    }
    public void scie(View view){
        Intent i = new Intent(this,science.class);
        startActivity(i);

    }

}
