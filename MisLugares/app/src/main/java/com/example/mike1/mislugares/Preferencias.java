package com.example.mike1.mislugares;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by MiKe1 on 28/04/2015.
 */
public class Preferencias extends PreferenceActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
