package com.deliveryhero.selfServiceChat.data.model;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class TextEvent {
    public final String read;
    public final String serializer;

    public final int hashCode() {
        return this.read.hashCode() + (this.serializer.hashCode() * 31);
    }

    public TextEvent(@getDensityDpi(serializer = "text") String str, @getDensityDpi(serializer = "type") String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.read = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextEvent)) {
            return false;
        }
        TextEvent textEvent = (TextEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, textEvent.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, textEvent.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextEvent(text=");
        sb.append(this.serializer);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }

    public /* synthetic */ TextEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "UserMessage" : str2);
    }
}
