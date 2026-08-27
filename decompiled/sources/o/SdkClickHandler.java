package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkClickHandler implements buildResponseData {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final Integer IconCompatParcelizer;
    public final Uri RemoteActionCompatParcelizer;
    public final String read;
    public final ResponseData1 serializer;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 3;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.IconCompatParcelizer;
        int i4 = i2 + 47;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 105;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 27;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ResponseData1 responseData1 = this.serializer;
        int i5 = i2 + 113;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return responseData1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SdkClickHandler(String str, Uri uri, ResponseData1 responseData1, Integer num) {
        str.getClass();
        responseData1.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = uri;
        this.serializer = responseData1;
        this.IconCompatParcelizer = num;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.serializer.hashCode();
        Integer num = this.IconCompatParcelizer;
        if (num == null) {
            int i4 = write + 7;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i6 = MediaSessionCompatQueueItem + 17;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = ((iHashCode4 + ((iHashCode3 + (iHashCode2 * 31)) * 31)) * 31) + iHashCode;
        int i9 = write + 45;
        MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return i8;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenLink(text=" + this.read + ", uri=" + this.RemoteActionCompatParcelizer + ", style=" + this.serializer + ", icon=" + this.IconCompatParcelizer + ")";
        int i2 = MediaSessionCompatQueueItem + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkClickHandler)) {
            return false;
        }
        SdkClickHandler sdkClickHandler = (SdkClickHandler) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, sdkClickHandler.read}, getCieXyz.write())).booleanValue()) {
            if (this.RemoteActionCompatParcelizer.equals(sdkClickHandler.RemoteActionCompatParcelizer)) {
                if (this.serializer != sdkClickHandler.serializer) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, sdkClickHandler.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            i = write + 49;
            MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            i = MediaSessionCompatQueueItem + 7;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return false;
    }
}
