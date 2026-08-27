package com.deliveryhero.customerchat.fwf;

import androidx.compose.ui.text.android.LayoutCompat;
import o.IconCompatParcelizer;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class FeatureInfo {
    public final boolean variation;

    public final boolean RemoteActionCompatParcelizer() {
        return this.variation;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.variation);
    }

    public FeatureInfo(@getDensityDpi(serializer = "variation") boolean z) {
        this.variation = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureInfo) && this.variation == ((FeatureInfo) obj).variation;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("FeatureInfo(variation="), this.variation, ')');
    }
}
