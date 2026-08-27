package com.mapbox.navigation.ui.maps.location;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationLocationProvider$registerLocationConsumer$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final NavigationLocationProvider$registerLocationConsumer$1$1 INSTANCE;
    public static final NavigationLocationProvider$registerLocationConsumer$1$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationLocationProvider$registerLocationConsumer$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            ValueAnimator valueAnimator = (ValueAnimator) obj;
            valueAnimator.getClass();
            valueAnimator.setDuration(0L);
            return createfromparcel;
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
        valueAnimator2.getClass();
        valueAnimator2.setDuration(0L);
        return createfromparcel;
    }

    static {
        int i = 1;
        INSTANCE = new NavigationLocationProvider$registerLocationConsumer$1$1(i, 0);
        INSTANCE$1 = new NavigationLocationProvider$registerLocationConsumer$1$1(i, i);
    }
}
