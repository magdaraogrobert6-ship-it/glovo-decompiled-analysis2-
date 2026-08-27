package o;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class findDerivativeRoots implements DialogInterface.OnClickListener {
    public final /* synthetic */ androidx.preference.ListPreferenceDialogFragment serializer;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        androidx.preference.ListPreferenceDialogFragment listPreferenceDialogFragment = this.serializer;
        listPreferenceDialogFragment.IconCompatParcelizer = i;
        listPreferenceDialogFragment.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }

    public findDerivativeRoots(androidx.preference.ListPreferenceDialogFragment listPreferenceDialogFragment) {
        this.serializer = listPreferenceDialogFragment;
    }
}
