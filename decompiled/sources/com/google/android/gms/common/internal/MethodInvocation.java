package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new com.google.android.gms.common.api.zzd(24);
    public final int IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final int serializer;
    public final int write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.write);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 8);
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(this.read);
        SQLite.serializer(parcel, 6, this.MediaMetadataCompat);
        SQLite.serializer(parcel, 7, this.MediaBrowserCompatMediaItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeInt(this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeInt(this.MediaSessionCompatQueueItem);
        SQLite.serializer(i2, parcel);
    }

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.serializer = i;
        this.write = i2;
        this.IconCompatParcelizer = i3;
        this.RemoteActionCompatParcelizer = j;
        this.read = j2;
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.RatingCompat = i4;
        this.MediaSessionCompatQueueItem = i5;
    }
}
