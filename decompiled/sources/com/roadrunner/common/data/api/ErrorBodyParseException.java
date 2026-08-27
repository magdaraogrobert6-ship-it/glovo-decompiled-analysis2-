package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorBodyParseException extends Exception {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final Throwable RemoteActionCompatParcelizer;
    public final UniqueHttpException read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBodyParseException(Throwable th, UniqueHttpException uniqueHttpException, String str) {
        Throwable cause;
        super(null, th);
        Object obj = null;
        this.RemoteActionCompatParcelizer = th;
        this.read = uniqueHttpException;
        this.IconCompatParcelizer = str;
        Throwable cause2 = getCause();
        int i = 5;
        while (true) {
            if (cause2 != null) {
                int i2 = serializer + 21;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    cause2.getCause();
                    throw null;
                }
                cause = cause2.getCause();
                int i3 = 2 % 2;
            } else {
                cause = null;
            }
            if (cause == null) {
                break;
            }
            int i4 = write + 19;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cause2.getCause(), cause2}, getCieXyz.write())).booleanValue();
                obj.hashCode();
                throw null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cause2.getCause(), cause2}, getCieXyz.write())).booleanValue()) {
                break;
            }
            int i5 = serializer + 53;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i <= 0) {
                break;
            }
            cause2 = cause2.getCause();
            i--;
        }
        if (cause2 != null) {
            try {
                cause2.initCause(this.read);
            } catch (Exception unused) {
            }
        }
        int i6 = serializer + 103;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i2 = write;
            int i3 = i2 + 37;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("ErrorBodyParseException(parseException=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", httpException=");
        sb.append(this.read);
        sb.append(", bodyString=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = serializer + 113;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r21 instanceof com.roadrunner.common.data.api.ErrorBodyParseException) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = (com.roadrunner.common.data.api.ErrorBodyParseException) r21;
        r11 = new java.lang.Object[]{r20.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r18 = new java.lang.Object[]{r20.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r18 = new java.lang.Object[]{r20.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r3 = r3 + 29;
        com.roadrunner.common.data.api.ErrorBodyParseException.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r3 = com.roadrunner.common.data.api.ErrorBodyParseException.write
            int r4 = r3 + 43
            int r5 = r4 % 128
            com.roadrunner.common.data.api.ErrorBodyParseException.serializer = r5
            int r4 = r4 % r2
            r5 = 0
            if (r4 != 0) goto L19
            r4 = 93
            int r4 = r4 / r5
            if (r0 != r1) goto L24
            goto L1b
        L19:
            if (r0 != r1) goto L24
        L1b:
            int r3 = r3 + 29
            int r1 = r3 % 128
            com.roadrunner.common.data.api.ErrorBodyParseException.serializer = r1
            int r3 = r3 % r2
            goto La6
        L24:
            boolean r2 = r1 instanceof com.roadrunner.common.data.api.ErrorBodyParseException
            if (r2 != 0) goto L2a
            goto La8
        L2a:
            com.roadrunner.common.data.api.ErrorBodyParseException r1 = (com.roadrunner.common.data.api.ErrorBodyParseException) r1
            java.lang.Throwable r2 = r0.RemoteActionCompatParcelizer
            java.lang.Throwable r3 = r1.RemoteActionCompatParcelizer
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
            goto La8
        L59:
            com.roadrunner.common.data.api.UniqueHttpException r4 = r0.read
            com.roadrunner.common.data.api.UniqueHttpException r6 = r1.read
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
            goto La8
        L80:
            java.lang.String r4 = r0.IconCompatParcelizer
            java.lang.String r1 = r1.IconCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r1}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r2
            r15 = r3
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La8
        La6:
            r1 = 1
            return r1
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.common.data.api.ErrorBodyParseException.equals(java.lang.Object):boolean");
    }
}
