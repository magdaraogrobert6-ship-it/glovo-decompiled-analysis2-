package com.braze.models;

import bo.app.h9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IBrazeLocation extends IPutIntoJson<JSONObject> {
    public static final String ACCURACY = "ll_accuracy";
    public static final String ALTITUDE = "altitude";
    public static final h9 Companion = h9.a;
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String VERTICAL_ACCURACY = "alt_accuracy";

    Double getAccuracy();

    Double getAltitude();

    double getLatitude();

    double getLongitude();

    Double getVerticalAccuracy();
}
