package o;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusState {
    public static AccessibilityNodeInfo.AccessibilityAction write() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
    }
}
