package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Map RemoteActionCompatParcelizer;
    public final String write;

    public r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I(Map map, String str) {
        str.getClass();
        this.RemoteActionCompatParcelizer = map;
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = read + 69;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ChatLanguageSelectorUiState(availableLanguages=" + this.RemoteActionCompatParcelizer + ", selectedLanguage=" + this.write + ")";
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r8, o.getCieXyz.write())).booleanValue() != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r10 != r11) goto L10
            int r11 = o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I.IconCompatParcelizer
            int r11 = r11 + 119
            int r2 = r11 % 128
            o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I.read = r2
            int r11 = r11 % r0
            goto L57
        L10:
            boolean r2 = r11 instanceof o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I
            if (r2 != 0) goto L15
            goto L4c
        L15:
            o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I r11 = (o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I) r11
            java.util.Map r2 = r10.RemoteActionCompatParcelizer
            java.util.Map r3 = r11.RemoteActionCompatParcelizer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L4c
        L22:
            java.lang.String r2 = r10.write
            java.lang.String r11 = r11.write
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r11}
            int r3 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r6 = o.getCieXyz.write()
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r11 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == r1) goto L57
        L4c:
            int r11 = o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I.IconCompatParcelizer
            int r11 = r11 + 17
            int r1 = r11 % 128
            o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I.read = r1
            int r11 = r11 % r0
            r11 = 0
            return r11
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I.equals(java.lang.Object):boolean");
    }
}
