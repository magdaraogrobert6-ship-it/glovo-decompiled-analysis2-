package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.socket.emitter.Emitter;

/* JADX INFO: loaded from: classes3.dex */
public final class getMaxHeight implements resizeToBitmapDimensionslambda0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final Emitter IconCompatParcelizer;
    public final Emitter RemoteActionCompatParcelizer;
    public final String read;
    public final Emitter serializer;
    public final String write;

    public getMaxHeight(String str, String str2, Emitter emitter, Emitter emitter2, Emitter emitter3) {
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = emitter;
        this.serializer = emitter2;
        this.IconCompatParcelizer = emitter3;
    }

    public static getMaxHeight read(getMaxHeight getmaxheight, String str, String str2, Emitter emitter, Emitter emitter2, Emitter emitter3, int i) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 95;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = getmaxheight.write;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = getmaxheight.read;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            emitter = getmaxheight.RemoteActionCompatParcelizer;
        }
        Emitter emitter4 = emitter;
        if ((i & 8) != 0) {
            int i5 = i4 + 73;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            emitter2 = getmaxheight.serializer;
        }
        Emitter emitter5 = emitter2;
        if ((i & 16) != 0) {
            int i7 = MediaDescriptionCompat + 13;
            MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                Emitter emitter6 = getmaxheight.IconCompatParcelizer;
                throw null;
            }
            emitter3 = getmaxheight.IconCompatParcelizer;
        }
        getMaxHeight getmaxheight2 = new getMaxHeight(str3, str4, emitter4, emitter5, emitter3);
        int i8 = MediaDescriptionCompat + 79;
        MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return getmaxheight2;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 57;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            this.write.hashCode();
            throw null;
        }
        int iHashCode = this.write.hashCode();
        String str = this.read;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i4 = MediaDescriptionCompat + 57;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode3 + (((iHashCode * 31) + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DiagnosticsUiState(title=", this.write, ", subtitle=", this.read, ", appPermissionState=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", deviceConfirmationState=");
        sbM.append(this.serializer);
        sbM.append(", testNotificationState=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 27;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (obj instanceof getMaxHeight) {
                getMaxHeight getmaxheight = (getMaxHeight) obj;
                if (!this.write.equals(getmaxheight.write)) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getmaxheight.read}, getCieXyz.write())).booleanValue()) {
                    if (!this.RemoteActionCompatParcelizer.equals(getmaxheight.RemoteActionCompatParcelizer) || !this.serializer.equals(getmaxheight.serializer) || (!this.IconCompatParcelizer.equals(getmaxheight.IconCompatParcelizer))) {
                        return false;
                    }
                } else {
                    int i5 = MediaDescriptionCompat + 101;
                    MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        return false;
                    }
                    int i6 = 4 / 3;
                    return false;
                }
            } else {
                int i7 = i3 + 25;
                MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
        }
        return true;
    }
}
