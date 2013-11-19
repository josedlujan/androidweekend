package com.aplicacion.android.weekend;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity implements OnClickListener{

	TextView tv1;
	ImageView imagen;
	EditText et1;
	Button boton,boton2,boton3;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv1 = (TextView) findViewById(R.id.tv1);
		imagen = (ImageView) findViewById(R.id.imagen1);
		et1 = (EditText) findViewById(R.id.et1);
		boton = (Button) findViewById(R.id.boton);
		boton2 = (Button) findViewById(R.id.boton2);
		boton3 = (Button) findViewById(R.id.boton3);
		
		tv1.setText("le cambie el texto al textview1");
		
		imagen.setOnClickListener(this);
		tv1.setOnClickListener(this);
		boton.setOnClickListener(this);
		boton2.setOnClickListener(this);
		boton3.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imagen1:
					Toast toast = new Toast(this);
					Toast.makeText(this, "le diste clic a la imagen",Toast.LENGTH_LONG).show();
			break;
		case R.id.boton:
					String tx = et1.getText().toString();
					tv1.setText(tx);
			break;
			
		case R.id.boton2:
					Animation rotacion;
					rotacion = AnimationUtils.loadAnimation(this,R.anim.rotate);
					rotacion.reset();
					imagen.startAnimation(rotacion);
			break;		
		case R.id.boton3:
			String nombre= et1.getText().toString();
			Intent intent = new Intent("android.intent.action.VENTANA2");
			intent.putExtra("nombrenuevo", nombre);
			startActivity(intent);
		
			break;	
		default:
			break;
		}
		
		
	}


}
