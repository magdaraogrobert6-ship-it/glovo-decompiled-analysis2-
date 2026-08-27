package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzh(10);
    public boolean ComponentActivity;
    public int IconCompatParcelizer;
    public zzq MediaBrowserCompatMediaItem;
    public zzt MediaDescriptionCompat;
    public zzs MediaMetadataCompat;
    public zzn MediaSessionCompatQueueItem;
    public byte[] MediaSessionCompatResultReceiverWrapper;
    public zzk MediaSessionCompatToken;
    public zzl ParcelableVolumeInfo;
    public zzo PlaybackStateCompat;
    public zzm PlaybackStateCompatCustomAction;
    public zzr RatingCompat;
    public String RemoteActionCompatParcelizer;
    public double r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Point[] read;
    public String serializer;
    public int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        int i3 = this.write;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i3);
        SQLite.serializer(parcel, 3, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 4, this.serializer);
        int i4 = this.IconCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(i4);
        SQLite.serializer(parcel, 6, this.read, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.MediaSessionCompatQueueItem, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, this.MediaBrowserCompatMediaItem, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, this.RatingCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 10, this.MediaDescriptionCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 11, this.MediaMetadataCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 12, this.PlaybackStateCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 13, this.MediaSessionCompatToken, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 14, this.ParcelableVolumeInfo, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 15, this.PlaybackStateCompatCustomAction, i);
        SQLite.IconCompatParcelizer(parcel, 16, this.MediaSessionCompatResultReceiverWrapper);
        boolean z = this.ComponentActivity;
        SQLite.RemoteActionCompatParcelizer(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        SQLite.RemoteActionCompatParcelizer(parcel, 18, 8);
        parcel.writeDouble(d);
        SQLite.serializer(i2, parcel);
    }
}
