package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ensureAnimationInfo {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final String IconCompatParcelizer;
    public final callStartTransitionListener RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public ensureAnimationInfo(String str, String str2, String str3, callStartTransitionListener callstarttransitionlistener, String str4) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = callstarttransitionlistener;
        this.write = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HelpCenterUrlParams(globalEntityId=", this.IconCompatParcelizer, ", brand=", this.read, ", brazeId=");
        sbM.append(this.serializer);
        sbM.append(", isHelpCenterMode=true, deeplinkParams=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", uiMode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaBrowserCompatMediaItem + 31;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 71;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.read), 31, this.serializer), 31, true);
        callStartTransitionListener callstarttransitionlistener = this.RemoteActionCompatParcelizer;
        if (callstarttransitionlistener == null) {
            int i4 = MediaMetadataCompat + 23;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 3 / 5;
            }
            iHashCode = 0;
        } else {
            iHashCode = callstarttransitionlistener.hashCode();
        }
        String str = this.write;
        int iHashCode2 = ((iM + iHashCode) * 31) + (str == null ? 0 : str.hashCode());
        int i6 = MediaBrowserCompatMediaItem + 29;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 != 0) {
            int i4 = 45 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof ensureAnimationInfo) {
            ensureAnimationInfo ensureanimationinfo = (ensureAnimationInfo) obj;
            Object[] objArr = {this.IconCompatParcelizer, ensureanimationinfo.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.read, ensureanimationinfo.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.serializer, ensureanimationinfo.serializer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.RemoteActionCompatParcelizer, ensureanimationinfo.RemoteActionCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                            Object[] objArr5 = {this.write, ensureanimationinfo.write};
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            int i5 = i3 + 3;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        return false;
    }
}
