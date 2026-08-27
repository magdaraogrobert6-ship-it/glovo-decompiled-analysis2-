package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkAuthenticationSignaturelambda11 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final RectListDebuggerModifierNode RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public setSdkAuthenticationSignaturelambda11(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, boolean z, RectListDebuggerModifierNode rectListDebuggerModifierNode) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.write = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.read = z;
        this.RemoteActionCompatParcelizer = rectListDebuggerModifierNode;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(4);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.write.hashCode() + (iHashCode * 31)) * 31, 31, this.IconCompatParcelizer), 31, this.serializer), 31, this.read);
        int i4 = RatingCompat + 33;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TwoFaViewState(numDigits=4, enteredPin=" + this.write + ", phoneNumber=REDACTED, pinRowErrorMessage=" + this.serializer + ", hasGeneralError=" + this.read + ", countDownState=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = MediaBrowserCompatMediaItem + 101;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public static setSdkAuthenticationSignaturelambda11 RemoteActionCompatParcelizer(setSdkAuthenticationSignaturelambda11 setsdkauthenticationsignaturelambda11, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, boolean z, RectListDebuggerModifierNode rectListDebuggerModifierNode, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 93;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setsdkauthenticationsignaturelambda11.getClass();
        if ((i & 2) != 0) {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = setsdkauthenticationsignaturelambda11.write;
            int i5 = MediaBrowserCompatMediaItem + 93;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        if ((i & 4) != 0) {
            str = setsdkauthenticationsignaturelambda11.IconCompatParcelizer;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = setsdkauthenticationsignaturelambda11.serializer;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = setsdkauthenticationsignaturelambda11.read;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            rectListDebuggerModifierNode = setsdkauthenticationsignaturelambda11.RemoteActionCompatParcelizer;
        }
        RectListDebuggerModifierNode rectListDebuggerModifierNode2 = rectListDebuggerModifierNode;
        setsdkauthenticationsignaturelambda11.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        rectListDebuggerModifierNode2.getClass();
        return new setSdkAuthenticationSignaturelambda11(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, str3, str4, z2, rectListDebuggerModifierNode2);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof setSdkAuthenticationSignaturelambda11)) {
                return false;
            }
            setSdkAuthenticationSignaturelambda11 setsdkauthenticationsignaturelambda11 = (setSdkAuthenticationSignaturelambda11) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setsdkauthenticationsignaturelambda11.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.IconCompatParcelizer.equals(setsdkauthenticationsignaturelambda11.IconCompatParcelizer)) {
                if (this.serializer.equals(setsdkauthenticationsignaturelambda11.serializer)) {
                    if (this.read != setsdkauthenticationsignaturelambda11.read || (!this.RemoteActionCompatParcelizer.equals(setsdkauthenticationsignaturelambda11.RemoteActionCompatParcelizer))) {
                        return false;
                    }
                } else {
                    i = RatingCompat + 67;
                    MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
            } else {
                i = MediaBrowserCompatMediaItem + 29;
                RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
            return false;
        }
        return true;
    }
}
