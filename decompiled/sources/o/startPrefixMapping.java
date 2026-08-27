package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class startPrefixMapping {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final String serializer;
    public final String write;

    public startPrefixMapping(String str, String str2) {
        str.getClass();
        this.write = str;
        this.serializer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("NativeCacheEventMetadata(globalEntityId=", this.write, ", userId=REDACTED)");
        int i4 = RemoteActionCompatParcelizer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode() << (this.write.hashCode() << 32);
        } else {
            iHashCode = (this.write.hashCode() * 31) + this.serializer.hashCode();
        }
        int i3 = read + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 71;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            if (!(obj instanceof startPrefixMapping)) {
                return false;
            }
            startPrefixMapping startprefixmapping = (startPrefixMapping) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, startprefixmapping.write}, getCieXyz.write())).booleanValue() || (!this.serializer.equals(startprefixmapping.serializer))) {
                return false;
            }
        }
        int i4 = read + 17;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
