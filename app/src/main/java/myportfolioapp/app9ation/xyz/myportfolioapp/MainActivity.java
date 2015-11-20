package myportfolioapp.app9ation.xyz.myportfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void displayToast(View v) {
        // 1) Possibly check for instance of first
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        String display = "The button will launch " + buttonText.toLowerCase();
        Toast t = Toast.makeText(this,display,Toast.LENGTH_SHORT);
        t.show();

    }


}
