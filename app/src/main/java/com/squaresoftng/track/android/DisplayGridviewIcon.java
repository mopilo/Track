package com.squaresoftng.track.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by acer on 12/17/2016.
 */

public class DisplayGridviewIcon extends Activity
{
ImageView child_vaccination, child_vas, pregnant_women, nursing_mother, insecticide_net, family_practices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_gridview_icons);

        child_vaccination = (ImageView) findViewById(R.id.child_vaccine);
        child_vas = (ImageView) findViewById(R.id.child_vas);
        pregnant_women = (ImageView) findViewById(R.id.pregnant_women);
        nursing_mother = (ImageView) findViewById(R.id.nursing_mothers);
        insecticide_net = (ImageView) findViewById(R.id.bed_net);
       family_practices = (ImageView) findViewById(R.id.family_practices);

        child_vaccination.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
              Intent  myIntent = new Intent(DisplayGridviewIcon.this, ChildVaccineActivity.class);
                startActivity(myIntent);
            }
        });

        child_vas.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
              Intent  myIntent = new Intent(DisplayGridviewIcon.this, ChildVAS.class);
                startActivity(myIntent);
            }
        });

        pregnant_women.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
              Intent  myIntent = new Intent(DisplayGridviewIcon.this, PregnantWomen.class);
                startActivity(myIntent);
            }
        });

        nursing_mother.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
              Intent  myIntent = new Intent(DisplayGridviewIcon.this, NursingMother.class);
                startActivity(myIntent);
            }
        });

        insecticide_net.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
              Intent  myIntent = new Intent(DisplayGridviewIcon.this, InsecticideNet.class);
                startActivity(myIntent);
            }
        });

        family_practices.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                  Intent  myIntent = new Intent(DisplayGridviewIcon.this, FamilyPracticeActivity.class);
                    startActivity(myIntent);
                }
            });



    }
}


