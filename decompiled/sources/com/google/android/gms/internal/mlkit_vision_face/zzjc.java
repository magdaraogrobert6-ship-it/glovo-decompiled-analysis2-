package com.google.android.gms.internal.mlkit_vision_face;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjc {
    public static Visibility valueOf(String str) {
        if (str.equals("VISIBLE")) {
            return Visibility.VISIBLE;
        }
        if (str.equals("NONE")) {
            return Visibility.NONE;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", str));
        return null;
    }
}
