package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class disableFbIdReading {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final List serializer;
    public final enablePreinstallTracking write;

    public disableFbIdReading(String str, String str2, enablePreinstallTracking enablepreinstalltracking, List list) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = enablepreinstalltracking;
        this.serializer = list;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        String str = this.read;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = MediaMetadataCompat + 49;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iHashCode3 = this.serializer.hashCode() + ((this.write.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31)) * 31);
        int i4 = RemoteActionCompatParcelizer + 61;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderSafetyReport(startDate=", this.IconCompatParcelizer, ", lastUpdated=", this.read, ", scores=");
        sbM.append(this.write);
        sbM.append(", recommendations=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 13;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disableFbIdReading)) {
            return false;
        }
        disableFbIdReading disablefbidreading = (disableFbIdReading) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, disablefbidreading.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, disablefbidreading.read}, getCieXyz.write())).booleanValue() && this.write.equals(disablefbidreading.write) && this.serializer.equals(disablefbidreading.serializer);
        }
        int i3 = RemoteActionCompatParcelizer + 33;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
