package com.example.aartisharma.truth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestAndroid extends AppCompatActivity {
    RadioGroup q1_2,q2_2,q3_2,q4_2,q5_2,q6_2,q7_2,q8_2,q9_2,q10_2;
    RadioButton rbtn1d_2,rbtn2a_2,rbtn3d_2,rbtn4b_2,rbtn5b_2,rbtn6b_2,rbtn7d_2,rbtn8c_2,rbtn9a_2,rbtn10c_2;
    Button submitAndroid_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_android);
        submitAndroid_2=findViewById(R.id.submitAndroid_2);
        q1_2=findViewById(R.id.q1_2);
        q2_2=findViewById(R.id.q2_2);
        q3_2=findViewById(R.id.q3_2);
        q4_2=findViewById(R.id.q4_2);
        q5_2=findViewById(R.id.q5_2);
        q6_2=findViewById(R.id.q6_2);
        q7_2=findViewById(R.id.q7_2);
        q8_2=findViewById(R.id.q8_2);
        q9_2=findViewById(R.id.q9_2);
        q10_2=findViewById(R.id.q10_2);
        rbtn1d_2=findViewById(R.id.rbtn1d_2);
        rbtn2a_2=findViewById(R.id.rbtn2a_2);
        rbtn3d_2=findViewById(R.id.rbtn3d_2);
        rbtn4b_2=findViewById(R.id.rbtn4b_2);
        rbtn5b_2=findViewById(R.id.rbtn5b_2);
        rbtn6b_2=findViewById(R.id.rbtn6b_2);
        rbtn7d_2=findViewById(R.id.rbtn7d_2);
        rbtn8c_2=findViewById(R.id.rbtn8c_2);
        rbtn9a_2=findViewById(R.id.rbtn9a_2);
        rbtn10c_2=findViewById(R.id.rbtn10c_2);
        submitAndroid_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String value1 = ((RadioButton) findViewById(q1_2.getCheckedRadioButtonId())).getText().toString();
               // boolean value11 = ((RadioButton) findViewById(q1_2.getCheckedRadioButtonId())).isSelected();
                final String value2 = ((RadioButton) findViewById(q2_2.getCheckedRadioButtonId())).getText().toString();
                final String value3 = ((RadioButton) findViewById(q3_2.getCheckedRadioButtonId())).getText().toString();
                final String value4 = ((RadioButton) findViewById(q4_2.getCheckedRadioButtonId())).getText().toString();
                final String value5 = ((RadioButton) findViewById(q5_2.getCheckedRadioButtonId())).getText().toString();
                final String value6 = ((RadioButton) findViewById(q6_2.getCheckedRadioButtonId())).getText().toString();
                final String value7 = ((RadioButton) findViewById(q7_2.getCheckedRadioButtonId())).getText().toString();
                final String value8 = ((RadioButton) findViewById(q8_2.getCheckedRadioButtonId())).getText().toString();
                final String value9 = ((RadioButton) findViewById(q9_2.getCheckedRadioButtonId())).getText().toString();
                final String value10 = ((RadioButton) findViewById(q10_2.getCheckedRadioButtonId())).getText().toString();
                final String check1 = rbtn1d_2.getText().toString();
                final String check2 = rbtn2a_2.getText().toString();
                final String check3 = rbtn3d_2.getText().toString();
                final String check4 = rbtn4b_2.getText().toString();
                final String check5 = rbtn5b_2.getText().toString();
                final String check6 = rbtn6b_2.getText().toString();
                final String check7 = rbtn7d_2.getText().toString();
                final String check8 = rbtn8c_2.getText().toString();
                final String check9 = rbtn9a_2.getText().toString();
                final String check10 = rbtn10c_2.getText().toString();
                int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, count = 0;
                for (int i = 0; i < 10; i++) {
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


                    count = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
                    if (count == 9 || count == 10)
                        Toast.makeText(TestAndroid.this, "excellent", Toast.LENGTH_SHORT).show();
                    else if (count == 7 || count == 8)
                        Toast.makeText(TestAndroid.this, "good", Toast.LENGTH_SHORT).show();
                    else if (count == 5 || count == 6)
                        Toast.makeText(TestAndroid.this, "try to score better", Toast.LENGTH_SHORT).show();
                    else if (count == 3 || count == 4)
                        Toast.makeText(TestAndroid.this, "work hard", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(TestAndroid.this, "need to study!", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }
}
