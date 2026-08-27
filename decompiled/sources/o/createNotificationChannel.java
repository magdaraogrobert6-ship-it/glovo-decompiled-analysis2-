package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createNotificationChannel extends createNotificationChannelGroups {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final List read;

    public createNotificationChannel(List list) {
        this.read = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read.hashCode();
            throw null;
        }
        int iHashCode = this.read.hashCode();
        int i3 = RemoteActionCompatParcelizer + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("TypeSelector(types=", ")", this.read);
        int i4 = RemoteActionCompatParcelizer + 125;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof createNotificationChannel) {
            if (this.read.equals(((createNotificationChannel) obj).read)) {
                return true;
            }
        } else {
            int i5 = i3 + 49;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 4 % 4;
            }
        }
        int i7 = serializer + 53;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 63 / 0;
        }
        return false;
    }
}
