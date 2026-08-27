package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ListPreferenceSavedState implements NavControllerImplExternalSyntheticLambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String read;
    public final EditTextPreferenceDialogFragment write;

    public ListPreferenceSavedState(String str, String str2, EditTextPreferenceDialogFragment editTextPreferenceDialogFragment) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = editTextPreferenceDialogFragment;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() % af$$ExternalSyntheticOutline0.m(this.read.hashCode() >> 105, 64, this.IconCompatParcelizer);
        } else {
            iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer);
        }
        int i3 = RemoteActionCompatParcelizer + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("StartTutorial(title=", this.read, ", description=", this.IconCompatParcelizer, ", action=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 1;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListPreferenceSavedState) {
            ListPreferenceSavedState listPreferenceSavedState = (ListPreferenceSavedState) obj;
            Object[] objArr = {this.read, listPreferenceSavedState.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.IconCompatParcelizer, listPreferenceSavedState.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.write.equals(listPreferenceSavedState.write)) {
                    return true;
                }
            }
        }
        int i3 = serializer + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
