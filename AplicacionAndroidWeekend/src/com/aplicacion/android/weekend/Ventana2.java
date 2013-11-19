package com.aplicacion.android.weekend;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Ventana2 extends Activity{

		ListView lista;
		ArrayAdapter<String>  adaptador;
		ArrayList datos;
		String datorecibido;
		
		TextView textov2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ventana2);

		lista = (ListView) findViewById(R.id.lv);
		
		
		Bundle extras = getIntent().getExtras();
		datorecibido = extras.getString("nombrenuevo");
		
		datos = new ArrayList();
		llenarlista();
		
		adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,datos);
		
		
		lista.setAdapter(adaptador);
		
		
		
		
		
		
		
		
		//textov2 = (TextView) findViewById(R.id.newtv);
		//textov2.setText(datorecibido);
		
		
	}
	
	private void llenarlista(){
		datos.add("dato1");
        datos.add(datorecibido);
        datos.add("Pedro");
        datos.add("Sergio");
        datos.add("Jeronimo");
		
		
	}
}
