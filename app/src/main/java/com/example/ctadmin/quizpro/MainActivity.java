package com.example.ctadmin.quizpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gotoButton = (Button) findViewById(R.id.result);

        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                CheckBox qAnswer1 = (CheckBox) findViewById(R.id.checkbox1);
                boolean isChecked1 = qAnswer1.isChecked();
                CheckBox qAnswer2 = (CheckBox) findViewById(R.id.checkbox2);
                boolean isChecked2 = qAnswer2.isChecked();
                CheckBox qAnswer3 = (CheckBox) findViewById(R.id.checkbox3);
                boolean isChecked3 = qAnswer3.isChecked();
                CheckBox qAnswer4 = (CheckBox) findViewById(R.id.checkbox4);
                boolean isChecked4 = qAnswer4.isChecked();
                if (isChecked2 && isChecked4 && !isChecked1 && !isChecked3) {
                    quizScore = quizScore + 1;
                }
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.rg1);
                int selectedId2 = rg1.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(R.id.bob);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals("Bob Iger ")) {

                        quizScore = quizScore + 1;
                    }
                }

                RadioGroup rg2 = (RadioGroup) findViewById(R.id.rg2);
                int selectedId3 = rg2.getCheckedRadioButtonId();
                if (selectedId3 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(R.id.chandrasekaran);
                    String radioButtonText3 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText3).equals("Natrajan Chandrasekaran ")) {

                        quizScore = quizScore + 1;
                    }
                }

                RadioGroup rg3 = (RadioGroup) findViewById(R.id.rg3);
                int selectedId4 = rg3.getCheckedRadioButtonId();
                if (selectedId4 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(R.id.mark);
                    String radioButtonText3 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText3).equals("Mark Parker ")) {

                        quizScore = quizScore + 1;
                    }
                }
                EditText sampleEditTextView = (EditText) findViewById(R.id.edittextsample);
                String value = sampleEditTextView.getText().toString();
                if (sampleEditTextView.getText().equals("Vishal Sikka"))
                    quizScore = quizScore + 1;
            }
        });

        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(quizScore));

    }
}
