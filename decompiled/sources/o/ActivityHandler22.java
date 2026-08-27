package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationSuccessResponse$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandler241;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler22 {
    public static final AccountCreationSuccessResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationSuccessResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 17;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return ActivityHandler241.IconCompatParcelizer;
            }
            ActivityHandler241 activityHandler241 = ActivityHandler241.IconCompatParcelizer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String accessToken;
    public final String applicantId;
    public final String deviceToken;
    public final String refreshToken;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationSuccessResponse$Companion] */
    static {
        int i = read + 81;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ActivityHandler22(String str, int i, String str2, String str3, String str4) {
        if (7 == (i & 7)) {
            this.accessToken = str;
            this.refreshToken = str2;
            this.deviceToken = str3;
            if ((i & 8) == 0) {
                this.applicantId = null;
                int i2 = RemoteActionCompatParcelizer + 31;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.applicantId = str4;
            int i4 = RemoteActionCompatParcelizer + 73;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, ActivityHandler241.IconCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("AccountCreationSuccessResponse(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", deviceToken="), this.deviceToken, ", applicantId=", this.applicantId, ")");
            int i3 = RemoteActionCompatParcelizer + 51;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("AccountCreationSuccessResponse(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", deviceToken="), this.deviceToken, ", applicantId=", this.applicantId, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 15;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.deviceToken);
        String str = this.applicantId;
        if (str == null) {
            int i5 = RemoteActionCompatParcelizer + 97;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = str.hashCode();
            int i6 = RemoteActionCompatParcelizer + 65;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityHandler22) {
            ActivityHandler22 activityHandler22 = (ActivityHandler22) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, activityHandler22.accessToken}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, activityHandler22.refreshToken}, getCieXyz.write())).booleanValue()) {
                int i5 = write + 75;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, activityHandler22.deviceToken}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.applicantId, activityHandler22.applicantId}, getCieXyz.write())).booleanValue();
            }
            int i7 = write + 119;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i3 + 3;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
