package com.example.raymond.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity{
    public final static String EXTRA_MESSAGE = "com.example.raymond.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }
    // Called when the user clicks the Send button
    public void sendMessage(View view){
        //Do something in response to button
        //starts an activity called DisplayMessageActivity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //use findViewById to get the EditText element
        EditText editText = (EditText) findViewById(R.id.edit_message);
        //add text value to the intent
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message); //take first as key and second as value
        //finish the intent by calling the startActivity method and passing the intent object created
        startActivity(intent);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
