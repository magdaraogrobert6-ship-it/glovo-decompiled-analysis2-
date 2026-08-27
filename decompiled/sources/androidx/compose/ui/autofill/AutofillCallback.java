package androidx.compose.ui.autofill;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class AutofillCallback extends android.view.autofill.AutofillManager.AutofillCallback {
    public static final AutofillCallback INSTANCE = new AutofillCallback();
    public static final int $stable = 8;

    private AutofillCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
    }

    public final void register(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().registerCallback(this);
    }

    public final void unregister(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().unregisterCallback(this);
    }
}
