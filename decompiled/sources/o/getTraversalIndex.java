package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getTraversalIndex {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getTraversalIndex(String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = str4;
        this.read = str5;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("WebRefreshTokenRequest(accessToken=REDACTED, refreshToken=REDACTED, deviceToken=REDACTED, countryCode=", this.serializer, ", userId=REDACTED)");
        }
        ff$$ExternalSyntheticOutline0.m("WebRefreshTokenRequest(accessToken=REDACTED, refreshToken=REDACTED, deviceToken=REDACTED, countryCode=", this.serializer, ", userId=REDACTED)");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int i4 = MediaDescriptionCompat + 117;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaBrowserCompatMediaItem + 43;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getTraversalIndex)) {
            int i4 = MediaDescriptionCompat + 35;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        getTraversalIndex gettraversalindex = (getTraversalIndex) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, gettraversalindex.write}, getCieXyz.write())).booleanValue()) {
            int i6 = MediaDescriptionCompat + 77;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, gettraversalindex.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i7 = MediaBrowserCompatMediaItem + 39;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, gettraversalindex.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i9 = MediaBrowserCompatMediaItem + 43;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, gettraversalindex.serializer}, getCieXyz.write())).booleanValue()) {
            int i10 = MediaDescriptionCompat + 89;
            MediaBrowserCompatMediaItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i10 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, gettraversalindex.read}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i11 = MediaBrowserCompatMediaItem + 83;
        MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
