package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class allocateItemsIndex extends debugString {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public allocateItemsIndex(String str, String str2, long j) {
        str2.getClass();
        this.serializer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = j;
    }

    public final int hashCode() {
        int iM729hashCodeimpl;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.RemoteActionCompatParcelizer) - af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() + 11, 27, this.read);
        } else {
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.RemoteActionCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read);
        }
        int i3 = write + 69;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iM729hashCodeimpl;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Available(title=", this.serializer, ", subtitle=", this.read, ", statusColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.RemoteActionCompatParcelizer), ")");
            throw null;
        }
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Available(title=", this.serializer, ", subtitle=", this.read, ", statusColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.RemoteActionCompatParcelizer), ")");
        int i3 = write + 49;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if ((!androidx.compose.ui.graphics.Color.m723equalsimpl0(r12.RemoteActionCompatParcelizer, r13.RemoteActionCompatParcelizer)) != true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.allocateItemsIndex.IconCompatParcelizer
            int r1 = r1 + 91
            int r2 = r1 % 128
            o.allocateItemsIndex.write = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 45
            int r1 = r1 / r3
            if (r12 != r13) goto L19
            goto L61
        L16:
            if (r12 != r13) goto L19
            goto L61
        L19:
            boolean r1 = r13 instanceof o.allocateItemsIndex
            if (r1 != 0) goto L1e
            goto L62
        L1e:
            o.allocateItemsIndex r13 = (o.allocateItemsIndex) r13
            java.lang.String r1 = r12.serializer
            java.lang.String r4 = r13.serializer
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2b
            goto L62
        L2b:
            java.lang.String r1 = r12.read
            java.lang.String r4 = r13.read
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r4}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L56
            goto L62
        L56:
            long r4 = r12.RemoteActionCompatParcelizer
            long r6 = r13.RemoteActionCompatParcelizer
            boolean r13 = androidx.compose.ui.graphics.Color.m723equalsimpl0(r4, r6)
            r13 = r13 ^ r2
            if (r13 == r2) goto L62
        L61:
            return r2
        L62:
            int r13 = o.allocateItemsIndex.IconCompatParcelizer
            int r13 = r13 + 93
            int r1 = r13 % 128
            o.allocateItemsIndex.write = r1
            int r13 = r13 % r0
            if (r13 == 0) goto L70
            r13 = 37
            int r13 = r13 / r3
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.allocateItemsIndex.equals(java.lang.Object):boolean");
    }
}
