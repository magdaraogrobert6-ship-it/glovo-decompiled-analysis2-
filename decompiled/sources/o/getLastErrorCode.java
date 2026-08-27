package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyTrackingPermissionResponse$Companion;
import kotlinx.serialization.Serializable;
import o.getInstallVersion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLastErrorCode {
    public static final RiderSafetyTrackingPermissionResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.safety.authentication.data.RiderSafetyTrackingPermissionResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 39;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getInstallVersion.serializer;
            }
            getInstallVersion getinstallversion = getInstallVersion.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final boolean permissionGranted;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.safety.authentication.data.RiderSafetyTrackingPermissionResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 111;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
    }

    public /* synthetic */ getLastErrorCode(int i, boolean z) {
        if (1 == (i & 1)) {
            this.permissionGranted = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getInstallVersion.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.permissionGranted);
        }
        int i3 = 82 / 0;
        return Boolean.hashCode(this.permissionGranted);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strSerializer = MediaSessionCompatQueueItem.serializer("RiderSafetyTrackingPermissionResponse(permissionGranted=", ")", this.permissionGranted);
            int i3 = write + 77;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strSerializer;
        }
        MediaSessionCompatQueueItem.serializer("RiderSafetyTrackingPermissionResponse(permissionGranted=", ")", this.permissionGranted);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 105;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof getLastErrorCode) || this.permissionGranted != ((getLastErrorCode) obj).permissionGranted) {
            return false;
        }
        int i3 = write + 93;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
