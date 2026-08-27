package o;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class CompositionDataTree extends getNoopState {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final CompositionDataTree INSTANCE = new CompositionDataTree();
    public static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new AnimatedVisibilityState(25));

    static {
        int i = RemoteActionCompatParcelizer + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return "ChatAction";
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return 1555388294;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.CompositionDataTree) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 15;
        o.CompositionDataTree.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
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
            int r1 = o.CompositionDataTree.IconCompatParcelizer
            int r2 = r1 + 39
            int r3 = r2 % 128
            o.CompositionDataTree.read = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L16
            r2 = 72
            int r2 = r2 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r4
        L19:
            boolean r6 = r6 instanceof o.CompositionDataTree
            if (r6 != 0) goto L28
            int r1 = r1 + 15
            int r6 = r1 % 128
            o.CompositionDataTree.read = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L27
            return r4
        L27:
            return r3
        L28:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CompositionDataTree.equals(java.lang.Object):boolean");
    }
}
