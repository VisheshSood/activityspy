package edu.washington.vsood.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    //TAG constant to identify activity
    public static final String TAG ="MainActivity";


    // When I launch the application, it should write “on{event-name} event fired” to the INFO
    // level of the diagnostic log for this application. If there is additional data with that
    // event, it should also be written to the log.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            Log.i(TAG, "onCreate event fired");
        } else {
            Log.i(TAG, "onCreate event fired: " + savedInstanceState.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume event fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop event fired");
    }

    // When I close the application, it should write “We’re going down, Captain!” to the ERROR
    // level of the diagnostic log in response to the onDestroy event.
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "We're going down, Captain!");
    }
}
