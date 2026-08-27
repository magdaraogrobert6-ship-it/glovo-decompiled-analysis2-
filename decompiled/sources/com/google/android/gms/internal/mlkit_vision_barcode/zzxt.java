package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzh(20);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.IconCompatParcelizer);
        SQLite.serializer(parcel, 2, this.write);
        SQLite.serializer(parcel, 3, this.serializer);
        SQLite.serializer(parcel, 4, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 5, this.read);
        SQLite.serializer(parcel, 6, this.MediaDescriptionCompat);
        SQLite.serializer(parcel, 7, this.RatingCompat);
        SQLite.serializer(parcel, 8, this.MediaSessionCompatQueueItem);
        SQLite.serializer(parcel, 9, this.MediaBrowserCompatMediaItem);
        SQLite.serializer(parcel, 10, this.MediaMetadataCompat);
        SQLite.serializer(parcel, 11, this.ParcelableVolumeInfo);
        SQLite.serializer(parcel, 12, this.PlaybackStateCompat);
        SQLite.serializer(parcel, 13, this.MediaSessionCompatToken);
        SQLite.serializer(parcel, 14, this.MediaSessionCompatResultReceiverWrapper);
        SQLite.serializer(i2, parcel);
    }

    public zzxt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.MediaDescriptionCompat = str6;
        this.RatingCompat = str7;
        this.MediaSessionCompatQueueItem = str8;
        this.MediaBrowserCompatMediaItem = str9;
        this.MediaMetadataCompat = str10;
        this.ParcelableVolumeInfo = str11;
        this.PlaybackStateCompat = str12;
        this.MediaSessionCompatToken = str13;
        this.MediaSessionCompatResultReceiverWrapper = str14;
    }
}
