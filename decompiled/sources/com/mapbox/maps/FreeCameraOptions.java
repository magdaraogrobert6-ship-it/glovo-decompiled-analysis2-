package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class FreeCameraOptions {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class FreeCameraOptionsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            FreeCameraOptions.cleanNativePeer(this.peer);
        }

        public FreeCameraOptionsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native Double getAltitude();

    public native Point getLocation();

    public long getNativePtr() {
        return this.peer;
    }

    public native Vec4 getOrientation();

    public native Vec3 getPosition();

    public native void lookAtPoint(Point point);

    public native void lookAtPoint(Point point, double d);

    public native void lookAtPoint(Point point, double d, Vec3 vec3);

    public native void setAltitude(double d);

    public native void setLocation(Point point);

    public native void setLocation(Point point, double d);

    public native void setOrientation(Vec4 vec4);

    public native void setPitchBearing(double d, double d2);

    public native void setPosition(Vec3 vec3);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public FreeCameraOptions(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new FreeCameraOptionsPeerCleaner(j));
    }
}
