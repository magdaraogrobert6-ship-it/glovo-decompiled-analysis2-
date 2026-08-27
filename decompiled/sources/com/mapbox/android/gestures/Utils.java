package com.mapbox.android.gestures;

import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utils {
    public static float getRawX(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX();
        float x = motionEvent.getX();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getX(i) + (rawX - x);
        }
        return 0.0f;
    }

    public static float getRawY(MotionEvent motionEvent, int i) {
        float rawY = motionEvent.getRawY();
        float y = motionEvent.getY();
        if (i < motionEvent.getPointerCount()) {
            return motionEvent.getY(i) + (rawY - y);
        }
        return 0.0f;
    }

    public static PointF determineFocalPoint(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float x = 0.0f;
        float y = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        return new PointF(x / f, y / f);
    }
}
