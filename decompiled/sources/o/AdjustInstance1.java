package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class AdjustInstance1 extends setSendingReferrersAsNotSent {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final StartWorkingNavAction.StartExistingShift read;

    public AdjustInstance1(StartWorkingNavAction.StartExistingShift startExistingShift) {
        this.read = startExistingShift;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 19;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorking(navAction=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if ((obj instanceof AdjustInstance1) && this.read.equals(((AdjustInstance1) obj).read)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
