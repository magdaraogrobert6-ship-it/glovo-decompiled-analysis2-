package o;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusRestorerNodeonExit1 {
    public final Object write;

    public FocusRestorerNodeonExit1(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.write = collectionItemInfo;
    }

    public static FocusRestorerNodeonExit1 serializer(int i, int i2, int i3, int i4, boolean z) {
        return new FocusRestorerNodeonExit1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
