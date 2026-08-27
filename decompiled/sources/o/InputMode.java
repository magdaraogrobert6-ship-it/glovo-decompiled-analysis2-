package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public final class InputMode {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @SerializedName("network_info")
    private final requestiuPiT84 networkInfo;

    public InputMode(requestiuPiT84 requestiupit84) {
        this.networkInfo = requestiupit84;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.networkInfo.hashCode();
        int i4 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ConnectionInfo(networkInfo=" + this.networkInfo + ")";
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InputMode) {
            Object[] objArr = {this.networkInfo, ((InputMode) obj).networkInfo};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i2 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
