package com.example.aartisharma.truth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ExistUser extends AppCompatActivity {
    RadioGroup q1_1, q2_1,q3_1,q4_1,q5_1,q6_1,q7_1,q8_1,q9_1,q10_1;
    RadioButton rbtn1d_1,rbtn2b_1,rbtn3a_1,rbtn4a_1,rbtn5c_1,rbtn6b_1,rbtn7d_1,rbtn8a_1,rbtn9d_1,rbtn10a_1;
    Button submitJava_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exist_user);


        submitJava_1 = (Button) findViewById(R.id.submitJava_1);
        q1_1 = (RadioGroup) findViewById(R.id.q1_1);
        q2_1 = findViewById(R.id.q2_1);
        q3_1 = findViewById(R.id.q3_1);
        q4_1 = findViewById(R.id.q4_1);
        q5_1 = findViewById(R.id.q5_1);
        q6_1 = findViewById(R.id.q6_1);
        q7_1 = findViewById(R.id.q7_1);
        q8_1 = findViewById(R.id.q8_1);
        q9_1 = findViewById(R.id.q9_1);
        q10_1 = findViewById(R.id.q10_1);
        rbtn1d_1 = findViewById(R.id.rbtn1d_1);
        rbtn2b_1 = findViewById(R.id.rbtn2b_1);
        rbtn3a_1=findViewById(R.id.rbtn3a_1);
        rbtn4a_1=findViewById(R.id.rbtn4a_1);
        rbtn5c_1=findViewById(R.id.rbtn5c_1);
        rbtn6b_1=findViewById(R.id.rbtn6b_1);
        rbtn7d_1=findViewById(R.id.rbtn7d_1);
        rbtn8a_1=findViewById(R.id.rbtn8a_1);
        rbtn9d_1=findViewById(R.id.rbtn9d_1);
        rbtn10a_1=findViewById(R.id.rbtn10a_1);


        submitJava_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String value1 = ((RadioButton)findViewById(q1_1.getCheckedRadioButtonId())).getText().toString();
                final String value2 = ((RadioButton)findViewById(q2_1.getCheckedRadioButtonId())).getText().toString();
                final String value3 = ((RadioButton)findViewById(q3_1.getCheckedRadioButtonId())).getText().toString();
                final String value4 = ((RadioButton)findViewById(q4_1.getCheckedRadioButtonId())).getText().toString();
                final String value5 = ((RadioButton)findViewById(q5_1.getCheckedRadioButtonId())).getText().toString();
                final String value6 = ((RadioButton)findViewById(q6_1.getCheckedRadioButtonId())).getText().toString();
                final String value7 = ((RadioButton)findViewById(q7_1.getCheckedRadioButtonId())).getText().toString();
                final String value8 = ((RadioButton)findViewById(q8_1.getCheckedRadioButtonId())).getText().toString();
                final String value9 = ((RadioButton)findViewById(q9_1.getCheckedRadioButtonId())).getText().toString();
                final String value10 = ((RadioButton)findViewById(q10_1.getCheckedRadioButtonId())).getText().toString();
               final String check1=rbtn1d_1.getText().toString();
               final String check2=rbtn2b_1.getText().toString();
               final String check3=rbtn3a_1.getText().toString();
               final String check4=rbtn4a_1.getText().toString();
               final String check5=rbtn5c_1.getText().toString();
               final String check6=rbtn6b_1.getText().toString();
               final String check7=rbtn7d_1.getText().toString();
               final String check8=rbtn8a_1.getText().toString();
               final String check9=rbtn9d_1.getText().toString();
               final String check10=rbtn10a_1.getText().toString();
               int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,count=0;
               for(int i=0;i<10;i++) {
                   if (value1 == check1) {
                        c1 = 1;
                   }
                   if (value2 == check2) {
                        c2 = 1;
                   }
                   if (value3 == check3) {
                       c3 = 1;
                   }
                   if (value4 == check4) {
                       c4 = 1;
                   }
                   if (value5 == check5) {
                       c5 = 1;
                   }
                   if (value6 == check6) {
                       c6 = 1;
                   }
                   if (value7 == check7) {
                       c7 = 1;
                   }
                   if (value8 == check8) {
                       c8 = 1;
                   }
                   if (value9 == check9) {
                       c9 = 1;
                   }
                   if (value10 == check10) {
                       c10 = 1;
                   }

                   count=c1+c2+c3+c4+c5+c6+c7+c8+c9+c10;
                   if (count==9 || count==10)
                       Toast.makeText(ExistUser.this,"excellent",Toast.LENGTH_SHORT).show();
                   else if (count==7 || count==8)
                       Toast.makeText(ExistUser.this,"good",Toast.LENGTH_SHORT).show();
                   else if (count==5 || count==6)
                       Toast.makeText(ExistUser.this,"try to score better",Toast.LENGTH_SHORT).show();
                   else if (count==3 || count==4)
                       Toast.makeText(ExistUser.this,"work hard",Toast.LENGTH_SHORT).show();
                   else if (count==1 || count==2)
                       Toast.makeText(ExistUser.this,"need to study!",Toast.LENGTH_SHORT).show();

               }

            }
        });
    }
}
    /*public void addListenerOnButton() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = q1.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                q1 = (RadioButton) findViewById(selectedId);
                Toast.makeText(ExistUser.this,
                        q1.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }*/