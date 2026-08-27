package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getMiddleEllipsisgIe3tQ8annotations {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final isInsideContent IconCompatParcelizer;
    public final String serializer;

    public getMiddleEllipsisgIe3tQ8annotations(String str, isInsideContent isinsidecontent) {
        str.getClass();
        isinsidecontent.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = isinsidecontent;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = write + 23;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ActiveScan(deliveryId=" + this.serializer + ", vendor=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 55;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 41;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof getMiddleEllipsisgIe3tQ8annotations)) {
            return false;
        }
        getMiddleEllipsisgIe3tQ8annotations getmiddleellipsisgie3tq8annotations = (getMiddleEllipsisgIe3tQ8annotations) obj;
        Object[] objArr = {this.serializer, getmiddleellipsisgie3tq8annotations.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.IconCompatParcelizer, getmiddleellipsisgie3tq8annotations.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = RemoteActionCompatParcelizer + 121;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
