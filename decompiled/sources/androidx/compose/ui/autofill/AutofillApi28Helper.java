package androidx.compose.ui.autofill;

import android.view.ViewStructure;

/* JADX INFO: loaded from: classes4.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    public final void setMaxTextLength(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }
}
