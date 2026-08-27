package o;

/* JADX INFO: loaded from: classes3.dex */
public final class retrySendingI implements buildResponseData {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final ResponseData1 RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final Integer write;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        Integer num = this.write;
        int i5 = i3 + 55;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        ResponseData1 responseData1 = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 85;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return responseData1;
        }
        obj.hashCode();
        throw null;
    }

    public retrySendingI(String str, ResponseData1 responseData1, Integer num, boolean z) {
        str.getClass();
        responseData1.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = responseData1;
        this.write = num;
        this.read = z;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 117;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Integer num = this.write;
        if (num == null) {
            i = 0;
        } else {
            int iHashCode3 = num.hashCode();
            int i5 = IconCompatParcelizer + 13;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return Boolean.hashCode(this.read) + ((((iHashCode2 + (iHashCode * 31)) * 31) + i) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof retrySendingI)) {
                return false;
            }
            retrySendingI retrysendingi = (retrySendingI) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, retrysendingi.serializer}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 9;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (this.RemoteActionCompatParcelizer == retrysendingi.RemoteActionCompatParcelizer) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, retrysendingi.write}, getCieXyz.write())).booleanValue()) {
                    int i4 = IconCompatParcelizer + 53;
                    MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                if (this.read != retrysendingi.read) {
                    return false;
                }
                int i6 = MediaSessionCompatQueueItem + 23;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return true;
            }
            int i8 = MediaSessionCompatQueueItem + 123;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = IconCompatParcelizer + 57;
        MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 != 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RequestBreak(text=" + this.serializer + ", style=" + this.RemoteActionCompatParcelizer + ", icon=" + this.write + ", isOnDemand=" + this.read + ")";
        int i2 = IconCompatParcelizer + 111;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
