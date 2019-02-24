# LocationListenerCallbackAndroid

A simple useful example of "How to get current Location from HelperClass/Callback" in Android using "FusedLocationProviderClient"

# Library Usages

1. Add the library to your build file:

allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

2. Add the dependency:

implementation 'com.github.rommansabbir:AndroidLocationListener:Tag'

replace Tag with specific version

3. Implement the location listener callback interface:

public class MainActivity extends AppCompatActivity implements LocationListener.LocationListenerCallbackInterface{}

4. Instantiate location listener: 

locationListenerCallback = new LocationListener(this);

5. Call getLocation() to get your current location: 

locationListenerCallback.getLocation();

# Now, you are ready to go!
