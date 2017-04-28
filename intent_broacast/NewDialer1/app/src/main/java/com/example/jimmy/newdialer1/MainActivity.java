package com.example.jimmy.newdialer1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final EditText phoneNum = (EditText)findViewById(R.id.phoneNum);
        final Button button = (Button)findViewById(R.id.Button01);
        button.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View b){
               String call = phoneNum.getText().toString();
               if (PhoneNumberUtils.isGlobalPhoneNumber(call)){
                   Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel://"+call));
                   startActivity(i);
               }
               else{
                   Toast.makeText(MainActivity.this,R.string.notify_incorrect_phonenum,Toast.LENGTH_LONG).show();
               }
           }
        });
    }
}
