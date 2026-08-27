package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog IconCompatParcelizer;
    private DialogInterface.OnCancelListener RemoteActionCompatParcelizer;
    private Dialog serializer;

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    public static ErrorDialogFragment write(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        accessgetSystemNavigationDowncp.serializer(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errorDialogFragment.serializer = dialog;
        if (onCancelListener != null) {
            errorDialogFragment.RemoteActionCompatParcelizer = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.RemoteActionCompatParcelizer;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.serializer;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.IconCompatParcelizer == null) {
            Activity activity = getActivity();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(activity);
            this.IconCompatParcelizer = new AlertDialog.Builder(activity).create();
        }
        return this.IconCompatParcelizer;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
