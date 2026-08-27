package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler26 implements ActivityHandler27 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;

    public ActivityHandler26(String str) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            int i3 = 1 / 0;
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        }
        int i4 = IconCompatParcelizer + 95;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("Error(info=", this.RemoteActionCompatParcelizer, ")");
            int i3 = IconCompatParcelizer + 113;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("Error(info=", this.RemoteActionCompatParcelizer, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityHandler26) {
            Object[] objArr = {this.RemoteActionCompatParcelizer, ((ActivityHandler26) obj).RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 53;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 97;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i5 = serializer + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
