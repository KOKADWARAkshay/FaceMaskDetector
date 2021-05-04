/*
TEAM MASC DETECTOR
VIT BHOPAL UNIVERSITY COLLEGE PROJECT SEM 4
AKSHAY KOKADWAR 19BCE10251
AMAAN ALI KHAN 19BCE10201
 */

package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {
    }
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonnm = findViewById(R.id.buttonm);

        buttonnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DetectorActivity.class);

                MainActivity.this.startActivity(intent);

            }
        });

        textView = findViewById(R.id.textViewLink);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}


/*
TEAM MASC DETECTOR
VIT BHOPAL UNIVERSITY COLLEGE PROJECT SEM 4
AKSHAY KOKADWAR 19BCE10251
AMAAN ALI KHAN 19BCE10201
 */