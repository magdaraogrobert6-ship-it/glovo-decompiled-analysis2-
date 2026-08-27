package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class getDrawStyle {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    @SerializedName("name")
    private final String name;

    @SerializedName("version")
    private final String version;

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Product(name=", this.name, ", version=", this.version, ")");
        int i4 = RemoteActionCompatParcelizer + 23;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        throw null;
    }

    public getDrawStyle(int i) {
        String str;
        if ((i & 2) == 0) {
            str = "v4.2634.5";
        } else {
            int i2 = serializer + 77;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this.name = "p2pchat";
        this.version = str;
    }

    public getDrawStyle() {
        this(3);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.name.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.name.hashCode();
        String str = this.version;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i3 = serializer + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof getDrawStyle) {
                getDrawStyle getdrawstyle = (getDrawStyle) obj;
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, getdrawstyle.name}, getCieXyz.write())).booleanValue())) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, getdrawstyle.version}, getCieXyz.write())).booleanValue();
                }
                int i2 = RemoteActionCompatParcelizer + 111;
                int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                serializer = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 93;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = RemoteActionCompatParcelizer + 9;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 119;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = serializer + 77;
        RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            int i13 = 60 / 0;
        }
        return true;
    }
}
