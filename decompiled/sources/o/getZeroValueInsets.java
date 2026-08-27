package o;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.StartCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class getZeroValueInsets extends androidx.core.view.AccessibilityDelegateCompat {
    public final TextInputLayout read;

    public getZeroValueInsets(TextInputLayout textInputLayout) {
        this.read = textInputLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        TextInputLayout textInputLayout = this.read;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.getSavedStateRegistryControllerannotations;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        StartCompoundLayout startCompoundLayout = textInputLayout.initializeViewTreeOwners;
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = startCompoundLayout.serializer;
        if (appCompatTextView.getVisibility() == 0) {
            focusRestorerKtsaveFocusedChild11.write.setLabelFor(appCompatTextView);
            focusRestorerKtsaveFocusedChild11.write.setTraversalAfter(appCompatTextView);
        } else {
            focusRestorerKtsaveFocusedChild11.write.setTraversalAfter(startCompoundLayout.MediaSessionCompatQueueItem);
        }
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        if (!zIsEmpty) {
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(text);
        } else if (!TextUtils.isEmpty(string)) {
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(string);
            if (!z && placeholderText != null) {
                focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = textInputLayout.addContentView.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.ensureViewModelStore.getEndIconDelegate().serializer(focusRestorerKtsaveFocusedChild11);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.read.ensureViewModelStore.getEndIconDelegate().read(accessibilityEvent);
    }
}
