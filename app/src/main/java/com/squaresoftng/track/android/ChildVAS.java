package com.squaresoftng.track.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by acer on 12/18/2016.
 */

public class ChildVAS extends Activity implements AdapterView.OnItemSelectedListener{
    EditText parent_name, childName, age;
    Spinner gender, sideEffect, deworm, vas;
    ImageView fingerScanner;
    TextView sexTextview, dewormTextview, effectTextview, vasTextview;

    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.child_vas);


        sexTextview = (TextView) findViewById(R.id.child_vas_sex);
        dewormTextview = (TextView) findViewById(R.id.child_vas_deworm);
        effectTextview = (TextView) findViewById(R.id.child_vas_effects);
        vasTextview = (TextView) findViewById(R.id.child_vas_vas);

        parent_name = (EditText) findViewById(R.id.child_vacine_parent_name);
        childName = (EditText) findViewById(R.id.child_vacine_child_name);
        age = (EditText) findViewById(R.id.child_vaccine_age);


        sideEffect = (Spinner) findViewById(R.id.child_vas_spinner_side_effects);
        deworm = (Spinner) findViewById(R.id.child_vas_spinner_deworm);
        vas = (Spinner) findViewById(R.id.child_vas_spinner_vas);

        fingerScanner = (ImageView) findViewById(R.id.fingerScanner);



        gender = (Spinner) findViewById(R.id.child_vas_spinner_sex);
        gender.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSex = ArrayAdapter.createFromResource(this, R.array.sex, android.R.layout.simple_spinner_item);
        adapterSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(adapterSex);


        sideEffect.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSideEffect = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sideEffect.setAdapter(adapterSideEffect);


        deworm.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterDosage = ArrayAdapter.createFromResource(this, R.array.dosage, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        deworm.setAdapter(adapterDosage);

        vas.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adaptervas = ArrayAdapter.createFromResource(this, R.array.dosage, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vas.setAdapter(adaptervas);


        fingerScanner = (ImageView) findViewById(R.id.fingerScanner);
        fingerScanner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "captured", Toast.LENGTH_SHORT).show();
                return true;
            }
        });


    }
    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

