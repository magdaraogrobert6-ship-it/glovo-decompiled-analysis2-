package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpErrorResponse$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ActivityHandlerExternalSyntheticLambda11 {
    public static final OtpErrorResponse$Companion Companion = new OtpErrorResponse$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String message;
    public final String originalMessage;

    static {
        int i = IconCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda11(int i, String str, String str2) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.message = str;
            if ((i & 2) == 0) {
                this.originalMessage = null;
                int i2 = serializer + 25;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.originalMessage = str2;
            int i3 = serializer + 49;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, verifyPlayStorePurchase.read.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("OtpErrorResponse(message=", this.message, ", originalMessage=", this.originalMessage, ")");
        int i4 = write + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.message.hashCode();
        String str = this.originalMessage;
        if (str == null) {
            int i2 = write + 83;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 87;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof ActivityHandlerExternalSyntheticLambda11)) {
            return false;
        }
        ActivityHandlerExternalSyntheticLambda11 activityHandlerExternalSyntheticLambda11 = (ActivityHandlerExternalSyntheticLambda11) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, activityHandlerExternalSyntheticLambda11.message}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.originalMessage, activityHandlerExternalSyntheticLambda11.originalMessage}, getCieXyz.write())).booleanValue();
        }
        int i7 = write + 27;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
