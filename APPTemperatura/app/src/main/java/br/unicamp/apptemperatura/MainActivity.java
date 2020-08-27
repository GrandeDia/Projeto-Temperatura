package br.unicamp.apptemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTemperatura = (TextView) findViewById(R.id.tvCelcius);
    TextView tvTemperaturaCelcius = (TextView) findViewById(R.id.tvConverterTemperatura);
    TextView tvErro = (TextView) findViewById(R.id.tvErro);
    EditText edCelcius = (EditText) findViewById(R.id.edCelcius);
    Button btnConverter = (Button) findViewById(R.id.btnConverter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edCelcius.getText().toString().isEmpty())
                {
                    tvErro.setText("Por Favor, digite um valor");
                }
                else
                {
                    Intent intencao = new Intent(MainActivity.this , ExibirConversao.class);
                    Bundle enviar = new Bundle();

                    enviar.putString("celcius" , edCelcius.getText().toString());

                    intencao.putExtras(enviar);

                    startActivity(intencao);
                }




            }
        });
    }
}