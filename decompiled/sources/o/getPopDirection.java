package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getPopDirection implements resizeToBitmapDimensionslambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final String read;
    public final Integer write;

    public final Integer IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Integer num = this.write;
        int i5 = i2 + 73;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 96 / 0;
        }
        return num;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        int i3 = 10 / 0;
        return this.read;
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.IconCompatParcelizer;
        int i4 = i3 + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getPopDirection(String str, int i, boolean z) {
        Integer numValueOf = Integer.valueOf(com.logistics.rider.glovo.R.string.snackbar_error_exception);
        if ((i & 1) != 0) {
            int i2 = serializer + 73;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = RemoteActionCompatParcelizer + 3;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            numValueOf = null;
        }
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            str = null;
        }
        this(z, numValueOf, str);
    }

    public getPopDirection(boolean z, Integer num, String str) {
        this.IconCompatParcelizer = z;
        this.write = num;
        this.read = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer);
        Integer num = this.write;
        int iHashCode3 = 0;
        if (num == null) {
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
            int i2 = RemoteActionCompatParcelizer + 7;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str = this.read;
        if (str != null) {
            iHashCode3 = str.hashCode();
            int i4 = serializer + 37;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("HelpCenterUrlViewState(isLoading=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", error=");
        sb.append(this.write);
        sb.append(", url=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.read, ")");
        int i2 = RemoteActionCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 19;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof getPopDirection)) {
            int i5 = i3 + 117;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        getPopDirection getpopdirection = (getPopDirection) obj;
        if (this.IconCompatParcelizer != getpopdirection.IconCompatParcelizer) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getpopdirection.write}, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 119;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getpopdirection.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = serializer + 119;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
