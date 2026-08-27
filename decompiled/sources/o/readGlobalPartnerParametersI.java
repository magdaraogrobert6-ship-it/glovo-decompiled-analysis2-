package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.recentdeliveries.data.model.VendorReview$Companion;
import kotlinx.serialization.Serializable;
import o.readInstallReferrerHuaweiAds;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class readGlobalPartnerParametersI {
    public static final VendorReview$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.VendorReview$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 29;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                readInstallReferrerHuaweiAds readinstallreferrerhuaweiads = readInstallReferrerHuaweiAds.write;
                throw null;
            }
            readInstallReferrerHuaweiAds readinstallreferrerhuaweiads2 = readInstallReferrerHuaweiAds.write;
            int i3 = write + 11;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return readinstallreferrerhuaweiads2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final int score;
    public final boolean submitted;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.VendorReview$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 65;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ readGlobalPartnerParametersI(int i, int i2, boolean z) {
        if (3 == (i & 3)) {
            this.submitted = z;
            this.score = i2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, readInstallReferrerHuaweiAds.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.score) + (Boolean.hashCode(this.submitted) * 31);
        int i4 = IconCompatParcelizer + 95;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.readGlobalPartnerParametersI) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = (o.readGlobalPartnerParametersI) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r6.submitted == r7.submitted) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6.score == r7.score) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r1 = r1 + 119;
        o.readGlobalPartnerParametersI.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.readGlobalPartnerParametersI.IconCompatParcelizer
            int r2 = r1 + 57
            int r3 = r2 % 128
            o.readGlobalPartnerParametersI.read = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 72
            int r2 = r2 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r7 instanceof o.readGlobalPartnerParametersI
            if (r2 != 0) goto L1e
            return r4
        L1e:
            o.readGlobalPartnerParametersI r7 = (o.readGlobalPartnerParametersI) r7
            boolean r2 = r6.submitted
            boolean r5 = r7.submitted
            if (r2 == r5) goto L27
            return r4
        L27:
            int r2 = r6.score
            int r7 = r7.score
            if (r2 == r7) goto L35
            int r1 = r1 + 119
            int r7 = r1 % 128
            o.readGlobalPartnerParametersI.read = r7
            int r1 = r1 % r0
            return r4
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.readGlobalPartnerParametersI.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "VendorReview(submitted=" + this.submitted + ", score=" + this.score + ")";
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
