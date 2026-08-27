package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class addCompatExtras extends NotificationCompatCallStyle {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final StartWorkingNavAction.StartWorkNow RemoteActionCompatParcelizer;

    public addCompatExtras(StartWorkingNavAction.StartWorkNow startWorkNow) {
        this.RemoteActionCompatParcelizer = startWorkNow;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = serializer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorkNow(startWorkingNavAction=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if ((obj instanceof addCompatExtras) && this.RemoteActionCompatParcelizer.equals(((addCompatExtras) obj).RemoteActionCompatParcelizer)) {
            return true;
        }
        int i4 = serializer + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
