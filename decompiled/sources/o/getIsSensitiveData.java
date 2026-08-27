package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getIsSensitiveData extends getIsDialog {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final getTextSelectionRange RemoteActionCompatParcelizer;
    public final getLinkTestMarker serializer;

    public getIsSensitiveData(getTextSelectionRange gettextselectionrange, getLinkTestMarker getlinktestmarker) {
        this.RemoteActionCompatParcelizer = gettextselectionrange;
        this.serializer = getlinktestmarker;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode() / (this.RemoteActionCompatParcelizer.hashCode() / 113);
        }
        return this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "IdentityNotVerified(userData=" + this.RemoteActionCompatParcelizer + ", idVerificationParams=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r5.serializer.equals(r6.serializer) != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getIsSensitiveData.IconCompatParcelizer
            int r2 = r1 + 29
            int r3 = r2 % 128
            o.getIsSensitiveData.write = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L16
            r2 = 98
            int r2 = r2 / r3
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r1 = r1 + 63
            int r6 = r1 % 128
            o.getIsSensitiveData.write = r6
            int r1 = r1 % r0
            goto L45
        L20:
            boolean r1 = r6 instanceof o.getIsSensitiveData
            if (r1 != 0) goto L25
            goto L44
        L25:
            o.getIsSensitiveData r6 = (o.getIsSensitiveData) r6
            o.getTextSelectionRange r1 = r5.RemoteActionCompatParcelizer
            o.getTextSelectionRange r2 = r6.RemoteActionCompatParcelizer
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3a
            int r6 = o.getIsSensitiveData.write
            int r6 = r6 + r4
            int r1 = r6 % 128
            o.getIsSensitiveData.IconCompatParcelizer = r1
            int r6 = r6 % r0
            goto L44
        L3a:
            o.getLinkTestMarker r1 = r5.serializer
            o.getLinkTestMarker r6 = r6.serializer
            boolean r6 = r1.equals(r6)
            if (r6 == r4) goto L45
        L44:
            return r3
        L45:
            int r6 = o.getIsSensitiveData.IconCompatParcelizer
            int r6 = r6 + 75
            int r1 = r6 % 128
            o.getIsSensitiveData.write = r1
            int r6 = r6 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIsSensitiveData.equals(java.lang.Object):boolean");
    }
}
