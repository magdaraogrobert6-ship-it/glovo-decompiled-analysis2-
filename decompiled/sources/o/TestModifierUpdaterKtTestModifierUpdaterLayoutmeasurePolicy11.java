package o;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy11 extends View.AccessibilityDelegate {
    public final /* synthetic */ TestModifierUpdaterKtTestModifierUpdaterLayout11 read;

    public TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy11(TestModifierUpdaterKtTestModifierUpdaterLayout11 testModifierUpdaterKtTestModifierUpdaterLayout11) {
        this.read = testModifierUpdaterKtTestModifierUpdaterLayout11;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.read.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
