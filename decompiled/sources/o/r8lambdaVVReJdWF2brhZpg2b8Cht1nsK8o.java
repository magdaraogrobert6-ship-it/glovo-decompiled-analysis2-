package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final accessgetStrictcp IconCompatParcelizer;
    public final r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c RemoteActionCompatParcelizer;
    public final List serializer;
    public final r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI write;

    public r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o(accessgetStrictcp accessgetstrictcp, List list, r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri) {
        accessgetstrictcp.getClass();
        this.IconCompatParcelizer = accessgetstrictcp;
        this.serializer = list;
        this.RemoteActionCompatParcelizer = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c;
        this.write = r8lambdav9hvubmv32qeolrxalsjens1hri;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r1 r3 r4
  0x0028: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v3 java.util.List) = (r3v0 java.util.List), (r3v5 java.util.List) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1 r4
  0x0026: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        List list;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = read + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            list = this.serializer;
            iHashCode2 = 1;
            if (list == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = list.hashCode();
            }
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
            list = this.serializer;
            iHashCode2 = 0;
            if (list == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = list.hashCode();
            }
        }
        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = this.RemoteActionCompatParcelizer;
        if (r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c == null) {
            int i3 = read + 83;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode4 = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.hashCode();
        }
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = this.write;
        if (r8lambdav9hvubmv32qeolrxalsjens1hri != null) {
            iHashCode2 = r8lambdav9hvubmv32qeolrxalsjens1hri.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationSettingsUiState(chosenNavigationType=" + this.IconCompatParcelizer + ", navigationTypes=" + this.serializer + ", mapboxMetrics=" + this.RemoteActionCompatParcelizer + ", naverRoutePreview=" + this.write + ")";
        int i2 = MediaMetadataCompat + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 5;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o)) {
            return false;
        }
        r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o r8lambdavvrejdwf2brhzpg2b8cht1nsk8o = (r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) obj;
        if (this.IconCompatParcelizer != r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.IconCompatParcelizer) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.serializer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.write}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = read + 61;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = read + 65;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
