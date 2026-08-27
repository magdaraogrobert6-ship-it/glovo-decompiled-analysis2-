package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.FixedSizeIntrinsicsPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new FixedSizeIntrinsicsPlaceable(8);
    public final int IconCompatParcelizer;
    public final PointF serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.serializer, i);
        SQLite.serializer(i2, parcel);
    }

    public zzpc(int i, PointF pointF) {
        this.IconCompatParcelizer = i;
        this.serializer = pointF;
    }
}
