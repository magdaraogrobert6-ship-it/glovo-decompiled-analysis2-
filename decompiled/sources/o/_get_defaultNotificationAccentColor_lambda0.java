package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_defaultNotificationAccentColor_lambda0 {
    public final int MediaDescriptionCompat;
    public final ByteString MediaMetadataCompat;
    public final ByteString RatingCompat;
    public static final ByteString write = ByteString.IconCompatParcelizer(":");
    public static final ByteString IconCompatParcelizer = ByteString.IconCompatParcelizer(":status");
    public static final ByteString read = ByteString.IconCompatParcelizer(":method");
    public static final ByteString serializer = ByteString.IconCompatParcelizer(":path");
    public static final ByteString RemoteActionCompatParcelizer = ByteString.IconCompatParcelizer(":scheme");
    public static final ByteString MediaSessionCompatQueueItem = ByteString.IconCompatParcelizer(":authority");

    public final int hashCode() {
        return this.MediaMetadataCompat.hashCode() + ((this.RatingCompat.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strRatingCompat = this.RatingCompat.RatingCompat();
        String strRatingCompat2 = this.MediaMetadataCompat.RatingCompat();
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        java.util.Locale locale = java.util.Locale.US;
        return af$$ExternalSyntheticOutline0.m(strRatingCompat, ": ", strRatingCompat2);
    }

    public _get_defaultNotificationAccentColor_lambda0(ByteString byteString, ByteString byteString2) {
        this.RatingCompat = byteString;
        this.MediaMetadataCompat = byteString2;
        this.MediaDescriptionCompat = byteString2.write() + byteString.write() + 32;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof _get_defaultNotificationAccentColor_lambda0)) {
            return false;
        }
        _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0 = (_get_defaultNotificationAccentColor_lambda0) obj;
        return this.RatingCompat.equals(_get_defaultnotificationaccentcolor_lambda0.RatingCompat) && this.MediaMetadataCompat.equals(_get_defaultnotificationaccentcolor_lambda0.MediaMetadataCompat);
    }

    public _get_defaultNotificationAccentColor_lambda0(ByteString byteString, String str) {
        this(byteString, ByteString.IconCompatParcelizer(str));
    }

    public _get_defaultNotificationAccentColor_lambda0(String str, String str2) {
        this(ByteString.IconCompatParcelizer(str), ByteString.IconCompatParcelizer(str2));
    }
}
