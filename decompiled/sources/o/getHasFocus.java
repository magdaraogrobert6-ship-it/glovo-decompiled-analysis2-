package o;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class getHasFocus {
    public final Object IconCompatParcelizer;

    public getHasFocus(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.IconCompatParcelizer = collectionInfo;
    }

    public static getHasFocus write(int i, int i2, int i3) {
        return new getHasFocus(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
