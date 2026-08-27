package o;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRestorerNodeonEnter1 extends AccessibilityNodeProvider {
    public final androidx.core.view.accessibility.AccessibilityNodeProviderCompat write;

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.write.addExtraDataToAccessibilityNodeInfo(i, new FocusRestorerKtsaveFocusedChild11(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11CreateAccessibilityNodeInfo = this.write.createAccessibilityNodeInfo(i);
        if (focusRestorerKtsaveFocusedChild11CreateAccessibilityNodeInfo == null) {
            return null;
        }
        return focusRestorerKtsaveFocusedChild11CreateAccessibilityNodeInfo.write;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        List<FocusRestorerKtsaveFocusedChild11> listFindAccessibilityNodeInfosByText = this.write.findAccessibilityNodeInfosByText(str, i);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listFindAccessibilityNodeInfosByText.get(i2).write);
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11FindFocus = this.write.findFocus(i);
        if (focusRestorerKtsaveFocusedChild11FindFocus == null) {
            return null;
        }
        return focusRestorerKtsaveFocusedChild11FindFocus.write;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.write.performAction(i, i2, bundle);
    }

    public FocusRestorerNodeonEnter1(androidx.core.view.accessibility.AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
        this.write = accessibilityNodeProviderCompat;
    }
}
