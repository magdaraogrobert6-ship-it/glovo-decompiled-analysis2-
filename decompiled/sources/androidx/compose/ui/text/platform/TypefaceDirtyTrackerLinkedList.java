package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
final class TypefaceDirtyTrackerLinkedList {
    private final Object initial;
    private final TypefaceDirtyTrackerLinkedList next;
    private final onViewAttachedToWindow resolveResult;

    public final Object getInitial() {
        return this.initial;
    }

    public final Typeface getTypeface() {
        Object obj = this.initial;
        obj.getClass();
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        if (this.resolveResult.getValue() != this.initial) {
            return true;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.next;
        return typefaceDirtyTrackerLinkedList != null && typefaceDirtyTrackerLinkedList.isStaleResolvedFont();
    }

    public TypefaceDirtyTrackerLinkedList(onViewAttachedToWindow onviewattachedtowindow, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.resolveResult = onviewattachedtowindow;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = onviewattachedtowindow.getValue();
    }

    public /* synthetic */ TypefaceDirtyTrackerLinkedList(onViewAttachedToWindow onviewattachedtowindow, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onviewattachedtowindow, (i & 2) != 0 ? null : typefaceDirtyTrackerLinkedList);
    }
}
