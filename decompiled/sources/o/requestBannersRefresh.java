package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class requestBannersRefresh {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final String write;

    public requestBannersRefresh(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = z;
        this.read = z2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer(c8$$ExternalSyntheticOutline0.m("ReviewTag(key=", this.write, ", label=", this.RemoteActionCompatParcelizer, ", isVisible="), this.IconCompatParcelizer, ", isSelected=", this.read, ")");
        int i4 = MediaBrowserCompatMediaItem + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strSerializer;
        }
        throw null;
    }

    public static requestBannersRefresh serializer(requestBannersRefresh requestbannersrefresh, boolean z, boolean z2, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 1;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        int i5 = i3 % 2;
        String str = requestbannersrefresh.write;
        String str2 = requestbannersrefresh.RemoteActionCompatParcelizer;
        if ((i & 4) != 0) {
            int i6 = i4 + 107;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                boolean z3 = requestbannersrefresh.IconCompatParcelizer;
                throw null;
            }
            z = requestbannersrefresh.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            z2 = requestbannersrefresh.read;
            int i7 = i4 + 61;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
        }
        str.getClass();
        str2.getClass();
        requestBannersRefresh requestbannersrefresh2 = new requestBannersRefresh(str, str2, z, z2);
        int i9 = MediaBrowserCompatMediaItem + 103;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return requestbannersrefresh2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.IconCompatParcelizer);
        int i4 = serializer + 81;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof requestBannersRefresh)) {
                return false;
            }
            requestBannersRefresh requestbannersrefresh = (requestBannersRefresh) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, requestbannersrefresh.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, requestbannersrefresh.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.IconCompatParcelizer == requestbannersrefresh.IconCompatParcelizer) {
                return this.read == requestbannersrefresh.read;
            }
            int i2 = serializer + 5;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 9;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaBrowserCompatMediaItem + 71;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}
