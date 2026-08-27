package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapter implements lambda_2086912010lambda0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw write;

    public ComposeViewAdapter(r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw) {
        r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.getClass();
        this.write = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        int i3 = IconCompatParcelizer + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenOrInstallPelican(link=" + this.write + ")";
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 41;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ComposeViewAdapter)) {
            int i4 = serializer + 75;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr = {this.write, ((ComposeViewAdapter) obj).write};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = IconCompatParcelizer + 109;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
