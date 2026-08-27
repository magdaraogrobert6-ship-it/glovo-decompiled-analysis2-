package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Timestamps$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetSavercp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLayoutTextGranularityduNsdkg {
    public static final HostMessage$HostLoadingPerformanceMeasurement$Timestamps$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Timestamps$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 75;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetSavercp accessgetsavercp = accessgetSavercp.read;
            int i4 = write + 29;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessgetsavercp;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final long contentRendered;
    public final long userTap;
    public final long webViewUrlLoadEnd;
    public final long webViewUrlLoadStart;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.HostMessage$HostLoadingPerformanceMeasurement$Timestamps$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 65;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ toLayoutTextGranularityduNsdkg(int i, long j, long j2, long j3, long j4) {
        if (15 == (i & 15)) {
            this.userTap = j;
            this.webViewUrlLoadStart = j2;
            this.webViewUrlLoadEnd = j3;
            this.contentRendered = j4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, accessgetSavercp.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.contentRendered) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.userTap) * 31, 31, this.webViewUrlLoadStart), 31, this.webViewUrlLoadEnd);
        int i4 = IconCompatParcelizer + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public toLayoutTextGranularityduNsdkg(long j, long j2, long j3, long j4) {
        this.userTap = j;
        this.webViewUrlLoadStart = j2;
        this.webViewUrlLoadEnd = j3;
        this.contentRendered = j4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(this.userTap, "Timestamps(userTap=", ", webViewUrlLoadStart=");
        sbM.append(this.webViewUrlLoadStart);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", webViewUrlLoadEnd=", this.webViewUrlLoadEnd, ", contentRendered=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.contentRendered, ")", sbM);
        int i4 = read + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 87;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toLayoutTextGranularityduNsdkg)) {
            return false;
        }
        toLayoutTextGranularityduNsdkg tolayouttextgranularitydunsdkg = (toLayoutTextGranularityduNsdkg) obj;
        if (this.userTap != tolayouttextgranularitydunsdkg.userTap) {
            int i6 = i2 + 45;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.webViewUrlLoadStart != tolayouttextgranularitydunsdkg.webViewUrlLoadStart || this.webViewUrlLoadEnd != tolayouttextgranularitydunsdkg.webViewUrlLoadEnd) {
            return false;
        }
        if (this.contentRendered == tolayouttextgranularitydunsdkg.contentRendered) {
            return true;
        }
        int i7 = i4 + 79;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
