package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    private TextView tView;
    private RadioButton radioButton1, radioButton2, radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView = (TextView)findViewById(R.id.tvMessage);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);

    }

    public void seleccionRadioButton(View view){
        //Diferentes formas de presentar la selección
        if(radioButton1.isChecked()){
            //rb1
            String selectionString = radioButton1.getText() + " - " + radioButton1.getResources().getResourceEntryName(radioButton1.getId());
            tView.setText(selectionString);
        } else if (radioButton2.isChecked()){
            //rb2
            tView.setText(MessageFormat.format("{0} - {1}", radioButton2.getText(), radioButton2.getResources().getResourceEntryName(radioButton2.getId())));
        } else {
            //rb3
            tView.setText(String.format("%s - %s", radioButton3.getText(), radioButton3.getResources().getResourceEntryName(radioButton3.getId())));
        }
    }
}