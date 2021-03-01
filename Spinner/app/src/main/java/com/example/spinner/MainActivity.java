package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerDefault, spinnerCustom;
    private TextView selectionDefault, selectionCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos las vistas a los objetos.
        spinnerDefault = (Spinner)findViewById(R.id.spinner_default);
        spinnerCustom  = (Spinner)findViewById(R.id.spinner_custom);
        selectionDefault = (TextView)findViewById(R.id.tv_selectedItem_spinnerDefault);
        selectionCustom  = (TextView)findViewById(R.id.tv_selectedItem_spinnerCustom);

        //Creamos la lista de elementos
        String [] itemList = {"Element1", "Element2", "Element3", "Element4"};

        //Adaptador para el spinner por defecto
        ArrayAdapter <String> defaultAdapterItemList = new ArrayAdapter <String> (this, android.R.layout.simple_list_item_1, itemList);

        //Adaptador para el spinner personalizado. Se hace uso del layout custom_spinner.xml
        ArrayAdapter <String> customAdapterItemList = new ArrayAdapter <String> (this, R.layout.custom_spinner, itemList);

        //Establecemos el adaptador
        spinnerDefault.setAdapter(defaultAdapterItemList);
        spinnerCustom.setAdapter(customAdapterItemList);

        spinnerDefault.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = spinnerDefault.getSelectedItem().toString();
                selectionDefault.setText(selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = spinnerCustom.getSelectedItem().toString();
                selectionCustom.setText(selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}