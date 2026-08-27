package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class launchSessionResponseTasksI {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final launchSessionResponseListenerI serializer;
    public final launchThirdPartySharingResponseTasks write;

    public launchSessionResponseTasksI(String str, long j, launchSessionResponseListenerI launchsessionresponselisteneri, launchThirdPartySharingResponseTasks launchthirdpartysharingresponsetasks) {
        str.getClass();
        launchsessionresponselisteneri.getClass();
        launchthirdpartysharingresponsetasks.getClass();
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = launchsessionresponselisteneri;
        this.write = launchthirdpartysharingresponsetasks;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode = this.write.hashCode() + ((this.serializer.hashCode() + iM) * 31);
        int i4 = read + 37;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("DeliveryTrackingData(orderCode=", this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, ", deliveryId=");
        sbM.append(", callType=");
        sbM.append(this.serializer);
        sbM.append(", state=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 55;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof launchSessionResponseTasksI)) {
                return false;
            }
            launchSessionResponseTasksI launchsessionresponsetasksi = (launchSessionResponseTasksI) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, launchsessionresponsetasksi.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (this.RemoteActionCompatParcelizer == launchsessionresponsetasksi.RemoteActionCompatParcelizer) {
                    return this.serializer == launchsessionresponsetasksi.serializer && this.write == launchsessionresponsetasksi.write;
                }
                int i2 = read + 15;
                MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = MediaMetadataCompat + 121;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 23;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 35 / 0;
            }
            return false;
        }
        int i9 = MediaMetadataCompat + 39;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}
