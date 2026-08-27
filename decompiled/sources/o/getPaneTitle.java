package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPaneTitle implements getIsTraversalGroup {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public getPaneTitle(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("TwoFaRequired(flowId=", this.RemoteActionCompatParcelizer, ", phoneNumber=REDACTED)");
        int i4 = IconCompatParcelizer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode() - (this.RemoteActionCompatParcelizer.hashCode() / 54);
        } else {
            iHashCode = this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = read + 115;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 99;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getPaneTitle)) {
            return false;
        }
        getPaneTitle getpanetitle = (getPaneTitle) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getpanetitle.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getpanetitle.serializer}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i4 = IconCompatParcelizer + 25;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 3;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
