package o;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletCompanion {
    private static int read = 0;
    private static int serializer = 1;

    @SerializedName("details")
    private final Map<String, String> details;

    @SerializedName("id")
    private final String id;

    public BulletCompanion(String str, Map map) {
        str.getClass();
        this.id = str;
        this.details = map;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 29;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.id.hashCode();
        Map<String, String> map = this.details;
        if (map == null) {
            i = 0;
        } else {
            int iHashCode2 = map.hashCode();
            int i5 = serializer + 49;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "User(id=" + this.id + ", details=" + this.details + ")";
        int i2 = read + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulletCompanion) {
            BulletCompanion bulletCompanion = (BulletCompanion) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, bulletCompanion.id}, getCieXyz.write())).booleanValue()) {
                return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, bulletCompanion.details}, getCieXyz.write())).booleanValue() ^ true);
            }
            int i2 = read + 77;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = serializer + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
