package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteRegisteredGeofenceCachelambda0 extends deserializeContentCardlambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final StartWorkingNavAction write;

    public final StartWorkingNavAction RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        StartWorkingNavAction startWorkingNavAction = this.write;
        int i5 = i3 + 111;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return startWorkingNavAction;
    }

    public deleteRegisteredGeofenceCachelambda0(StartWorkingNavAction startWorkingNavAction) {
        startWorkingNavAction.getClass();
        this.write = startWorkingNavAction;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = RemoteActionCompatParcelizer + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToOneClickStartWorking(startWorkingNavAction=" + this.write + ")";
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteRegisteredGeofenceCachelambda0)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((deleteRegisteredGeofenceCachelambda0) obj).write}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 103;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            z = i5 % 2 == 0;
            int i6 = i4 + 51;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 10 / 0;
            }
        }
        return z;
    }
}
