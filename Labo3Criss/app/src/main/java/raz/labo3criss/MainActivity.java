package raz.labo3criss;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String Number = "";
    public String MaskText="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void Effacer(View v)
    {

        if(Number.length() > 0)
        {
            Number = Number.substring(0,Number.length() -1);
            MaskText = MaskText.substring(0,MaskText.length() -1);
            ((EditText) findViewById(R.id.EditPW)).setText(MaskText);
        }

    }
    public void startActivity(View v)
    {
        if(Number.length() == 4 && !((EditText)findViewById(R.id.EditName)).getText().toString().isEmpty()) {
            Intent intent = new Intent(this, ReponseAuCode.class);
            String name = ((EditText) findViewById(R.id.EditName)).getText().toString();
            intent.putExtra("nom", name);
            intent.putExtra("code", Number);
            startActivity(intent);
        }
        else
        {

            Toast t = Toast.makeText(this,"entrer un code a 4 chiffre et un user name pliss",Toast.LENGTH_LONG);
            t.show();
        }
    }
    public void AddNumber(View v)
    {


        this.Number += ((Button) v).getText();
        MaskText += "*";
        ((EditText) findViewById(R.id.EditPW)).setText(MaskText);



    }
}
