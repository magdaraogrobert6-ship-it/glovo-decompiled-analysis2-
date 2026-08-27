package com.mapbox.search.utils.bitmap;

/* JADX INFO: loaded from: classes5.dex */
public final class BitmapEncodeOptions {
    public final int hashCode() {
        return Integer.hashCode(90) + (Integer.hashCode(400) * 31);
    }

    public final String toString() {
        return "BitmapEncodeOptions(minSideSize=400, compressQuality=90)";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitmapEncodeOptions);
    }
}
