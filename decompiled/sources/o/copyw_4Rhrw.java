package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class copyw_4Rhrw {
    private static int read = 0;
    private static int write = 1;

    @SerializedName("details")
    private final Map<String, String> details;

    @SerializedName("id")
    private final String id;

    @SerializedName("name")
    private final String name;

    public copyw_4Rhrw(String str, String str2, safeSetClipToOutline safesetcliptooutline) {
        this.id = str;
        this.name = str2;
        this.details = safesetcliptooutline;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String str = this.id;
            String str2 = this.name;
            return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Event(id=", str, ", name=", str2, ", details="), this.details, ")");
        }
        String str3 = this.id;
        String str4 = this.name;
        String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Event(id=", str3, ", name=", str4, ", details="), this.details, ")");
        int i3 = 57 / 0;
        return strRemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
        Map<String, String> map = this.details;
        int iHashCode = iM + (map == null ? 0 : map.hashCode());
        int i4 = write + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof copyw_4Rhrw)) {
            return false;
        }
        copyw_4Rhrw copyw_4rhrw = (copyw_4Rhrw) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, copyw_4rhrw.id}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, copyw_4rhrw.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, copyw_4rhrw.details}, getCieXyz.write())).booleanValue();
        }
        int i4 = write + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
