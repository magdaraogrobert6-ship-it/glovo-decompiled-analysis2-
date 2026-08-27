package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationOpenedlambda31 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final List RemoteActionCompatParcelizer;
    public final List serializer;
    public final List write;

    public logPushNotificationOpenedlambda31(List list, List list2, List list3) {
        this.serializer = list;
        this.write = list2;
        this.RemoteActionCompatParcelizer = list3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + c8$$ExternalSyntheticOutline0.m(this.write, this.serializer.hashCode() * 31, 31);
        int i4 = IconCompatParcelizer + 67;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OneClickStartWorkingViewEntity(equipmentComponents=");
        sb.append(this.serializer);
        sb.append(", bodyComponents=");
        sb.append(this.write);
        sb.append(", footerComponents=");
        String str = MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof logPushNotificationOpenedlambda31) {
            logPushNotificationOpenedlambda31 logpushnotificationopenedlambda31 = (logPushNotificationOpenedlambda31) obj;
            if (this.serializer.equals(logpushnotificationopenedlambda31.serializer)) {
                if (this.write.equals(logpushnotificationopenedlambda31.write) && this.RemoteActionCompatParcelizer.equals(logpushnotificationopenedlambda31.RemoteActionCompatParcelizer)) {
                    return true;
                }
            } else {
                int i2 = read + 39;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
        }
        int i4 = IconCompatParcelizer + 47;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
