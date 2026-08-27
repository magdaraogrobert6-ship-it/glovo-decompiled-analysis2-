package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class instantiateReceiver extends checkCompatWrapper {
    private static int read = 1;
    private static int serializer;
    public final StartWorkingNavAction.StartWorkNow write;

    public instantiateReceiver(StartWorkingNavAction.StartWorkNow startWorkNow) {
        this.write = startWorkNow;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        int i3 = read + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 79 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorkNow(startWorkingNavAction=" + this.write + ")";
        int i2 = read + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof instantiateReceiver) || !this.write.equals(((instantiateReceiver) obj).write))) {
            return false;
        }
        int i4 = read + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
