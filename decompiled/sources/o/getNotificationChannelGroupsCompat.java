package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationChannelGroupsCompat extends getNotificationChannels {
    private static int read = 0;
    private static int write = 1;
    public final List IconCompatParcelizer;

    public final List serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.IconCompatParcelizer;
        int i5 = i2 + 79;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public getNotificationChannelGroupsCompat(List list) {
        list.getClass();
        this.IconCompatParcelizer = list;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.read("Available(opportunities=", ", isSelected=true)", this.IconCompatParcelizer);
        }
        int i3 = 10 / 0;
        return MediaSessionCompatQueueItem.read("Available(opportunities=", ", isSelected=true)", this.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 17;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            iHashCode = Boolean.hashCode(false);
            i = iHashCode2 * 89;
        } else {
            int iHashCode3 = this.IconCompatParcelizer.hashCode();
            iHashCode = Boolean.hashCode(true);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 39;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof getNotificationChannelGroupsCompat)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((getNotificationChannelGroupsCompat) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i5 = i2 + 53;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
