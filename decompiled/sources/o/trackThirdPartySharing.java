package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class trackThirdPartySharing {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final RectListDebuggerModifierNode IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk serializer;
    public final String write;

    public trackThirdPartySharing(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, String str3, String str4, boolean z, RectListDebuggerModifierNode rectListDebuggerModifierNode, boolean z2) {
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        this.serializer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.MediaDescriptionCompat = str;
        this.write = str2;
        this.MediaMetadataCompat = str3;
        this.RatingCompat = str4;
        this.read = z;
        this.IconCompatParcelizer = rectListDebuggerModifierNode;
        this.RemoteActionCompatParcelizer = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(4);
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + (iHashCode * 31)) * 31, 31, this.MediaDescriptionCompat), 31, this.write), 31, this.MediaMetadataCompat), 31, this.RatingCompat), 31, this.read);
        int iHashCode2 = Boolean.hashCode(this.RemoteActionCompatParcelizer) + ((this.IconCompatParcelizer.hashCode() + iM) * 31);
        int i4 = MediaSessionCompatQueueItem + 33;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OtpVerificationViewState(numDigits=4, enteredPin=");
        sb.append(this.serializer);
        sb.append(", phoneNumber=REDACTED, email=REDACTED, requestId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", pinRowErrorMessage=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.RatingCompat, ", hasGeneralError=", ", countDownState=", sb, this.read);
        sb.append(this.IconCompatParcelizer);
        sb.append(", isLoading=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static trackThirdPartySharing write(trackThirdPartySharing trackthirdpartysharing, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, String str, String str2, String str3, String str4, boolean z, RectListDebuggerModifierNode rectListDebuggerModifierNode, boolean z2, int i) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2;
        String str5;
        String str6;
        String str7;
        String str8;
        RectListDebuggerModifierNode rectListDebuggerModifierNode2;
        boolean z3;
        int i2 = 2 % 2;
        trackthirdpartysharing.getClass();
        if ((i & 2) != 0) {
            int i3 = MediaSessionCompatQueueItem + 111;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = trackthirdpartysharing.serializer;
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        }
        if ((i & 4) != 0) {
            int i5 = MediaSessionCompatQueueItem + 7;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                String str9 = trackthirdpartysharing.MediaDescriptionCompat;
                throw null;
            }
            str5 = trackthirdpartysharing.MediaDescriptionCompat;
        } else {
            str5 = str;
        }
        if ((i & 8) != 0) {
            int i6 = MediaSessionCompatQueueItem + 53;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            str6 = trackthirdpartysharing.write;
        } else {
            str6 = str2;
        }
        if ((i & 16) != 0) {
            int i8 = MediaBrowserCompatMediaItem + 19;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                String str10 = trackthirdpartysharing.MediaMetadataCompat;
                throw null;
            }
            str7 = trackthirdpartysharing.MediaMetadataCompat;
        } else {
            str7 = str3;
        }
        if ((i & 32) != 0) {
            int i9 = MediaSessionCompatQueueItem + 109;
            int i10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i10;
            int i11 = i9 % 2;
            str8 = trackthirdpartysharing.RatingCompat;
            int i12 = i10 + 19;
            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            str8 = str4;
        }
        boolean z4 = (i & 64) != 0 ? trackthirdpartysharing.read : z;
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            int i14 = MediaSessionCompatQueueItem + 115;
            MediaBrowserCompatMediaItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            rectListDebuggerModifierNode2 = trackthirdpartysharing.IconCompatParcelizer;
        } else {
            rectListDebuggerModifierNode2 = rectListDebuggerModifierNode;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            int i16 = MediaSessionCompatQueueItem + 69;
            MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                boolean z5 = trackthirdpartysharing.RemoteActionCompatParcelizer;
                throw null;
            }
            z3 = trackthirdpartysharing.RemoteActionCompatParcelizer;
        } else {
            z3 = z2;
        }
        trackthirdpartysharing.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2.getClass();
        str7.getClass();
        rectListDebuggerModifierNode2.getClass();
        trackThirdPartySharing trackthirdpartysharing2 = new trackThirdPartySharing(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, str5, str6, str7, str8, z4, rectListDebuggerModifierNode2, z3);
        int i17 = MediaBrowserCompatMediaItem + 55;
        MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return trackthirdpartysharing2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 63;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof trackThirdPartySharing) {
            trackThirdPartySharing trackthirdpartysharing = (trackThirdPartySharing) obj;
            Object[] objArr = {this.serializer, trackthirdpartysharing.serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat.equals(trackthirdpartysharing.MediaDescriptionCompat) && this.write.equals(trackthirdpartysharing.write)) {
                if (!this.MediaMetadataCompat.equals(trackthirdpartysharing.MediaMetadataCompat)) {
                    int i4 = MediaSessionCompatQueueItem + 13;
                    MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else if (!this.RatingCompat.equals(trackthirdpartysharing.RatingCompat)) {
                    int i6 = MediaBrowserCompatMediaItem + 101;
                    MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        int i7 = 4 / 5;
                    }
                } else if (this.read == trackthirdpartysharing.read && this.IconCompatParcelizer.equals(trackthirdpartysharing.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == trackthirdpartysharing.RemoteActionCompatParcelizer) {
                    return true;
                }
            }
        }
        return false;
    }
}
