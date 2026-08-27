package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class execSessionFailureCallbackCommand {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final Integer IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final execSessionSuccessCallbackCommand write;

    public execSessionFailureCallbackCommand(String str, String str2, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand, Integer num) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.write = execsessionsuccesscallbackcommand;
        this.IconCompatParcelizer = num;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0045 A[PHI: r1 r3
  0x0045: PHI (r1v12 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v10 o.execSessionSuccessCallbackCommand) = (r3v1 o.execSessionSuccessCallbackCommand), (r3v12 o.execSessionSuccessCallbackCommand) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v16 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand;
        int i;
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = read + 49;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() / 76, 79, this.serializer);
            execsessionsuccesscallbackcommand = this.write;
            if (execsessionsuccesscallbackcommand == null) {
                i = read + 85;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i4 = 4 % 2;
                }
                iHashCode = 0;
            } else {
                iHashCode = execsessionsuccesscallbackcommand.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer);
            execsessionsuccesscallbackcommand = this.write;
            if (execsessionsuccesscallbackcommand == null) {
                i = read + 85;
                MediaDescriptionCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i5 = 4 % 2;
                }
                iHashCode = 0;
            } else {
                iHashCode = execsessionsuccesscallbackcommand.hashCode();
            }
        }
        return this.IconCompatParcelizer.hashCode() + ((iM + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EmptyViewEntity(emptyTitle=", this.RemoteActionCompatParcelizer, ", emptyMessage=", this.serializer, ", recoveryButtonView=");
        sbM.append(this.write);
        sbM.append(", imageRes=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r21 instanceof o.execSessionFailureCallbackCommand) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = (o.execSessionFailureCallbackCommand) r21;
        r11 = new java.lang.Object[]{r20.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r18 = new java.lang.Object[]{r20.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r18 = new java.lang.Object[]{r20.write, r1.write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r20.IconCompatParcelizer.equals(r1.IconCompatParcelizer) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r3 = r3 + 121;
        o.execSessionFailureCallbackCommand.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.execSessionFailureCallbackCommand.MediaDescriptionCompat
            int r4 = r3 + 37
            int r5 = r4 % 128
            o.execSessionFailureCallbackCommand.read = r5
            int r4 = r4 % r2
            r5 = 0
            if (r4 == 0) goto L19
            r4 = 46
            int r4 = r4 / r5
            if (r0 != r1) goto L24
            goto L1b
        L19:
            if (r0 != r1) goto L24
        L1b:
            int r3 = r3 + 121
            int r1 = r3 % 128
            o.execSessionFailureCallbackCommand.read = r1
            int r3 = r3 % r2
            goto Lb2
        L24:
            boolean r2 = r1 instanceof o.execSessionFailureCallbackCommand
            if (r2 != 0) goto L2a
            goto Lb1
        L2a:
            o.execSessionFailureCallbackCommand r1 = (o.execSessionFailureCallbackCommand) r1
            java.lang.String r2 = r0.RemoteActionCompatParcelizer
            java.lang.String r3 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r2 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r3 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r2
            r8 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L59
            goto Lb1
        L59:
            java.lang.String r4 = r0.serializer
            java.lang.String r6 = r1.serializer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r6}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r2
            r15 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L80
            goto Lb1
        L80:
            o.execSessionSuccessCallbackCommand r4 = r0.write
            o.execSessionSuccessCallbackCommand r6 = r1.write
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r6}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r2
            r15 = r3
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto La7
            goto Lb1
        La7:
            java.lang.Integer r2 = r0.IconCompatParcelizer
            java.lang.Integer r1 = r1.IconCompatParcelizer
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lb2
        Lb1:
            return r5
        Lb2:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.execSessionFailureCallbackCommand.equals(java.lang.Object):boolean");
    }
}
