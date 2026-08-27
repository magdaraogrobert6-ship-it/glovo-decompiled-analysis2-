package o;

import com.sentiance.okio.ByteString;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultNotificationAccentColorannotations {
    public final readResourceValuelambda1 IconCompatParcelizer;
    public final ArrayList write = new ArrayList();
    public _get_defaultNotificationAccentColor_lambda0[] read = new _get_defaultNotificationAccentColor_lambda0[8];
    public int MediaBrowserCompatMediaItem = 7;
    public int MediaSessionCompatQueueItem = 0;
    public int MediaDescriptionCompat = 0;
    public final int RemoteActionCompatParcelizer = androidx.compose.ui.graphics.Fields.TransformOrigin;
    public int serializer = androidx.compose.ui.graphics.Fields.TransformOrigin;

    public final void IconCompatParcelizer(_get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0) {
        this.write.add(_get_defaultnotificationaccentcolor_lambda0);
        int i = _get_defaultnotificationaccentcolor_lambda0.MediaDescriptionCompat;
        int i2 = this.serializer;
        if (i > i2) {
            Arrays.fill(this.read, (Object) null);
            this.MediaBrowserCompatMediaItem = this.read.length - 1;
            this.MediaSessionCompatQueueItem = 0;
            this.MediaDescriptionCompat = 0;
            return;
        }
        write((this.MediaDescriptionCompat + i) - i2);
        int i3 = this.MediaSessionCompatQueueItem;
        _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = this.read;
        if (i3 + 1 > _get_defaultnotificationaccentcolor_lambda0Arr.length) {
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr2 = new _get_defaultNotificationAccentColor_lambda0[_get_defaultnotificationaccentcolor_lambda0Arr.length * 2];
            System.arraycopy(_get_defaultnotificationaccentcolor_lambda0Arr, 0, _get_defaultnotificationaccentcolor_lambda0Arr2, _get_defaultnotificationaccentcolor_lambda0Arr.length, _get_defaultnotificationaccentcolor_lambda0Arr.length);
            this.MediaBrowserCompatMediaItem = this.read.length - 1;
            this.read = _get_defaultnotificationaccentcolor_lambda0Arr2;
        }
        int i4 = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = i4 - 1;
        this.read[i4] = _get_defaultnotificationaccentcolor_lambda0;
        this.MediaSessionCompatQueueItem++;
        this.MediaDescriptionCompat += i;
    }

    public final ByteString RemoteActionCompatParcelizer() {
        readResourceValuelambda1 readresourcevaluelambda1 = this.IconCompatParcelizer;
        byte bMediaBrowserCompatMediaItem = readresourcevaluelambda1.MediaBrowserCompatMediaItem();
        int i = 0;
        boolean z = (bMediaBrowserCompatMediaItem & 128) == 128;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(bMediaBrowserCompatMediaItem & 255, 127);
        if (!z) {
            return readresourcevaluelambda1.read(iRemoteActionCompatParcelizer);
        }
        getDefaultNotificationChannelName getdefaultnotificationchannelname = getDefaultNotificationChannelName.serializer;
        byte[] bArrWrite = readresourcevaluelambda1.write(iRemoteActionCompatParcelizer);
        getdefaultnotificationchannelname.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageResources_androidKt imageResources_androidKt = getdefaultnotificationchannelname.RemoteActionCompatParcelizer;
        ImageResources_androidKt imageResources_androidKt2 = imageResources_androidKt;
        int i2 = 0;
        for (byte b : bArrWrite) {
            i2 = (i2 << 8) | (b & 255);
            i += 8;
            while (i >= 8) {
                imageResources_androidKt2 = ((ImageResources_androidKt[]) imageResources_androidKt2.read)[(i2 >>> (i - 8)) & 255];
                if (((ImageResources_androidKt[]) imageResources_androidKt2.read) == null) {
                    byteArrayOutputStream.write(imageResources_androidKt2.RemoteActionCompatParcelizer);
                    i -= imageResources_androidKt2.serializer;
                    imageResources_androidKt2 = imageResources_androidKt;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            ImageResources_androidKt imageResources_androidKt3 = ((ImageResources_androidKt[]) imageResources_androidKt2.read)[(i2 << (8 - i)) & 255];
            ImageResources_androidKt[] imageResources_androidKtArr = (ImageResources_androidKt[]) imageResources_androidKt3.read;
            int i3 = imageResources_androidKt3.serializer;
            if (imageResources_androidKtArr != null || i3 > i) {
                break;
            }
            byteArrayOutputStream.write(imageResources_androidKt3.RemoteActionCompatParcelizer);
            i -= i3;
            imageResources_androidKt2 = imageResources_androidKt;
        }
        return ByteString.write(byteArrayOutputStream.toByteArray());
    }

    public final ByteString read(int i) throws IOException {
        if (i >= 0) {
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = _get_sdkFlavor_lambda0.write;
            if (i <= _get_defaultnotificationaccentcolor_lambda0Arr.length - 1) {
                return _get_defaultnotificationaccentcolor_lambda0Arr[i].RatingCompat;
            }
        }
        int length = this.MediaBrowserCompatMediaItem + 1 + (i - _get_sdkFlavor_lambda0.write.length);
        if (length >= 0) {
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr2 = this.read;
            if (length < _get_defaultnotificationaccentcolor_lambda0Arr2.length) {
                return _get_defaultnotificationaccentcolor_lambda0Arr2[length].RatingCompat;
            }
        }
        DrawableTransformation.RemoteActionCompatParcelizer(i + 1, "Header index too large ");
        return null;
    }

    public final int write(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.read.length;
            while (true) {
                length--;
                i2 = this.MediaBrowserCompatMediaItem;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.read[length].MediaDescriptionCompat;
                i -= i4;
                this.MediaDescriptionCompat -= i4;
                this.MediaSessionCompatQueueItem--;
                i3++;
            }
            _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = this.read;
            int i5 = i2 + 1;
            System.arraycopy(_get_defaultnotificationaccentcolor_lambda0Arr, i5, _get_defaultnotificationaccentcolor_lambda0Arr, i5 + i3, this.MediaSessionCompatQueueItem);
            this.MediaBrowserCompatMediaItem += i3;
        }
        return i3;
    }

    public getDefaultNotificationAccentColorannotations(getDoesHandlePushDeepLinksAutomatically getdoeshandlepushdeeplinksautomatically) {
        java.util.logging.Logger logger = getResourceIdentifier.read;
        this.IconCompatParcelizer = new readResourceValuelambda1(getdoeshandlepushdeeplinksautomatically);
    }

    public final int RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte bMediaBrowserCompatMediaItem = this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
            if ((bMediaBrowserCompatMediaItem & 128) == 0) {
                return i2 + ((bMediaBrowserCompatMediaItem & 255) << i4);
            }
            i2 += (bMediaBrowserCompatMediaItem & 127) << i4;
            i4 += 7;
        }
    }
}
