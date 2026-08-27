package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnimatedVisibilityStatecc2g1to implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final insertBasedOnParentOffset write;

    public /* synthetic */ getAnimatedVisibilityStatecc2g1to(insertBasedOnParentOffset insertbasedonparentoffset, int i) {
        this.IconCompatParcelizer = i;
        this.write = insertbasedonparentoffset;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 115;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        insertBasedOnParentOffset insertbasedonparentoffset = this.write;
        if (i4 != 0) {
            return new getTransitions((getAnimationClocksui_tooling) insertbasedonparentoffset.write());
        }
        getAnimatedProperties getanimatedproperties = new getAnimatedProperties((getAnimationClocksui_tooling) insertbasedonparentoffset.write());
        int i5 = serializer + 113;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getanimatedproperties;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
