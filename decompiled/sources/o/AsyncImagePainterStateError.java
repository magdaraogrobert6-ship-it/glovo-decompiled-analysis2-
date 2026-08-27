package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainterStateError implements resizeToBitmapDimensionslambda0 {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final AsyncImagePainterStateSuccess read;

    public AsyncImagePainterStateError(String str, AsyncImagePainterStateSuccess asyncImagePainterStateSuccess, int i) {
        boolean z;
        if ((i & 1) != 0) {
            int i2 = serializer + 99;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = serializer;
            int i4 = i3 + 121;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 45;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            z = false;
        } else {
            z = true;
        }
        if ((i & 4) != 0) {
            int i8 = 2 % 2;
            asyncImagePainterStateSuccess = null;
        }
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = z;
        this.read = asyncImagePainterStateSuccess;
    }

    public final int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = serializer + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            str = this.IconCompatParcelizer;
            iHashCode = 1;
            if (str == null) {
                int i4 = i3 + 121;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.IconCompatParcelizer;
            if (str == null) {
                iHashCode = 0;
                int i6 = i3 + 121;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        int iM = d$$ExternalSyntheticOutline0.m(iHashCode2 * 31, 31, this.RemoteActionCompatParcelizer);
        AsyncImagePainterStateSuccess asyncImagePainterStateSuccess = this.read;
        if (asyncImagePainterStateSuccess == null) {
            int i8 = write + 29;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            iHashCode = asyncImagePainterStateSuccess.hashCode();
        }
        int i9 = iM + iHashCode;
        int i10 = write + 101;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            int i11 = 7 / 0;
        }
        return i9;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ProxyNumberViewState(phoneNumber=REDACTED, isLoading=" + this.RemoteActionCompatParcelizer + ", error=" + this.read + ")";
        int i2 = serializer + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainterStateError)) {
            return false;
        }
        AsyncImagePainterStateError asyncImagePainterStateError = (AsyncImagePainterStateError) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, asyncImagePainterStateError.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == asyncImagePainterStateError.RemoteActionCompatParcelizer) {
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, asyncImagePainterStateError.read}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i3 = serializer + 37;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
