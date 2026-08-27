package com.mapbox.maps.plugin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapDelegateProviderImpl$mapAttributionDelegate$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Object $mapGeofencingConsent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $telemetry;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapDelegateProviderImpl$mapAttributionDelegate$2(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$telemetry = obj2;
        this.$mapGeofencingConsent = obj3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.$mapGeofencingConsent;
        Object obj2 = this.$telemetry;
        Object obj3 = this.this$0;
        if (i == 0) {
            return new MapAttributionDelegateImpl((MapboxMap) ((MapDelegateProviderImpl) obj3).mapboxMap, (MapTelemetry) obj2, (MapGeofencingConsent) obj);
        }
        AnimatorSet animatorSet = (AnimatorSet) obj3;
        animatorSet.addListener(((CameraAnimationsPluginImpl) obj2).clearHighLevelAnimatorSetListener);
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) obj;
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        return createFromParcel.INSTANCE;
    }
}
