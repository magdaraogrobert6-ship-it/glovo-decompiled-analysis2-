package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNavigatorExternalSyntheticLambda0 extends NavHostFragmentExternalSyntheticLambda1 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String write;

    @Override // o.NavHostFragmentExternalSyntheticLambda1
    public final int read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return com.logistics.rider.glovo.R.drawable.ic_bold_large_edit_default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorExternalSyntheticLambda0(String str) {
        super(com.logistics.rider.glovo.R.drawable.ic_bold_large_edit_default);
        str.getClass();
        this.write = str;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("DeepLink(url=", this.write, ", iconRes=2131231087)");
        }
        ff$$ExternalSyntheticOutline0.m("DeepLink(url=", this.write, ", iconRes=2131231087)");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(com.logistics.rider.glovo.R.drawable.ic_bold_large_edit_default) + (this.write.hashCode() * 31);
        int i4 = serializer + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 19;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (obj instanceof FragmentNavigatorExternalSyntheticLambda0) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((FragmentNavigatorExternalSyntheticLambda0) obj).write}, getCieXyz.write())).booleanValue()) {
                int i6 = IconCompatParcelizer + 117;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        }
        return false;
    }
}
