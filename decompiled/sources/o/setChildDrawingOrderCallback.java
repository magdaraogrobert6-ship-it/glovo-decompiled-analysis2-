package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.InAppNotificationRequestBody$Companion;
import kotlinx.serialization.Serializable;
import o.setAccessibilityDelegateCompat;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setChildDrawingOrderCallback {
    public static final InAppNotificationRequestBody$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.InAppNotificationRequestBody$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 67;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return setAccessibilityDelegateCompat.RemoteActionCompatParcelizer;
            }
            int i3 = 32 / 0;
            return setAccessibilityDelegateCompat.RemoteActionCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String inAppMessageData;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.InAppNotificationRequestBody$Companion] */
    static {
        int i = write + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setChildDrawingOrderCallback(int i, String str) {
        if (1 == (i & 1)) {
            this.inAppMessageData = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setAccessibilityDelegateCompat.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.inAppMessageData.hashCode();
            throw null;
        }
        int iHashCode = this.inAppMessageData.hashCode();
        int i3 = read + 1;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("InAppNotificationRequestBody(inAppMessageData=", this.inAppMessageData, ")");
        int i4 = serializer + 13;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setChildDrawingOrderCallback(String str) {
        str.getClass();
        this.inAppMessageData = str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 17;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof setChildDrawingOrderCallback)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inAppMessageData, ((setChildDrawingOrderCallback) obj).inAppMessageData}, getCieXyz.write())).booleanValue();
    }
}
