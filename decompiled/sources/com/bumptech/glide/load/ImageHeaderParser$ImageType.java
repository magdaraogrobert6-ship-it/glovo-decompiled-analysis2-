package com.bumptech.glide.load;

import o.oetfFunclambda0;

/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);

    private final boolean hasAlpha;

    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    public boolean isWebp() {
        int i = oetfFunclambda0.read[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    ImageHeaderParser$ImageType(boolean z) {
        this.hasAlpha = z;
    }
}
