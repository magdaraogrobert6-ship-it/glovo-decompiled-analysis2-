package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNodeonEnter1;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {
    private final Object read;

    public void addExtraDataToAccessibilityNodeInfo(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, String str, Bundle bundle) {
    }

    public FocusRestorerKtsaveFocusedChild11 createAccessibilityNodeInfo(int i) {
        return null;
    }

    public List<FocusRestorerKtsaveFocusedChild11> findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    public FocusRestorerKtsaveFocusedChild11 findFocus(int i) {
        return null;
    }

    public Object getProvider() {
        return this.read;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat() {
        this.read = new FocusRestorerNodeonEnter1(this);
    }

    public AccessibilityNodeProviderCompat(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.read = accessibilityNodeProvider;
    }
}
