package o;

import com.sentiance.okio.ByteString;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_versionCode_lambda0 {
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int read = Integer.MAX_VALUE;
    public _get_defaultNotificationAccentColor_lambda0[] write = new _get_defaultNotificationAccentColor_lambda0[8];
    public int MediaDescriptionCompat = 7;
    public int MediaBrowserCompatMediaItem = 0;
    public int MediaMetadataCompat = 0;
    public int serializer = androidx.compose.ui.graphics.Fields.TransformOrigin;

    public final void write(ByteString byteString) {
        getDefaultNotificationChannelName.serializer.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < byteString.write(); i++) {
            j2 += (long) getDefaultNotificationChannelName.write[byteString.RemoteActionCompatParcelizer(i) & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iWrite = byteString.write();
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        if (i2 >= iWrite) {
            RemoteActionCompatParcelizer(byteString.write(), 127, 0);
            byteString.write(r8lambdabeyrnr8p6809bwlboro_stans);
            return;
        }
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        getDefaultNotificationChannelName.serializer.getClass();
        int i3 = 0;
        for (int i4 = 0; i4 < byteString.write(); i4++) {
            int iRemoteActionCompatParcelizer = byteString.RemoteActionCompatParcelizer(i4) & 255;
            int i5 = getDefaultNotificationChannelName.IconCompatParcelizer[iRemoteActionCompatParcelizer];
            byte b = getDefaultNotificationChannelName.write[iRemoteActionCompatParcelizer];
            j = (j << b) | ((long) i5);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                r8lambdabeyrnr8p6809bwlboro_stans2.write((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            r8lambdabeyrnr8p6809bwlboro_stans2.write((int) ((j << (8 - i3)) | ((long) (255 >>> i3))));
        }
        ByteString byteString2 = new ByteString(r8lambdabeyrnr8p6809bwlboro_stans2.RatingCompat());
        RemoteActionCompatParcelizer(byteString2.write(), 127, androidx.compose.ui.graphics.Fields.SpotShadowColor);
        byteString2.write(r8lambdabeyrnr8p6809bwlboro_stans);
    }

    public _get_versionCode_lambda0(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans) {
        this.IconCompatParcelizer = r8lambdabeyrnr8p6809bwlboro_stans;
    }

    public final void write(int i) {
        int i2;
        if (i > 0) {
            int length = this.write.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.MediaDescriptionCompat;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.write[length].MediaDescriptionCompat;
                i -= i4;
                this.MediaMetadataCompat -= i4;
                this.MediaBrowserCompatMediaItem--;
                i3++;
                length--;
            }
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = this.write;
            int i5 = i2 + 1;
            System.arraycopy(_get_defaultnotificationaccentcolor_lambda0Arr, i5, _get_defaultnotificationaccentcolor_lambda0Arr, i5 + i3, this.MediaBrowserCompatMediaItem);
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr2 = this.write;
            int i6 = this.MediaDescriptionCompat + 1;
            Arrays.fill(_get_defaultnotificationaccentcolor_lambda0Arr2, i6, i6 + i3, (Object) null);
            this.MediaDescriptionCompat += i3;
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.IconCompatParcelizer;
        if (i < i2) {
            r8lambdabeyrnr8p6809bwlboro_stans.write(i | i3);
            return;
        }
        r8lambdabeyrnr8p6809bwlboro_stans.write(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            r8lambdabeyrnr8p6809bwlboro_stans.write(128 | (i4 & 127));
            i4 >>>= 7;
        }
        r8lambdabeyrnr8p6809bwlboro_stans.write(i4);
    }

    public final void read(_get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0) {
        int i = _get_defaultnotificationaccentcolor_lambda0.MediaDescriptionCompat;
        int i2 = this.serializer;
        if (i > i2) {
            Arrays.fill(this.write, (Object) null);
            this.MediaDescriptionCompat = this.write.length - 1;
            this.MediaBrowserCompatMediaItem = 0;
            this.MediaMetadataCompat = 0;
            return;
        }
        write((this.MediaMetadataCompat + i) - i2);
        int i3 = this.MediaBrowserCompatMediaItem;
        _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = this.write;
        if (i3 + 1 > _get_defaultnotificationaccentcolor_lambda0Arr.length) {
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr2 = new _get_defaultNotificationAccentColor_lambda0[_get_defaultnotificationaccentcolor_lambda0Arr.length * 2];
            System.arraycopy(_get_defaultnotificationaccentcolor_lambda0Arr, 0, _get_defaultnotificationaccentcolor_lambda0Arr2, _get_defaultnotificationaccentcolor_lambda0Arr.length, _get_defaultnotificationaccentcolor_lambda0Arr.length);
            this.MediaDescriptionCompat = this.write.length - 1;
            this.write = _get_defaultnotificationaccentcolor_lambda0Arr2;
        }
        int i4 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i4 - 1;
        this.write[i4] = _get_defaultnotificationaccentcolor_lambda0;
        this.MediaBrowserCompatMediaItem++;
        this.MediaMetadataCompat += i;
    }
}
