package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getBottomPaddingui_textannotations {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final int IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;

    public getBottomPaddingui_textannotations(String str, int i, boolean z, boolean z2) {
        str.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.IconCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.read);
        int i4 = MediaMetadataCompat + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static getBottomPaddingui_textannotations serializer(getBottomPaddingui_textannotations getbottompaddingui_textannotations, String str, boolean z, boolean z2, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = MediaMetadataCompat + 29;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 93;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str = getbottompaddingui_textannotations.serializer;
        }
        if ((i2 & 2) != 0) {
            z = getbottompaddingui_textannotations.RemoteActionCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            z2 = getbottompaddingui_textannotations.read;
        }
        if ((i2 & 8) != 0) {
            i = getbottompaddingui_textannotations.IconCompatParcelizer;
        }
        str.getClass();
        return new getBottomPaddingui_textannotations(str, i, z, z2);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 61;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("LastStopMapPinUiState(hint=", this.serializer, ", isMoving=", ", hintVisible=", this.RemoteActionCompatParcelizer);
        sbM.append(this.read);
        sbM.append(", safeAreaOffset=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 29;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBottomPaddingui_textannotations)) {
            return false;
        }
        getBottomPaddingui_textannotations getbottompaddingui_textannotations = (getBottomPaddingui_textannotations) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getbottompaddingui_textannotations.serializer}, getCieXyz.write())).booleanValue()) {
            int i3 = write + 63;
            MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (this.RemoteActionCompatParcelizer != getbottompaddingui_textannotations.RemoteActionCompatParcelizer) {
            int i5 = MediaMetadataCompat + 53;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i6;
            boolean z = i5 % 2 != 0;
            int i7 = i6 + 67;
            MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return z;
        }
        if (this.read != getbottompaddingui_textannotations.read) {
            int i9 = MediaMetadataCompat + 37;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.IconCompatParcelizer == getbottompaddingui_textannotations.IconCompatParcelizer) {
            return true;
        }
        int i10 = MediaMetadataCompat + 123;
        write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
