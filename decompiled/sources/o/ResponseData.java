package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ResponseData implements buildResponseData {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final Integer IconCompatParcelizer;
    public final ResponseData1 read;
    public final Uri serializer;
    public final String write;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.IconCompatParcelizer;
        int i4 = i3 + 51;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return num;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        throw null;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 79;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResponseData(String str, Uri uri, ResponseData1 responseData1, Integer num) {
        str.getClass();
        responseData1.getClass();
        this.write = str;
        this.serializer = uri;
        this.read = responseData1;
        this.IconCompatParcelizer = num;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        int iHashCode4 = this.read.hashCode();
        Integer num = this.IconCompatParcelizer;
        if (num == null) {
            int i2 = RemoteActionCompatParcelizer + 67;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int i4 = ((iHashCode4 + ((iHashCode3 + (iHashCode2 * 31)) * 31)) * 31) + iHashCode;
        int i5 = RemoteActionCompatParcelizer + 51;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenDeepLink(text=" + this.write + ", uri=" + this.serializer + ", style=" + this.read + ", icon=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 117;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 9;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof ResponseData)) {
                return false;
            }
            ResponseData responseData = (ResponseData) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, responseData.write}, getCieXyz.write())).booleanValue() || !this.serializer.equals(responseData.serializer) || this.read != responseData.read) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, responseData.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
