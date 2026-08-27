package o;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class findFirstCubicRoot implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ androidx.preference.MultiSelectListPreferenceDialogFragment write;

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = this.write;
        boolean z2 = multiSelectListPreferenceDialogFragment.read;
        if (z) {
            multiSelectListPreferenceDialogFragment.read = multiSelectListPreferenceDialogFragment.serializer.add(multiSelectListPreferenceDialogFragment.RemoteActionCompatParcelizer[i].toString()) | z2;
        } else {
            multiSelectListPreferenceDialogFragment.read = multiSelectListPreferenceDialogFragment.serializer.remove(multiSelectListPreferenceDialogFragment.RemoteActionCompatParcelizer[i].toString()) | z2;
        }
    }

    public findFirstCubicRoot(androidx.preference.MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment) {
        this.write = multiSelectListPreferenceDialogFragment;
    }
}
