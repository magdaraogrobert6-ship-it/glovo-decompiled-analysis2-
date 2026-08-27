package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Timestamps$Companion;
import kotlinx.serialization.Serializable;
import o.setDrawerElevation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setDrawerListener {
    public static final HostLoadingPerformanceMeasurementBridgeMessage$Timestamps$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Timestamps$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 121;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setDrawerElevation setdrawerelevation = setDrawerElevation.IconCompatParcelizer;
            int i4 = write + 15;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setdrawerelevation;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final long contentRendered;
    public final long userTap;
    public final long webViewUrlLoadEnd;
    public final long webViewUrlLoadStart;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.HostLoadingPerformanceMeasurementBridgeMessage$Timestamps$Companion] */
    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setDrawerListener(int i, long j, long j2, long j3, long j4) {
        if (15 == (i & 15)) {
            this.userTap = j;
            this.webViewUrlLoadStart = j2;
            this.webViewUrlLoadEnd = j3;
            this.contentRendered = j4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setDrawerElevation.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.contentRendered) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.userTap) * 31, 31, this.webViewUrlLoadStart), 31, this.webViewUrlLoadEnd);
        int i4 = serializer + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public setDrawerListener(long j, long j2, long j3, long j4) {
        this.userTap = j;
        this.webViewUrlLoadStart = j2;
        this.webViewUrlLoadEnd = j3;
        this.contentRendered = j4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.userTap, "Timestamps(userTap=", ", webViewUrlLoadStart=");
        sbM.append(this.webViewUrlLoadStart);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", webViewUrlLoadEnd=", this.webViewUrlLoadEnd, ", contentRendered=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.contentRendered, ")", sbM);
        int i4 = IconCompatParcelizer + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 83;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setDrawerListener)) {
            return false;
        }
        setDrawerListener setdrawerlistener = (setDrawerListener) obj;
        if (this.userTap != setdrawerlistener.userTap) {
            return false;
        }
        if (this.webViewUrlLoadStart == setdrawerlistener.webViewUrlLoadStart) {
            return this.webViewUrlLoadEnd == setdrawerlistener.webViewUrlLoadEnd && this.contentRendered == setdrawerlistener.contentRendered;
        }
        int i4 = IconCompatParcelizer + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
