package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ListPreferenceDialogFragment {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final PreferenceCategory read;
    public final String serializer;

    public ListPreferenceDialogFragment(String str, String str2, PreferenceCategory preferenceCategory) {
        str.getClass();
        str2.getClass();
        preferenceCategory.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = preferenceCategory;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int i4 = write + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Action(url=", this.serializer, ", title=", this.RemoteActionCompatParcelizer, ", navigationType=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListPreferenceDialogFragment)) {
            return false;
        }
        ListPreferenceDialogFragment listPreferenceDialogFragment = (ListPreferenceDialogFragment) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, listPreferenceDialogFragment.serializer}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, listPreferenceDialogFragment.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.read == listPreferenceDialogFragment.read) {
                return true;
            }
            int i4 = IconCompatParcelizer + 109;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 107;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
