package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidTypefaceCache {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public AndroidTypefaceCache(String str, String str2, String str3, String str4) {
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SettingsDialog(title=", this.IconCompatParcelizer, ", message=", this.serializer, ", affirmativeActionTitle="), this.write, ", dismissActionTitle=", this.RemoteActionCompatParcelizer, ")");
        int i4 = read + 19;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 107;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.serializer), 31, this.write);
        int i4 = MediaDescriptionCompat + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidTypefaceCache) {
            AndroidTypefaceCache androidTypefaceCache = (AndroidTypefaceCache) obj;
            if (this.IconCompatParcelizer.equals(androidTypefaceCache.IconCompatParcelizer) && this.serializer.equals(androidTypefaceCache.serializer) && this.write.equals(androidTypefaceCache.write) && this.RemoteActionCompatParcelizer.equals(androidTypefaceCache.RemoteActionCompatParcelizer)) {
                return true;
            }
        }
        int i4 = read + 51;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
