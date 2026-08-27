package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPaddingWidth {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final long read;
    public final int serializer;
    public final long write;

    public getPaddingWidth(long j, long j2, int i) {
        this.serializer = i;
        this.write = j;
        this.read = j2;
    }

    public final int hashCode() {
        int iM729hashCodeimpl;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) * MediaSessionCompatQueueItem.IconCompatParcelizer(Integer.hashCode(this.serializer) >> 70, 66, this.write);
        } else {
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.read) + MediaSessionCompatQueueItem.IconCompatParcelizer(Integer.hashCode(this.serializer) * 31, 31, this.write);
        }
        int i3 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return iM729hashCodeimpl;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM730toStringimpl = androidx.compose.ui.graphics.Color.m730toStringimpl(this.write);
        String strM = ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("StatusStyle(icon=", this.serializer, ", iconTint=", strM730toStringimpl, ", textColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.read), ")");
        int i4 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getPaddingWidth) {
            getPaddingWidth getpaddingwidth = (getPaddingWidth) obj;
            if (this.serializer == getpaddingwidth.serializer) {
                if (androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, getpaddingwidth.write)) {
                    if (androidx.compose.ui.graphics.Color.m723equalsimpl0(this.read, getpaddingwidth.read)) {
                        return true;
                    }
                } else {
                    int i2 = RemoteActionCompatParcelizer + 65;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                }
            }
        }
        int i4 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
