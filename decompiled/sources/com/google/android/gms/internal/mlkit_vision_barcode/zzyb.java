package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new zzh(15);
    public final byte[] IconCompatParcelizer;
    public final zzya MediaBrowserCompatMediaItem;
    public final zzxu MediaDescriptionCompat;
    public final zzxx MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final zzxz MediaSessionCompatResultReceiverWrapper;
    public final zzxv MediaSessionCompatToken;
    public final zzxt ParcelableVolumeInfo;
    public final zzxs PlaybackStateCompat;
    public final zzxr PlaybackStateCompatCustomAction;
    public final zzxy RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final Point[] write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.read);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 3, this.serializer);
        SQLite.IconCompatParcelizer(parcel, 4, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 5, this.write, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.MediaSessionCompatQueueItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.MediaDescriptionCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, this.MediaMetadataCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, this.RatingCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 10, this.MediaBrowserCompatMediaItem, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 11, this.MediaSessionCompatResultReceiverWrapper, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 12, this.MediaSessionCompatToken, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 13, this.PlaybackStateCompatCustomAction, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 14, this.PlaybackStateCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 15, this.ParcelableVolumeInfo, i);
        SQLite.serializer(i2, parcel);
    }

    public zzyb(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
        this.IconCompatParcelizer = bArr;
        this.write = pointArr;
        this.MediaSessionCompatQueueItem = i2;
        this.MediaDescriptionCompat = zzxuVar;
        this.MediaMetadataCompat = zzxxVar;
        this.RatingCompat = zzxyVar;
        this.MediaBrowserCompatMediaItem = zzyaVar;
        this.MediaSessionCompatResultReceiverWrapper = zzxzVar;
        this.MediaSessionCompatToken = zzxvVar;
        this.PlaybackStateCompatCustomAction = zzxrVar;
        this.PlaybackStateCompat = zzxsVar;
        this.ParcelableVolumeInfo = zzxtVar;
    }
}
