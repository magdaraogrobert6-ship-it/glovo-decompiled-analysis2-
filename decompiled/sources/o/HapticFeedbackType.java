package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class HapticFeedbackType {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public HapticFeedbackType(int i, int i2, String str, String str2, String str3) {
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str2;
        this.write = str3;
        this.IconCompatParcelizer = i2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 69;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("NotificationChannel(id=", this.RemoteActionCompatParcelizer, this.read, ", color=", ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", importance=4, light=true, name=", this.write, ", sound=");
        String strM = af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, ", vibration=true)", sbM);
        int i4 = MediaMetadataCompat + 25;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(true) + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(4, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.read.hashCode() * 31, 31), 31, this.serializer), 31), 31, true), 31, this.write), 31);
        int i4 = MediaSessionCompatQueueItem + 101;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 7;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof HapticFeedbackType)) {
            return false;
        }
        HapticFeedbackType hapticFeedbackType = (HapticFeedbackType) obj;
        if (!this.read.equals(hapticFeedbackType.read) || this.RemoteActionCompatParcelizer != hapticFeedbackType.RemoteActionCompatParcelizer || !this.serializer.equals(hapticFeedbackType.serializer) || !this.write.equals(hapticFeedbackType.write) || this.IconCompatParcelizer != hapticFeedbackType.IconCompatParcelizer) {
            return false;
        }
        int i5 = MediaSessionCompatQueueItem + 99;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
