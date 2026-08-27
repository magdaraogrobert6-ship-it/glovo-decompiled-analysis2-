package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH extends getStrokeLineCapCSYIeUk {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(String str, String str2, String str3, String str4) {
        this.serializer = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 73;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CopyText(message=", this.serializer, ", actionLabel=", this.write, ", url="), this.IconCompatParcelizer, ", toastMessage=", this.read, ")");
            int i3 = RemoteActionCompatParcelizer + 99;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CopyText(message=", this.serializer, ", actionLabel=", this.write, ", url="), this.IconCompatParcelizer, ", toastMessage=", this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer);
        int i4 = RemoteActionCompatParcelizer + 59;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH)) {
                return false;
            }
            getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH getstyleable_vector_drawable_viewport_width = (getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH) obj;
            if (!this.serializer.equals(getstyleable_vector_drawable_viewport_width.serializer)) {
                return false;
            }
            if (this.write.equals(getstyleable_vector_drawable_viewport_width.write)) {
                if (!this.IconCompatParcelizer.equals(getstyleable_vector_drawable_viewport_width.IconCompatParcelizer) || (!this.read.equals(getstyleable_vector_drawable_viewport_width.read))) {
                    return false;
                }
            } else {
                int i4 = MediaSessionCompatQueueItem + 15;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 4 / 2;
                return false;
            }
        }
        return true;
    }
}
