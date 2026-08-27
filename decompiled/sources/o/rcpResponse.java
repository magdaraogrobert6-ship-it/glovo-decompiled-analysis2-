package o;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rcpResponse implements adaptdefault {
    public final String IconCompatParcelizer;
    public final boolean serializer;
    public final List write;

    @Override // o.adaptdefault
    public final getPackedValueannotations IconCompatParcelizer(accessgetMirrorcp accessgetmirrorcp, StrokeJoinCompanion strokeJoinCompanion, ExtendedSrgblambda0 extendedSrgblambda0) {
        return new accessgetCentercp(accessgetmirrorcp, extendedSrgblambda0, this, strokeJoinCompanion);
    }

    public rcpResponse(String str, List list, boolean z) {
        this.IconCompatParcelizer = str;
        this.write = list;
        this.serializer = z;
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.IconCompatParcelizer + "' Shapes: " + Arrays.toString(this.write.toArray()) + '}';
    }
}
