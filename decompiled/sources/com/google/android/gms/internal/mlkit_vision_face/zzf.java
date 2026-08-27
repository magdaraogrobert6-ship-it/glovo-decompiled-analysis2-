package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new FixedSizeIntrinsicsPlaceable(1);
    public final int IconCompatParcelizer;
    public final float MediaBrowserCompatMediaItem;
    public final zzn[] MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public final float MediaSessionCompatResultReceiverWrapper;
    public final float MediaSessionCompatToken;
    public final float ParcelableVolumeInfo;
    public final zzd[] PlaybackStateCompat;
    public final float PlaybackStateCompatCustomAction;
    public final float RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeFloat(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeFloat(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeFloat(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeFloat(this.MediaSessionCompatQueueItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeFloat(this.MediaMetadataCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeFloat(this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 9, this.MediaDescriptionCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 10, 4);
        parcel.writeFloat(this.PlaybackStateCompatCustomAction);
        SQLite.RemoteActionCompatParcelizer(parcel, 11, 4);
        parcel.writeFloat(this.ParcelableVolumeInfo);
        SQLite.RemoteActionCompatParcelizer(parcel, 12, 4);
        parcel.writeFloat(this.MediaSessionCompatResultReceiverWrapper);
        SQLite.serializer(parcel, 13, this.PlaybackStateCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 14, 4);
        parcel.writeFloat(this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 15, 4);
        parcel.writeFloat(this.MediaSessionCompatToken);
        SQLite.serializer(i2, parcel);
    }

    public zzf(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, zzn[] zznVarArr, float f8, float f9, float f10, zzd[] zzdVarArr, float f11) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.read = f;
        this.write = f2;
        this.serializer = f3;
        this.MediaSessionCompatQueueItem = f4;
        this.MediaMetadataCompat = f5;
        this.MediaBrowserCompatMediaItem = f6;
        this.RatingCompat = f7;
        this.MediaDescriptionCompat = zznVarArr;
        this.PlaybackStateCompatCustomAction = f8;
        this.ParcelableVolumeInfo = f9;
        this.MediaSessionCompatResultReceiverWrapper = f10;
        this.PlaybackStateCompat = zzdVarArr;
        this.MediaSessionCompatToken = f11;
    }
}
