package com.example.aartisharma.truth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity implements View.OnClickListener{
    Button bt1login,bt2signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bt1login=findViewById(R.id.bt1login);
        bt2signUp=findViewById(R.id.bt2signUp);
        bt1login.setOnClickListener(this);
        bt2signUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt1login:
                Intent inSelectionPg=new Intent(Splash.this,SelectionPage.class);
                startActivity(inSelectionPg);
                finish();
                break;
         /*   case R.id.bt2signUp:
                Intent i2signUp=new Intent(Splash.this,NewUser.class);
                startActivity(i2signUp);
                finish();
                break;*/

        }
    }
}
