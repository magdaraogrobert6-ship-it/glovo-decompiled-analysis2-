package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import o.AnchoredDraggableState;

/* JADX INFO: loaded from: classes.dex */
public final class NodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean compareEquals(AnchoredDraggableState anchoredDraggableState, Map<AlignmentLine, Integer> map) {
        if (anchoredDraggableState == null || anchoredDraggableState.serializer != map.size()) {
            return false;
        }
        Object[] objArr = anchoredDraggableState.IconCompatParcelizer;
        int[] iArr = anchoredDraggableState.MediaMetadataCompat;
        long[] jArr = anchoredDraggableState.write;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        int i5 = iArr[i4];
                        Integer num = map.get((AlignmentLine) obj);
                        if (num == null || num.intValue() != i5) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m2549nextUntilhw7D004(DelegatableNode delegatableNode, int i, int i2) {
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null || (child$ui.getAggregateChildKindSet$ui() & i) == 0) {
            return null;
        }
        while (child$ui != null) {
            int kindSet$ui = child$ui.getKindSet$ui();
            if ((kindSet$ui & i2) != 0) {
                return null;
            }
            if ((kindSet$ui & i) != 0) {
                return child$ui;
            }
            child$ui = child$ui.getChild$ui();
        }
        return null;
    }
}
