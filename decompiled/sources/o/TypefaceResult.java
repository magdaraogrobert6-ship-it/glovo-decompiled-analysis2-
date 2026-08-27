package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceResult extends getSizeui_text {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String write;

    public TypefaceResult(String str) {
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        int i5 = i3 + 69;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("SetResultAndDismiss(clickedPictureUri=", this.write, ")");
            int i3 = RemoteActionCompatParcelizer + 115;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("SetResultAndDismiss(clickedPictureUri=", this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 109;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 11;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof TypefaceResult)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((TypefaceResult) obj).write}, getCieXyz.write())).booleanValue();
    }
}
