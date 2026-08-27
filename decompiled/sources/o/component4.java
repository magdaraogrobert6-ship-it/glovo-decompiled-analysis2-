package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class component4 {
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final getDateMillisOrDefault MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public Object[] MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final AndroidContentCaptureManagersendContentCaptureAppearEvents1 ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final int[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public int write;

    public final void write() {
        this.read = true;
        AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1 = this.ParcelableVolumeInfo;
        if (androidContentCaptureManagersendContentCaptureAppearEvents1.RatingCompat <= 0) {
            getCreditCardExpirationDay.read("Unexpected reader close()");
        }
        androidContentCaptureManagersendContentCaptureAppearEvents1.RatingCompat--;
        this.MediaSessionCompatResultReceiverWrapper = new Object[0];
    }

    public final Object RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i < this.serializer) {
            return read(this.RatingCompat, i);
        }
        return 0;
    }

    public final AndroidContentCaptureManagercurrentSemanticsNodes1 read(int i) {
        ArrayList arrayList = this.ParcelableVolumeInfo.read;
        int iWrite = AbstractC0170getTimestamp.write(arrayList, i, this.MediaSessionCompatQueueItem);
        if (iWrite >= 0) {
            return (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(iWrite);
        }
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = new AndroidContentCaptureManagercurrentSemanticsNodes1(i);
        arrayList.add(-(iWrite + 1), androidContentCaptureManagercurrentSemanticsNodes1);
        return androidContentCaptureManagercurrentSemanticsNodes1;
    }

    public final int serializer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i < this.serializer) {
            return this.RatingCompat[i * 5];
        }
        return 0;
    }

    public final Object serializer(int i, int i2) {
        int[] iArr = this.RatingCompat;
        int i3 = AbstractC0170getTimestamp.read(iArr, i);
        int i4 = i + 1;
        int i5 = i3 + i2;
        return i5 < (i4 < this.MediaSessionCompatQueueItem ? iArr[(i4 * 5) + 4] : this.MediaSessionCompatToken) ? this.MediaSessionCompatResultReceiverWrapper[i5] : getCreditCardExpirationMonth.write;
    }

    public final int write(int i) {
        return this.RatingCompat[i * 5];
    }

    public component4(AndroidContentCaptureManagersendContentCaptureAppearEvents1 androidContentCaptureManagersendContentCaptureAppearEvents1) {
        this.ParcelableVolumeInfo = androidContentCaptureManagersendContentCaptureAppearEvents1;
        this.RatingCompat = androidContentCaptureManagersendContentCaptureAppearEvents1.RemoteActionCompatParcelizer;
        int i = androidContentCaptureManagersendContentCaptureAppearEvents1.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = i;
        this.MediaSessionCompatResultReceiverWrapper = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaDescriptionCompat;
        this.MediaSessionCompatToken = androidContentCaptureManagersendContentCaptureAppearEvents1.MediaSessionCompatQueueItem;
        this.serializer = i;
        this.PlaybackStateCompat = -1;
        this.MediaMetadataCompat = new getDateMillisOrDefault(0);
    }

    public final void IconCompatParcelizer() {
        if (this.MediaDescriptionCompat == 0) {
            if (this.RemoteActionCompatParcelizer != this.serializer) {
                getCreditCardExpirationDay.read("endGroup() not called at the end of a group");
            }
            int i = this.PlaybackStateCompat;
            int[] iArr = this.RatingCompat;
            int i2 = iArr[(i * 5) + 2];
            this.PlaybackStateCompat = i2;
            int i3 = this.MediaSessionCompatQueueItem;
            this.serializer = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer < 0) {
                this.IconCompatParcelizer = 0;
                this.write = 0;
            } else {
                this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
                this.write = i2 >= i3 + (-1) ? this.MediaSessionCompatToken : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final boolean IconCompatParcelizer(int i) {
        return (this.RatingCompat[(i * 5) + 1] & 536870912) != 0;
    }

    public final void MediaBrowserCompatMediaItem() {
        if (this.MediaDescriptionCompat <= 0) {
            int i = this.PlaybackStateCompat;
            int i2 = this.RemoteActionCompatParcelizer;
            int i3 = i2 * 5;
            int[] iArr = this.RatingCompat;
            if (iArr[i3 + 2] != i) {
                getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Invalid slot table detected");
            }
            int i4 = this.IconCompatParcelizer;
            int i5 = this.write;
            getDateMillisOrDefault getdatemillisordefault = this.MediaMetadataCompat;
            if (i4 == 0 && i5 == 0) {
                getdatemillisordefault.IconCompatParcelizer(-1);
            } else {
                getdatemillisordefault.IconCompatParcelizer(i4);
            }
            this.PlaybackStateCompat = i2;
            this.serializer = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.RemoteActionCompatParcelizer = i6;
            this.IconCompatParcelizer = AbstractC0170getTimestamp.read(iArr, i2);
            this.write = i2 >= this.MediaSessionCompatQueueItem + (-1) ? this.MediaSessionCompatToken : iArr[(i6 * 5) + 4];
        }
    }

    public final boolean MediaBrowserCompatMediaItem(int i) {
        return (this.RatingCompat[(i * 5) + 1] & 1073741824) != 0;
    }

    public final int MediaDescriptionCompat(int i) {
        return this.RatingCompat[(i * 5) + 1] & 67108863;
    }

    public final Object MediaMetadataCompat(int i) {
        int i2 = i * 5;
        int[] iArr = this.RatingCompat;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 == 0) {
            return null;
        }
        if (i3 != 0) {
            return this.MediaSessionCompatResultReceiverWrapper[iArr[i2 + 4]];
        }
        return getCreditCardExpirationMonth.write;
    }

    public final int MediaSessionCompatQueueItem(int i) {
        return this.RatingCompat[(i * 5) + 2];
    }

    public final Object RemoteActionCompatParcelizer(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.MediaSessionCompatResultReceiverWrapper[AbstractC0170getTimestamp.write(iArr, i)];
        }
        return null;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        return (this.RatingCompat[(i * 5) + 1] & 134217728) != 0;
    }

    public final Object read() {
        int i;
        if (this.MediaDescriptionCompat > 0 || (i = this.IconCompatParcelizer) >= this.write) {
            this.MediaBrowserCompatMediaItem = false;
            return getCreditCardExpirationMonth.write;
        }
        this.MediaBrowserCompatMediaItem = true;
        Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
        this.IconCompatParcelizer = i + 1;
        return objArr[i];
    }

    public final Object read(int[] iArr, int i) {
        int iBitCount;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
            if (i2 >= iArr.length) {
                iBitCount = iArr.length;
            } else {
                iBitCount = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
            }
            return objArr[iBitCount];
        }
        return getCreditCardExpirationMonth.write;
    }

    public final boolean serializer(int i) {
        return (this.RatingCompat[(i * 5) + 1] & 67108864) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", key=");
        sb.append(serializer());
        sb.append(", parent=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", end=");
        return af$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }

    public final int RatingCompat() {
        if (this.MediaDescriptionCompat != 0) {
            getCreditCardExpirationDay.read("Cannot skip while in an empty region");
        }
        int i = this.RemoteActionCompatParcelizer;
        int i2 = i * 5;
        int[] iArr = this.RatingCompat;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.RemoteActionCompatParcelizer = iArr[i2 + 3] + i;
        return i4;
    }

    public final void RatingCompat(int i) {
        if (this.MediaDescriptionCompat != 0) {
            getCreditCardExpirationDay.read("Cannot reposition while in an empty region");
        }
        this.RemoteActionCompatParcelizer = i;
        int[] iArr = this.RatingCompat;
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.PlaybackStateCompat) {
            this.PlaybackStateCompat = i3;
            if (i3 < 0) {
                this.serializer = i2;
            } else {
                this.serializer = iArr[(i3 * 5) + 3] + i3;
            }
            this.IconCompatParcelizer = 0;
            this.write = 0;
        }
    }

    public final void MediaMetadataCompat() {
        if (this.MediaDescriptionCompat != 0) {
            getCreditCardExpirationDay.read("Cannot skip the enclosing group while in an empty region");
        }
        this.RemoteActionCompatParcelizer = this.serializer;
        this.IconCompatParcelizer = 0;
        this.write = 0;
    }
}
