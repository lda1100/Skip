package com.example.lda.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.buttonTest);
        button.setOnClickListener(new View.OnClickListener()


                 {
            @Override
                    public void onClick(View v){
                EditText editText1 = (EditText) findViewById(R.id.User1);
                String date_1 = editText1.getText().toString().trim();


                Intent intent = new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("date",date_1);
                startActivityForResult(intent,0);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==0 && resultCode==0){
            String str=data.getStringExtra("data2");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
}
        }
