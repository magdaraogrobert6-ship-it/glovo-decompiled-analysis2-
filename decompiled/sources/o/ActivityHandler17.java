package o;

import android.annotation.SuppressLint;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountCreationErrorResponse$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler17 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final ActivityHandler23 accountStatus;
    public final String applicantId;
    public final String code;
    public final Boolean isEligible;
    public final String message;
    public static final AccountCreationErrorResponse$Companion Companion = new AccountCreationErrorResponse$Companion();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(1)), null, null, null};

    static {
        int i = IconCompatParcelizer + 109;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ActivityHandler17(int i, Boolean bool, ActivityHandler23 activityHandler23, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.isEligible = null;
        } else {
            this.isEligible = bool;
        }
        if ((i & 2) == 0) {
            this.accountStatus = null;
        } else {
            this.accountStatus = activityHandler23;
        }
        if ((i & 4) == 0) {
            int i2 = RemoteActionCompatParcelizer + 107;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.applicantId = null;
                throw null;
            }
            this.applicantId = null;
        } else {
            this.applicantId = str;
            int i3 = RemoteActionCompatParcelizer + 95;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
        }
        if ((i & 8) == 0) {
            int i5 = read + 111;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.code = null;
        } else {
            this.code = str2;
        }
        int i7 = 2 % 2;
        if ((i & 16) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("AccountCreationErrorResponse(isEligible=");
        sb.append(this.isEligible);
        sb.append(", accountStatus=");
        sb.append(this.accountStatus);
        sb.append(", applicantId=");
        c8$$ExternalSyntheticOutline0.m(sb, this.applicantId, ", code=", this.code, ", message=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.message, ")");
        int i2 = read + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        Boolean bool;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = read + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0 ? (bool = this.isEligible) != null : (bool = this.isEligible) != null) {
            iHashCode = bool.hashCode();
        } else {
            int i4 = i3 + 103;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        ActivityHandler23 activityHandler23 = this.accountStatus;
        if (activityHandler23 == null) {
            int i6 = RemoteActionCompatParcelizer + 41;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = activityHandler23.hashCode();
        }
        String str = this.applicantId;
        if (str == null) {
            int i7 = RemoteActionCompatParcelizer + 81;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        String str2 = this.code;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.message;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityHandler17) {
            ActivityHandler17 activityHandler17 = (ActivityHandler17) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isEligible, activityHandler17.isEligible}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.accountStatus == activityHandler17.accountStatus) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.applicantId, activityHandler17.applicantId}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, activityHandler17.code}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, activityHandler17.message}, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 67;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 107;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            int i5 = RemoteActionCompatParcelizer + 91;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = read + 95;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
