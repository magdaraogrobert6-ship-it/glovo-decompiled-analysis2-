package o;

import android.net.Uri;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class isEmimpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final Uri read;
    public final String serializer;
    public final LayoutDirection write;

    public isEmimpl(Uri uri, String str, LayoutDirection layoutDirection) {
        this.read = uri;
        this.serializer = str;
        this.write = layoutDirection;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode() % af$$ExternalSyntheticOutline0.m(this.read.hashCode() % 35, 62, this.serializer);
        } else {
            iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.serializer);
        }
        int i3 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public static isEmimpl RemoteActionCompatParcelizer(isEmimpl isemimpl, Uri uri, String str, LayoutDirection layoutDirection, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            uri = isemimpl.read;
        }
        if ((i & 2) != 0) {
            int i3 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                str = isemimpl.serializer;
                int i4 = 3 / 0;
            } else {
                str = isemimpl.serializer;
            }
        }
        if ((i & 4) != 0) {
            layoutDirection = isemimpl.write;
            int i5 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        isemimpl.getClass();
        uri.getClass();
        str.getClass();
        layoutDirection.getClass();
        isEmimpl isemimpl2 = new isEmimpl(uri, str, layoutDirection);
        int i7 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return isemimpl2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InAppCameraWithTagsUiState(clickedPictureUri=" + this.read + ", pictureOutputFilePath=" + this.serializer + ", pictureTags=" + this.write + ")";
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isEmimpl)) {
            return false;
        }
        isEmimpl isemimpl = (isEmimpl) obj;
        if (!this.read.equals(isemimpl.read)) {
            return false;
        }
        if (this.serializer.equals(isemimpl.serializer)) {
            return this.write.equals(isemimpl.write);
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
