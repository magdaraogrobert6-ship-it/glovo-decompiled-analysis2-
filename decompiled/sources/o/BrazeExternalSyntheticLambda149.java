package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.web.model.AqsScreenStopTracePayload$Companion;
import kotlinx.serialization.Serializable;
import o.BrazeExternalSyntheticLambda14;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BrazeExternalSyntheticLambda149 {
    public static final AqsScreenStopTracePayload$Companion Companion = new Object() { // from class: com.roadrunner.web.model.AqsScreenStopTracePayload$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 69;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return BrazeExternalSyntheticLambda14.RemoteActionCompatParcelizer;
            }
            BrazeExternalSyntheticLambda14 brazeExternalSyntheticLambda14 = BrazeExternalSyntheticLambda14.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String screen;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.web.model.AqsScreenStopTracePayload$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 13;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ BrazeExternalSyntheticLambda149(int i, String str) {
        if (1 == (i & 1)) {
            this.screen = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, BrazeExternalSyntheticLambda14.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.screen.hashCode();
        }
        this.screen.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("AqsScreenStopTracePayload(screen=", this.screen, ")");
        int i4 = IconCompatParcelizer + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r12 instanceof o.BrazeExternalSyntheticLambda149) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = new java.lang.Object[]{r11.screen, ((o.BrazeExternalSyntheticLambda149) r12).screen};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r9, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r12 = o.BrazeExternalSyntheticLambda149.serializer + 67;
        o.BrazeExternalSyntheticLambda149.IconCompatParcelizer = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return true;
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
            int r1 = o.BrazeExternalSyntheticLambda149.IconCompatParcelizer
            int r1 = r1 + 87
            int r2 = r1 % 128
            o.BrazeExternalSyntheticLambda149.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 14
            int r1 = r1 / r3
            if (r11 != r12) goto L19
            goto L18
        L16:
            if (r11 != r12) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r12 instanceof o.BrazeExternalSyntheticLambda149
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.BrazeExternalSyntheticLambda149 r12 = (o.BrazeExternalSyntheticLambda149) r12
            java.lang.String r1 = r11.screen
            java.lang.String r12 = r12.screen
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
            if (r12 != 0) goto L54
            int r12 = o.BrazeExternalSyntheticLambda149.serializer
            int r12 = r12 + 67
            int r1 = r12 % 128
            o.BrazeExternalSyntheticLambda149.IconCompatParcelizer = r1
            int r12 = r12 % r0
            return r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeExternalSyntheticLambda149.equals(java.lang.Object):boolean");
    }
}
