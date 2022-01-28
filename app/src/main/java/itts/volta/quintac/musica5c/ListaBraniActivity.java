package itts.volta.quintac.musica5c;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import itts.volta.quintac.musica5c.databinding.ActivityListaBraniBinding;

public class ListaBraniActivity extends AppCompatActivity {

    ListView lvSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GestioneBrani gb = (GestioneBrani) getIntent().getSerializableExtra("gb");

        String canzoni= gb.visualizza().toString();
        lvSong= (ListView) findViewById(R.id.lista);
        //non funziona
        ArrayAdapter aaC= new ArrayAdapter <String>(getApplicationContext(), android.R.layout.simple_list_item_1, canzoni);
        lvSong.setAdapter(aaC);
    }

}