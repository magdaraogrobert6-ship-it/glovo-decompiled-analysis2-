package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq(0);
    public final String IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final Context RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.serializer ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.read ? 1 : 0);
        SQLite.write(parcel, 4, new ObjectWrapper(this.RemoteActionCompatParcelizer));
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(this.MediaBrowserCompatMediaItem ? 1 : 0);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.IconCompatParcelizer = str;
        this.serializer = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = (Context) ObjectWrapper.unwrap(ObjectWrapper.asInterface(iBinder));
        this.write = z3;
        this.MediaBrowserCompatMediaItem = z4;
        this.MediaDescriptionCompat = z5;
    }
}
