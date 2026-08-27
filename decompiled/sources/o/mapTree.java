package o;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class mapTree extends getNoopState {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final mapTree INSTANCE = new mapTree();
    public static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(26));

    static {
        int i = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return "ChatOrCallAction";
        }
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return -1012208185;
        }
        int i3 = 4 / 0;
        return -1012208185;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i3 = write + 93;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setgraphicmodalmaxwidthdp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r7 = 58 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if ((r7 instanceof o.mapTree) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r3 = r3 + 123;
        o.mapTree.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r1 = r1 + 107;
        o.mapTree.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 95;
        o.mapTree.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.mapTree.write
            int r2 = r1 + 43
            int r3 = r2 % 128
            o.mapTree.serializer = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 44
            int r2 = r2 / r5
            if (r6 != r7) goto L25
            goto L18
        L16:
            if (r6 != r7) goto L25
        L18:
            int r1 = r1 + 95
            int r7 = r1 % 128
            o.mapTree.serializer = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L24
            r7 = 58
            int r7 = r7 / r5
        L24:
            return r4
        L25:
            boolean r7 = r7 instanceof o.mapTree
            if (r7 != 0) goto L31
            int r3 = r3 + 123
            int r7 = r3 % 128
            o.mapTree.write = r7
            int r3 = r3 % r0
            return r5
        L31:
            int r1 = r1 + 107
            int r7 = r1 % 128
            o.mapTree.serializer = r7
            int r1 = r1 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mapTree.equals(java.lang.Object):boolean");
    }
}
