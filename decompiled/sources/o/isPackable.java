package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Breakdown$Companion;
import kotlinx.serialization.Serializable;
import o.getDrawerElevation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class isPackable {
    public static final HostLoadingPerformanceMeasurementBridgeMessage$Breakdown$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Breakdown$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 29;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getDrawerElevation.RemoteActionCompatParcelizer;
            }
            getDrawerElevation getdrawerelevation = getDrawerElevation.RemoteActionCompatParcelizer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final int bridgeHandshakeDurationMs;
    public final int hostExternalRequestDurationMs;
    public final int hostNativeDurationMs;
    public final int webViewLoadDurationMs;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Breakdown$Companion] */
    static {
        int i = serializer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ isPackable(int i, int i2, int i3, int i4, int i5) {
        if (15 == (i & 15)) {
            this.hostNativeDurationMs = i2;
            this.hostExternalRequestDurationMs = i3;
            this.bridgeHandshakeDurationMs = i4;
            this.webViewLoadDurationMs = i5;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getDrawerElevation.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.webViewLoadDurationMs) + af$$ExternalSyntheticOutline0.m(this.bridgeHandshakeDurationMs, af$$ExternalSyntheticOutline0.m(this.hostExternalRequestDurationMs, Integer.hashCode(this.hostNativeDurationMs) * 31, 31), 31);
        int i4 = RemoteActionCompatParcelizer + 113;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public isPackable(int i, int i2, int i3, int i4) {
        this.hostNativeDurationMs = i;
        this.hostExternalRequestDurationMs = i2;
        this.bridgeHandshakeDurationMs = i3;
        this.webViewLoadDurationMs = i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.hostNativeDurationMs, this.hostExternalRequestDurationMs, "Breakdown(hostNativeDurationMs=", ", hostExternalRequestDurationMs=", ", bridgeHandshakeDurationMs=");
        sbM.append(this.bridgeHandshakeDurationMs);
        sbM.append(", webViewLoadDurationMs=");
        sbM.append(this.webViewLoadDurationMs);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 81;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPackable)) {
            return false;
        }
        isPackable ispackable = (isPackable) obj;
        if (this.hostNativeDurationMs != ispackable.hostNativeDurationMs) {
            return false;
        }
        if (this.hostExternalRequestDurationMs != ispackable.hostExternalRequestDurationMs) {
            int i2 = RemoteActionCompatParcelizer + 85;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        if (this.bridgeHandshakeDurationMs != ispackable.bridgeHandshakeDurationMs) {
            int i4 = RemoteActionCompatParcelizer + 113;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.webViewLoadDurationMs == ispackable.webViewLoadDurationMs) {
            return true;
        }
        int i6 = read + 101;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
