package br.com.goodwordsforlife;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PortActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_port);
		
		
		Button btnvoltar; // cria��o do objeto btnvoltar
		
		btnvoltar=(Button) findViewById(R.id.btnvoltar); // instanciando o objeto para ativa��o do bot�o
		// M�todo que chama a fun��o click do bot�o
    	btnvoltar.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				carregarVoltar();// chamada do M�todo carregarVoltar
				
			}
		});
		//Vetor que cont�m as frases a serem exibidas
		final String vet[]={"Confessar que nos enganamos � saber que temos um erro a menos. Autor Desconhecido",
				"Sorria sempre, mesmo que seu sorriso seja um sorriso triste, pois mais triste que um sorriso triste � a tristeza de n�o poder sorrir. Autor Desconhecido",
				"A intelig�ncia � o farol que nos guia, mas � a vontade que nos faz caminhar. Autor Desconhecido",
				"Quem deixa para fazer depois o que pode fazer hoje, perde o que nunca mais encontrar�: o tempo. Autor Desconhecido",
				"Nem tudo o que nos aborrece e faz sofrer �, for�osamente, um mal em nossa vida. Autor Desconhecido",
				"Podemos escolher o que semear, mas somos obrigados a colher aquilo que plantamos. Autor Desconhecido",
				"Toda meia tem o seu p�, toda luva a sua m�o; todo crente a sua f�, todo mal a solu��o. Autor Desconhecido",
				"N�o diga � Deus o tamanho do seu problema. Diga ao problema o tamanho do seu Deus. Autor Desconhecido",
				"As coisas nunca s�o t�o boas quanto esperamos, nem t�o ruins quanto tememos. Autor Desconhecido",
				"Na tua mente h� espa�o para apenas um pensamento de cada vez. Cuida, ent�o, que seja um pensamento positivo. Autor Desconhecido",
				"N�o podemos evitar que os p�ssaros da amargura voem sobre nossas cabe�as, mas podemos evitar que eles fa�am ninhos em nossos cabelos. Autor Desconhecido",
				"N�o veja cada oportunidade como um problema: veja cada problema como uma oportunidade. Autor Desconhecido",
				"Cada gesto de amor ressoa no universo, que o devolve em copiosa chuva de luz. Autor Desconhecido",
				"Quando julgamos tudo acabado, nos enganamos, pois � a� que tudo se inicia. Autor Desconhecido",
				"Se voc� est� seguindo no rumo errado , lembre-se de que Deus encheu a estrada de retornos. Autor Desconhecido",
				"Seja humilde para aceitar quando errou e tenha coragem para mudar o que for preciso. Autor Desconhecido",
				"Nunca desista de seus sonhos. Uma pessoa sem sonhos � como um p�ssaro de asas quebradas, que n�o pode voar. Autor Desconhecido",
				"Os sonhos se realizam para aqueles que trabalham enquanto sonham. Autor Desconhecido",
				"N�o espere esperando. Espere vivendo. Autor Desconhecido"} ;
		int aux=0;// vari�vel que auxiliar� no acesso aos �ndices do vetor
		Random a=new Random(); // objeto do tipo Random, para sortear uma frase
		aux=(a.nextInt(19)+0); // utilizando aux para armazenamento do �ndice sorteado
		TextView txtresu=(TextView) findViewById(R.id.txtport); // instancia��o do objeto que exibir� a frase
		txtresu.setText(""+vet[aux]); //exibindo a frase sorteada
		
		fazendo();//M�todo para exibi��o de uma frase em espec�fico

	}

	
public void carregarVoltar(){
    	
    	finish(); //fun��o j� pronta que elimina a Activity
    	
    }

	public void fazendo(){	
		String aa ="Aprecie sem modera��o!!"; // vari�vel tipo texto com uma frase j� determinada
		Toast t= Toast.makeText(getBaseContext(), aa, Toast.LENGTH_LONG); // cria��o e instancia��o do objeto t do tipo Toast
		t.show();// exibindo a frase
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.port, menu);
		return true;
	}

}
