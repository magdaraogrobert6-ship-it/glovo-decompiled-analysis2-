package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.tnc.model.TermsAndConditions$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class requestBannersRefreshlambda13 {
    public static final TermsAndConditions$Companion Companion = new TermsAndConditions$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String url;

    static {
        int i = write + 9;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public /* synthetic */ requestBannersRefreshlambda13(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, requestContentCardsRefreshFromCachelambda1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.url.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.url.hashCode();
        int i3 = IconCompatParcelizer + 51;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = read + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
            int i3 = 38 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m("TermsAndConditions(url=", this.url, ")");
        }
        int i4 = IconCompatParcelizer + 101;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r12 instanceof o.requestBannersRefreshlambda13)) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r11.url, ((o.requestBannersRefreshlambda13) r12).url}, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r12 = o.requestBannersRefreshlambda13.IconCompatParcelizer + 73;
        o.requestBannersRefreshlambda13.read = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if ((r12 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.requestBannersRefreshlambda13.read
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.requestBannersRefreshlambda13.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            r1 = 55
            int r1 = r1 / r2
            if (r11 != r12) goto L19
            goto L18
        L16:
            if (r11 != r12) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r12 instanceof o.requestBannersRefreshlambda13
            r1 = r1 ^ r3
            if (r1 == r3) goto L58
            o.requestBannersRefreshlambda13 r12 = (o.requestBannersRefreshlambda13) r12
            java.lang.String r1 = r11.url
            java.lang.String r12 = r12.url
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r12}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r12 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L57
            int r12 = o.requestBannersRefreshlambda13.IconCompatParcelizer
            int r12 = r12 + 73
            int r1 = r12 % 128
            o.requestBannersRefreshlambda13.read = r1
            int r12 = r12 % r0
            if (r12 == 0) goto L56
            return r3
        L56:
            return r2
        L57:
            return r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.requestBannersRefreshlambda13.equals(java.lang.Object):boolean");
    }
}
