package o;

import android.annotation.SuppressLint;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public final class lambdaremoveGlobalCallbackParameter25 {
    private static int read = 0;
    private static int serializer = 1;

    @SerializedName(RemoteMessageConst.DEVICE_TOKEN)
    private final String deviceToken;

    public lambdaremoveGlobalCallbackParameter25(String str) {
        this.deviceToken = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        String str = this.deviceToken;
        if (str != null) {
            return str.hashCode();
        }
        int i2 = serializer;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 121;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("UpdatePushTokenRequestBody(deviceToken=", this.deviceToken, ")");
        }
        ff$$ExternalSyntheticOutline0.m("UpdatePushTokenRequestBody(deviceToken=", this.deviceToken, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdaremoveGlobalCallbackParameter25)) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviceToken, ((lambdaremoveGlobalCallbackParameter25) obj).deviceToken}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i2 = serializer;
        int i3 = i2 + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
