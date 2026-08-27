package com.mapbox.maps.plugin.animation.animator;

import android.animation.TypeEvaluator;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public interface CameraTypeEvaluator extends TypeEvaluator {
    boolean canSkip(Serializable serializable, Object obj, Object[] objArr);
}
