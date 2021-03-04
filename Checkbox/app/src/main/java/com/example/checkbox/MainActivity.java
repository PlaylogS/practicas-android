package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox val1 = findViewById(R.id.checkBox1);
        CheckBox val2 = findViewById(R.id.checkBox2);
        CheckBox val3 = findViewById(R.id.checkBox3);
        CheckBox val4 = findViewById(R.id.checkBox4);

        //Creamos un listener por código para el checkbox 1
        //El resto de checkboxes se establece el evento click mediante el atributo onClick del diseñador
        val1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCheckboxClicked(v);
            }
        });
    }

    public void onCheckboxClicked(View view){

        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked){
                    Toast.makeText(this, "Valor 1 checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Valor 1 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox2:
                if (checked){
                    Toast.makeText(this, "Valor 2 checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Valor 2 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox3:
                if (checked){
                    Toast.makeText(this, "Valor 3 checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Valor 3 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox4:
                if (checked){
                    Toast.makeText(this, "Valor 4 checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Valor 4 unchecked", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}