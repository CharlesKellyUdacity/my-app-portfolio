package com.charleskelly.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void onClickSpotifyStreamer(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }

    public void onClickScores(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }

    public void onClickLibrary(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }

    public void onClickBuildItBigger(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }

    public void onClickXyzReader(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }


    public void onClickCapstone(View view)
    {
        Button appLaunchButton = (Button) view;
        String appNameString = (String) appLaunchButton.getText();
        Toast.makeText(this, "This button will launch " + appNameString, Toast.LENGTH_LONG).show();
    }


}
