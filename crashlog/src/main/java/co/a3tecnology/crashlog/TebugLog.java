package co.a3tecnology.crashlog;

import android.util.Log;


public final class TebugLog {

    public static void print(String message) {
        Log.d("TebugLog", message);
    }
}
