package com.example.gevin93.button_on_click_show;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//testing through as
//testing  whether this works
//testing again

public class MainActivity extends AppCompatActivity {

    Button sendMessage;  //button variable

    public final static String EXTRA_MESSAGE = "com.example.gevin93.button_on_click_show.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMessage = (Button) findViewById(R.id.button1); //setting up the button in the activity_main layout to on click
        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Activity_2.class); //the message show to the next layout

                EditText editText = (EditText) findViewById(R.id.edit_message); //calling R
                String message = editText.getText().toString(); //converting the message in the text field to string and save in a variable

                intent.putExtra(EXTRA_MESSAGE, message);

                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show(); //toast to show a little pop up message to show the message you entered.
                Toast.makeText(MainActivity.this,"Hello!", Toast.LENGTH_LONG).show(); //toast to a pop up saying hello
                    startActivity(intent);

            }
            });

    }
}
