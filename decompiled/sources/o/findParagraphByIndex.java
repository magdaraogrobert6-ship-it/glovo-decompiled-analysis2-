package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class findParagraphByIndex {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final boolean IconCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final Boolean write;

    public findParagraphByIndex(boolean z, boolean z2, Boolean bool, String str) {
        this.serializer = z;
        this.IconCompatParcelizer = z2;
        this.write = bool;
        this.read = str;
    }

    public static findParagraphByIndex RemoteActionCompatParcelizer(findParagraphByIndex findparagraphbyindex, boolean z, boolean z2, Boolean bool, String str, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 39;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0 ? (i & 2) != 0 : (i & 5) != 0) {
            z2 = findparagraphbyindex.IconCompatParcelizer;
            int i5 = i3 + 59;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            bool = findparagraphbyindex.write;
        }
        if ((i & 8) != 0) {
            str = findparagraphbyindex.read;
        }
        findparagraphbyindex.getClass();
        return new findParagraphByIndex(z, z2, bool, str);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.serializer) * 31, 31, this.IconCompatParcelizer);
        Boolean bool = this.write;
        if (bool == null) {
            int i3 = MediaBrowserCompatMediaItem + 109;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i3 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = bool.hashCode();
            int i4 = RemoteActionCompatParcelizer + 3;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode;
        }
        String str = this.read;
        return ((iM + i) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof findParagraphByIndex)) {
                return false;
            }
            findParagraphByIndex findparagraphbyindex = (findParagraphByIndex) obj;
            if (this.serializer != findparagraphbyindex.serializer || this.IconCompatParcelizer != findparagraphbyindex.IconCompatParcelizer) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, findparagraphbyindex.write}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, findparagraphbyindex.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
            } else {
                int i4 = MediaBrowserCompatMediaItem + 117;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CustomerChatUiState(showLoading=" + this.serializer + ", isError=" + this.IconCompatParcelizer + ", shouldShowWebChat=" + this.write + ", chatId=" + this.read + ")";
        int i2 = MediaBrowserCompatMediaItem + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
