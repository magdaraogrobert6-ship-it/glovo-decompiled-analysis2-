package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$UiItem$CheckAckUiItem$Companion;
import kotlinx.serialization.Serializable;
import o.AnimatedVisibilityStateCompanion;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TransitionBasedSearchInfo implements TransitionSearchInfo {
    public static final AcknowledgmentTaskUiItem$UiItem$CheckAckUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$UiItem$CheckAckUiItem$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AnimatedVisibilityStateCompanion animatedVisibilityStateCompanion = AnimatedVisibilityStateCompanion.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 79 / 0;
            }
            return animatedVisibilityStateCompanion;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String subtext;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$UiItem$CheckAckUiItem$Companion] */
    static {
        int i = serializer + 67;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    public /* synthetic */ TransitionBasedSearchInfo(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.text = str;
            this.subtext = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, AnimatedVisibilityStateCompanion.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CheckAckUiItem(text=", this.text, ", subtext=", this.subtext, ")");
        }
        int i3 = 1 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CheckAckUiItem(text=", this.text, ", subtext=", this.subtext, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.text.hashCode();
        String str = this.subtext;
        if (str == null) {
            int i4 = read + 113;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = read + 91;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransitionBasedSearchInfo(String str, String str2) {
        str.getClass();
        this.text = str;
        this.subtext = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if ((r23 instanceof o.TransitionBasedSearchInfo) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r5 = r5 + 43;
        o.TransitionBasedSearchInfo.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r1 = (o.TransitionBasedSearchInfo) r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.text, r1.text}, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        r1 = o.TransitionBasedSearchInfo.write + 45;
        o.TransitionBasedSearchInfo.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.subtext, r1.subtext}, o.getCieXyz.write())).booleanValue()) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r3 = r3 + 7;
        o.TransitionBasedSearchInfo.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.TransitionBasedSearchInfo.write
            int r4 = r3 + 91
            int r5 = r4 % 128
            o.TransitionBasedSearchInfo.read = r5
            int r4 = r4 % r2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L19
            r4 = 1
            int r4 = r4 / r6
            if (r0 != r1) goto L23
            goto L1b
        L19:
            if (r0 != r1) goto L23
        L1b:
            int r3 = r3 + 7
            int r1 = r3 % 128
            o.TransitionBasedSearchInfo.read = r1
            int r3 = r3 % r2
            return r7
        L23:
            boolean r3 = r1 instanceof o.TransitionBasedSearchInfo
            if (r3 != 0) goto L2f
            int r5 = r5 + 43
            int r1 = r5 % 128
            o.TransitionBasedSearchInfo.write = r1
            int r5 = r5 % r2
            return r6
        L2f:
            o.TransitionBasedSearchInfo r1 = (o.TransitionBasedSearchInfo) r1
            java.lang.String r3 = r0.text
            java.lang.String r4 = r1.text
            java.lang.Object[] r13 = new java.lang.Object[]{r3, r4}
            int r8 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r14 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            r16 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r17 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r9 = r16
            r10 = r17
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L69
            int r1 = o.TransitionBasedSearchInfo.write
            int r1 = r1 + 45
            int r3 = r1 % 128
            o.TransitionBasedSearchInfo.read = r3
            int r1 = r1 % r2
            return r6
        L69:
            java.lang.String r2 = r0.subtext
            java.lang.String r1 = r1.subtext
            java.lang.Object[] r20 = new java.lang.Object[]{r2, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r7
            if (r1 == 0) goto L8f
            return r6
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TransitionBasedSearchInfo.equals(java.lang.Object):boolean");
    }
}
