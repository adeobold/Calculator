package com.android1.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button btnBack = findViewById(R.id.btnBack);
        Switch swDarkTheme = findViewById(R.id.swDarkTheme);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentResult = new Intent();
                intentResult.putExtra(SETTINGS_RESULT, swDarkTheme.isChecked());
                setResult(RESULT_OK, intentResult);
                finish();
            }
        });

        int themeName = getIntent().getExtras().getInt(THEME_KEY, AppCompatDelegate.MODE_NIGHT_NO);

        if (themeName == AppCompatDelegate.MODE_NIGHT_YES) {
            swDarkTheme.setChecked(true);
        }
        ;

        swDarkTheme.setOnCheckedChangeListener((compoundButton, b) -> {

            if (b) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }

        });


    }
}