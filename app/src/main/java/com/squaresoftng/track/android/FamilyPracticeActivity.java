package com.squaresoftng.track.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by acer on 12/18/2016.
 */

public class FamilyPracticeActivity extends Activity {
    LinearLayout layout_one, layout_two, layout_three, layout_four;
    TextView one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen;
    TextView first_heading, second_heading, third_heading, fouth_heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_practices_activity);

        one = (TextView) findViewById(R.id.one);
        two = (TextView) findViewById(R.id.two);
        three = (TextView) findViewById(R.id.three);
        four = (TextView) findViewById(R.id.four);
        five = (TextView) findViewById(R.id.five);
        six = (TextView) findViewById(R.id.six);
        seven = (TextView) findViewById(R.id.seven);
        eight = (TextView) findViewById(R.id.eight);
        nine = (TextView) findViewById(R.id.nine);
        ten = (TextView) findViewById(R.id.ten);
        eleven = (TextView) findViewById(R.id.eleven);
        twelve = (TextView) findViewById(R.id.twelve);
        thirteen = (TextView) findViewById(R.id.thirteen);
        fourteen = (TextView) findViewById(R.id.fouteen);
        fifteen = (TextView) findViewById(R.id.fifteen);
        sixteen = (TextView) findViewById(R.id.sixteen);

        first_heading = (TextView) findViewById(R.id.first_heading);
        second_heading = (TextView) findViewById(R.id.second_heading);
        third_heading = (TextView) findViewById(R.id.thrid_heading);
        fouth_heading = (TextView) findViewById(R.id.fouth_heading);


        layout_one = (LinearLayout) findViewById(R.id.layout_one);
        layout_two = (LinearLayout) findViewById(R.id.layout_two);
        layout_three = (LinearLayout) findViewById(R.id.layout_three);
        layout_four = (LinearLayout) findViewById(R.id.layout_four);

        layout_one.setVisibility(View.GONE);
        layout_two.setVisibility(View.GONE);
        layout_three.setVisibility(View.GONE);
        layout_four.setVisibility(View.GONE);

        first_heading.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                layout_one.setVisibility(View.VISIBLE);
                layout_two.setVisibility(View.GONE);
                layout_three.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);

            }
        });

        second_heading.setOnClickListener( new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.VISIBLE);
                layout_three.setVisibility(View.GONE);
                layout_four.setVisibility(View.GONE);


            }
        });


        third_heading.setOnClickListener( new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_three.setVisibility(View.VISIBLE);
                layout_four.setVisibility(View.GONE);


            }
        });

        fouth_heading.setOnClickListener( new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                layout_one.setVisibility(View.GONE);
                layout_two.setVisibility(View.GONE);
                layout_three.setVisibility(View.GONE);
                layout_four.setVisibility(View.VISIBLE);


            }
        });

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
