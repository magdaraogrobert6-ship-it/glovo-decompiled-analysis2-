package o;

import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class getCallbackId {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final isTrackingEnabled IconCompatParcelizer;
    public final Calendar read;

    public getCallbackId(isTrackingEnabled istrackingenabled, Calendar calendar) {
        istrackingenabled.getClass();
        this.IconCompatParcelizer = istrackingenabled;
        this.read = calendar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.hashCode();
            throw null;
        }
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Calendar calendar = this.read;
        int iHashCode2 = (iHashCode * 31) + (calendar == null ? 0 : calendar.hashCode());
        int i3 = serializer + 33;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 29;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getCallbackId)) {
            int i4 = serializer + 49;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getCallbackId getcallbackid = (getCallbackId) obj;
        if (this.IconCompatParcelizer != getcallbackid.IconCompatParcelizer) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getcallbackid.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = RemoteActionCompatParcelizer + 33;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CourierStatusData(status=" + this.IconCompatParcelizer + ", nextStatusSyncTime=" + this.read + ")";
        int i2 = serializer + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
