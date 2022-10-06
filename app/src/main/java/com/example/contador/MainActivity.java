package com.example.contador;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.contador.databinding.ActivityMainBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        setSupportActionBar(binding.toolbar);
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    public void incrementaContador(View vista){
        contador++;
        mostrarResultado();
    }
    public void decrementaContador(View vista){
        contador--;
        mostrarResultado();
    }
    public void reseteaContador(View vista){
        TextView textoEdit = (TextView) findViewById(R.id.editNumero);
        contador = Integer.parseInt(textoEdit.getText().toString());
        mostrarResultado();

    }

    public void mostrarResultado() {
        TextView textoContador = (TextView) findViewById(R.id.contadorText);
        textoContador.setText(""+contador);
    }

}