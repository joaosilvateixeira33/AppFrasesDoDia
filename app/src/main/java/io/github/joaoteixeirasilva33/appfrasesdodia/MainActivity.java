package io.github.joaoteixeirasilva33.appfrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "O melhor está por vir.",
            "Acredite: você é capaz.",
            "Um dia de cada vez.",
            "Feito é melhor que perfeito.",
            "O impossível é questão de opinião.",
            "Sua atitude define sua altitude.",
            "Não pare até se orgulhar.",
            "Foco, força e fé.",
            "Seja a sua melhor versão.",
            "Gratidão gera gratidão."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textFrase);
        int numeroAleatorio = new Random().nextInt( 10 );
        String frase = frases[numeroAleatorio];
        texto.setText(frase);
    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textFrase);
        String textoResultado = "";
        for (String frase : frases){
            textoResultado += frase + "\n";
        }

        texto.setText( textoResultado );
    }

}