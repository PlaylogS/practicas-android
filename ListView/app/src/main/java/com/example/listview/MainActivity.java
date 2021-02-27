package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView myList;
    private TextView mySelection;

    private static final String namesList [] = {
            "Alberto",
            "Jesús",
            "Joaquín",
            "María",
            "Alicia",
            "Raúl",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos las vistas a los objetos
        myList = (ListView)findViewById(R.id.ListView);
        mySelection = (TextView)findViewById(R.id.tvSelection);

        //Creamos el adaptador con el resource layout item_list
        ArrayAdapter <String> adapter = new ArrayAdapter <String> (this, R.layout.item_list, namesList);

        //Asignamos el adaptador a la lista
        myList.setAdapter(adapter);

        //Creamos un ItemClickListener con el método onItemClick que obtiene el item de la posicion pulsada
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mySelection.setText("Se ha seleccionado " + myList.getItemAtPosition(position));
            }
        });
    }
}