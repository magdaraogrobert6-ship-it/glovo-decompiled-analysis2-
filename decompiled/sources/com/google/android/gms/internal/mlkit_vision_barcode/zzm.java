package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzh(29);
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 3, this.write);
        SQLite.serializer(parcel, 4, this.read);
        SQLite.serializer(parcel, 5, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 6, this.serializer);
        SQLite.serializer(parcel, 7, this.MediaDescriptionCompat);
        SQLite.serializer(parcel, 8, this.MediaSessionCompatQueueItem);
        SQLite.serializer(parcel, 9, this.RatingCompat);
        SQLite.serializer(parcel, 10, this.MediaMetadataCompat);
        SQLite.serializer(parcel, 11, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 12, this.MediaSessionCompatResultReceiverWrapper);
        SQLite.serializer(parcel, 13, this.MediaSessionCompatToken);
        SQLite.serializer(parcel, 14, this.ParcelableVolumeInfo);
        SQLite.serializer(parcel, 15, this.PlaybackStateCompatCustomAction);
        SQLite.serializer(i2, parcel);
    }
}
