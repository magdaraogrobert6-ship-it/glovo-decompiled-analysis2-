package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzq(13);
    public boolean IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public zzbg MediaMetadataCompat;
    public final zzbg MediaSessionCompatQueueItem;
    public final zzbg MediaSessionCompatResultReceiverWrapper;
    public final long RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public zzpl serializer;
    public long write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 3, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, this.serializer, i);
        long j = this.write;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.IconCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        SQLite.serializer(parcel, 7, this.MediaDescriptionCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, this.MediaSessionCompatQueueItem, i);
        long j2 = this.MediaBrowserCompatMediaItem;
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 8);
        parcel.writeLong(j2);
        SQLite.RemoteActionCompatParcelizer(parcel, 10, this.MediaMetadataCompat, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 11, 8);
        parcel.writeLong(this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 12, this.MediaSessionCompatResultReceiverWrapper, i);
        SQLite.serializer(i2, parcel);
    }

    public zzah(zzah zzahVar) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzahVar);
        this.RemoteActionCompatParcelizer = zzahVar.RemoteActionCompatParcelizer;
        this.read = zzahVar.read;
        this.serializer = zzahVar.serializer;
        this.write = zzahVar.write;
        this.IconCompatParcelizer = zzahVar.IconCompatParcelizer;
        this.MediaDescriptionCompat = zzahVar.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = zzahVar.MediaSessionCompatQueueItem;
        this.MediaBrowserCompatMediaItem = zzahVar.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = zzahVar.MediaMetadataCompat;
        this.RatingCompat = zzahVar.RatingCompat;
        this.MediaSessionCompatResultReceiverWrapper = zzahVar.MediaSessionCompatResultReceiverWrapper;
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbg zzbgVar, long j2, zzbg zzbgVar2, long j3, zzbg zzbgVar3) {
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.serializer = zzplVar;
        this.write = j;
        this.IconCompatParcelizer = z;
        this.MediaDescriptionCompat = str3;
        this.MediaSessionCompatQueueItem = zzbgVar;
        this.MediaBrowserCompatMediaItem = j2;
        this.MediaMetadataCompat = zzbgVar2;
        this.RatingCompat = j3;
        this.MediaSessionCompatResultReceiverWrapper = zzbgVar3;
    }
}
