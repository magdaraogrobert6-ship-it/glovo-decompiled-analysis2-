package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.rider.recruitment.accountcreation.pass_verification.data.model.IdentityVerificationResponse$Companion;
import kotlinx.serialization.Serializable;
import o.ActivityHandler14;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ActivityHandler13 {
    public static final IdentityVerificationResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.recruitment.accountcreation.pass_verification.data.model.IdentityVerificationResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 91;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return ActivityHandler14.RemoteActionCompatParcelizer;
            }
            int i3 = 13 / 0;
            return ActivityHandler14.RemoteActionCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.recruitment.accountcreation.pass_verification.data.model.IdentityVerificationResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 3;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public /* synthetic */ ActivityHandler13(int i, String str) {
        if (1 == (i & 1)) {
            this.url = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ActivityHandler14.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.url.hashCode();
            throw null;
        }
        int iHashCode = this.url.hashCode();
        int i3 = RemoteActionCompatParcelizer + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("IdentityVerificationResponse(url=", this.url, ")");
            int i3 = write + 23;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("IdentityVerificationResponse(url=", this.url, ")");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if ((r12 instanceof o.ActivityHandler13) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r9 = new java.lang.Object[]{r11.url, ((o.ActivityHandler13) r12).url};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r9, o.getCieXyz.write())).booleanValue() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r12 = o.ActivityHandler13.RemoteActionCompatParcelizer + 123;
        o.ActivityHandler13.write = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
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
            int r1 = o.ActivityHandler13.write
            int r1 = r1 + 121
            int r2 = r1 % 128
            o.ActivityHandler13.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L15
            r1 = 7
            int r1 = r1 / r3
            if (r11 != r12) goto L18
            goto L17
        L15:
            if (r11 != r12) goto L18
        L17:
            return r2
        L18:
            boolean r1 = r12 instanceof o.ActivityHandler13
            if (r1 != 0) goto L1d
            return r3
        L1d:
            o.ActivityHandler13 r12 = (o.ActivityHandler13) r12
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
            if (r12 == 0) goto L4a
            return r2
        L4a:
            int r12 = o.ActivityHandler13.RemoteActionCompatParcelizer
            int r12 = r12 + 123
            int r1 = r12 % 128
            o.ActivityHandler13.write = r1
            int r12 = r12 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ActivityHandler13.equals(java.lang.Object):boolean");
    }
}
