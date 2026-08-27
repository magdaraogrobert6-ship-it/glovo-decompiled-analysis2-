package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public AlertDialog getNavigationEventDispatcher;
    public DialogInterface.OnCancelListener getOnBackPressedDispatcher;
    public Dialog getSavedStateRegistry;

    public static SupportErrorDialogFragment read(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        accessgetSystemNavigationDowncp.serializer(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supportErrorDialogFragment.getSavedStateRegistry = dialog;
        if (onCancelListener != null) {
            supportErrorDialogFragment.getOnBackPressedDispatcher = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.getOnBackPressedDispatcher;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        Dialog dialog = this.getSavedStateRegistry;
        if (dialog != null) {
            return dialog;
        }
        this.PlaybackStateCompat = false;
        if (this.getNavigationEventDispatcher == null) {
            Context context = getContext();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            this.getNavigationEventDispatcher = new AlertDialog.Builder(context).create();
        }
        return this.getNavigationEventDispatcher;
    }
}
