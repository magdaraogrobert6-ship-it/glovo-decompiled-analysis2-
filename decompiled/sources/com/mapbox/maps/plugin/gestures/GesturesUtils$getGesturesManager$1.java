package com.mapbox.maps.plugin.gestures;

import android.animation.ValueAnimator;
import com.mapbox.android.gestures.AndroidGesturesManager;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesUtils$getGesturesManager$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final GesturesUtils$getGesturesManager$1 INSTANCE;
    public static final GesturesUtils$getGesturesManager$1 INSTANCE$1;
    public static final GesturesUtils$getGesturesManager$1 INSTANCE$2;
    public static final GesturesUtils$getGesturesManager$1 INSTANCE$3;
    public static final GesturesUtils$getGesturesManager$1 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GesturesUtils$getGesturesManager$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            GesturesPlugin gesturesPlugin = (GesturesPlugin) obj;
            gesturesPlugin.getClass();
            AndroidGesturesManager androidGesturesManager = ((GesturesPluginImpl) gesturesPlugin).gesturesManager;
            if (androidGesturesManager != null) {
                return androidGesturesManager;
            }
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        if (i == 1) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.getClass();
            valueAnimator.setDuration(0L);
            return createfromparcel;
        }
        if (i == 2) {
            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
            valueAnimator2.getClass();
            valueAnimator2.setDuration(0L);
            return createfromparcel;
        }
        if (i != 3) {
            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
            valueAnimator3.getClass();
            valueAnimator3.setDuration(0L);
            return createfromparcel;
        }
        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
        valueAnimator4.getClass();
        valueAnimator4.setDuration(0L);
        return createfromparcel;
    }

    static {
        int i = 1;
        INSTANCE$1 = new GesturesUtils$getGesturesManager$1(i, i);
        INSTANCE$2 = new GesturesUtils$getGesturesManager$1(i, 2);
        INSTANCE$3 = new GesturesUtils$getGesturesManager$1(i, 3);
        INSTANCE$4 = new GesturesUtils$getGesturesManager$1(i, 4);
        INSTANCE = new GesturesUtils$getGesturesManager$1(i, 0);
    }
}
