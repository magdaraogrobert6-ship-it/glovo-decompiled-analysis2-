package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import o.registerInAppMessageManagerlambda2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda1 implements Cancelable {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        int i = this.$r8$classId;
        if (i == 0) {
            MapboxMap.setFeatureState$lambda$27();
            return;
        }
        if (i == 1) {
            MapboxMap.getFeatureState$lambda$33();
        } else if (i != 2) {
            registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = CameraAnimationsPluginImpl.$$delegatedProperties;
        } else {
            MapboxMap.removeFeatureState$lambda$39();
        }
    }
}
