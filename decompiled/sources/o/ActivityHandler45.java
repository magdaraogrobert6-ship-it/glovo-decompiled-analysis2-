package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.api.applicant.model.ApplicantData$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler45 {
    public static final ApplicantData$Companion Companion = new ApplicantData$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String accessToken;
    public final String countryCode;
    public final String deviceToken;
    public final long expiry;
    public final String refreshToken;
    public final String userId;

    static {
        int i = write + 115;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 25;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.deviceToken;
        int i5 = i2 + 111;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.accessToken;
        int i5 = i3 + 103;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.countryCode;
        int i5 = i3 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.refreshToken;
        int i5 = i3 + 99;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ActivityHandler45(int i, String str, String str2, String str3, String str4, long j, String str5) {
        if (31 == (i & 31)) {
            this.accessToken = str;
            this.refreshToken = str2;
            this.deviceToken = str3;
            this.countryCode = str4;
            this.expiry = j;
            if ((i & 32) == 0) {
                this.userId = null;
                int i2 = RemoteActionCompatParcelizer + 5;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 29 / 0;
                    return;
                }
                return;
            }
            this.userId = str5;
            int i4 = serializer + 67;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, ActivityHandler51.serializer.getDescriptor());
        throw null;
    }

    public ActivityHandler45(long j, String str, String str2, String str3, String str4, String str5) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.accessToken = str;
        this.refreshToken = str2;
        this.deviceToken = str3;
        this.countryCode = str4;
        this.expiry = j;
        this.userId = str5;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.deviceToken), 31, this.countryCode), 31, this.expiry);
        String str = this.userId;
        if (str == null) {
            int i2 = serializer + 21;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = serializer + 7;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ApplicantData(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", deviceToken=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.deviceToken, ", countryCode=", this.countryCode, ", expiry=");
        sbM.append(this.expiry);
        sbM.append(", userId=");
        sbM.append(this.userId);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 55;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHandler45)) {
            int i4 = i2 + 99;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        ActivityHandler45 activityHandler45 = (ActivityHandler45) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, activityHandler45.accessToken}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 75;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.refreshToken, activityHandler45.refreshToken}, getCieXyz.write())).booleanValue()) {
            int i7 = RemoteActionCompatParcelizer + 21;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, activityHandler45.deviceToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, activityHandler45.countryCode}, getCieXyz.write())).booleanValue() || this.expiry != activityHandler45.expiry) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, activityHandler45.userId}, getCieXyz.write())).booleanValue();
    }
}
