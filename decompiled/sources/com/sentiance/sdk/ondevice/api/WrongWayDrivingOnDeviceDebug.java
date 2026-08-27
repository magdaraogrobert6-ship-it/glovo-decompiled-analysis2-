package com.sentiance.sdk.ondevice.api;

import android.annotation.SuppressLint;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.N;
import o.runlambda0;
import o.setPushUniqueId;
import o.storeRegisteredGeofencesToLocalStoragelambda0;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
class WrongWayDrivingOnDeviceDebug extends N {

    @SuppressLint
    private static WrongWayDrivingOnDeviceDebug sInstance;

    private WrongWayDrivingOnDeviceDebug() {
    }

    public static WrongWayDrivingOnDeviceDebug getInstance() {
        WrongWayDrivingOnDeviceDebug wrongWayDrivingOnDeviceDebug;
        synchronized (WrongWayDrivingOnDeviceDebug.class) {
            if (sInstance == null) {
                sInstance = new WrongWayDrivingOnDeviceDebug();
            }
            wrongWayDrivingOnDeviceDebug = sInstance;
        }
        return wrongWayDrivingOnDeviceDebug;
    }

    public Float getMaxAcceptableAccuracyOverride() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).RemoteActionCompatParcelizer();
    }

    public Float getMaxAcceptableDistanceOverride() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).read();
    }

    public Float getMinAcceptableDistanceOverride() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).serializer();
    }

    public Float getMinAcceptableSpeedOverride() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).write();
    }

    public void setMaxAcceptableAccuracyOverride(Float f) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).serializer(f);
    }

    public void setMaxAcceptableDistanceOverride(Float f) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).IconCompatParcelizer(f);
    }

    public void setMinAcceptableDistanceOverride(Float f) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).write(f);
    }

    public void setMinAcceptableSpeedOverride(Float f) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).read(f);
    }
}
