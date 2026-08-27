package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public final class requestiuPiT84 {
    private static int read = 1;
    private static int serializer;

    @SerializedName("provider")
    private final String provider;

    @SerializedName("type")
    private final String type;

    public requestiuPiT84(String str, String str2) {
        str.getClass();
        this.type = str;
        this.provider = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("NetworkInfo(type=", this.type, ", provider=", this.provider, ")");
        int i4 = serializer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strWrite;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 105;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.provider.hashCode() + (this.type.hashCode() * 31);
        int i4 = serializer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof requestiuPiT84))) {
            requestiuPiT84 requestiupit84 = (requestiuPiT84) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, requestiupit84.type}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.provider, requestiupit84.provider}, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 11;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = read + 117;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 51;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 27;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
