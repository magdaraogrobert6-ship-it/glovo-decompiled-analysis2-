package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import o.accessgetNegativeZerocp;
import o.ceilslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ceilslo4al4 ceilslo4al4Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.PlaybackStateCompatCustomAction = -1;
        iconCompat.serializer = null;
        iconCompat.MediaSessionCompatQueueItem = null;
        iconCompat.RemoteActionCompatParcelizer = 0;
        iconCompat.read = 0;
        iconCompat.MediaBrowserCompatMediaItem = null;
        iconCompat.MediaMetadataCompat = IconCompat.write;
        iconCompat.MediaDescriptionCompat = null;
        iconCompat.PlaybackStateCompatCustomAction = ceilslo4al4Var.serializer(-1, 1);
        byte[] bArr = iconCompat.serializer;
        if (ceilslo4al4Var.IconCompatParcelizer(2)) {
            Parcel parcel = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.serializer = bArr;
        iconCompat.MediaSessionCompatQueueItem = ceilslo4al4Var.read(iconCompat.MediaSessionCompatQueueItem, 3);
        iconCompat.RemoteActionCompatParcelizer = ceilslo4al4Var.serializer(iconCompat.RemoteActionCompatParcelizer, 4);
        iconCompat.read = ceilslo4al4Var.serializer(iconCompat.read, 5);
        iconCompat.MediaBrowserCompatMediaItem = (ColorStateList) ceilslo4al4Var.read(iconCompat.MediaBrowserCompatMediaItem, 6);
        String string = iconCompat.MediaDescriptionCompat;
        if (ceilslo4al4Var.IconCompatParcelizer(7)) {
            string = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.readString();
        }
        iconCompat.MediaDescriptionCompat = string;
        String string2 = iconCompat.RatingCompat;
        if (ceilslo4al4Var.IconCompatParcelizer(8)) {
            string2 = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.readString();
        }
        iconCompat.RatingCompat = string2;
        iconCompat.MediaMetadataCompat = PorterDuff.Mode.valueOf(iconCompat.MediaDescriptionCompat);
        switch (iconCompat.PlaybackStateCompatCustomAction) {
            case -1:
                Parcelable parcelable = iconCompat.MediaSessionCompatQueueItem;
                if (parcelable != null) {
                    iconCompat.IconCompatParcelizer = parcelable;
                    return iconCompat;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.MediaSessionCompatQueueItem;
                if (parcelable2 != null) {
                    iconCompat.IconCompatParcelizer = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.serializer;
                iconCompat.IconCompatParcelizer = bArr3;
                iconCompat.PlaybackStateCompatCustomAction = 3;
                iconCompat.RemoteActionCompatParcelizer = 0;
                iconCompat.read = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.serializer, Charset.forName("UTF-16"));
                iconCompat.IconCompatParcelizer = str;
                if (iconCompat.PlaybackStateCompatCustomAction == 2 && iconCompat.RatingCompat == null) {
                    iconCompat.RatingCompat = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.IconCompatParcelizer = iconCompat.serializer;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ceilslo4al4 ceilslo4al4Var) {
        ceilslo4al4Var.getClass();
        iconCompat.MediaDescriptionCompat = iconCompat.MediaMetadataCompat.name();
        switch (iconCompat.PlaybackStateCompatCustomAction) {
            case -1:
                iconCompat.MediaSessionCompatQueueItem = (Parcelable) iconCompat.IconCompatParcelizer;
                break;
            case 1:
            case 5:
                iconCompat.MediaSessionCompatQueueItem = (Parcelable) iconCompat.IconCompatParcelizer;
                break;
            case 2:
                iconCompat.serializer = ((String) iconCompat.IconCompatParcelizer).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.serializer = (byte[]) iconCompat.IconCompatParcelizer;
                break;
            case 4:
            case 6:
                iconCompat.serializer = iconCompat.IconCompatParcelizer.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.PlaybackStateCompatCustomAction;
        if (-1 != i) {
            ceilslo4al4Var.write(i, 1);
        }
        byte[] bArr = iconCompat.serializer;
        if (bArr != null) {
            ceilslo4al4Var.serializer(2);
            Parcel parcel = ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.MediaSessionCompatQueueItem;
        if (parcelable != null) {
            ceilslo4al4Var.serializer(3);
            ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            ceilslo4al4Var.write(i2, 4);
        }
        int i3 = iconCompat.read;
        if (i3 != 0) {
            ceilslo4al4Var.write(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.MediaBrowserCompatMediaItem;
        if (colorStateList != null) {
            ceilslo4al4Var.serializer(6);
            ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.MediaDescriptionCompat;
        if (str != null) {
            ceilslo4al4Var.serializer(7);
            ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.writeString(str);
        }
        String str2 = iconCompat.RatingCompat;
        if (str2 != null) {
            ceilslo4al4Var.serializer(8);
            ((accessgetNegativeZerocp) ceilslo4al4Var).MediaDescriptionCompat.writeString(str2);
        }
    }
}
