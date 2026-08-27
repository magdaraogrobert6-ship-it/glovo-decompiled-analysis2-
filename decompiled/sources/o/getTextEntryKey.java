package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextEntryKey extends getTextSubstitution {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            int i4 = 43 / 0;
        }
        int i5 = i3 + 125;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "Authenticated(authToken=REDACTED)";
    }

    public getTextEntryKey(String str) {
        str.getClass();
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = IconCompatParcelizer + 105;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 101;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof getTextEntryKey) {
            Object[] objArr = {this.read, ((getTextEntryKey) obj).read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = IconCompatParcelizer + 41;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = serializer;
        int i6 = i5 + 79;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i5 + 81;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
