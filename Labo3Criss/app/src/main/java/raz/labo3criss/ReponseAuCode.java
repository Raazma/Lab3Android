package raz.labo3criss;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ReponseAuCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reponse_au_code);

        Intent intent = getIntent();
        String name = intent.getStringExtra("nom");
        String code = intent.getStringExtra("code");

        Gestion(name,code);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reponse_au_code, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Gestion(String name,String code)
    {

        if(code.equals("1337")) {
            ((TextView) findViewById(R.id.View)).setBackgroundColor(Color.GREEN);
            ((TextView) findViewById(R.id.View)).setText("Salut a toi " + name + " Tu es un heros des terres inconnues");

        }
        else {
            ((TextView) findViewById(R.id.View)).setBackgroundColor(Color.RED);
            ((TextView) findViewById(R.id.View)).setText("ERREUR DE CODE MAUDIT FOU!!!!");
        }

    }
}