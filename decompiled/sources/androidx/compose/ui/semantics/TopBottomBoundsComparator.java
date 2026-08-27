package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import java.util.Comparator;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes.dex */
final class TopBottomBoundsComparator implements Comparator<onViewAttachedToWindowlambda0> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0, onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1) {
        int iCompare = Float.compare(((Rect) onviewattachedtowindowlambda0.serializer).getTop(), ((Rect) onviewattachedtowindowlambda1.serializer).getTop());
        return iCompare != 0 ? iCompare : Float.compare(((Rect) onviewattachedtowindowlambda0.serializer).getBottom(), ((Rect) onviewattachedtowindowlambda1.serializer).getBottom());
    }
}
