package com.example.android.quakereport;

/**
 * Created by rkalimul on 6/2/2017.
 */

class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    Earthquake(double Magnitude, String Location, long TimeInMilliseconds, String Url) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mTimeInMilliseconds = TimeInMilliseconds;
        this.mUrl = Url;
    }

    double getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    String getUrl() {
        return mUrl;
    }
}
