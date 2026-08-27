package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class mul3x3Diag implements adaptdefault {
    public final mul3x3Float3 IconCompatParcelizer;
    public final boolean serializer;

    @Override // o.adaptdefault
    public final getPackedValueannotations IconCompatParcelizer(accessgetMirrorcp accessgetmirrorcp, StrokeJoinCompanion strokeJoinCompanion, ExtendedSrgblambda0 extendedSrgblambda0) {
        if (((HashSet) accessgetmirrorcp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read).contains(TileModeCompanion.MergePathsApi19)) {
            return new VertexMode(this);
        }
        getD50Xyzui_graphics.IconCompatParcelizer("Animation contains merge paths but they are disabled.");
        return null;
    }

    public mul3x3Diag(String str, mul3x3Float3 mul3x3float3, boolean z) {
        this.IconCompatParcelizer = mul3x3float3;
        this.serializer = z;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.IconCompatParcelizer + '}';
    }
}
