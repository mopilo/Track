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
import android.widget.Toast;


/**
 * Created by acer on 12/17/2016.
 */

public class ChildVaccineActivity extends Activity implements AdapterView.OnItemSelectedListener
{
    Spinner spinnerVaccine, spinnerSex, spinnerSideEffect, spinnerDosage;
    EditText parentName, childName, age;
    ImageView fingerScanner;

    public void onCreate(Bundle saveInstanceState)
    {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.child_vaccine);
        //Edittext

        parentName = (EditText) findViewById(R.id.child_vacine_parent_name);
        childName = (EditText) findViewById(R.id.child_vacine_child_name);
        age = (EditText) findViewById(R.id.child_vaccine_age);

        spinnerVaccine = (Spinner) findViewById(R.id.child_vaccine_spinner_vaccine);
        spinnerVaccine.setOnItemSelectedListener(this);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.vaccine, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinnerVaccine.setAdapter(adapter);


        spinnerSex = (Spinner) findViewById(R.id.child_vaccine_spinner_sex);
        spinnerSex.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSex = ArrayAdapter.createFromResource(this, R.array.sex, android.R.layout.simple_spinner_item);
        adapterSex.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSex.setAdapter(adapterSex);

        spinnerSideEffect = (Spinner) findViewById(R.id.child_vaccine_spinner_side_effects);
        spinnerSideEffect.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSideEffect = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSideEffect.setAdapter(adapterSideEffect);

        spinnerDosage = (Spinner) findViewById(R.id.child_vaccine_spinner_dosage);
        spinnerDosage.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterDosage = ArrayAdapter.createFromResource(this, R.array.dosage, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDosage.setAdapter(adapterDosage);


        //finger scanner
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                return true;
            default:
               return super.onOptionsItemSelected(item);
        }
    }

}
