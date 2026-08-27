package com.mapbox.navigation.voice.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.utils.FloatKt;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechVolume {
    public final float level;

    public final int hashCode() {
        return Float.hashCode(this.level);
    }

    public SpeechVolume(float f) {
        this.level = f;
        double d = f;
        if (0.0d > d || d > 1.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Volume level must be between [0.0..1.0]");
            throw null;
        }
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder("SpeechVolume(level="), this.level, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SpeechVolume.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return FloatKt.safeCompareTo(Float.valueOf(this.level), Float.valueOf(((SpeechVolume) obj).level));
    }
}
