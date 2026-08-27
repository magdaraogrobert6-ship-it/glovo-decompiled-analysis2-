package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setDeviceIdProviderandroid_sdk_base_release extends runGuardedForResultandroid_sdk_base_release {
    private static int read = 1;
    private static int write;
    public final boolean serializer;

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = write + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        int i3 = 95 / 0;
        return this.serializer;
    }

    public setDeviceIdProviderandroid_sdk_base_release(boolean z) {
        this.serializer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Boolean.hashCode(this.serializer);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.serializer);
        int i3 = write + 55;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("NavigateToLivenessFlow(isDismissable=", ")", this.serializer);
        int i4 = write + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDeviceIdProviderandroid_sdk_base_release)) {
            int i2 = write + 73;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.serializer == ((setDeviceIdProviderandroid_sdk_base_release) obj).serializer) {
            return true;
        }
        int i4 = write + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
