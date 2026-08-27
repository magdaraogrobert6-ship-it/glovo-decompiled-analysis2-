package com.mapbox.android.gestures;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.ImageHeaderParserImageType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MultiFingerGesture extends BaseGesture {
    public DisplayMetrics displayMetrics;
    public final float edgeSlop;
    public PointF focalPoint;
    public final ImageHeaderParserImageType permittedActionsGuard;
    public final ArrayList pointerIdList;
    public final HashMap pointersDistanceMap;
    public float spanThreshold;

    public boolean analyzeMovement() {
        return false;
    }

    public int getRequiredPointersCount() {
        return 2;
    }

    public abstract void reset();

    public boolean isSloppyGesture() {
        DisplayMetrics displayMetrics = this.displayMetrics;
        float f = displayMetrics.widthPixels;
        float f2 = this.edgeSlop;
        float f3 = displayMetrics.heightPixels;
        Iterator it = this.pointerIdList.iterator();
        while (it.hasNext()) {
            int iFindPointerIndex = this.currentEvent.findPointerIndex(((Integer) it.next()).intValue());
            float rawX = Utils.getRawX(this.currentEvent, iFindPointerIndex);
            float rawY = Utils.getRawY(this.currentEvent, iFindPointerIndex);
            if (rawX < f2 || rawY < f2 || rawX > f - f2 || rawY > f3 - f2) {
                return true;
            }
        }
        Iterator it2 = this.pointersDistanceMap.values().iterator();
        while (it2.hasNext()) {
            if (((MultiFingerDistancesObject) it2.next()).getCurrFingersDiffXY() < this.spanThreshold) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:82:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:3: B:28:0x005d->B:84:?, LOOP_END, SYNTHETIC] */
    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean analyzeEvent(MotionEvent motionEvent) {
        long j;
        boolean z;
        Iterator it;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            queryDisplayMetrics();
        }
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = this.pointerIdList;
        int size = arrayList.size();
        this.permittedActionsGuard.getClass();
        int i = 1;
        if (size == 0) {
            j = 0;
        } else if (Math.abs(pointerCount - size) > 1) {
            j = 255;
        } else if (pointerCount > size) {
            j = 5;
        } else if (pointerCount < size) {
            j = 255;
        } else {
            j = ((pointerCount == 1 ? 1L : 6L) << 8) + 2;
        }
        long j2 = actionMasked;
        if (j2 == j) {
            if (actionMasked == 2) {
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        } else {
            while (true) {
                if (j != 0) {
                    if (j2 == (j & 255)) {
                        if (actionMasked == 2) {
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (motionEvent.findPointerIndex(((Integer) it.next()).intValue()) == -1) {
                                    }
                                }
                            }
                        }
                        z = false;
                    } else {
                        j >>= 8;
                    }
                }
                z = true;
            }
        }
        HashMap map = this.pointersDistanceMap;
        if (z) {
            if (this instanceof ProgressiveGesture) {
                ProgressiveGesture progressiveGesture = (ProgressiveGesture) this;
                if (progressiveGesture.isInProgress) {
                    progressiveGesture.gestureStopped();
                }
            }
            arrayList.clear();
            map.clear();
        }
        if (!z || actionMasked == 0) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0 || actionMasked2 == 5) {
                arrayList.add(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            } else if (actionMasked2 == 1 || actionMasked2 == 6) {
                arrayList.remove(Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex())));
            }
        }
        this.focalPoint = Utils.determineFocalPoint(motionEvent);
        if (z) {
            SentryLogcatAdapter.IconCompatParcelizer("MultiFingerGesture", "Some MotionEvents were not passed to the library or events from different view trees are merged.");
            return false;
        }
        if (actionMasked == 2 && arrayList.size() >= getRequiredPointersCount() && this.currentEvent.getPressure() / this.previousEvent.getPressure() > 0.67f) {
            map.clear();
            int i2 = 0;
            while (i2 < arrayList.size() - i) {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < arrayList.size()) {
                    Integer num = (Integer) arrayList.get(i2);
                    int iIntValue = num.intValue();
                    Integer num2 = (Integer) arrayList.get(i4);
                    int iIntValue2 = num2.intValue();
                    MotionEvent motionEvent2 = this.previousEvent;
                    float x = motionEvent2.getX(motionEvent2.findPointerIndex(iIntValue));
                    MotionEvent motionEvent3 = this.previousEvent;
                    float y = motionEvent3.getY(motionEvent3.findPointerIndex(iIntValue));
                    MotionEvent motionEvent4 = this.previousEvent;
                    float x2 = motionEvent4.getX(motionEvent4.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent5 = this.previousEvent;
                    float y2 = motionEvent5.getY(motionEvent5.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent6 = this.currentEvent;
                    float x3 = motionEvent6.getX(motionEvent6.findPointerIndex(iIntValue));
                    MotionEvent motionEvent7 = this.currentEvent;
                    float y3 = motionEvent7.getY(motionEvent7.findPointerIndex(iIntValue));
                    MotionEvent motionEvent8 = this.currentEvent;
                    int i5 = i2;
                    float x4 = motionEvent8.getX(motionEvent8.findPointerIndex(iIntValue2));
                    MotionEvent motionEvent9 = this.currentEvent;
                    map.put(new PointerDistancePair(num, num2), new MultiFingerDistancesObject(x2 - x, y2 - y, x4 - x3, motionEvent9.getY(motionEvent9.findPointerIndex(iIntValue2)) - y3));
                    i4++;
                    i2 = i5;
                    i = 1;
                }
                i2 = i3;
            }
            if (!isSloppyGesture()) {
                return analyzeMovement();
            }
        }
        return false;
    }

    public MultiFingerGesture(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        this.permittedActionsGuard = new ImageHeaderParserImageType();
        this.pointerIdList = new ArrayList();
        this.pointersDistanceMap = new HashMap();
        this.focalPoint = new PointF();
        this.edgeSlop = ViewConfiguration.get(context).getScaledEdgeSlop();
        queryDisplayMetrics();
    }

    @Override // com.mapbox.android.gestures.BaseGesture
    public boolean canExecute(int i) {
        return super.canExecute(i) && !isSloppyGesture();
    }

    public final void queryDisplayMetrics() {
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            this.displayMetrics = this.context.getResources().getDisplayMetrics();
        } else {
            this.displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(this.displayMetrics);
        }
    }
}
