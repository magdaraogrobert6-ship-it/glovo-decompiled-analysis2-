package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setParameterizedContentlambda0100 extends r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final boolean IconCompatParcelizer;
    public final Double RemoteActionCompatParcelizer;
    public final Map read;
    public final String serializer;
    public final Double write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setParameterizedContentlambda0100(Double d, Map map, int i) {
        if ((i & 2) != 0) {
            int i2 = MediaMetadataCompat;
            int i3 = i2 + 59;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            d = null;
        }
        this(false, d, null, null, map);
    }

    public setParameterizedContentlambda0100(boolean z, Double d, Double d2, String str, Map map) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = d;
        this.write = d2;
        this.serializer = str;
        this.read = map;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ExecuteConfirmation(isPaymentChanged=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", defaultAmount=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", selectedAmount=");
        sb.append(this.write);
        sb.append(", selectedReasonKey=");
        sb.append(this.serializer);
        sb.append(", tasks=");
        String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.read, ")");
        int i2 = MediaMetadataCompat + 119;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strRemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r1 r3
  0x0026: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v3 java.lang.Double) = (r3v0 java.lang.Double), (r3v5 java.lang.Double) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        Double d;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 55;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        if (i2 % 2 != 0) {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
            d = this.RemoteActionCompatParcelizer;
            if (d == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = d.hashCode();
            }
        } else {
            iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
            d = this.RemoteActionCompatParcelizer;
            if (d == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = d.hashCode();
            }
        }
        Double d2 = this.write;
        int iHashCode5 = d2 == null ? 0 : d2.hashCode();
        String str = this.serializer;
        if (str == null) {
            int i3 = MediaMetadataCompat;
            int i4 = i3 + 5;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 43;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 5 % 2;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str.hashCode();
        }
        Map map = this.read;
        if (map == null) {
            int i8 = MediaMetadataCompat + 59;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            iHashCode4 = map.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 101;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(!(obj instanceof setParameterizedContentlambda0100))) {
                setParameterizedContentlambda0100 setparameterizedcontentlambda0100 = (setParameterizedContentlambda0100) obj;
                if (this.IconCompatParcelizer != setparameterizedcontentlambda0100.IconCompatParcelizer) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setparameterizedcontentlambda0100.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setparameterizedcontentlambda0100.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, setparameterizedcontentlambda0100.serializer}, getCieXyz.write())).booleanValue()) {
                    int i5 = MediaMetadataCompat + 113;
                    MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setparameterizedcontentlambda0100.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i7 = MediaSessionCompatQueueItem + 51;
                MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return true;
            }
            int i9 = i2 + 101;
            MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i2 + 39;
        MediaMetadataCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i11 % 2 != 0;
    }
}
