package o;

import android.annotation.SuppressLint;
import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class ActivityHandler10 {
    public static final OtpVerificationTimerEntity$Companion Companion = new OtpVerificationTimerEntity$Companion();
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String phoneNumber;
    public final long timerEndTimeInMillis;

    static {
        int i = IconCompatParcelizer + 17;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ActivityHandler10(int i, long j, String str) {
        if (1 == (i & 1)) {
            this.timerEndTimeInMillis = j;
            if ((i & 2) == 0) {
                this.phoneNumber = "";
                int i2 = read + 53;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.phoneNumber = str;
            int i3 = write + 39;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ActivityHandler1.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.phoneNumber.hashCode() >> (Long.hashCode(this.timerEndTimeInMillis) >>> 73);
        } else {
            iHashCode = (Long.hashCode(this.timerEndTimeInMillis) * 31) + this.phoneNumber.hashCode();
        }
        int i3 = write + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("OtpVerificationTimerEntity(timerEndTimeInMillis=", ", phoneNumber=", this.timerEndTimeInMillis, this.phoneNumber);
        sb.append(")");
        String string = sb.toString();
        int i4 = read + 109;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 69;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHandler10)) {
            int i4 = i2 + 67;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        ActivityHandler10 activityHandler10 = (ActivityHandler10) obj;
        if (this.timerEndTimeInMillis != activityHandler10.timerEndTimeInMillis) {
            return false;
        }
        Object[] objArr = {this.phoneNumber, activityHandler10.phoneNumber};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i6 = write + 75;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
        int i8 = write;
        int i9 = i8 + 43;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = i8 + 97;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public ActivityHandler10(long j, String str) {
        this.timerEndTimeInMillis = j;
        this.phoneNumber = str;
    }
}
