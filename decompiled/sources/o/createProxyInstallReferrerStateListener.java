package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.Status$Companion;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getStringInstallReferrer;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class createProxyInstallReferrerStateListener {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final getInstallReferrerStateListenerClass action;
    public final String description;
    public final String text;
    public final isTrackingEnabled type;
    public static final Status$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.Status$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 119;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getStringInstallReferrer getstringinstallreferrer = getStringInstallReferrer.write;
            int i4 = serializer + 119;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return getstringinstallreferrer;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(25)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.Status$Companion] */
    static {
        int i = IconCompatParcelizer + 119;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public /* synthetic */ createProxyInstallReferrerStateListener(int i, isTrackingEnabled istrackingenabled, String str, String str2, getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass) {
        if (3 == (i & 3)) {
            this.type = istrackingenabled;
            this.text = str;
            if ((i & 4) == 0) {
                this.description = null;
                int i2 = serializer + 69;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 3 % 2;
                } else {
                    int i4 = 2 % 2;
                }
            } else {
                this.description = str2;
                int i5 = write + 97;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            }
            if ((i & 8) == 0) {
                this.action = null;
                return;
            } else {
                this.action = getinstallreferrerstatelistenerclass;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getStringInstallReferrer.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.text);
        String str = this.description;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = serializer + 5;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        getInstallReferrerStateListenerClass getinstallreferrerstatelistenerclass = this.action;
        int iHashCode2 = ((iM + iHashCode) * 31) + (getinstallreferrerstatelistenerclass != null ? getinstallreferrerstatelistenerclass.hashCode() : 0);
        int i4 = write + 109;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Status(type=" + this.type + ", text=" + this.text + ", description=" + this.description + ", action=" + this.action + ")";
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.createProxyInstallReferrerStateListener) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 59;
        o.createProxyInstallReferrerStateListener.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.createProxyInstallReferrerStateListener) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r21.type == r1.type) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r12 = new java.lang.Object[]{r21.text, r1.text};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r1 = o.createProxyInstallReferrerStateListener.serializer + 101;
        o.createProxyInstallReferrerStateListener.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r19 = new java.lang.Object[]{r21.description, r1.description};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r19 = new java.lang.Object[]{r21.action, r1.action};
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
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
            int r3 = o.createProxyInstallReferrerStateListener.write
            int r4 = r3 + 111
            int r5 = r4 % 128
            o.createProxyInstallReferrerStateListener.serializer = r5
            int r4 = r4 % r2
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1a
            r4 = 12
            int r4 = r4 / r6
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r5
        L1d:
            boolean r4 = r1 instanceof o.createProxyInstallReferrerStateListener
            if (r4 != 0) goto L29
            int r3 = r3 + 59
            int r1 = r3 % 128
            o.createProxyInstallReferrerStateListener.serializer = r1
            int r3 = r3 % r2
            return r6
        L29:
            o.createProxyInstallReferrerStateListener r1 = (o.createProxyInstallReferrerStateListener) r1
            o.isTrackingEnabled r3 = r0.type
            o.isTrackingEnabled r4 = r1.type
            if (r3 == r4) goto L32
            return r6
        L32:
            java.lang.String r3 = r0.text
            java.lang.String r4 = r1.text
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r4}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r4 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r4
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == r5) goto L6b
            int r1 = o.createProxyInstallReferrerStateListener.serializer
            int r1 = r1 + 101
            int r3 = r1 % 128
            o.createProxyInstallReferrerStateListener.write = r3
            int r1 = r1 % r2
            if (r1 != 0) goto L6a
            return r5
        L6a:
            return r6
        L6b:
            java.lang.String r2 = r0.description
            java.lang.String r7 = r1.description
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r7}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L93
            return r6
        L93:
            o.getInstallReferrerStateListenerClass r2 = r0.action
            o.getInstallReferrerStateListenerClass r1 = r1.action
            java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r4
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lbb
            return r6
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createProxyInstallReferrerStateListener.equals(java.lang.Object):boolean");
    }
}
