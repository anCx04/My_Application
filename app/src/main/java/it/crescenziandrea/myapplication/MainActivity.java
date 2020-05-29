package it.crescenziandrea.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getText(R.string.app_name);
        getText(R.string.app_name);
        getText(R.string.app_name);
    }
}
