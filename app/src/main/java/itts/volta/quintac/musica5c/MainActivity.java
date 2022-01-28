package itts.volta.quintac.musica5c;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    GestioneBrani gb;
    EditText txtAutore;
    EditText txtTitolo;
    EditText intDurata;
    Button btnInserimento;
    Spinner spnGen;
    Button btnLista;

    String[] genMusicali= {"Pop", "Rock", "Liscio", "Dance"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserimento= (Button)findViewById(R.id.btnInserisci);
        txtAutore=(EditText) findViewById(R.id.txtAutore);
        txtTitolo=(EditText) findViewById(R.id.txtTitolo);
        intDurata=(EditText) findViewById(R.id.txtDurata);
        btnLista= (Button) findViewById(R.id.btnList);


        gb= new GestioneBrani();
        spnGen= (Spinner)findViewById(R.id.spnGen);
        ArrayAdapter<String> aaG= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, genMusicali);
        spnGen.setAdapter(aaG);

        btnInserimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genersel= spnGen.getSelectedItem().toString();
                String autoreBrano= txtAutore.getEditableText().toString();
                String titoloBrano= txtTitolo.getEditableText().toString();
                int durataBrano= Integer.parseInt(intDurata.getText().toString());
                gb.addBrano(titoloBrano, autoreBrano, genersel, durataBrano);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListaBraniActivity.class);
                i.putExtra("gb", gb);
            }
        });



    }
}