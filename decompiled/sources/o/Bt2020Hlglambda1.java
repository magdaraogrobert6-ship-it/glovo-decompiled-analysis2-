package o;

/* JADX INFO: loaded from: classes.dex */
public final class Bt2020Hlglambda1 implements adaptdefault {
    public final toXyz IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final toXyz read;
    public final Bt2020Pqlambda0 serializer;
    public final toXyz write;

    @Override // o.adaptdefault
    public final getPackedValueannotations IconCompatParcelizer(accessgetMirrorcp accessgetmirrorcp, StrokeJoinCompanion strokeJoinCompanion, ExtendedSrgblambda0 extendedSrgblambda0) {
        return new encodePointList(extendedSrgblambda0, this);
    }

    public Bt2020Hlglambda1(String str, Bt2020Pqlambda0 bt2020Pqlambda0, toXyz toxyz, toXyz toxyz2, toXyz toxyz3, boolean z) {
        this.serializer = bt2020Pqlambda0;
        this.write = toxyz;
        this.read = toxyz2;
        this.IconCompatParcelizer = toxyz3;
        this.RemoteActionCompatParcelizer = z;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.write + ", end: " + this.read + ", offset: " + this.IconCompatParcelizer + "}";
    }
}
