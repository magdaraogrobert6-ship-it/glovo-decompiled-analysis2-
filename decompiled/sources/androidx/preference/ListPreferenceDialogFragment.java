package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.findDerivativeRoots;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ListPreferenceDialogFragment extends PreferenceDialogFragment {
    public int IconCompatParcelizer;
    private CharSequence[] read;
    private CharSequence[] serializer;

    @Deprecated
    public ListPreferenceDialogFragment() {
    }

    @Deprecated
    public static ListPreferenceDialogFragment serializer(String str) {
        ListPreferenceDialogFragment listPreferenceDialogFragment = new ListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragment.setArguments(bundle);
        return listPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void read(AlertDialog.Builder builder) {
        super.read(builder);
        builder.setSingleChoiceItems(this.read, this.IconCompatParcelizer, new findDerivativeRoots(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    private ListPreference serializer() {
        return (ListPreference) IconCompatParcelizer();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.IconCompatParcelizer = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.read = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.serializer = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceSerializer = serializer();
        CharSequence[] charSequenceArr = listPreferenceSerializer.MediaDescriptionCompat;
        CharSequence[] charSequenceArr2 = listPreferenceSerializer.MediaSessionCompatResultReceiverWrapper;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.IconCompatParcelizer = listPreferenceSerializer.IconCompatParcelizer(listPreferenceSerializer.PlaybackStateCompatCustomAction);
        this.read = listPreferenceSerializer.MediaDescriptionCompat;
        this.serializer = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.IconCompatParcelizer);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.read);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.serializer);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void RemoteActionCompatParcelizer(boolean z) {
        int i;
        ListPreference listPreferenceSerializer = serializer();
        if (!z || (i = this.IconCompatParcelizer) < 0) {
            return;
        }
        String string = this.serializer[i].toString();
        listPreferenceSerializer.getClass();
        listPreferenceSerializer.write(string);
    }
}
