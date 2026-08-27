package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdasetExternalDeviceIdInDelay51 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final String write;

    public lambdasetExternalDeviceIdInDelay51(String str, boolean z, boolean z2, boolean z3) {
        this.read = z;
        this.write = str;
        this.RemoteActionCompatParcelizer = z2;
        this.IconCompatParcelizer = z3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) * 31, 31, this.write), 31, this.RemoteActionCompatParcelizer);
        int i4 = serializer + 111;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("RealtimeConnectionConfiguration(realtimeConnectionEnabled=");
        sb.append(this.read);
        sb.append(", realtimeConnectionUrl=");
        sb.append(this.write);
        sb.append(", reconnectOnExpiration=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.RemoteActionCompatParcelizer, ", realtimeConnectionDebugLogsEnabled=", this.IconCompatParcelizer, ")");
        int i2 = MediaSessionCompatQueueItem + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 103;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof lambdasetExternalDeviceIdInDelay51)) {
            return false;
        }
        lambdasetExternalDeviceIdInDelay51 lambdasetexternaldeviceidindelay51 = (lambdasetExternalDeviceIdInDelay51) obj;
        return this.read == lambdasetexternaldeviceidindelay51.read && this.write.equals(lambdasetexternaldeviceidindelay51.write) && this.RemoteActionCompatParcelizer == lambdasetexternaldeviceidindelay51.RemoteActionCompatParcelizer && this.IconCompatParcelizer == lambdasetexternaldeviceidindelay51.IconCompatParcelizer;
    }
}
