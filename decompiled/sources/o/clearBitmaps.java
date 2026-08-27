package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class clearBitmaps {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String read;
    public final int serializer;

    public clearBitmaps(int i, String str, String str2) {
        this.serializer = i;
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("Group(icon=", this.serializer, ", title=", this.read, ", buttonIcon=2131231040, additionalInfo="), this.IconCompatParcelizer, ")");
        int i4 = write + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_up, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) * 31, 31, this.read), 31);
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = RemoteActionCompatParcelizer + 61;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 57;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof clearBitmaps)) {
            return false;
        }
        clearBitmaps clearbitmaps = (clearBitmaps) obj;
        if (this.serializer != clearbitmaps.serializer || !this.read.equals(clearbitmaps.read)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, clearbitmaps.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
