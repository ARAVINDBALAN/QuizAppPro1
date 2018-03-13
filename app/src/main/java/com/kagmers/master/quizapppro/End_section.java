package com.kagmers.master.quizapppro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class End_section extends AppCompatActivity {
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_section);
        go =(Button)findViewById(R.id.main);
    }
    public int main(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        return 0;
    }
    public void wont(View view){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}
