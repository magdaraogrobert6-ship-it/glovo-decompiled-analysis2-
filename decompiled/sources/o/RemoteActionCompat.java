package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteActionCompat extends Person {
    private static int serializer = 1;
    private static int write;
    public final List IconCompatParcelizer;
    public final getGpsAdid RemoteActionCompatParcelizer;
    public final boolean read;

    public RemoteActionCompat(getGpsAdid getgpsadid, boolean z, List list) {
        this.RemoteActionCompatParcelizer = getgpsadid;
        this.read = z;
        this.IconCompatParcelizer = list;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 19;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getGpsAdid getgpsadid = this.RemoteActionCompatParcelizer;
        if (getgpsadid == null) {
            i = 0;
        } else {
            int iHashCode = getgpsadid.hashCode();
            int i5 = serializer + 87;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return this.IconCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(i * 31, 31, this.read);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Available(opportunity=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isSelected=");
        sb.append(this.read);
        sb.append(", startNowOpportunities=");
        String str = MediaSessionCompatQueueItem.read(sb, this.IconCompatParcelizer, ")");
        int i2 = serializer + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof RemoteActionCompat)) {
                int i4 = i2 + 79;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            RemoteActionCompat remoteActionCompat = (RemoteActionCompat) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, remoteActionCompat.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.read != remoteActionCompat.read || (!this.IconCompatParcelizer.equals(remoteActionCompat.IconCompatParcelizer))) {
                return false;
            }
        }
        return true;
    }
}
