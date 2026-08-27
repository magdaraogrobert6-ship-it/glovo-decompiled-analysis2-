package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceGroupSavedState implements PreferenceOnPreferenceCopyListener {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final setDividerHeight write;

    public PreferenceGroupSavedState(String str, String str2, setDividerHeight setdividerheight) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = setdividerheight;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        setDividerHeight setdividerheight = this.write;
        if (setdividerheight == null) {
            int i5 = read + 19;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = setdividerheight.hashCode();
            int i7 = IconCompatParcelizer + 27;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SuspendedState(title=", this.serializer, ", description=", this.RemoteActionCompatParcelizer, ", action=");
        sbM.append(this.write);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 119;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferenceGroupSavedState)) {
            int i4 = i2 + 101;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        PreferenceGroupSavedState preferenceGroupSavedState = (PreferenceGroupSavedState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, preferenceGroupSavedState.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, preferenceGroupSavedState.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, preferenceGroupSavedState.write}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = read + 77;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
