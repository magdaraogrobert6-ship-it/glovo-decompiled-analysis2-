package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.FixedSizeIntrinsicsPlaceable;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new FixedSizeIntrinsicsPlaceable(7);
    public final float IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public final List PlaybackStateCompatCustomAction;
    public final float RatingCompat;
    public final float RemoteActionCompatParcelizer;
    public final int read;
    public final float serializer;
    public final Rect write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.write, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeFloat(this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeFloat(this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeFloat(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeFloat(this.RatingCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeFloat(this.MediaDescriptionCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeFloat(this.MediaSessionCompatQueueItem);
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeFloat(this.MediaMetadataCompat);
        Object[] objArr = {parcel, 10, this.MediaBrowserCompatMediaItem};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        Object[] objArr2 = {parcel, 11, this.PlaybackStateCompatCustomAction};
        int iSerializer2 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr2, getQueryParameterslambda2.serializer(), 36608644, iSerializer2);
        SQLite.serializer(i2, parcel);
    }

    public zzow(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList, ArrayList arrayList2) {
        this.read = i;
        this.write = rect;
        this.RemoteActionCompatParcelizer = f;
        this.serializer = f2;
        this.IconCompatParcelizer = f3;
        this.RatingCompat = f4;
        this.MediaDescriptionCompat = f5;
        this.MediaSessionCompatQueueItem = f6;
        this.MediaMetadataCompat = f7;
        this.MediaBrowserCompatMediaItem = arrayList;
        this.PlaybackStateCompatCustomAction = arrayList2;
    }
}
