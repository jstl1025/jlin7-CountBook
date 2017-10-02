package com.assignment1.jlin7_countbook2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_counter);
    }

    public void finish(View view){

        EditText counterName = (EditText) findViewById(R.id.counterName);
        String name = counterName.getText().toString();
        /*EditText init = (EditText) findViewById(R.id.init);
        int initValue = Integer.parseInt(init.getText().toString());
        EditText comment = (EditText) findViewById(R.id.comment);
        String comments = comment.getText().toString();*/
        Intent data = new Intent();
        data.putExtra("counterName", name);
        setResult(RESULT_OK, data);
        super.finish();
    }
}
