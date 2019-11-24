package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectospinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MostrarActivity extends AppCompatActivity {
    ArrayList<Var> coloresList;
    Button btnmenu;
    Spinner spp;
    //color es una propiedad no olvidar
    ArrayAdapter<String> ColorD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        btnmenu = (Button) findViewById(R.id.btnmenu);
        spp = findViewById(R.id.spp);
        //usar variable
        ColorD = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Var.miscolores());
        coloresList = new ArrayList<Var>();

        spp.setAdapter(ColorD);

    }



    public void Menuprincipal(View view) {
        Intent Menuprincipal = new Intent(this, MenuPrincipalActivity.class);
        startActivity(Menuprincipal);
        Toast.makeText(getApplicationContext(), "Regresando al menu principal Loading... " , Toast.LENGTH_LONG).show();

    }
    public void iragregar(View view) {
        Intent iragregar = new Intent(this, addActivity.class);
        startActivity(iragregar);
        Toast.makeText(getApplicationContext(), "Regresando a Agregar Color Loading... " , Toast.LENGTH_LONG).show();

    }

}
