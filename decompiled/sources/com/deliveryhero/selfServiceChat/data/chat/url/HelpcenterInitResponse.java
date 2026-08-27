package com.deliveryhero.selfServiceChat.data.chat.url;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class HelpcenterInitResponse {
    public final String url;

    public final int hashCode() {
        return this.url.hashCode();
    }

    public HelpcenterInitResponse(@getDensityDpi(serializer = "url") String str) {
        str.getClass();
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpcenterInitResponse) && this.url.equals(((HelpcenterInitResponse) obj).url);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("HelpcenterInitResponse(url="), this.url, ')');
    }
}
