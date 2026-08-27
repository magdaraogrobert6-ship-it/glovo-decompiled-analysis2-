package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkFetcherfetch2 implements RealInterceptorChain {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public NetworkFetcherfetch2(String str, String str2, String str3, String str4) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 109;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PermissionDialogUiState(title=", this.read, ", description=", this.RemoteActionCompatParcelizer, ", mainActionButton="), this.write, ", dismissButtonTitle=", this.IconCompatParcelizer, ")");
        int i4 = MediaSessionCompatQueueItem + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 75;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.write);
        int i4 = MediaSessionCompatQueueItem + 41;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkFetcherfetch2) {
            NetworkFetcherfetch2 networkFetcherfetch2 = (NetworkFetcherfetch2) obj;
            if (!this.read.equals(networkFetcherfetch2.read)) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer.equals(networkFetcherfetch2.RemoteActionCompatParcelizer)) {
                return this.write.equals(networkFetcherfetch2.write) && this.IconCompatParcelizer.equals(networkFetcherfetch2.IconCompatParcelizer);
            }
            int i5 = MediaSessionCompatQueueItem + 67;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 103;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
