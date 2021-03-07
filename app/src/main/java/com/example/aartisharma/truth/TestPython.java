package com.example.aartisharma.truth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestPython extends AppCompatActivity {
    RadioGroup q1_4,q2_4,q3_4,q4_4,q5_4,q6_4,q7_4,q8_4,q9_4,q10_4;
    RadioButton rbtn1b_4,rbtn2a_4,rbtn3c_4,rbtn4a_4,rbtn5c_4,rbtn6c_4,rbtn7e_4,rbtn8a_4,rbtn9a_4,rbtn10d_4;
    Button submitPython_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_python);
        submitPython_4=findViewById(R.id.submitPython_4);
        q1_4=findViewById(R.id.q1_4);
        q2_4=findViewById(R.id.q2_4);
        q3_4=findViewById(R.id.q3_4);
        q4_4=findViewById(R.id.q4_4);
        q5_4=findViewById(R.id.q5_4);
        q6_4=findViewById(R.id.q6_4);
        q7_4=findViewById(R.id.q7_4);
        q8_4=findViewById(R.id.q8_4);
        q9_4=findViewById(R.id.q9_4);
        q10_4=findViewById(R.id.q10_4);
        rbtn1b_4=findViewById(R.id.rbtn1b_4);
        rbtn2a_4=findViewById(R.id.rbtn2a_4);
        rbtn3c_4=findViewById(R.id.rbtn3c_4);
        rbtn4a_4=findViewById(R.id.rbtn4a_4);
        rbtn5c_4=findViewById(R.id.rbtn5c_4);
        rbtn6c_4=findViewById(R.id.rbtn6c_4);
        rbtn7e_4=findViewById(R.id.rbtn7e_4);
        rbtn8a_4=findViewById(R.id.rbtn8a_4);
        rbtn9a_4=findViewById(R.id.rbtn9a_4);
        rbtn10d_4=findViewById(R.id.rbtn10d_4);
        submitPython_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String value1 = ((RadioButton) findViewById(q1_4.getCheckedRadioButtonId())).getText().toString();
                final String value2 = ((RadioButton) findViewById(q2_4.getCheckedRadioButtonId())).getText().toString();
                final String value3 = ((RadioButton) findViewById(q3_4.getCheckedRadioButtonId())).getText().toString();
                final String value4 = ((RadioButton) findViewById(q4_4.getCheckedRadioButtonId())).getText().toString();
                final String value5 = ((RadioButton) findViewById(q5_4.getCheckedRadioButtonId())).getText().toString();
                final String value6 = ((RadioButton) findViewById(q6_4.getCheckedRadioButtonId())).getText().toString();
                final String value7 = ((RadioButton) findViewById(q7_4.getCheckedRadioButtonId())).getText().toString();
                final String value8 = ((RadioButton) findViewById(q8_4.getCheckedRadioButtonId())).getText().toString();
                final String value9 = ((RadioButton) findViewById(q9_4.getCheckedRadioButtonId())).getText().toString();
                final String value10 = ((RadioButton) findViewById(q10_4.getCheckedRadioButtonId())).getText().toString();
                final String check1 = rbtn1b_4.getText().toString();
                final String check2 = rbtn2a_4.getText().toString();
                final String check3 = rbtn3c_4.getText().toString();
                final String check4 = rbtn4a_4.getText().toString();
                final String check5 = rbtn5c_4.getText().toString();
                final String check6 = rbtn6c_4.getText().toString();
                final String check7 = rbtn7e_4.getText().toString();
                final String check8 = rbtn8a_4.getText().toString();
                final String check9 = rbtn9a_4.getText().toString();
                final String check10 = rbtn10d_4.getText().toString();

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
                        Toast.makeText(TestPython.this, "excellent", Toast.LENGTH_SHORT).show();
                    else if (count == 7 || count == 8)
                        Toast.makeText(TestPython.this, "good", Toast.LENGTH_SHORT).show();
                    else if (count == 5 || count == 6)
                        Toast.makeText(TestPython.this, "try to score better", Toast.LENGTH_SHORT).show();
                    else if (count == 3 || count == 4)
                        Toast.makeText(TestPython.this, "work hard", Toast.LENGTH_SHORT).show();
                    else if (count == 1 || count == 2)
                        Toast.makeText(TestPython.this, "need to study!", Toast.LENGTH_SHORT).show();

                }




            }
        });
    }
}
