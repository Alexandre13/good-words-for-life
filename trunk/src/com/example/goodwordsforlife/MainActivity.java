package com.example.goodwordsforlife;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  
        Button btnPort; // criação do objeto para acionar a PortActivity
        Button btnEngl; //criação do objeto para acionar a EnglActivity
    	btnPort=(Button) findViewById(R.id.btnPort); //instanciando o botão btnPort
    	
    	// método que chama a função click do botão 
    	btnPort.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				carregar(); // Método que invoca a activity PortActivity
				
			}
		});
    	
    	// método que chama a função click do botão
    	btnEngl=(Button) findViewById(R.id.button2);
    	btnEngl.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				carregarEnglish(); // Método que invoca a activity EnglActivity
				
			}
		});
    }
    
    
    public void carregar(){
    	Intent intent= new Intent(this,PortActivity.class); // criação e instanciação do objeto intent para ativar a PortActivity
    	startActivity(intent); //iniciando  a PortActivity
    }
    
    public void carregarEnglish(){
    	Intent intent= new Intent(this,EnglActivity.class); // criação e instanciação do objeto intent para ativar a EnglActivity
    	startActivity(intent); //iniciando  a PortActivity
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
