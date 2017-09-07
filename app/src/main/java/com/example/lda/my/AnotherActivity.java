package com.example.lda.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent intent=getIntent();
        String message = intent.getStringExtra("date");
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

        Button button=(Button)findViewById(R.id.buttonReturn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                EditText editText1 = (EditText) findViewById(R.id.User2);
                String date_2= editText1.getText().toString().trim();
                intent.putExtra("data2",date_2);
                setResult(0,intent);
                finish();





            }
        });
    }


}
