package com.assignment1.jlin7_countbook2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn= (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(), CreateCounterActivity.class);
                startActivity(intent);
                //startActivityForResult(intent, REQUEST_CODE);


                }
            });
        }

}
