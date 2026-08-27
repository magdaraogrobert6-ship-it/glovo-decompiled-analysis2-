package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncImagePainterStateSuccess {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public AsyncImagePainterStateSuccess(String str, String str2, String str3, String str4) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 103;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Error(title=", this.write, ", description=", this.RemoteActionCompatParcelizer, ", mainActionButtonText="), this.read, ", shouldMainActionDismiss=true, errorMessage=", this.IconCompatParcelizer, ")");
        int i4 = serializer + 19;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.read), 31, true);
        int i4 = MediaBrowserCompatMediaItem + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AsyncImagePainterStateSuccess) {
            AsyncImagePainterStateSuccess asyncImagePainterStateSuccess = (AsyncImagePainterStateSuccess) obj;
            if (this.write.equals(asyncImagePainterStateSuccess.write)) {
                if (this.RemoteActionCompatParcelizer.equals(asyncImagePainterStateSuccess.RemoteActionCompatParcelizer)) {
                    if (this.read.equals(asyncImagePainterStateSuccess.read) && this.IconCompatParcelizer.equals(asyncImagePainterStateSuccess.IconCompatParcelizer)) {
                        return true;
                    }
                } else {
                    int i2 = MediaBrowserCompatMediaItem + 9;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                }
            }
        }
        int i4 = MediaBrowserCompatMediaItem + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
