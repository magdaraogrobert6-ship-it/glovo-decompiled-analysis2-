package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaprocessAndResolveDeeplink14 {
    private static int read = 0;
    private static int write = 1;

    @SerializedName("device_token_status")
    private final boolean tokenStatus;

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = write + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.tokenStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "DeviceTokenResponse(tokenStatus=REDACTED)";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.tokenStatus);
        int i4 = write + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdaprocessAndResolveDeeplink14)) {
            int i4 = i3 + 15;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.tokenStatus == ((lambdaprocessAndResolveDeeplink14) obj).tokenStatus) {
            int i5 = i3 + 83;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i6 = i3 + 35;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i3 + 85;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
