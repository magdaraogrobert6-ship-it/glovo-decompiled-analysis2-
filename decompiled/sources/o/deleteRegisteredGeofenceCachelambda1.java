package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteRegisteredGeofenceCachelambda1 extends deserializeContentCardlambda0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final StartWorkingNavAction RemoteActionCompatParcelizer;

    public final StartWorkingNavAction write() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        StartWorkingNavAction startWorkingNavAction = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 13;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return startWorkingNavAction;
    }

    public deleteRegisteredGeofenceCachelambda1(StartWorkingNavAction startWorkingNavAction) {
        startWorkingNavAction.getClass();
        this.RemoteActionCompatParcelizer = startWorkingNavAction;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToEquipmentSelection(startWorkingNavAction=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 89;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof deleteRegisteredGeofenceCachelambda1)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((deleteRegisteredGeofenceCachelambda1) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 23;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = IconCompatParcelizer + 33;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
