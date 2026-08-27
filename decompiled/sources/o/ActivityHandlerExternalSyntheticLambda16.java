package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateRequest$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandlerExternalSyntheticLambda18;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandlerExternalSyntheticLambda16 {
    public static final OtpValidateRequest$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateRequest$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 69;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ActivityHandlerExternalSyntheticLambda18 activityHandlerExternalSyntheticLambda18 = ActivityHandlerExternalSyntheticLambda18.read;
            int i4 = IconCompatParcelizer + 51;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 37 / 0;
            }
            return activityHandlerExternalSyntheticLambda18;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String code;
    public final String receiver;
    public final String requestId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.otp_verification.data.model.OtpValidateRequest$Companion] */
    static {
        int i = read + 11;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda16(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.receiver = str;
            this.code = str2;
            this.requestId = str3;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, ActivityHandlerExternalSyntheticLambda18.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.requestId.hashCode() / af$$ExternalSyntheticOutline0.m(this.receiver.hashCode() % 46, 5, this.code);
        } else {
            iHashCode = this.requestId.hashCode() + af$$ExternalSyntheticOutline0.m(this.receiver.hashCode() * 31, 31, this.code);
        }
        int i3 = IconCompatParcelizer + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("OtpValidateRequest(receiver=", this.receiver, ", code=", this.code, ", requestId="), this.requestId, ")");
        int i4 = serializer + 79;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public ActivityHandlerExternalSyntheticLambda16(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.receiver = str;
        this.code = str2;
        this.requestId = str3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof ActivityHandlerExternalSyntheticLambda16) {
                ActivityHandlerExternalSyntheticLambda16 activityHandlerExternalSyntheticLambda16 = (ActivityHandlerExternalSyntheticLambda16) obj;
                Object[] objArr = {this.receiver, activityHandlerExternalSyntheticLambda16.receiver};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    int i2 = serializer + 33;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                Object[] objArr2 = {this.code, activityHandlerExternalSyntheticLambda16.code};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr3 = {this.requestId, activityHandlerExternalSyntheticLambda16.requestId};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i4 = serializer + 57;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = serializer + 21;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = IconCompatParcelizer + 91;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return true;
    }
}
