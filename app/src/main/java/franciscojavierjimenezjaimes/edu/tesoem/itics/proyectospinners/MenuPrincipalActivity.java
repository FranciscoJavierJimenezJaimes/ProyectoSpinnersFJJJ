package franciscojavierjimenezjaimes.edu.tesoem.itics.proyectospinners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void Agregarscreen(View view) {
        Intent Agregarscreen = new Intent(this, addActivity.class);
        startActivity(Agregarscreen);
        Toast.makeText(getApplicationContext(), "Cargando Pantalla Agregar Color ", Toast.LENGTH_LONG).show();
    }

    public void Mostrarscreen(View view) {
        Intent Mostrarscreen = new Intent(this, MostrarActivity.class);
        startActivity(Mostrarscreen);
        Toast.makeText(getApplicationContext(), "Cargando Pantalla Mostrar Color", Toast.LENGTH_LONG).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.acercade, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.Acercade) {
            Toast.makeText(this, "Acerca De.", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, AcercaActivity.class));
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
