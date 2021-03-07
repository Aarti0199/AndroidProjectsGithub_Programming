package com.example.aartisharma.truth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SelectionPage extends AppCompatActivity{
RadioGroup options;
RadioButton op_java,op_android,op_reactJS,op_python,op_javaScript;
Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_page);
        options = findViewById(R.id.options);
        op_java = findViewById(R.id.op_java);
        op_javaScript = findViewById(R.id.op_javaScript);
        op_android=findViewById(R.id.op_android);
        op_reactJS=findViewById(R.id.op_reactJS);
        op_python=findViewById(R.id.op_python);
        btnOK = findViewById(R.id.btnOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String rgrpOptions = ((RadioButton) findViewById(options.getCheckedRadioButtonId())).getText().toString();
                final String rbtn1 = op_java.getText().toString();
                final String rbtn5 = op_javaScript.getText().toString();
                final String rbtn2=op_android.getText().toString();
                final String rbtn3=op_reactJS.getText().toString();
                final String rbtn4=op_python.getText().toString();
                if (rbtn1 == rgrpOptions) {
                    Intent inJavaPg = new Intent(SelectionPage.this, ExistUser.class);
                    startActivity(inJavaPg);
                    finish();
                }
                if (rbtn2 == rgrpOptions) {
                    Intent inAndroidPg = new Intent(SelectionPage.this, TestAndroid.class);
                    startActivity(inAndroidPg);
                    finish();

                }
                if (rbtn3 == rgrpOptions) {
                    Intent inReactJSPg = new Intent(SelectionPage.this, TestReactNative.class);
                    startActivity(inReactJSPg);
                    finish();
                }
                if (rbtn4==rgrpOptions){
                    Intent inPythonPg=new Intent(SelectionPage.this,TestPython.class);
                    startActivity(inPythonPg);
                    finish();
                }
                if (rbtn5==rgrpOptions){
                    Intent inJavaScriptPg=new Intent(SelectionPage.this,TestPython.class);
                    startActivity(inJavaScriptPg);
                    finish();
                }


            }
        });
    }

}
