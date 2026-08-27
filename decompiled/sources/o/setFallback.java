package o;

import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class setFallback implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public final DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        removeIf removeif = (removeIf) this.serializer.serializer;
        AutoCompleteTextView autoCompleteTextView = removeif.serializer;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = removeif.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        checkableImageButton.setImportantForAccessibility(i);
    }

    public setFallback(DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5) {
        this.serializer = dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setFallback) {
            return this.serializer.equals(((setFallback) obj).serializer);
        }
        return false;
    }
}
