package com.mapbox.maps.plugin.gestures;

import android.view.MotionEvent;
import com.mapbox.maps.ScreenCoordinate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GesturesPluginImplKt {
    public static final ScreenCoordinate access$toScreenCoordinate(MotionEvent motionEvent) {
        return new ScreenCoordinate(motionEvent.getX(), motionEvent.getY());
    }
}
