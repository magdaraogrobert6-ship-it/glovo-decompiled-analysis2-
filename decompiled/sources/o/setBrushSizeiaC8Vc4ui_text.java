package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setBrushSizeiaC8Vc4ui_text {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final Map serializer;
    public final String write;

    public setBrushSizeiaC8Vc4ui_text(String str, Map map) {
        map.getClass();
        this.write = str;
        this.serializer = map;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.write.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode2 << 26;
        } else {
            int iHashCode3 = this.write.hashCode();
            iHashCode = this.serializer.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Analytics(deliveryState=" + this.write + ", commonParams=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof setBrushSizeiaC8Vc4ui_text) {
                setBrushSizeiaC8Vc4ui_text setbrushsizeiac8vc4ui_text = (setBrushSizeiaC8Vc4ui_text) obj;
                if (!this.write.equals(setbrushsizeiac8vc4ui_text.write)) {
                    return false;
                }
                Object[] objArr = {this.serializer, setbrushsizeiac8vc4ui_text.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i5 = i3 + 1;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return true;
    }
}
