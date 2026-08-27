package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class EditTextPreferenceDialogFragment {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final EditTextPreferenceSavedState read;
    public final String serializer;
    public final String write;

    public EditTextPreferenceDialogFragment(String str, String str2, EditTextPreferenceSavedState editTextPreferenceSavedState) {
        str.getClass();
        str2.getClass();
        editTextPreferenceSavedState.getClass();
        this.serializer = str;
        this.write = str2;
        this.read = editTextPreferenceSavedState;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.read.hashCode() % af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 127, 83, this.write);
        } else {
            iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write);
        }
        int i3 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Action(text=", this.serializer, ", url=", this.write, ", navigationType=");
            sbM.append(this.read);
            sbM.append(")");
            String string = sbM.toString();
            int i3 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return string;
        }
        StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("Action(text=", this.serializer, ", url=", this.write, ", navigationType=");
        sbM2.append(this.read);
        sbM2.append(")");
        sbM2.toString();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextPreferenceDialogFragment)) {
            return false;
        }
        EditTextPreferenceDialogFragment editTextPreferenceDialogFragment = (EditTextPreferenceDialogFragment) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, editTextPreferenceDialogFragment.serializer}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, editTextPreferenceDialogFragment.write}, getCieXyz.write())).booleanValue()) {
                return this.read == editTextPreferenceDialogFragment.read;
            }
            int i4 = IconCompatParcelizer + 29;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        int i5 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i5 % 2 == 0;
    }
}
