package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import o.EdgeToEdgeExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog write(Bundle bundle) {
        return new EdgeToEdgeExternalSyntheticLambda0(getContext(), w_());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void RemoteActionCompatParcelizer(Dialog dialog, int i) {
        if (!(dialog instanceof EdgeToEdgeExternalSyntheticLambda0)) {
            super.RemoteActionCompatParcelizer(dialog, i);
            return;
        }
        EdgeToEdgeExternalSyntheticLambda0 edgeToEdgeExternalSyntheticLambda0 = (EdgeToEdgeExternalSyntheticLambda0) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        edgeToEdgeExternalSyntheticLambda0.RemoteActionCompatParcelizer(1);
    }
}
