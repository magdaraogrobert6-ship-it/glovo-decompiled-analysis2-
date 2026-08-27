package androidx.preference;

import android.app.AlertDialog;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o.findFirstCubicRoot;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    CharSequence[] IconCompatParcelizer;
    public CharSequence[] RemoteActionCompatParcelizer;
    public boolean read;
    public Set<String> serializer = new HashSet();

    @Deprecated
    public static MultiSelectListPreferenceDialogFragment IconCompatParcelizer(String str) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void read(AlertDialog.Builder builder) {
        super.read(builder);
        int length = this.RemoteActionCompatParcelizer.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.serializer.contains(this.RemoteActionCompatParcelizer[i].toString());
        }
        builder.setMultiChoiceItems(this.IconCompatParcelizer, zArr, new findFirstCubicRoot(this));
    }

    private MultiSelectListPreference serializer() {
        return (MultiSelectListPreference) IconCompatParcelizer();
    }

    @Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList<>(this.serializer));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.read);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.IconCompatParcelizer);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void RemoteActionCompatParcelizer(boolean z) {
        MultiSelectListPreference multiSelectListPreferenceSerializer = serializer();
        if (z && this.read) {
            Set<String> set = this.serializer;
            multiSelectListPreferenceSerializer.getClass();
            multiSelectListPreferenceSerializer.serializer(set);
        }
        this.read = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.serializer.clear();
            this.serializer.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
            this.read = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
            this.IconCompatParcelizer = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
            this.RemoteActionCompatParcelizer = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceSerializer = serializer();
        CharSequence[] charSequenceArr = multiSelectListPreferenceSerializer.RatingCompat;
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceSerializer.MediaSessionCompatQueueItem;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.serializer.clear();
        this.serializer.addAll(multiSelectListPreferenceSerializer.MediaDescriptionCompat);
        this.read = false;
        this.IconCompatParcelizer = multiSelectListPreferenceSerializer.RatingCompat;
        this.RemoteActionCompatParcelizer = charSequenceArr2;
    }
}
