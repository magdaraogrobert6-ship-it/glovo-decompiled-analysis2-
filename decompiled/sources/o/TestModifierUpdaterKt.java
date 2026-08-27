package o;

import android.widget.EditText;
import com.google.android.material.textfield.EndCompoundLayout;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdaterKt {
    public final /* synthetic */ EndCompoundLayout serializer;

    public final void serializer(TextInputLayout textInputLayout) {
        EndCompoundLayout endCompoundLayout = this.serializer;
        TestModifierUpdaterLayout testModifierUpdaterLayout = endCompoundLayout.serializer;
        if (endCompoundLayout.IconCompatParcelizer == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = endCompoundLayout.IconCompatParcelizer;
        if (editText != null) {
            editText.removeTextChangedListener(testModifierUpdaterLayout);
            if (endCompoundLayout.IconCompatParcelizer.getOnFocusChangeListener() == endCompoundLayout.getEndIconDelegate().read()) {
                endCompoundLayout.IconCompatParcelizer.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        endCompoundLayout.IconCompatParcelizer = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(testModifierUpdaterLayout);
        }
        endCompoundLayout.getEndIconDelegate().write(endCompoundLayout.IconCompatParcelizer);
        endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
    }

    public TestModifierUpdaterKt(EndCompoundLayout endCompoundLayout) {
        this.serializer = endCompoundLayout;
    }
}
