package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import o.PlaceableKt;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public final void RemoteActionCompatParcelizer() {
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog instanceof PlaceableKt) {
            ((PlaceableKt) dialog).IconCompatParcelizer().isHideable();
        }
        super.RemoteActionCompatParcelizer();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog write(Bundle bundle) {
        return new PlaceableKt(getContext(), w_());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void write() {
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog instanceof PlaceableKt) {
            ((PlaceableKt) dialog).IconCompatParcelizer().isHideable();
        }
        read(false, false);
    }
}
