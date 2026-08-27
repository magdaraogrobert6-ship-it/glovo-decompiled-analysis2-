package o;

/* JADX INFO: loaded from: classes3.dex */
public final class readField implements buildResponseData {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final boolean read;
    public final ResponseData1 write;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        Integer num = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 33;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return num;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 27;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.IconCompatParcelizer;
        int i5 = i2 + 3;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        ResponseData1 responseData1 = this.write;
        int i5 = i3 + 115;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return responseData1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public readField(String str, ResponseData1 responseData1, Integer num, boolean z) {
        str.getClass();
        responseData1.getClass();
        this.IconCompatParcelizer = str;
        this.write = responseData1;
        this.RemoteActionCompatParcelizer = num;
        this.read = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040 A[PHI: r1 r3 r4
  0x0040: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r3v8 int) = (r3v1 int), (r3v10 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r4v4 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v5 java.lang.Integer) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1 r3
  0x0033: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v2 int) = (r3v1 int), (r3v10 int) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Integer num;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 93;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode3 = 0;
        if (i3 % 2 == 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            iHashCode2 = this.write.hashCode();
            num = this.RemoteActionCompatParcelizer;
            int i4 = 39 / 0;
            if (num == null) {
                i = serializer + 119;
                MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode3 = 1;
                }
            } else {
                iHashCode3 = num.hashCode();
            }
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
            iHashCode2 = this.write.hashCode();
            num = this.RemoteActionCompatParcelizer;
            if (num == null) {
                i = serializer + 119;
                MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode3 = 1;
                }
            } else {
                iHashCode3 = num.hashCode();
            }
        }
        return Boolean.hashCode(this.read) + ((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readField)) {
            return false;
        }
        readField readfield = (readField) obj;
        Object[] objArr = {this.IconCompatParcelizer, readfield.IconCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.write == readfield.write) {
            Object[] objArr2 = {this.RemoteActionCompatParcelizer, readfield.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.read == readfield.read) {
                return true;
            }
            int i4 = serializer + 5;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = serializer + 37;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EndBreak(text=" + this.IconCompatParcelizer + ", style=" + this.write + ", icon=" + this.RemoteActionCompatParcelizer + ", isOnDemand=" + this.read + ")";
        int i2 = MediaBrowserCompatMediaItem + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
