package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new FixedSizeIntrinsicsPlaceable(0);
    public final int IconCompatParcelizer;
    public final PointF[] RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer, i);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzd(PointF[] pointFArr, int i) {
        this.RemoteActionCompatParcelizer = pointFArr;
        this.IconCompatParcelizer = i;
    }
}
