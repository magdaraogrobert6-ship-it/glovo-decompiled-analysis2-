package com.mapbox.android.gestures;

import android.content.Context;
import com.logistics.rider.glovo.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidGesturesManager {
    public final CopyOnWriteArrayList detectors;
    public final MoveGestureDetector moveGestureDetector;
    public final MultiFingerTapGestureDetector multiFingerTapGestureDetector;
    public final ArrayList mutuallyExclusiveGestures;
    public final RotateGestureDetector rotateGestureDetector;
    public final ShoveGestureDetector shoveGestureDetector;
    public final StandardGestureDetector standardGestureDetector;
    public final StandardScaleGestureDetector standardScaleGestureDetector;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureType {
    }

    public AndroidGesturesManager(Context context) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.mutuallyExclusiveGestures = arrayList2;
        arrayList2.addAll(arrayList);
        RotateGestureDetector rotateGestureDetector = new RotateGestureDetector(context, this);
        this.rotateGestureDetector = rotateGestureDetector;
        StandardScaleGestureDetector standardScaleGestureDetector = new StandardScaleGestureDetector(context, this);
        this.standardScaleGestureDetector = standardScaleGestureDetector;
        ShoveGestureDetector shoveGestureDetector = new ShoveGestureDetector(context, this);
        this.shoveGestureDetector = shoveGestureDetector;
        SidewaysShoveGestureDetector sidewaysShoveGestureDetector = new SidewaysShoveGestureDetector(context, this);
        MultiFingerTapGestureDetector multiFingerTapGestureDetector = new MultiFingerTapGestureDetector(context, this);
        this.multiFingerTapGestureDetector = multiFingerTapGestureDetector;
        MoveGestureDetector moveGestureDetector = new MoveGestureDetector(context, this);
        this.moveGestureDetector = moveGestureDetector;
        StandardGestureDetector standardGestureDetector = new StandardGestureDetector(context, this);
        this.standardGestureDetector = standardGestureDetector;
        CopyOnWriteArrayList<BaseGesture> copyOnWriteArrayList = new CopyOnWriteArrayList(Arrays.asList(rotateGestureDetector, standardScaleGestureDetector, shoveGestureDetector, sidewaysShoveGestureDetector, multiFingerTapGestureDetector, moveGestureDetector, standardGestureDetector));
        this.detectors = copyOnWriteArrayList;
        for (BaseGesture baseGesture : copyOnWriteArrayList) {
            if (baseGesture instanceof MultiFingerGesture) {
                MultiFingerGesture multiFingerGesture = (MultiFingerGesture) baseGesture;
                multiFingerGesture.spanThreshold = multiFingerGesture.context.getResources().getDimension(R.dimen.mapbox_internalMinSpan24);
            }
            if (baseGesture instanceof StandardScaleGestureDetector) {
                StandardScaleGestureDetector standardScaleGestureDetector2 = (StandardScaleGestureDetector) baseGesture;
                standardScaleGestureDetector2.spanSinceStartThreshold = standardScaleGestureDetector2.context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold);
            }
            if (baseGesture instanceof ShoveGestureDetector) {
                ShoveGestureDetector shoveGestureDetector2 = (ShoveGestureDetector) baseGesture;
                shoveGestureDetector2.pixelDeltaThreshold = shoveGestureDetector2.context.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
                shoveGestureDetector2.maxShoveAngle = 20.0f;
            }
            if (baseGesture instanceof SidewaysShoveGestureDetector) {
                SidewaysShoveGestureDetector sidewaysShoveGestureDetector2 = (SidewaysShoveGestureDetector) baseGesture;
                sidewaysShoveGestureDetector2.pixelDeltaThreshold = sidewaysShoveGestureDetector2.context.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
                sidewaysShoveGestureDetector2.maxShoveAngle = 20.0f;
            }
            if (baseGesture instanceof MultiFingerTapGestureDetector) {
                MultiFingerTapGestureDetector multiFingerTapGestureDetector2 = (MultiFingerTapGestureDetector) baseGesture;
                multiFingerTapGestureDetector2.multiFingerTapMovementThreshold = multiFingerTapGestureDetector2.context.getResources().getDimension(R.dimen.mapbox_defaultMultiTapMovementThreshold);
                multiFingerTapGestureDetector2.multiFingerTapTimeThreshold = 150L;
            }
            if (baseGesture instanceof RotateGestureDetector) {
                ((RotateGestureDetector) baseGesture).angleThreshold = 15.3f;
            }
        }
    }
}
