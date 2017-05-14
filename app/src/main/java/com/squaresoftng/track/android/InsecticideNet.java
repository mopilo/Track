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

/**
 * Created by acer on 12/18/2016.
 */

public class InsecticideNet extends Activity implements AdapterView.OnItemSelectedListener
{
    EditText parentName, phone, houseHold;
    TextView numberChild;
    ImageView fingerScanner;
    Spinner number_child;

    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.insecticide_net_activity);

        parentName = (EditText) findViewById(R.id.insecticide_net_parent_name);
        phone = (EditText) findViewById(R.id.insecticide_net_phone);
        houseHold = (EditText) findViewById(R.id.insecticide_net_house_hold);
        numberChild = (TextView) findViewById(R.id.insecticide_net_children);

        number_child = (Spinner) findViewById(R.id.insecticide_net_spinner_children);
        number_child.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapterNumber_children = ArrayAdapter.createFromResource(this, R.array.children, android.R.layout.simple_spinner_item);
        adapterNumber_children.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        number_child.setAdapter(adapterNumber_children);

        fingerScanner = (ImageView) findViewById(R.id.finger_scanner);
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
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
