package com.roadrunner.rider.recruitment.accountcreation.password_creation.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public final class DecodingFailException extends Exception {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final Exception serializer;

    public DecodingFailException(Exception exc) {
        super("Failed to decode string token data", exc);
        this.serializer = exc;
        this.RemoteActionCompatParcelizer = "Failed to decode string token data";
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 115;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Exception exc = this.serializer;
        int i5 = i2 + 63;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 95;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 15;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Exception exc = this.serializer;
        int iHashCode2 = 0;
        if (exc == null) {
            int i2 = write;
            int i3 = i2 + 101;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            iHashCode = (i3 % 2 != 0 ? 0 : 1) ^ 1;
            int i4 = i2 + 29;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode = exc.hashCode();
        }
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            iHashCode2 = str.hashCode();
            int i6 = write + 53;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        int i = 2 % 2;
        String str = "DecodingFailException(cause=" + this.serializer + ", message=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != true) goto L13;
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
            int r3 = com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.write
            int r3 = r3 + 57
            int r4 = r3 % 128
            com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r3 = 1
            if (r0 != r1) goto L14
            goto L7e
        L14:
            boolean r5 = r1 instanceof com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException
            if (r5 != 0) goto L20
            int r4 = r4 + 45
            int r1 = r4 % 128
            com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.write = r1
            int r4 = r4 % r2
            goto L73
        L20:
            com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException r1 = (com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException) r1
            java.lang.Exception r4 = r0.serializer
            java.lang.Exception r5 = r1.serializer
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r14
            r8 = r15
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L4f
            goto L73
        L4f:
            java.lang.String r4 = r0.RemoteActionCompatParcelizer
            java.lang.String r1 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r1}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == r3) goto L7e
        L73:
            int r1 = com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.write
            int r1 = r1 + 105
            int r3 = r1 % 128
            com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.IconCompatParcelizer = r3
            int r1 = r1 % r2
            r1 = 0
            return r1
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.accountcreation.password_creation.domain.DecodingFailException.equals(java.lang.Object):boolean");
    }
}
