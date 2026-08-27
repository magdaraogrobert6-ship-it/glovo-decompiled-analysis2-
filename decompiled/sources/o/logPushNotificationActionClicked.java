package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class logPushNotificationActionClicked {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final LinkedHashMap read;
    public final ArrayList write;

    public logPushNotificationActionClicked(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.read = linkedHashMap;
        this.write = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.read.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReviewConfig(scores=" + this.read + ", tags=" + this.write + ")";
        int i2 = serializer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 121;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 5 / 5;
            }
        } else {
            if (!(obj instanceof logPushNotificationActionClicked)) {
                return false;
            }
            logPushNotificationActionClicked logpushnotificationactionclicked = (logPushNotificationActionClicked) obj;
            if (!this.read.equals(logpushnotificationactionclicked.read) || !this.write.equals(logpushnotificationactionclicked.write)) {
                return false;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
