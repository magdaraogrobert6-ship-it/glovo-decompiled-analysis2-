package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setScreenOffsetgyyYBs extends getWindowOffsetnOccac {
    private static int read = 0;
    private static int write = 1;
    public final long serializer;

    public final long RemoteActionCompatParcelizer() {
        long j;
        int i = 2 % 2;
        int i2 = write + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            j = this.serializer;
            int i4 = 83 / 0;
        } else {
            j = this.serializer;
        }
        int i5 = i3 + 51;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return j;
    }

    public setScreenOffsetgyyYBs(long j) {
        this.serializer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.serializer);
        int i4 = write + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = m1$$ExternalSyntheticOutline0.m(this.serializer, "OpenChatByDeliveries(deliveryId=", ")");
            int i3 = read + 89;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        m1$$ExternalSyntheticOutline0.m(this.serializer, "OpenChatByDeliveries(deliveryId=", ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setScreenOffsetgyyYBs)) {
            int i2 = write + 51;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (this.serializer == ((setScreenOffsetgyyYBs) obj).serializer) {
            return true;
        }
        int i3 = read + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 51;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 50 / 0;
        }
        return false;
    }
}
