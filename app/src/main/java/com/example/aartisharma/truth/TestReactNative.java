package com.example.aartisharma.truth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestReactNative extends AppCompatActivity {
    RadioGroup q1_3,q2_3,q3_3,q4_3,q5_3,q6_3,q7_3,q8_3,q9_3,q10_3;
    RadioButton rbtn1b_3,rbtn2a_3,rbtn3c_3,rbtn4b_3,rbtn5d_3,rbtn6c_3,rbtn7b_3,rbtn8c_3,rbtn9a_3,rbtn10c_3;
    Button submitReactJS_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_react_native);
        submitReactJS_3=findViewById(R.id.submitReactJS_3);
        q1_3=findViewById(R.id.q1_3);
        q2_3=findViewById(R.id.q2_3);
        q3_3=findViewById(R.id.q3_3);
        q4_3=findViewById(R.id.q4_3);
        q5_3=findViewById(R.id.q5_3);
        q6_3=findViewById(R.id.q6_3);
        q7_3=findViewById(R.id.q7_3);
        q8_3=findViewById(R.id.q8_3);
        q9_3=findViewById(R.id.q9_3);
        q10_3=findViewById(R.id.q10_3);
        rbtn1b_3=findViewById(R.id.rbtn1b_3);
        rbtn2a_3=findViewById(R.id.rbtn2a_3);
        rbtn3c_3=findViewById(R.id.rbtn3c_3);
        rbtn4b_3=findViewById(R.id.rbtn4b_3);
        rbtn5d_3=findViewById(R.id.rbtn5d_3);
        rbtn6c_3=findViewById(R.id.rbtn6c_3);
        rbtn7b_3=findViewById(R.id.rbtn7b_3);
        rbtn8c_3=findViewById(R.id.rbtn8c_3);
        rbtn9a_3=findViewById(R.id.rbtn9a_3);
        rbtn10c_3=findViewById(R.id.rbtn10c_3);
        submitReactJS_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String value1 = ((RadioButton) findViewById(q1_3.getCheckedRadioButtonId())).getText().toString();
                final String value2 = ((RadioButton) findViewById(q2_3.getCheckedRadioButtonId())).getText().toString();
                final String value3 = ((RadioButton) findViewById(q3_3.getCheckedRadioButtonId())).getText().toString();
                final String value4 = ((RadioButton) findViewById(q4_3.getCheckedRadioButtonId())).getText().toString();
                final String value5 = ((RadioButton) findViewById(q5_3.getCheckedRadioButtonId())).getText().toString();
                final String value6 = ((RadioButton) findViewById(q6_3.getCheckedRadioButtonId())).getText().toString();
                final String value7 = ((RadioButton) findViewById(q7_3.getCheckedRadioButtonId())).getText().toString();
                final String value8 = ((RadioButton) findViewById(q8_3.getCheckedRadioButtonId())).getText().toString();
                final String value9 = ((RadioButton) findViewById(q9_3.getCheckedRadioButtonId())).getText().toString();
                final String value10 = ((RadioButton) findViewById(q10_3.getCheckedRadioButtonId())).getText().toString();
                final String check1 = rbtn1b_3.getText().toString();
                final String check2 = rbtn2a_3.getText().toString();
                final String check3 = rbtn3c_3.getText().toString();
                final String check4 = rbtn4b_3.getText().toString();
                final String check5 = rbtn5d_3.getText().toString();
                final String check6 = rbtn6c_3.getText().toString();
                final String check7 = rbtn7b_3.getText().toString();
                final String check8 = rbtn8c_3.getText().toString();
                final String check9 = rbtn9a_3.getText().toString();
                final String check10 = rbtn10c_3.getText().toString();
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
                        Toast.makeText(TestReactNative.this, "excellent", Toast.LENGTH_SHORT).show();
                    else if (count == 7 || count == 8)
                        Toast.makeText(TestReactNative.this, "good", Toast.LENGTH_SHORT).show();
                    else if (count == 5 || count == 6)
                        Toast.makeText(TestReactNative.this, "try to score better", Toast.LENGTH_SHORT).show();
                    else if (count == 3 || count == 4)
                        Toast.makeText(TestReactNative.this, "work hard", Toast.LENGTH_SHORT).show();
                    else if (count == 1 || count == 2)
                        Toast.makeText(TestReactNative.this, "need to study!", Toast.LENGTH_SHORT).show();

                }


                }
        });

    }
}
