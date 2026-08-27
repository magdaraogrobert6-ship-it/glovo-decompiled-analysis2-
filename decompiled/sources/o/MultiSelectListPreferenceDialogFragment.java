package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiSelectListPreferenceDialogFragment implements ListPreference {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final MultiSelectListPreferenceSavedState write;

    public MultiSelectListPreferenceDialogFragment(String str, String str2, String str3, MultiSelectListPreferenceSavedState multiSelectListPreferenceSavedState, String str4) {
        str.getClass();
        str3.getClass();
        multiSelectListPreferenceSavedState.getClass();
        str4.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
        this.write = multiSelectListPreferenceSavedState;
        this.IconCompatParcelizer = str4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int iHashCode = this.IconCompatParcelizer.hashCode() + ((this.write.hashCode() + iM) * 31);
        int i4 = MediaMetadataCompat + 125;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 21;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderProfile(name=", this.read, ", subtitle=", this.RemoteActionCompatParcelizer, ", status=");
        sbM.append(this.serializer);
        sbM.append(", style=");
        sbM.append(this.write);
        sbM.append(", imageUrl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ")");
        int i4 = MediaSessionCompatQueueItem + 67;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 61;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectListPreferenceDialogFragment)) {
            return false;
        }
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = (MultiSelectListPreferenceDialogFragment) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, multiSelectListPreferenceDialogFragment.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.equals(multiSelectListPreferenceDialogFragment.RemoteActionCompatParcelizer)) {
            int i3 = MediaSessionCompatQueueItem + 89;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, multiSelectListPreferenceDialogFragment.serializer}, getCieXyz.write())).booleanValue() || this.write != multiSelectListPreferenceDialogFragment.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, multiSelectListPreferenceDialogFragment.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
