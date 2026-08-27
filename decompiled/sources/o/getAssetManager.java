package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getAssetManager implements AndroidFileDescriptorFont {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final ArrayList RemoteActionCompatParcelizer;

    public getAssetManager(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = serializer + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(tags=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r4.RemoteActionCompatParcelizer.equals(((o.getAssetManager) r5).RemoteActionCompatParcelizer) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getAssetManager.IconCompatParcelizer
            int r2 = r1 + 63
            int r3 = r2 % 128
            o.getAssetManager.serializer = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 19
            int r2 = r2 / r3
            if (r4 != r5) goto L1f
            goto L17
        L15:
            if (r4 != r5) goto L1f
        L17:
            int r1 = r1 + 39
            int r5 = r1 % 128
            o.getAssetManager.serializer = r5
            int r1 = r1 % r0
            goto L38
        L1f:
            boolean r2 = r5 instanceof o.getAssetManager
            if (r2 != 0) goto L2b
            int r1 = r1 + 57
            int r5 = r1 % 128
            o.getAssetManager.serializer = r5
            int r1 = r1 % r0
            goto L37
        L2b:
            o.getAssetManager r5 = (o.getAssetManager) r5
            java.util.ArrayList r1 = r4.RemoteActionCompatParcelizer
            java.util.ArrayList r5 = r5.RemoteActionCompatParcelizer
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L38
        L37:
            return r3
        L38:
            int r5 = o.getAssetManager.IconCompatParcelizer
            int r5 = r5 + 71
            int r1 = r5 % 128
            o.getAssetManager.serializer = r1
            int r5 = r5 % r0
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAssetManager.equals(java.lang.Object):boolean");
    }
}
