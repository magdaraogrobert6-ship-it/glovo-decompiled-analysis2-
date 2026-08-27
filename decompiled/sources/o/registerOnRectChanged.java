package o;

/* JADX INFO: loaded from: classes3.dex */
public final class registerOnRectChanged extends getWindowOffsetnOccac {
    private static int serializer = 0;
    private static int write = 1;
    public final long IconCompatParcelizer;
    public final String read;

    public final long RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 95;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        long j = this.IconCompatParcelizer;
        int i5 = i2 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.read;
        int i4 = i2 + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public registerOnRectChanged(long j, String str) {
        str.getClass();
        this.IconCompatParcelizer = j;
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (Long.hashCode(this.IconCompatParcelizer) * 31);
        int i4 = write + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        int i = 2 % 2;
        int i2 = write + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sb = getBitmapFromCache.read("ForceOpenChatRoom(deliveryId=", ", orderId=", this.IconCompatParcelizer, this.read);
            sb.append(")");
            string = sb.toString();
            int i3 = 18 / 0;
        } else {
            StringBuilder sb2 = getBitmapFromCache.read("ForceOpenChatRoom(deliveryId=", ", orderId=", this.IconCompatParcelizer, this.read);
            sb2.append(")");
            string = sb2.toString();
        }
        int i4 = write + 13;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 33;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof registerOnRectChanged) {
            registerOnRectChanged registeronrectchanged = (registerOnRectChanged) obj;
            if (this.IconCompatParcelizer == registeronrectchanged.IconCompatParcelizer) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, registeronrectchanged.read}, getCieXyz.write())).booleanValue();
            }
            int i6 = i2 + 63;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = i4 + 125;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
