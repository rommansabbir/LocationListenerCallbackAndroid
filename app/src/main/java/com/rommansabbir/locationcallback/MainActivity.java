package com.rommansabbir.locationcallback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rommansabbir.locationcallback.callbacks.LocationListener.LocationListenerCallback;

public class MainActivity extends AppCompatActivity implements LocationListenerCallback.LocationListenerCallbackInterface, ActivityCompat.OnRequestPermissionsResultCallback  {
    private static final String TAG = "MainActivity";
    private static final int PERMISSION_REQUEST_LOCATION = 0;
    private LocationListenerCallback locationListenerCallback;
    private TextView latitudeTextBox, longitudeTextBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view item references
        latitudeTextBox = findViewById(R.id.latitudeTextView);
        longitudeTextBox = findViewById(R.id.longitudeTextView);

        //instantiate locationListenerCallback
        locationListenerCallback = new LocationListenerCallback(this);
        //call getLocation() from callback class to get callback
        locationListenerCallback.getLocation();
    }

    @Override
    public void onLocationSuccess(Location location) {
        //TODO implement your logic here
        Log.d(TAG, "onLocationSuccess: ");

        latitudeTextBox.setText("Latitude: "+location.getLatitude());
        longitudeTextBox.setText("Latitude: "+location.getLongitude());
    }

    @Override
    public void onLocationFailure(String ERROR_MESSAGE) {
        //TODO implement your logic here
        Log.d(TAG, "onLocationFailure: ");
    }
}
