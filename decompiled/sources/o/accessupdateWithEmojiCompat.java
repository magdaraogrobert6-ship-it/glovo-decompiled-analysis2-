package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessupdateWithEmojiCompat extends asExecutor {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final boolean write;

    public accessupdateWithEmojiCompat(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = z;
        this.serializer = str3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 75;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write);
        int i4 = MediaMetadataCompat + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DeliveryNotes(title=", this.IconCompatParcelizer, ", notes=", this.RemoteActionCompatParcelizer, ", isTranslationEnabled=");
        sbM.append(this.write);
        sbM.append(", translationTitle=");
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 119;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 93;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 21;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof accessupdateWithEmojiCompat)) {
                return false;
            }
            accessupdateWithEmojiCompat accessupdatewithemojicompat = (accessupdateWithEmojiCompat) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, accessupdatewithemojicompat.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, accessupdatewithemojicompat.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.write != accessupdatewithemojicompat.write) {
                int i6 = read + 45;
                MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            if (!this.serializer.equals(accessupdatewithemojicompat.serializer)) {
                return false;
            }
        }
        return true;
    }
}
