package com.example.demoapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

//Complete
public class PrefUtil {
    //  Todo : Boolean data
    // Put data or store Data into sharedPreference
    public static void putbooleanPref(String key, boolean value, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    // clear Data From sharedPreference
    public static void clearBoolean(String key, boolean value, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();
    }

    // get Data From sharedPreference
    public static boolean getbooleanPref(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(key, false);
    }

    //  Todo : String data
    public static void putstringPref(String key, String value, Context context) {
        SharedPreferences preferences = context.getSharedPreferences("PutString", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void RemoveString(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("PutString", Context.MODE_PRIVATE);
        preferences.edit().clear().apply();
    }

    public static String getstringPref(String key, Context context) {
        SharedPreferences references = context.getSharedPreferences("PutString", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = references.edit();
        editor.apply();
        return references.getString(key, "");
    }
}