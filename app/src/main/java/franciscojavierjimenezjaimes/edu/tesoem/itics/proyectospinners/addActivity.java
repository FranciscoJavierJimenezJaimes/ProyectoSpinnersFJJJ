package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectospinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class addActivity extends AppCompatActivity {
    //EditText = al nombre del campo de plaintext
    EditText nombrecolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        nombrecolor = (EditText) findViewById(R.id.nombrecolor);



    }


    public void agrega(View v) {

            if (nombrecolor.length()<1) {
                Toast.makeText(this, "ups... Verifica que escribiste algo rey", Toast.LENGTH_LONG).show();
            } else {
                Var.agrega(nombrecolor.getText().toString());
                nombrecolor.setText("");
                Toast.makeText(getApplicationContext(), "Se registro con exito sin base de datos    " , Toast.LENGTH_LONG).show();


        }
    }


    public void Mostrarscreen(View view) {
        Intent Mostrarscreen = new Intent(this, MostrarActivity.class);
        startActivity(Mostrarscreen);

    }

    public void menuprincipal(View view) {
        Intent menuprincipal = new Intent(this, MenuPrincipalActivity.class);
        startActivity(menuprincipal);

    }
}
