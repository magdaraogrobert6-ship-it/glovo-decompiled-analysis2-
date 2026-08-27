package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class nearestParentThatHasSemantics {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public nearestParentThatHasSemantics(String str) {
        str.getClass();
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 41;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("OpenGrabApp(url=", this.read, ")");
        }
        ff$$ExternalSyntheticOutline0.m("OpenGrabApp(url=", this.read, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 23;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof nearestParentThatHasSemantics)) {
            int i6 = i2 + 99;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr = {this.read, ((nearestParentThatHasSemantics) obj).read};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 51;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
