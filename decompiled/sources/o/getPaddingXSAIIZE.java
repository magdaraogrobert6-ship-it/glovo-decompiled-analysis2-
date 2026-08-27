package o;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getPaddingXSAIIZE {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    @SerializedName("details")
    private final Map<String, String> details;

    @SerializedName("id")
    private final String id;

    public getPaddingXSAIIZE(String str) {
        str.getClass();
        this.id = str;
        this.details = null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.id.hashCode();
        Map<String, String> map = this.details;
        if (map == null) {
            int i3 = IconCompatParcelizer + 45;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = map.hashCode();
            int i5 = IconCompatParcelizer + 115;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Order(id=" + this.id + ", details=" + this.details + ")";
        int i2 = IconCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 113;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 121;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getPaddingXSAIIZE)) {
            int i7 = i2 + 49;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        getPaddingXSAIIZE getpaddingxsaiize = (getPaddingXSAIIZE) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getpaddingxsaiize.id}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, getpaddingxsaiize.details}, getCieXyz.write())).booleanValue();
        }
        int i8 = IconCompatParcelizer + 45;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
