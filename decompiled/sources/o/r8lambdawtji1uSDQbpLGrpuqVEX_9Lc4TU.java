package o;

import android.annotation.SuppressLint;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public final class r8lambdawtji1uSDQbpLGrpuqVEX_9Lc4TU {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    @SerializedName("customer_proxy_number")
    private final String phoneNumber;

    public final String read() {
        int i = 2 % 2;
        int i2 = write + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.phoneNumber;
        int i5 = i3 + 119;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.phoneNumber.hashCode();
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ff$$ExternalSyntheticOutline0.m("ProxyPhoneNumberResponse(phoneNumber=", this.phoneNumber, ")");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String strM = ff$$ExternalSyntheticOutline0.m("ProxyPhoneNumberResponse(phoneNumber=", this.phoneNumber, ")");
        int i3 = RemoteActionCompatParcelizer + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof r8lambdawtji1uSDQbpLGrpuqVEX_9Lc4TU))) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, ((r8lambdawtji1uSDQbpLGrpuqVEX_9Lc4TU) obj).phoneNumber}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 103;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i6 = i3 + 33;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
