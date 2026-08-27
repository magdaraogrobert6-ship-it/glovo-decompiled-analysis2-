package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class EditTextPreferenceDialogFragment extends PreferenceDialogFragment {
    private CharSequence RemoteActionCompatParcelizer;
    private EditText read;

    @Deprecated
    public EditTextPreferenceDialogFragment() {
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public boolean write() {
        return true;
    }

    @Deprecated
    public static EditTextPreferenceDialogFragment serializer(String str) {
        EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = new EditTextPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        editTextPreferenceDialogFragment.setArguments(bundle);
        return editTextPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void RemoteActionCompatParcelizer(boolean z) {
        if (z) {
            String string = this.read.getText().toString();
            read().getClass();
            read().read(string);
        }
    }

    private EditTextPreference read() {
        return (EditTextPreference) IconCompatParcelizer();
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.RemoteActionCompatParcelizer = read().MediaSessionCompatQueueItem;
        } else {
            this.RemoteActionCompatParcelizer = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void IconCompatParcelizer(View view) {
        super.IconCompatParcelizer(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.read = editText;
        editText.requestFocus();
        EditText editText2 = this.read;
        if (editText2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText2.setText(this.RemoteActionCompatParcelizer);
        EditText editText3 = this.read;
        editText3.setSelection(editText3.getText().length());
    }
}
