package br.unicamp.apptemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ExibirConversao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_conversao);

        TextView tvFahrenheit = (TextView)findViewById(R.id.tvFahrenheit);
        TextView tvKelvin = (TextView)findViewById(R.id.tvKelvin);
        Button btnVoltar = (Button) findViewById(R.id.btnVoltar);

        Intent  intencao = getIntent();
        Bundle receber = intencao.getExtras();

        double celcius = Double.parseDouble(receber.getString("celcius"));

        String fahrenheit = (celcius + 32) + "";
        String kelvin = (((celcius * 9)/5) + 32) + "";

        tvFahrenheit.setText(fahrenheit);
        tvKelvin.setText(kelvin);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}