package o;

import android.text.Editable;
import com.google.android.material.textfield.EndCompoundLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdaterLayout extends accessgetTookFromPrecomposeMapcp {
    public final /* synthetic */ EndCompoundLayout RemoteActionCompatParcelizer;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.RemoteActionCompatParcelizer.getEndIconDelegate().afterEditTextChanged();
    }

    @Override // o.accessgetTookFromPrecomposeMapcp, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.RemoteActionCompatParcelizer.getEndIconDelegate().MediaDescriptionCompat();
    }

    public TestModifierUpdaterLayout(EndCompoundLayout endCompoundLayout) {
        this.RemoteActionCompatParcelizer = endCompoundLayout;
    }
}
