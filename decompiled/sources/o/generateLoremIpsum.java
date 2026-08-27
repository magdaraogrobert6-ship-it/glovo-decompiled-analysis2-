package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$Done$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidDensity_androidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class generateLoremIpsum extends Wallpapers {
    public static final SignatureTaskUiItem$SignatureState$Done$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$Done$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            AndroidDensity_androidKt androidDensity_androidKt;
            int i = 2 % 2;
            int i2 = write + 79;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                androidDensity_androidKt = AndroidDensity_androidKt.write;
                int i3 = 82 / 0;
            } else {
                androidDensity_androidKt = AndroidDensity_androidKt.write;
            }
            int i4 = write + 57;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return androidDensity_androidKt;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String thumbnailUri;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$SignatureState$Done$Companion] */
    static {
        int i = write + 21;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ generateLoremIpsum(int i, String str) {
        if (1 == (i & 1)) {
            this.thumbnailUri = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, AndroidDensity_androidKt.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.thumbnailUri.hashCode();
        }
        this.thumbnailUri.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Done(thumbnailUri=", this.thumbnailUri, ")");
        int i4 = IconCompatParcelizer + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public generateLoremIpsum(String str) {
        this.thumbnailUri = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.generateLoremIpsum) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 87;
        o.generateLoremIpsum.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10 = new java.lang.Object[]{r12.thumbnailUri, ((o.generateLoremIpsum) r13).thumbnailUri};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.generateLoremIpsum.read
            int r1 = r1 + 35
            int r2 = r1 % 128
            o.generateLoremIpsum.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 71
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.generateLoremIpsum
            if (r1 != 0) goto L25
            int r2 = r2 + 87
            int r13 = r2 % 128
            o.generateLoremIpsum.read = r13
            int r2 = r2 % r0
            return r4
        L25:
            o.generateLoremIpsum r13 = (o.generateLoremIpsum) r13
            java.lang.String r0 = r12.thumbnailUri
            java.lang.String r13 = r13.thumbnailUri
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L52
            return r4
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.generateLoremIpsum.equals(java.lang.Object):boolean");
    }
}
