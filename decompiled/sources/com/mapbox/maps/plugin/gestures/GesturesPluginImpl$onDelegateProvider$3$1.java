package com.mapbox.maps.plugin.gestures;

import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesPluginImpl$onDelegateProvider$3$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ AnimatorListenerAdapter $animatorHandler;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GesturesPluginImpl$onDelegateProvider$3$1(AnimatorListenerAdapter animatorListenerAdapter, int i) {
        super(0);
        this.$r8$classId = i;
        this.$animatorHandler = animatorListenerAdapter;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AnimatorListenerAdapter animatorListenerAdapter = this.$animatorHandler;
        if (i != 0) {
            animatorListenerAdapter.onAnimationEnd(GesturesPluginImpl.noOpAnimator);
            return createfromparcel;
        }
        animatorListenerAdapter.onAnimationStart(GesturesPluginImpl.noOpAnimator);
        return createfromparcel;
    }
}
