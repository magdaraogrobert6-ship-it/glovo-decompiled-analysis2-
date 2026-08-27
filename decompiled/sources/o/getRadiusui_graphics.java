package o;

/* JADX INFO: loaded from: classes.dex */
public final class getRadiusui_graphics {
    public final getCenterF1C5BW0ui_graphics IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer = new Object();
    public final CSSParseException serializer;

    public final void read(long j) {
        synchronized (this.RemoteActionCompatParcelizer) {
            toAndroidRect toandroidrect = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
            toandroidrect.IconCompatParcelizer = j;
            toandroidrect.write(j);
        }
    }

    public getRadiusui_graphics(getCenterF1C5BW0ui_graphics getcenterf1c5bw0ui_graphics, CSSParseException cSSParseException) {
        this.IconCompatParcelizer = getcenterf1c5bw0ui_graphics;
        this.serializer = cSSParseException;
    }
}
