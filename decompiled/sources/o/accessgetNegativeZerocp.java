package o;

import android.os.Parcel;
import android.util.SparseIntArray;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetNegativeZerocp extends ceilslo4al4 {
    public final int MediaBrowserCompatMediaItem;
    public final Parcel MediaDescriptionCompat;
    public final SparseIntArray MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final String ParcelableVolumeInfo;
    public int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public int write;

    @Override // o.ceilslo4al4
    public final boolean IconCompatParcelizer(int i) {
        while (true) {
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.RatingCompat;
            if (i2 >= this.RemoteActionCompatParcelizer) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.MediaSessionCompatQueueItem;
            Parcel parcel = this.MediaDescriptionCompat;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.RatingCompat = parcel.readInt();
            this.MediaSessionCompatQueueItem += i5;
        }
    }

    @Override // o.ceilslo4al4
    public final accessgetNegativeZerocp read() {
        Parcel parcel = this.MediaDescriptionCompat;
        int iDataPosition = parcel.dataPosition();
        int i = this.MediaSessionCompatQueueItem;
        if (i == this.MediaBrowserCompatMediaItem) {
            i = this.RemoteActionCompatParcelizer;
        }
        return new accessgetNegativeZerocp(parcel, iDataPosition, i, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.ParcelableVolumeInfo, "  "), this.read, this.IconCompatParcelizer, this.serializer);
    }

    @Override // o.ceilslo4al4
    public final void serializer(int i) {
        int i2 = this.write;
        SparseIntArray sparseIntArray = this.MediaMetadataCompat;
        Parcel parcel = this.MediaDescriptionCompat;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.write = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public accessgetNegativeZerocp(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ImageKt(0), new ImageKt(0), new ImageKt(0));
    }

    public accessgetNegativeZerocp(Parcel parcel, int i, int i2, String str, ImageKt imageKt, ImageKt imageKt2, ImageKt imageKt3) {
        super(imageKt, imageKt2, imageKt3);
        this.MediaMetadataCompat = new SparseIntArray();
        this.write = -1;
        this.RatingCompat = -1;
        this.MediaDescriptionCompat = parcel;
        this.MediaBrowserCompatMediaItem = i;
        this.RemoteActionCompatParcelizer = i2;
        this.MediaSessionCompatQueueItem = i;
        this.ParcelableVolumeInfo = str;
    }
}
