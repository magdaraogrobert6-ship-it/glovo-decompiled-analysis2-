package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class handleTag implements Html_androidKtWhenMappings {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final ArrayList read;

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        ArrayList arrayList = this.read;
        int i5 = i3 + 25;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return arrayList;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i2 + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return str;
    }

    public handleTag(String str, ArrayList arrayList) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.read = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() >> (this.IconCompatParcelizer.hashCode() << 28);
        }
        return (this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NewReleaseFound(id=" + this.IconCompatParcelizer + ", manifestReleaseIds=" + this.read + ")";
        int i2 = serializer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if ((r12 instanceof o.handleTag) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r12 = (o.handleTag) r12;
        r9 = new java.lang.Object[]{r11.IconCompatParcelizer, r12.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r9, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r11.read.equals(r12.read) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 113;
        o.handleTag.write = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.handleTag.write
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.handleTag.serializer = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 43
            int r1 = r1 / r3
            if (r11 != r12) goto L1f
            goto L17
        L15:
            if (r11 != r12) goto L1f
        L17:
            int r2 = r2 + 113
            int r12 = r2 % 128
            o.handleTag.write = r12
            int r2 = r2 % r0
            goto L5b
        L1f:
            boolean r0 = r12 instanceof o.handleTag
            if (r0 != 0) goto L24
            goto L5d
        L24:
            o.handleTag r12 = (o.handleTag) r12
            java.lang.String r0 = r11.IconCompatParcelizer
            java.lang.String r1 = r12.IconCompatParcelizer
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r1}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r0 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L51
            goto L5d
        L51:
            java.util.ArrayList r0 = r11.read
            java.util.ArrayList r12 = r12.read
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L5d
        L5b:
            r12 = 1
            return r12
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.handleTag.equals(java.lang.Object):boolean");
    }
}
