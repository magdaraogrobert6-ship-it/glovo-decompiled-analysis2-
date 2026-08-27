package o;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public final class getSegmentTick5zf0vsI {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("level")
    private final float level;

    @SerializedName("status")
    private final String status;

    public final String component1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final float component2() {
        float f;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 59;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            f = this.level;
            int i4 = 20 / 0;
        } else {
            f = this.level;
        }
        int i5 = i2 + 57;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return f;
    }

    public final float getLevel() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        float f = this.level;
        int i5 = i3 + 75;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return f;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.status;
        }
        throw null;
    }

    public getSegmentTick5zf0vsI(String str, float f) {
        str.getClass();
        this.status = str;
        this.level = f;
    }

    public final getSegmentTick5zf0vsI copy(String str, float f) {
        int i = 2 % 2;
        str.getClass();
        getSegmentTick5zf0vsI getsegmenttick5zf0vsi = new getSegmentTick5zf0vsI(str, f);
        int i2 = IconCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 3 / 0;
        }
        return getsegmenttick5zf0vsi;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = write + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.level) + (this.status.hashCode() * 31);
        int i4 = write + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static /* synthetic */ getSegmentTick5zf0vsI copy$default(getSegmentTick5zf0vsI getsegmenttick5zf0vsi, String str, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = write;
        int i4 = i3 + 93;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = getsegmenttick5zf0vsi.status;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 103;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            f = getsegmenttick5zf0vsi.level;
        }
        getSegmentTick5zf0vsI getsegmenttick5zf0vsiCopy = getsegmenttick5zf0vsi.copy(str, f);
        int i7 = write + 123;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 70 / 0;
        }
        return getsegmenttick5zf0vsiCopy;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BatteryInfo(status=" + this.status + ", level=" + this.level + ")";
        int i2 = write + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSegmentTick5zf0vsI)) {
            return false;
        }
        getSegmentTick5zf0vsI getsegmenttick5zf0vsi = (getSegmentTick5zf0vsI) obj;
        Object[] objArr = {this.status, getsegmenttick5zf0vsi.status};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (Float.compare(this.level, getsegmenttick5zf0vsi.level) == 0) {
                return true;
            }
            int i4 = IconCompatParcelizer + 113;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 89;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
