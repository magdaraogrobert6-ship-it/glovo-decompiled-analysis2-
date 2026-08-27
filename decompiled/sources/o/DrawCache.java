package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class DrawCache {
    public final updateParamsFromOutline IconCompatParcelizer;
    public final RangesKt serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public DrawCache(updateParamsFromOutline updateparamsfromoutline, RangesKt rangesKt) {
        updateparamsfromoutline.getClass();
        this.IconCompatParcelizer = updateparamsfromoutline;
        this.serializer = rangesKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawCache)) {
            return false;
        }
        DrawCache drawCache = (DrawCache) obj;
        return this.IconCompatParcelizer == drawCache.IconCompatParcelizer && this.serializer.equals(drawCache.serializer);
    }

    public final String toString() {
        return "ScreenEvent(status=" + this.IconCompatParcelizer + ", metric=" + this.serializer + ")";
    }
}
