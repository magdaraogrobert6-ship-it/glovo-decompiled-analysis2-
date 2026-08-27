package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class copy2BkPm_wdefault extends copyNcG25M8default {
    private static int RatingCompat = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public copy2BkPm_wdefault(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    public final String toString() {
        String strSerializer;
        int i = 2 % 2;
        int i2 = write + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strSerializer = MediaSessionCompatQueueItem.serializer(c8$$ExternalSyntheticOutline0.m("Toggle(title=", this.read, ", description=", this.serializer, ", isChecked="), this.IconCompatParcelizer, ", isInteractionEnabled=", this.RemoteActionCompatParcelizer, ")");
            int i3 = 44 / 0;
        } else {
            strSerializer = MediaSessionCompatQueueItem.serializer(c8$$ExternalSyntheticOutline0.m("Toggle(title=", this.read, ", description=", this.serializer, ", isChecked="), this.IconCompatParcelizer, ", isInteractionEnabled=", this.RemoteActionCompatParcelizer, ")");
        }
        int i4 = RatingCompat + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.read.hashCode();
        String str = this.serializer;
        if (str == null) {
            int i2 = RatingCompat + 109;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i3;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
            int i4 = i3 + 55;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 9;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof copy2BkPm_wdefault)) {
                int i6 = i4 + 105;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            copy2BkPm_wdefault copy2bkpm_wdefault = (copy2BkPm_wdefault) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, copy2bkpm_wdefault.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, copy2bkpm_wdefault.serializer}, getCieXyz.write())).booleanValue()) {
                return this.IconCompatParcelizer == copy2bkpm_wdefault.IconCompatParcelizer && this.RemoteActionCompatParcelizer == copy2bkpm_wdefault.RemoteActionCompatParcelizer;
            }
            int i8 = write + 27;
            RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = i2 + 39;
        int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i11;
        boolean z = i10 % 2 == 0;
        int i12 = i11 + 41;
        RatingCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return z;
    }
}
