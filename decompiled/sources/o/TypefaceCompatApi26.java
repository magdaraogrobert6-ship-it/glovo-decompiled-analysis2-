package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceCompatApi26 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public TypefaceCompatApi26(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.serializer = str2;
        this.write = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer);
        int i4 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("DialogState(title=", this.read, ", message=", this.serializer, ", positiveButtonText="), this.write, ")");
        int i4 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceCompatApi26)) {
            return false;
        }
        TypefaceCompatApi26 typefaceCompatApi26 = (TypefaceCompatApi26) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, typefaceCompatApi26.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, typefaceCompatApi26.serializer}, getCieXyz.write())).booleanValue()) {
            return this.write.equals(typefaceCompatApi26.write);
        }
        int i3 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
