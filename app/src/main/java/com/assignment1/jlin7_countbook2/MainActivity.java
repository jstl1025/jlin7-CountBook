package com.assignment1.jlin7_countbook2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final int REQUEST_CODE=1;
    private String[] name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn= (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent (v.getContext(), CreateCounterActivity.class);
                startActivityForResult(intent, REQUEST_CODE);


                }
            });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if(data.hasExtra("counterName")){
                Context context = getApplicationContext();
                CharSequence text  = ("Counter "+data.getExtras().getString("counterName")+" created");
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }
    }
}
