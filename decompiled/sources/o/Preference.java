package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class Preference {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final Type IconCompatParcelizer;
    public final ListPreferenceDialogFragment RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final Integer write;

    public Preference(String str, String str2, Integer num, ListPreferenceDialogFragment listPreferenceDialogFragment, Type type) {
        str.getClass();
        str2.getClass();
        type.getClass();
        this.serializer = str;
        this.read = str2;
        this.write = num;
        this.RemoteActionCompatParcelizer = listPreferenceDialogFragment;
        this.IconCompatParcelizer = type;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[PHI: r1 r4
  0x0042: PHI (r1v14 int) = (r1v7 int), (r1v18 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r4v9 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v11 java.lang.Integer) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v18 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        Integer num;
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 21, 124, this.read);
            num = this.write;
            if (num == null) {
                int i3 = MediaSessionCompatQueueItem + 121;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read);
            num = this.write;
            if (num == null) {
                int i5 = MediaSessionCompatQueueItem + 121;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
        }
        ListPreferenceDialogFragment listPreferenceDialogFragment = this.RemoteActionCompatParcelizer;
        return this.IconCompatParcelizer.hashCode() + ((((iM + iHashCode) * 31) + (listPreferenceDialogFragment != null ? listPreferenceDialogFragment.hashCode() : 0)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RiderStatistic(label=", this.serializer, ", value=", this.read, ", icon=");
        sbM.append(this.write);
        sbM.append(", action=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", type=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 41;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 13;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof Preference)) {
            int i6 = i3 + 59;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        Preference preference = (Preference) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, preference.serializer}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaDescriptionCompat + 9;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, preference.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, preference.write}, getCieXyz.write())).booleanValue()) {
            int i9 = MediaDescriptionCompat + 79;
            MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, preference.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i11 = MediaSessionCompatQueueItem + 1;
            MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i11 % 2 == 0;
        }
        if (this.IconCompatParcelizer == preference.IconCompatParcelizer) {
            return true;
        }
        int i12 = MediaDescriptionCompat + 63;
        MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return false;
    }
}
