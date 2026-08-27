package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteui_text implements getMBufferStateui_text {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final List RemoteActionCompatParcelizer;
    public final String serializer;
    public final long write;

    @Override // o.getMBufferStateui_text
    public final long IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 93;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getMBufferStateui_text
    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List list = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 113;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    @Override // o.getMBufferStateui_text
    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public deleteui_text(String str, List list, long j) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = list;
        this.write = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.write) + c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.serializer.hashCode() * 31, 31);
        int i4 = read + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return c8$$ExternalSyntheticOutline0.m(this.write, ")", r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Dispatcher(channelId=", this.serializer, ", messages=", this.RemoteActionCompatParcelizer, ", lastUpdated="));
        }
        c8$$ExternalSyntheticOutline0.m(this.write, ")", r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Dispatcher(channelId=", this.serializer, ", messages=", this.RemoteActionCompatParcelizer, ", lastUpdated="));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r11.write != r12.write) goto L16;
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
            r1 = 0
            if (r11 != r12) goto L7
            goto L56
        L7:
            boolean r2 = r12 instanceof o.deleteui_text
            if (r2 != 0) goto Lc
            goto L55
        Lc:
            o.deleteui_text r12 = (o.deleteui_text) r12
            java.lang.String r2 = r11.serializer
            java.lang.String r3 = r12.serializer
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r3}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r2 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L42
            int r12 = o.deleteui_text.IconCompatParcelizer
            int r12 = r12 + 37
            int r2 = r12 % 128
            o.deleteui_text.read = r2
            int r12 = r12 % r0
            goto L55
        L42:
            java.util.List r2 = r11.RemoteActionCompatParcelizer
            java.util.List r3 = r12.RemoteActionCompatParcelizer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L55
        L4d:
            long r2 = r11.write
            long r4 = r12.write
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L56
        L55:
            return r1
        L56:
            int r12 = o.deleteui_text.IconCompatParcelizer
            int r12 = r12 + 17
            int r2 = r12 % 128
            o.deleteui_text.read = r2
            int r12 = r12 % r0
            r0 = 1
            if (r12 != 0) goto L65
            r12 = 69
            int r12 = r12 / r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deleteui_text.equals(java.lang.Object):boolean");
    }
}
