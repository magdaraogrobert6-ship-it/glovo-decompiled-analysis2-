package o;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes4.dex */
public final class quadraticToMonotonicQuadratics implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.preference.TwoStatePreference write;

    public /* synthetic */ quadraticToMonotonicQuadratics(androidx.preference.TwoStatePreference twoStatePreference, int i) {
        this.IconCompatParcelizer = i;
        this.write = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.IconCompatParcelizer;
        androidx.preference.TwoStatePreference twoStatePreference = this.write;
        if (i == 0) {
            ((androidx.preference.SwitchPreference) twoStatePreference).RemoteActionCompatParcelizer(z);
        } else if (i != 1) {
            ((androidx.preference.SwitchPreferenceCompat) twoStatePreference).RemoteActionCompatParcelizer(z);
        } else {
            ((androidx.preference.CheckBoxPreference) twoStatePreference).RemoteActionCompatParcelizer(z);
        }
    }
}
