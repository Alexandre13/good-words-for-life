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
		
		
		Button btnvoltar; // criação do objeto btnvoltar
		
		btnvoltar=(Button) findViewById(R.id.btnvoltar); // instanciando o objeto para ativação do botão
		// Método que chama a função click do botão
    	btnvoltar.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				carregarVoltar();// chamada do Método carregarVoltar
				
			}
		});
		//Vetor que contém as frases a serem exibidas
		final String vet[]={"Confessar que nos enganamos é saber que temos um erro a menos. Autor Desconhecido",
				"Sorria sempre, mesmo que seu sorriso seja um sorriso triste, pois mais triste que um sorriso triste é a tristeza de não poder sorrir. Autor Desconhecido",
				"A inteligência é o farol que nos guia, mas é a vontade que nos faz caminhar. Autor Desconhecido",
				"Quem deixa para fazer depois o que pode fazer hoje, perde o que nunca mais encontrará: o tempo. Autor Desconhecido",
				"Nem tudo o que nos aborrece e faz sofrer é, forçosamente, um mal em nossa vida. Autor Desconhecido",
				"Podemos escolher o que semear, mas somos obrigados a colher aquilo que plantamos. Autor Desconhecido",
				"Toda meia tem o seu pé, toda luva a sua mão; todo crente a sua fé, todo mal a solução. Autor Desconhecido",
				"Não diga à Deus o tamanho do seu problema. Diga ao problema o tamanho do seu Deus. Autor Desconhecido",
				"As coisas nunca são tão boas quanto esperamos, nem tão ruins quanto tememos. Autor Desconhecido",
				"Na tua mente há espaço para apenas um pensamento de cada vez. Cuida, então, que seja um pensamento positivo. Autor Desconhecido",
				"Não podemos evitar que os pássaros da amargura voem sobre nossas cabeças, mas podemos evitar que eles façam ninhos em nossos cabelos. Autor Desconhecido",
				"Não veja cada oportunidade como um problema: veja cada problema como uma oportunidade. Autor Desconhecido",
				"Cada gesto de amor ressoa no universo, que o devolve em copiosa chuva de luz. Autor Desconhecido",
				"Quando julgamos tudo acabado, nos enganamos, pois é aí que tudo se inicia. Autor Desconhecido",
				"Se você está seguindo no rumo errado , lembre-se de que Deus encheu a estrada de retornos. Autor Desconhecido",
				"Seja humilde para aceitar quando errou e tenha coragem para mudar o que for preciso. Autor Desconhecido",
				"Nunca desista de seus sonhos. Uma pessoa sem sonhos é como um pássaro de asas quebradas, que não pode voar. Autor Desconhecido",
				"Os sonhos se realizam para aqueles que trabalham enquanto sonham. Autor Desconhecido",
				"Não espere esperando. Espere vivendo. Autor Desconhecido"} ;
		int aux=0;// variável que auxiliará no acesso aos índices do vetor
		Random a=new Random(); // objeto do tipo Random, para sortear uma frase
		aux=(a.nextInt(19)+0); // utilizando aux para armazenamento do índice sorteado
		TextView txtresu=(TextView) findViewById(R.id.txtport); // instanciação do objeto que exibirá a frase
		txtresu.setText(""+vet[aux]); //exibindo a frase sorteada
		
		fazendo();//Método para exibição de uma frase em específico

	}

	
public void carregarVoltar(){
    	
    	finish(); //função já pronta que elimina a Activity
    	
    }

	public void fazendo(){	
		String aa ="Aprecie sem moderação!!"; // variável tipo texto com uma frase já determinada
		Toast t= Toast.makeText(getBaseContext(), aa, Toast.LENGTH_LONG); // criação e instanciação do objeto t do tipo Toast
		t.show();// exibindo a frase
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.port, menu);
		return true;
	}

}
