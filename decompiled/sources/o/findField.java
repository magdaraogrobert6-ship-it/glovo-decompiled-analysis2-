package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.home.nest.api.data.PayTag$Companion;
import kotlinx.serialization.Serializable;
import o.clearOldDexDir;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findField {
    public static final PayTag$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.PayTag$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 95;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return clearOldDexDir.write;
            }
            clearOldDexDir clearolddexdir = clearOldDexDir.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final TagColorToken color;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.PayTag$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 57;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ findField(int i, TagColorToken tagColorToken, String str) {
        if (3 == (i & 3)) {
            this.color = tagColorToken;
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, clearOldDexDir.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.text.hashCode() << (this.color.hashCode() >>> 58);
        }
        return (this.color.hashCode() * 31) + this.text.hashCode();
    }

    public findField(TagColorToken tagColorToken) {
        tagColorToken.getClass();
        this.color = tagColorToken;
        this.text = "Cash order";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.findField) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 15;
        o.findField.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r13 = (o.findField) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r12.color == r13.color) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r10 = new java.lang.Object[]{r12.text, r13.text};
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
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
            int r1 = o.findField.IconCompatParcelizer
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.findField.write = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 53
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.findField
            if (r1 != 0) goto L29
            int r2 = r2 + 15
            int r13 = r2 % 128
            o.findField.IconCompatParcelizer = r13
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            goto L28
        L27:
            r3 = r4
        L28:
            return r3
        L29:
            o.findField r13 = (o.findField) r13
            com.roadrunner.delivery.state.pudo.TagColorToken r0 = r12.color
            com.roadrunner.delivery.state.pudo.TagColorToken r1 = r13.color
            if (r0 == r1) goto L32
            return r4
        L32:
            java.lang.String r0 = r12.text
            java.lang.String r13 = r13.text
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
            if (r13 != 0) goto L5d
            return r4
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findField.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PayTag(color=" + this.color + ", text=" + this.text + ")";
        int i2 = write + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
