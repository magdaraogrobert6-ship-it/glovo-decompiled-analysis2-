package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.BookSessionAction$Companion;
import kotlinx.serialization.Serializable;
import o.renderCallouts;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BlockRunnercancel1 {
    public static final BookSessionAction$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.BookSessionAction$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 107;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            renderCallouts rendercallouts = renderCallouts.serializer;
            int i4 = RemoteActionCompatParcelizer + 85;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return rendercallouts;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String title;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.BookSessionAction$Companion] */
    static {
        int i = serializer + 29;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BlockRunnercancel1(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.url = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, renderCallouts.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BookSessionAction(title=", this.title, ", url=", this.url, ")");
            int i3 = read + 35;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("BookSessionAction(title=", this.title, ", url=", this.url, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 61;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.url.hashCode() >>> (this.title.hashCode() - 57);
        } else {
            iHashCode = (this.title.hashCode() * 31) + this.url.hashCode();
        }
        int i3 = read + 49;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if ((!(r22 instanceof o.BlockRunnercancel1)) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r1 = (o.BlockRunnercancel1) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue()) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.url, r1.url}, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r1 = o.BlockRunnercancel1.write + 37;
        o.BlockRunnercancel1.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r4 = r4 + 103;
        o.BlockRunnercancel1.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.BlockRunnercancel1.write
            int r3 = r3 + 49
            int r4 = r3 % 128
            o.BlockRunnercancel1.read = r4
            int r3 = r3 % r2
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L1a
            r3 = 49
            int r3 = r3 / r5
            if (r0 != r1) goto L24
            goto L1c
        L1a:
            if (r0 != r1) goto L24
        L1c:
            int r4 = r4 + 103
            int r1 = r4 % 128
            o.BlockRunnercancel1.write = r1
            int r4 = r4 % r2
            return r6
        L24:
            boolean r3 = r1 instanceof o.BlockRunnercancel1
            r3 = r3 ^ r6
            if (r3 == 0) goto L2a
            return r5
        L2a:
            o.BlockRunnercancel1 r1 = (o.BlockRunnercancel1) r1
            java.lang.String r3 = r0.title
            java.lang.String r4 = r1.title
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r6
            if (r3 == r6) goto L80
            java.lang.String r2 = r0.url
            java.lang.String r1 = r1.url
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L7f
            return r5
        L7f:
            return r6
        L80:
            int r1 = o.BlockRunnercancel1.write
            int r1 = r1 + 37
            int r3 = r1 % 128
            o.BlockRunnercancel1.read = r3
            int r1 = r1 % r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BlockRunnercancel1.equals(java.lang.Object):boolean");
    }
}
