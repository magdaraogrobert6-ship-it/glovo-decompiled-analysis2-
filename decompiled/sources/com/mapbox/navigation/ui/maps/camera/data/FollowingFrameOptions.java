package com.mapbox.navigation.ui.maps.camera.data;

import androidx.sqlite.SQLite;
import com.mapbox.navigation.base.internal.utils.DoubleKt;
import com.sentiance.core.model.thrift.E1$b;

/* JADX INFO: loaded from: classes2.dex */
public final class FollowingFrameOptions {
    public final MapboxFollowingCameraFramingStrategy bearingSmoothing;
    public final boolean bearingUpdatesAllowed;
    public final boolean centerUpdatesAllowed;
    public final MapboxFollowingCameraFramingStrategy frameGeometryAfterManeuver;
    public final MapboxFollowingCameraFramingStrategy framingStrategy;
    public final boolean paddingUpdatesAllowed;
    public final E1$b pitchNearManeuvers;
    public final boolean pitchUpdatesAllowed;
    public final boolean zoomUpdatesAllowed;
    public double minZoom = 10.5d;
    public double maxZoom = 16.35d;
    public final FocalPoint focalPoint = new FocalPoint();
    public boolean maximizeViewableGeometryWhenPitchZero = true;
    public final MapboxFollowingCameraFramingStrategy intersectionDensityCalculation = new MapboxFollowingCameraFramingStrategy();

    public final class FocalPoint {
        public final boolean equals(Object obj) {
            Double dValueOf = Double.valueOf(1.0d);
            Double dValueOf2 = Double.valueOf(0.5d);
            if (this == obj) {
                return true;
            }
            if (!FocalPoint.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            if (DoubleKt.safeCompareTo(dValueOf2, dValueOf2)) {
                return DoubleKt.safeCompareTo(dValueOf, dValueOf);
            }
            return false;
        }

        public final int hashCode() {
            return Double.hashCode(1.0d) + (Double.hashCode(0.5d) * 31);
        }

        public final String toString() {
            return "FocalPoint(x=0.5, y=1.0)";
        }
    }

    public final void setMaximizeViewableGeometryWhenPitchZero() {
        this.maximizeViewableGeometryWhenPitchZero = false;
    }

    public final void setMaxZoom() {
        this.maxZoom = 18.0d;
    }

    public final void setMinZoom() {
        this.minZoom = 17.0d;
    }

    public FollowingFrameOptions() {
        E1$b e1$b = new E1$b();
        e1$b.serializer = SQLite.read("continue", "merge", "on ramp", "off ramp", "fork");
        this.pitchNearManeuvers = e1$b;
        this.frameGeometryAfterManeuver = new MapboxFollowingCameraFramingStrategy();
        this.bearingSmoothing = new MapboxFollowingCameraFramingStrategy();
        this.centerUpdatesAllowed = true;
        this.zoomUpdatesAllowed = true;
        this.bearingUpdatesAllowed = true;
        this.pitchUpdatesAllowed = true;
        this.paddingUpdatesAllowed = true;
        FollowingCameraFramingStrategy.Companion.getClass();
        this.framingStrategy = MapboxFollowingCameraFramingStrategy.INSTANCE;
    }
}
