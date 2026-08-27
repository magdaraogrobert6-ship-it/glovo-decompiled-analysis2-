package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isPlayTrackingEnabled implements buildResponseData {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String RemoteActionCompatParcelizer;
    public final ResponseData1 serializer;
    public final Integer write;

    @Override // o.buildResponseData
    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 53;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.write;
        int i4 = i2 + 57;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return num;
    }

    @Override // o.buildResponseData
    public final String read() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.buildResponseData
    public final ResponseData1 serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ResponseData1 responseData1 = this.serializer;
        int i4 = i2 + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return responseData1;
    }

    public isPlayTrackingEnabled(String str, ResponseData1 responseData1, Integer num) {
        str.getClass();
        responseData1.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.serializer = responseData1;
        this.write = num;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        Integer num = this.write;
        if (num == null) {
            int i4 = IconCompatParcelizer + 39;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 53;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 4 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CancelBreak(text=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", style=");
        sb.append(this.serializer);
        sb.append(", icon=");
        String strWrite = IconCompatParcelizer.write(this.write, ")", sb);
        int i2 = read + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strWrite;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPlayTrackingEnabled)) {
            return false;
        }
        isPlayTrackingEnabled isplaytrackingenabled = (isPlayTrackingEnabled) obj;
        Object[] objArr = {this.RemoteActionCompatParcelizer, isplaytrackingenabled.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (this.serializer == isplaytrackingenabled.serializer) {
                Object[] objArr2 = {this.write, isplaytrackingenabled.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = read + 71;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = read + 125;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 27;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
