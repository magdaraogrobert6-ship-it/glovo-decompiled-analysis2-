package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.selfservice.domain.push.PushPayload$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLineEnddefault {
    public static final PushPayload$Companion Companion = new PushPayload$Companion();
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE body;
    public final String hcChatMessage;
    public final String version;

    static {
        int i = IconCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 99;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.version;
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE serializer() {
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.body;
        }
        int i3 = 6 / 0;
        return this.body;
    }

    public /* synthetic */ getLineEnddefault(int i, String str, String str2, r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE r8lambdao_ysfdhcihui0mnw9w9iwvqnxle) {
        if (7 == (i & 7)) {
            this.hcChatMessage = str;
            this.version = str2;
            this.body = r8lambdao_ysfdhcihui0mnw9w9iwvqnxle;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, paintLG529CIdefault.write.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.body.hashCode() + af$$ExternalSyntheticOutline0.m(this.hcChatMessage.hashCode() * 31, 31, this.version);
        int i4 = read + 45;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PushPayload(hcChatMessage=", this.hcChatMessage, ", version=", this.version, ", body=");
            sbM.append(this.body);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = 52 / 0;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("PushPayload(hcChatMessage=", this.hcChatMessage, ", version=", this.version, ", body=");
        sbM2.append(this.body);
        sbM2.append(")");
        return sbM2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((!(r22 instanceof o.getLineEnddefault)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r1 = (o.getLineEnddefault) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.hcChatMessage, r1.hcChatMessage}, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.version, r1.version}, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.body, r1.body}, o.getCieXyz.write())).booleanValue() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        r1 = o.getLineEnddefault.serializer + 7;
        o.getLineEnddefault.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if ((r1 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
    
        return false;
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
            int r3 = o.getLineEnddefault.read
            int r3 = r3 + 103
            int r4 = r3 % 128
            o.getLineEnddefault.serializer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 55
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.getLineEnddefault
            r3 = r3 ^ r4
            if (r3 == 0) goto L23
            return r5
        L23:
            o.getLineEnddefault r1 = (o.getLineEnddefault) r1
            java.lang.String r3 = r0.hcChatMessage
            java.lang.String r6 = r1.hcChatMessage
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r3
            r9 = r6
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L52
            return r5
        L52:
            java.lang.String r7 = r0.version
            java.lang.String r8 = r1.version
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7a
            return r5
        L7a:
            o.r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE r7 = r0.body
            o.r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE r1 = r1.body
            java.lang.Object[] r19 = new java.lang.Object[]{r7, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            r15 = r3
            r16 = r6
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Laf
            int r1 = o.getLineEnddefault.serializer
            int r1 = r1 + 7
            int r3 = r1 % 128
            o.getLineEnddefault.read = r3
            int r1 = r1 % r2
            if (r1 != 0) goto Lad
            return r4
        Lad:
            r1 = 0
            throw r1
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLineEnddefault.equals(java.lang.Object):boolean");
    }
}
