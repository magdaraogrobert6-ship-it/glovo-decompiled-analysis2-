package o;

/* JADX INFO: loaded from: classes.dex */
public final class response implements adaptdefault {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final toXyz read;
    public final absRcpResponse serializer;
    public final boolean write;

    public response(String str, toXyz toxyz, toXyz toxyz2, ColorSpaceKt colorSpaceKt, boolean z) {
        this.read = toxyz;
        this.serializer = toxyz2;
        this.IconCompatParcelizer = colorSpaceKt;
        this.write = z;
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.toString();
        }
        return "RectangleShape{position=" + this.serializer + ", size=" + ((absRcpResponse) this.IconCompatParcelizer) + '}';
    }

    @Override // o.adaptdefault
    public final getPackedValueannotations IconCompatParcelizer(accessgetMirrorcp accessgetmirrorcp, StrokeJoinCompanion strokeJoinCompanion, ExtendedSrgblambda0 extendedSrgblambda0) {
        return this.RemoteActionCompatParcelizer != 0 ? new VertexModeCompanion(accessgetmirrorcp, extendedSrgblambda0, this) : new getTriangleFanc2xauaI(accessgetmirrorcp, extendedSrgblambda0, this);
    }

    public response(String str, absRcpResponse absrcpresponse, xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics, toXyz toxyz, boolean z) {
        this.serializer = absrcpresponse;
        this.IconCompatParcelizer = xyzatocolorjlnilsgui_graphics;
        this.read = toxyz;
        this.write = z;
    }
}
