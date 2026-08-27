package androidx.compose.ui.autofill;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class AutofillSemanticCallback extends android.view.autofill.AutofillManager.AutofillCallback {
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();
    public static final int $stable = 8;

    private AutofillSemanticCallback() {
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
    }

    public final void register(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        platformAutofillManager.getClass();
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().registerCallback(this);
    }

    public final void unregister(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        platformAutofillManager.getClass();
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().unregisterCallback(this);
    }
}
