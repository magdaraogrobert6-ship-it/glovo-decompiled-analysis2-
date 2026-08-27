package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignResponse$Companion;
import kotlinx.serialization.Serializable;
import o.sendPurchaseVerificationPackageI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class sendPurchaseVerificationPackageSync {
    public static final QuickSessionAssignResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            sendPurchaseVerificationPackageI sendpurchaseverificationpackagei = sendPurchaseVerificationPackageI.IconCompatParcelizer;
            int i4 = write + 99;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return sendpurchaseverificationpackagei;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String message;
    public final int sessionId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.searchshifts.data.entity.QuickSessionAssignResponse$Companion] */
    static {
        int i = read + 111;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ sendPurchaseVerificationPackageSync(int i, int i2, String str) {
        if (3 == (i & 3)) {
            this.sessionId = i2;
            this.message = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, sendPurchaseVerificationPackageI.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = Integer.hashCode(this.sessionId);
            iHashCode = this.message.hashCode();
            i = iHashCode2 >>> 10;
        } else {
            int iHashCode3 = Integer.hashCode(this.sessionId);
            iHashCode = this.message.hashCode();
            i = iHashCode3 * 31;
        }
        int i4 = iHashCode + i;
        int i5 = IconCompatParcelizer + 67;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sendPurchaseVerificationPackageSync)) {
            return false;
        }
        sendPurchaseVerificationPackageSync sendpurchaseverificationpackagesync = (sendPurchaseVerificationPackageSync) obj;
        if (this.sessionId == sendpurchaseverificationpackagesync.sessionId) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, sendpurchaseverificationpackagesync.message}, getCieXyz.write())).booleanValue())) {
                int i2 = serializer + 13;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i3 = serializer + 91;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 != 0;
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QuickSessionAssignResponse(sessionId=" + this.sessionId + ", message=" + this.message + ")";
        int i2 = serializer + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
