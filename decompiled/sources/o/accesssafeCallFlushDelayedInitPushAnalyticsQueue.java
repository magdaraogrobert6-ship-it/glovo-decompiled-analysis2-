package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssafeCallFlushDelayedInitPushAnalyticsQueue {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final double IconCompatParcelizer;
    public final double serializer;

    public final double IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        double d = this.serializer;
        int i4 = i3 + 7;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return d;
        }
        throw null;
    }

    public final double write() {
        int i = 2 % 2;
        int i2 = write + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public accesssafeCallFlushDelayedInitPushAnalyticsQueue(double d, double d2) {
        this.IconCompatParcelizer = d;
        this.serializer = d2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Double.hashCode(this.serializer) % (Double.hashCode(this.IconCompatParcelizer) << 35);
        }
        return Double.hashCode(this.serializer) + (Double.hashCode(this.IconCompatParcelizer) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 125;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(this.serializer, ")", af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "Coordinate(latitude=", ", longitude="));
        int i4 = RemoteActionCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesssafeCallFlushDelayedInitPushAnalyticsQueue) {
            accesssafeCallFlushDelayedInitPushAnalyticsQueue accesssafecallflushdelayedinitpushanalyticsqueue = (accesssafeCallFlushDelayedInitPushAnalyticsQueue) obj;
            return Double.compare(this.IconCompatParcelizer, accesssafecallflushdelayedinitpushanalyticsqueue.IconCompatParcelizer) == 0 && Double.compare(this.serializer, accesssafecallflushdelayedinitpushanalyticsqueue.serializer) == 0;
        }
        int i4 = i3 + 95;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return false;
    }
}
