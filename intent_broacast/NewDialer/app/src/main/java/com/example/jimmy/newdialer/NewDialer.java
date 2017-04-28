package com.example.jimmy.newdialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewDialer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button button = (Button)findViewById(R.id.Button01);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View b){
                Intent I = new Intent(Intent.ACTION_DIAL, Uri.parse("tel://10086"));
                startActivity(I);
            }
        }
        );
    }
}
