package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    
    private TextView textView;
    private Button button1;     // Declaramos el objeto para el botón1 y controlar el evento onClick
                                // por código. El evento onClick del resto de botones se controla por
                                // los atributos en el diseñador.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        textView = (TextView)findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }


        });

    }

    public void buttonClick(View v){
        textView.setText(v.getResources().getResourceEntryName(v.getId()));
    }


}