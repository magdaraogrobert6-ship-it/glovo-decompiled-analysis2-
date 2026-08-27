package androidx.compose.ui.autofill;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public interface Autofill {
    void cancelAutofillForNode(AutofillNode autofillNode);

    void requestAutofillForNode(AutofillNode autofillNode);
}
