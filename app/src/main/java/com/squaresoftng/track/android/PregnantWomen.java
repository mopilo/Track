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

/**
 * Created by acer on 12/18/2016.
 */

public class PregnantWomen extends Activity implements AdapterView.OnItemSelectedListener {
    EditText fullName, phoneNumber, age, medicationOption, supplementOption, pregnantWomenFood, pregnantWomenChildren;
    TextView pregnancy_duration, Pregnancy_feelings, Pregnancy_atenatal_care, pregnancy_smoke, Pregnancy_alcohol, pregnancy_working, pregnancy_supplements, pregnancy_medication;
    Spinner spinnerPregnantWomenPregnancyDuration, spinnerPregnantWomenFeelings, spinnerPregnantWomenAntenal, spinnerPregnantWomenSmoke;
    Spinner spinnerPregnantWomenSupplement,spinnerPregnantWomenAlcohol, spinnerPregnantWomenWorking, spinnerPregnantWomenMedication;
    ImageView fingerSanner;
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.pregnant_women_activity);


        fullName = (EditText) findViewById(R.id.pregnant_women_fname);
        phoneNumber = (EditText) findViewById(R.id.pregnant_women_phone);
        age = (EditText) findViewById(R.id.pregnant_women_age);
        medicationOption = (EditText) findViewById(R.id.pregnant_women_child_medication_option);
        supplementOption = (EditText) findViewById(R.id.pregnant_women_child_supplements_option);
        pregnantWomenFood = (EditText) findViewById(R.id.pregnant_women_food);
        pregnantWomenChildren = (EditText) findViewById(R.id.pregnant_women_children);

        pregnancy_duration = (TextView) findViewById(R.id.pregnant_women_pregnancy);
        Pregnancy_feelings = (TextView) findViewById(R.id.pregnant_women_feelings);
        Pregnancy_atenatal_care = (TextView) findViewById(R.id.pregnant_women_antenatal);
        pregnancy_smoke = (TextView) findViewById(R.id.pregnant_women_smoke);
        Pregnancy_alcohol = (TextView) findViewById(R.id.pregnant_women_alcohol);
        Pregnancy_feelings = (TextView) findViewById(R.id.pregnant_women_feelings);
        pregnancy_working = (TextView) findViewById(R.id.pregnant_women_working);
        pregnancy_supplements = (TextView) findViewById(R.id.pregnant_women_supplements);
        pregnancy_medication = (TextView) findViewById(R.id.pregnant_women_medication);


        spinnerPregnantWomenSupplement = (Spinner) findViewById(R.id.pregnant_women_spinner_supplements);
        spinnerPregnantWomenSupplement.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnancySupplement = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnancySupplement.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenSupplement.setAdapter(adapterPregnancySupplement);

        spinnerPregnantWomenAlcohol = (Spinner) findViewById(R.id.pregnant_women_spinner_alcohol);
        spinnerPregnantWomenAlcohol.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterSideEffect = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterSideEffect.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenAlcohol.setAdapter(adapterSideEffect);

        spinnerPregnantWomenWorking = (Spinner) findViewById(R.id.pregnant_women_spinner_working);
        spinnerPregnantWomenWorking.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnancySmoking = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnancySmoking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenWorking.setAdapter(adapterPregnancySmoking);

        spinnerPregnantWomenMedication = (Spinner) findViewById(R.id.pregnant_women_spinner_side_medication);
        spinnerPregnantWomenMedication.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnancyMedication = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnancyMedication.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenMedication.setAdapter(adapterPregnancyMedication);



        spinnerPregnantWomenPregnancyDuration = (Spinner) findViewById(R.id.pregnant_women_spinner_pregnancy);
        spinnerPregnantWomenPregnancyDuration.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnancyDuration = ArrayAdapter.createFromResource(this, R.array.duration_pregnancy, android.R.layout.simple_spinner_item);
        adapterPregnancyDuration.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenPregnancyDuration.setAdapter(adapterPregnancyDuration);

        spinnerPregnantWomenFeelings = (Spinner) findViewById(R.id.pregnant_women_spinner_feelings);
        spinnerPregnantWomenFeelings.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnacyFeeling = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnacyFeeling.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenFeelings.setAdapter(adapterPregnacyFeeling);

        spinnerPregnantWomenAntenal = (Spinner) findViewById(R.id.pregnant_women_spinner_antenal);
        spinnerPregnantWomenAntenal.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnacyAntenatal = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnacyAntenatal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenAntenal.setAdapter(adapterPregnacyAntenatal);

        spinnerPregnantWomenSmoke = (Spinner) findViewById(R.id.pregnant_women_spinner_smoke);
        spinnerPregnantWomenSmoke.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterPregnancySmoke = ArrayAdapter.createFromResource(this, R.array.Side_effect, android.R.layout.simple_spinner_item);
        adapterPregnancySmoke.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPregnantWomenSmoke.setAdapter(adapterPregnancySmoke);

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

