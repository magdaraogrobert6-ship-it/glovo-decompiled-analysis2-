package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 {
    private static int read = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final ArrayList serializer;

    public invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1(String str, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = arrayList;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode() % (this.RemoteActionCompatParcelizer.hashCode() * 13);
        } else {
            iHashCode = this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = read + 101;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ViewEntity(title=" + this.RemoteActionCompatParcelizer + ", items=" + this.serializer + ")";
        int i2 = read + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r4.serializer.equals(r5.serializer) != true) goto L13;
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
            int r1 = o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1.write
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1.read = r2
            int r1 = r1 % r0
            r1 = 1
            if (r4 != r5) goto L10
            goto L37
        L10:
            boolean r2 = r5 instanceof o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1
            if (r2 != 0) goto L15
            goto L2c
        L15:
            o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1 r5 = (o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1) r5
            java.lang.String r2 = r4.RemoteActionCompatParcelizer
            java.lang.String r3 = r5.RemoteActionCompatParcelizer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto L2c
        L22:
            java.util.ArrayList r2 = r4.serializer
            java.util.ArrayList r5 = r5.serializer
            boolean r5 = r2.equals(r5)
            if (r5 == r1) goto L37
        L2c:
            int r5 = o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1.read
            int r5 = r5 + 43
            int r1 = r5 % 128
            o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1.write = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invokeSuspendcomroadrunnermapcontainerenabledpresentationMapboxFragmentonViewCreated1.equals(java.lang.Object):boolean");
    }
}
