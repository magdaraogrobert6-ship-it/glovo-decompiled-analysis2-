package o;

/* JADX INFO: loaded from: classes3.dex */
public final class tryTrackMeasurementConsentI {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final String write;

    public tryTrackMeasurementConsentI(String str, String str2) {
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TrackingOtpData(errorCode=", this.IconCompatParcelizer, ", errorMessage=", this.write, ")");
            int i3 = read + 31;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("TrackingOtpData(errorCode=", this.IconCompatParcelizer, ", errorMessage=", this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            str = this.IconCompatParcelizer;
            int i3 = 22 / 0;
            if (str != null) {
                iHashCode = str.hashCode();
            }
        } else {
            str = this.IconCompatParcelizer;
            if (str != null) {
                iHashCode = str.hashCode();
            }
        }
        int iHashCode2 = this.write.hashCode() + (iHashCode * 31);
        int i4 = read + 51;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 47;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof tryTrackMeasurementConsentI)) {
            return false;
        }
        tryTrackMeasurementConsentI trytrackmeasurementconsenti = (tryTrackMeasurementConsentI) obj;
        Object[] objArr = {this.IconCompatParcelizer, trytrackmeasurementconsenti.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.write, trytrackmeasurementconsenti.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read + 43;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 115;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
