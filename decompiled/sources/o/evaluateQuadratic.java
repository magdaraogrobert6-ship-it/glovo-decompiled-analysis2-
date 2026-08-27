package o;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes4.dex */
public final class evaluateQuadratic implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ androidx.preference.DropDownPreference RemoteActionCompatParcelizer;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            androidx.preference.DropDownPreference dropDownPreference = this.RemoteActionCompatParcelizer;
            String string = dropDownPreference.MediaSessionCompatResultReceiverWrapper[i].toString();
            if (string.equals(dropDownPreference.PlaybackStateCompatCustomAction)) {
                return;
            }
            dropDownPreference.write(string);
        }
    }

    public evaluateQuadratic(androidx.preference.DropDownPreference dropDownPreference) {
        this.RemoteActionCompatParcelizer = dropDownPreference;
    }
}
