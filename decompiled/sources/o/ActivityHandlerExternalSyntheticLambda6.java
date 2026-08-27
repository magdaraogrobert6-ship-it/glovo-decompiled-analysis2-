package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateResponse$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandlerExternalSyntheticLambda3;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ActivityHandlerExternalSyntheticLambda6 {
    public static final OtpValidateResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateResponse$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 49;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return ActivityHandlerExternalSyntheticLambda3.read;
            }
            int i3 = 5 / 0;
            return ActivityHandlerExternalSyntheticLambda3.read;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final boolean verified;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 5;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda6(int i, boolean z) {
        if (1 == (i & 1)) {
            this.verified = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ActivityHandlerExternalSyntheticLambda3.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.verified);
        int i4 = RemoteActionCompatParcelizer + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("OtpValidateResponse(verified=", ")", this.verified);
        int i4 = RemoteActionCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 119;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ActivityHandlerExternalSyntheticLambda6)) {
            int i4 = write + 15;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.verified != ((ActivityHandlerExternalSyntheticLambda6) obj).verified) {
            int i5 = write + 89;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = write + 89;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
