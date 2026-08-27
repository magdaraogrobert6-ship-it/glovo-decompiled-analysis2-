package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* JADX INFO: loaded from: classes4.dex */
public final class getInputModeaOaMEAU {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @SerializedName("confidence")
    private final String confidence;

    @SerializedName(CrashHianalyticsData.TIME)
    private final long time;

    @SerializedName("type")
    private final String type;

    public getInputModeaOaMEAU(long j, String str, String str2) {
        this.type = str;
        this.time = j;
        this.confidence = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String str = this.type;
            long j = this.time;
            return d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("MotionActivity(type=", str, j, ", time="), ", confidence=", this.confidence, ")");
        }
        String str2 = this.type;
        long j2 = this.time;
        String strM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("MotionActivity(type=", str2, j2, ", time="), ", confidence=", this.confidence, ")");
        int i3 = 62 / 0;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.time);
        String str = this.confidence;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 4 / 4;
            }
        }
        int i4 = iM + iHashCode;
        int i5 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInputModeaOaMEAU)) {
            int i4 = i3 + 21;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getInputModeaOaMEAU getinputmodeaoameau = (getInputModeaOaMEAU) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, getinputmodeaoameau.type}, getCieXyz.write())).booleanValue()) {
            int i6 = RemoteActionCompatParcelizer + 79;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (this.time != getinputmodeaoameau.time) {
            int i8 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confidence, getinputmodeaoameau.confidence}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i9 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
