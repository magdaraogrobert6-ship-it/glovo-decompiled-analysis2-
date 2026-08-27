package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendResponse$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandlerExternalSyntheticLambda14;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ActivityHandlerExternalSyntheticLambda15 {
    public static final OtpSendResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 49;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return ActivityHandlerExternalSyntheticLambda14.read;
            }
            ActivityHandlerExternalSyntheticLambda14 activityHandlerExternalSyntheticLambda14 = ActivityHandlerExternalSyntheticLambda14.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String requestId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpSendResponse$Companion] */
    static {
        int i = write + 121;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda15(int i, String str) {
        if (1 == (i & 1)) {
            this.requestId = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ActivityHandlerExternalSyntheticLambda14.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.requestId.hashCode();
            throw null;
        }
        int iHashCode = this.requestId.hashCode();
        int i3 = RemoteActionCompatParcelizer + 43;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OtpSendResponse(requestId=", this.requestId, ")");
        int i4 = serializer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof ActivityHandlerExternalSyntheticLambda15) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requestId, ((ActivityHandlerExternalSyntheticLambda15) obj).requestId}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = serializer + 27;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i5 % 2 == 0;
            }
            int i6 = i3 + 51;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = i3 + 35;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
