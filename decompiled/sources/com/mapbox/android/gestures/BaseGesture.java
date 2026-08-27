package com.mapbox.android.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.WindowManager;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseGesture {
    public final Context context;
    public MotionEvent currentEvent;
    public long gestureDuration;
    public final AndroidGesturesManager gesturesManager;
    public boolean isEnabled = true;
    public Object listener;
    public MotionEvent previousEvent;
    public final WindowManager windowManager;

    public abstract boolean analyzeEvent(MotionEvent motionEvent);

    public BaseGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        this.context = context;
        this.windowManager = (WindowManager) context.getSystemService("window");
        this.gesturesManager = androidGesturesManager;
    }

    public boolean canExecute(int i) {
        if (this.listener == null || !this.isEnabled) {
            return false;
        }
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        for (Set<Integer> set : androidGesturesManager.mutuallyExclusiveGestures) {
            if (set.contains(Integer.valueOf(i))) {
                for (Integer num : set) {
                    num.getClass();
                    for (BaseGesture baseGesture : androidGesturesManager.detectors) {
                        if (baseGesture instanceof ProgressiveGesture) {
                            ProgressiveGesture progressiveGesture = (ProgressiveGesture) baseGesture;
                            if (progressiveGesture.handledTypes.contains(num) && progressiveGesture.isInProgress) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
