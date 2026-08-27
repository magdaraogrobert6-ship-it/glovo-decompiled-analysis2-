package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.data.bridge.PreChatValues$Companion;
import kotlinx.serialization.Serializable;
import o.DrawerLayoutSavedState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setDrawerLockMode {
    public static final PreChatValues$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.bridge.PreChatValues$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 79;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DrawerLayoutSavedState drawerLayoutSavedState = DrawerLayoutSavedState.RemoteActionCompatParcelizer;
            int i4 = IconCompatParcelizer + 17;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return drawerLayoutSavedState;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String description;
    public final String orderId;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.bridge.PreChatValues$Companion] */
    static {
        int i = write + 105;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
    }

    public /* synthetic */ setDrawerLockMode(int i, String str, String str2) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.description = null;
                int i2 = RemoteActionCompatParcelizer + 59;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } else {
                this.description = str;
            }
            this.orderId = str2;
            int i4 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 2, DrawerLayoutSavedState.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PreChatValues(description=", this.description, ", orderId=", this.orderId, ")");
            int i3 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PreChatValues(description=", this.description, ", orderId=", this.orderId, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.description;
        if (str == null) {
            int i5 = i3 + 103;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = this.orderId.hashCode() + (iHashCode * 31);
        int i7 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 68 / 0;
        }
        return iHashCode2;
    }

    public setDrawerLockMode(String str, String str2) {
        this.description = str;
        this.orderId = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if ((r23 instanceof o.setDrawerLockMode) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        r3 = r3 + 57;
        o.setDrawerLockMode.IconCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r1 = (o.setDrawerLockMode) r23;
        r13 = new java.lang.Object[]{r22.description, r1.description};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r13, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r1 = o.setDrawerLockMode.IconCompatParcelizer + 67;
        o.setDrawerLockMode.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        r20 = new java.lang.Object[]{r22.orderId, r1.orderId};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r20, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        r1 = o.setDrawerLockMode.IconCompatParcelizer + 25;
        o.setDrawerLockMode.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r22 == r23) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r5 = r5 + 49;
        o.setDrawerLockMode.RemoteActionCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r5 % 2) != 0) goto L11;
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
            int r3 = o.setDrawerLockMode.RemoteActionCompatParcelizer
            int r4 = r3 + 25
            int r5 = r4 % 128
            o.setDrawerLockMode.IconCompatParcelizer = r5
            int r4 = r4 % r2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L1a
            r4 = 60
            int r4 = r4 / r7
            if (r0 != r1) goto L2b
            goto L1c
        L1a:
            if (r0 != r1) goto L2b
        L1c:
            int r5 = r5 + 49
            int r1 = r5 % 128
            o.setDrawerLockMode.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r2
            if (r5 != 0) goto L26
            return r6
        L26:
            r1 = 0
            r1.hashCode()
            throw r1
        L2b:
            boolean r4 = r1 instanceof o.setDrawerLockMode
            if (r4 != 0) goto L37
            int r3 = r3 + 57
            int r1 = r3 % 128
            o.setDrawerLockMode.IconCompatParcelizer = r1
            int r3 = r3 % r2
            return r7
        L37:
            o.setDrawerLockMode r1 = (o.setDrawerLockMode) r1
            java.lang.String r3 = r0.description
            java.lang.String r4 = r1.description
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
            if (r3 != 0) goto L71
            int r1 = o.setDrawerLockMode.IconCompatParcelizer
            int r1 = r1 + 67
            int r3 = r1 % 128
            o.setDrawerLockMode.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r7
        L71:
            java.lang.String r3 = r0.orderId
            java.lang.String r1 = r1.orderId
            java.lang.Object[] r20 = new java.lang.Object[]{r3, r1}
            int r15 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r21 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L9f
            int r1 = o.setDrawerLockMode.IconCompatParcelizer
            int r1 = r1 + 25
            int r3 = r1 % 128
            o.setDrawerLockMode.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r2
            return r7
        L9f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDrawerLockMode.equals(java.lang.Object):boolean");
    }
}
