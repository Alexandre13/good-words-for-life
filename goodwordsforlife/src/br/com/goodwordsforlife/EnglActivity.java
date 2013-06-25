package br.com.goodwordsforlife;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EnglActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_engl);
		
		Button btnvoltar;// cria��o do objeto btnvoltar
		
		btnvoltar=(Button) findViewById(R.id.btnback);// instanciando o objeto para ativa��o do bot�o
		// M�todo que chama a fun��o click do bot�o
    	btnvoltar.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				carregarVoltar();// chamada do M�todo carregarVoltar				
			}
		});
    	//Vetor que cont�m as frases a serem exibidas
    	final String vet[]={"Confess that we deceive ourselves is know that we unless an error. Unknown Author",
    			"Always smile, even if your smile is one sad smile, because sadder than a smile sad is the sadness of not being able to smile. Unknown Author",
    			"Intelligence is the lighthouse that guides us, but it is the will that makes us move. Unknown Author",
    			"Who gets to do what you can do after Today, loses that never more will find: the time. Unknown Author",
    			"Not everything that bothers us is suffering and is necessarily an evil in our lives. Unknown Author",
    			"We can choose what we sow, but we are bound to reap what we plant. Unknown Author",
    			"Every socks has its foots, every gloves its hands;every believer his faith, all evil solution. Unknown Author",
    			"Don't talk to God the size of your problem.Tell the problem the size of your God. Unknown Author",
    			"Things are never as good as hopefully not as bad as feared. Unknown Author",
    			"In your mind there is room for only one Thinking once. Take care, then, that it be a positive thought. Unknown Author",
    			"We can not prevent the birds of sorrow from flying over our heads, but we can prevent them from making nests in our hair. Unknown Author",
    			"Do not see every opportunity as a problem:see every problem as an opportunity. Unknown Author",
    			"Each gesture of love resounds in the universe, that returns the same as rain light. Unknown Author",
    			"When we judge all finished, we deceive ourselves, because that is where everything starts. Unknown Author",
    			"If you're following the wrong direction, remember that God filled the road with returns. Unknown Author",
    			"Be humble to accept when you have a mistake and have the courage to change what you need. Unknown Author",
    			"Never give up your dreams. A person without dreams is like a broken winged bird that can not fly. Unknown Author",
    			"Dreams come true for those who work while they dream. Unknown Author",
    			"Do not wait expecting. Wait living. Unknown Author"};
		int aux=0;// vari�vel que auxiliar� no acesso aos �ndices do vetor
		Random a=new Random();// objeto do tipo Random, para sortear uma frase
		aux=(a.nextInt(19)+0);// utilizando aux para armazenamento do �ndice sorteado
		TextView txtresu=(TextView) findViewById(R.id.txtengl);// instancia��o do objeto que exibir� a frase
		txtresu.setText(vet[aux]);//exibindo a frase sorteada
		fazendo();//M�todo para exibi��o de uma frase em espec�fico

		
	}

	public void carregarVoltar(){
    	finish();//fun��o j� pronta que elimina a Activity
    }
	
	public void fazendo(){	
		String aa ="Enjoy without moderation!!"; // vari�vel tipo texto com uma frase j� determinada
		Toast t= Toast.makeText(getBaseContext(), aa, Toast.LENGTH_LONG); // cria��o e instancia��o do objeto t do tipo Toast
		t.show();// exibindo a frase
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.engl, menu);
		return true;
	}

}
