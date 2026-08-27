package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetTrianglescp implements encodeColorList, getPackedValueannotations {
    public r8lambda9WZGo8jxmhcanMko0p70vdir2pY RemoteActionCompatParcelizer;
    public final accessgetMirrorcp read;
    public final getColors write;

    public static int serializer(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
    }

    @Override // o.encodeColorList
    public final void serializer() {
        this.read.invalidateSelf();
    }

    public accessgetTrianglescp(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, ColorSpaces colorSpaces) {
        this.read = accessgetmirrorcp;
        getColors getcolorsWrite = colorSpaces.RemoteActionCompatParcelizer.write();
        this.write = getcolorsWrite;
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        getcolorsWrite.write(this);
    }
}
