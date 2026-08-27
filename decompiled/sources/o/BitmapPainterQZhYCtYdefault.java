package o;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapPainterQZhYCtYdefault {
    public final drawx_KDEd0 IconCompatParcelizer;
    public final configureAlpha RemoteActionCompatParcelizer;
    public final configureLayoutDirection read;
    public final configureColorFilter serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.read.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    public BitmapPainterQZhYCtYdefault(configureColorFilter configurecolorfilter, configureAlpha configurealpha, configureLayoutDirection configurelayoutdirection, drawx_KDEd0 drawx_kded0) {
        this.serializer = configurecolorfilter;
        this.RemoteActionCompatParcelizer = configurealpha;
        this.read = configurelayoutdirection;
        this.IconCompatParcelizer = drawx_kded0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainterQZhYCtYdefault)) {
            return false;
        }
        BitmapPainterQZhYCtYdefault bitmapPainterQZhYCtYdefault = (BitmapPainterQZhYCtYdefault) obj;
        return this.serializer.equals(bitmapPainterQZhYCtYdefault.serializer) && this.RemoteActionCompatParcelizer.equals(bitmapPainterQZhYCtYdefault.RemoteActionCompatParcelizer) && this.read.equals(bitmapPainterQZhYCtYdefault.read) && this.IconCompatParcelizer.equals(bitmapPainterQZhYCtYdefault.IconCompatParcelizer);
    }

    public final String toString() {
        return "AnalyticsWrapper(chatEventsTracker=" + this.serializer + ", imageEventsTracker=" + this.RemoteActionCompatParcelizer + ", locationEventsTracker=" + this.read + ", messageEventsTracker=" + this.IconCompatParcelizer + ')';
    }
}
