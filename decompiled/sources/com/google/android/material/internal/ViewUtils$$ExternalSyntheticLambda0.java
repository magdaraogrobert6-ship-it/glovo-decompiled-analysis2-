package com.google.android.material.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ View RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ ViewUtils$$ExternalSyntheticLambda0(int i, View view) {
        this.write = i;
        this.RemoteActionCompatParcelizer = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        View view = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
            return;
        }
        int i2 = 0;
        if (i == 1) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        } else if (i == 2) {
            view.requestFocus();
        } else {
            view.requestFocus();
            view.post(new ViewUtils$$ExternalSyntheticLambda0(i2, view));
        }
    }
}
