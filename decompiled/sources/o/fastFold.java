package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$Companion;
import kotlinx.serialization.Serializable;
import o.fastJoinTodefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "button_with_prompt")
public final class fastFold implements fastAny {
    public static final Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 123;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            fastJoinTodefault fastjointodefault = fastJoinTodefault.RemoteActionCompatParcelizer;
            int i4 = write + 113;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return fastjointodefault;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final getDismissOnBackPress button;
    public final fastJoinTo confirmationPrompt;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.Deliveries$Delivery$DeliveriesComponent$ButtonWithPrompt$Companion] */
    static {
        int i = IconCompatParcelizer + 13;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ fastFold(int i, getDismissOnBackPress getdismissonbackpress, fastJoinTo fastjointo) {
        if (3 == (i & 3)) {
            this.button = getdismissonbackpress;
            this.confirmationPrompt = fastjointo;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, fastJoinTodefault.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 105;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.button.hashCode();
            iHashCode = this.confirmationPrompt.hashCode();
            i = iHashCode2 / 5;
        } else {
            int iHashCode3 = this.button.hashCode();
            iHashCode = this.confirmationPrompt.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ButtonWithPrompt(button=" + this.button + ", confirmationPrompt=" + this.confirmationPrompt + ")";
        int i2 = serializer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r5 = r5 + 41;
        o.fastFold.serializer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if ((r23 instanceof o.fastFold) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r3 = r3 + 5;
        o.fastFold.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r1 = (o.fastFold) r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.button, r1.button}, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r1 = o.fastFold.read + 49;
        o.fastFold.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r22.confirmationPrompt, r1.confirmationPrompt}, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r1 = o.fastFold.read + 69;
        o.fastFold.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r1 = r5 + 57;
        o.fastFold.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L11;
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
            int r3 = o.fastFold.serializer
            int r4 = r3 + 47
            int r5 = r4 % 128
            o.fastFold.read = r5
            int r4 = r4 % r2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L1a
            r4 = 72
            int r4 = r4 / r7
            if (r0 != r1) goto L35
            goto L1c
        L1a:
            if (r0 != r1) goto L35
        L1c:
            int r1 = r5 + 57
            int r3 = r1 % 128
            o.fastFold.serializer = r3
            int r1 = r1 % r2
            if (r1 == 0) goto L26
            r6 = r7
        L26:
            int r5 = r5 + 41
            int r1 = r5 % 128
            o.fastFold.serializer = r1
            int r5 = r5 % r2
            if (r5 != 0) goto L30
            return r6
        L30:
            r1 = 0
            r1.hashCode()
            throw r1
        L35:
            boolean r4 = r1 instanceof o.fastFold
            if (r4 != 0) goto L41
            int r3 = r3 + 5
            int r1 = r3 % 128
            o.fastFold.read = r1
            int r3 = r3 % r2
            return r7
        L41:
            o.fastFold r1 = (o.fastFold) r1
            o.getDismissOnBackPress r3 = r0.button
            o.getDismissOnBackPress r4 = r1.button
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
            if (r3 != 0) goto L7b
            int r1 = o.fastFold.read
            int r1 = r1 + 49
            int r3 = r1 % 128
            o.fastFold.serializer = r3
            int r1 = r1 % r2
            return r7
        L7b:
            o.fastJoinTo r3 = r0.confirmationPrompt
            o.fastJoinTo r1 = r1.confirmationPrompt
            java.lang.Object[] r20 = new java.lang.Object[]{r3, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto La9
            int r1 = o.fastFold.read
            int r1 = r1 + 69
            int r3 = r1 % 128
            o.fastFold.serializer = r3
            int r1 = r1 % r2
            return r7
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fastFold.equals(java.lang.Object):boolean");
    }
}
