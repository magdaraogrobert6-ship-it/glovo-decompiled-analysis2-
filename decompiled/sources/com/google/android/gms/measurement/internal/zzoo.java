package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import java.util.ArrayList;
import java.util.List;
import o.OnFirstVisibleModifierKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzq(17);
    public final List write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        List list = this.write;
        if (list != null) {
            int i3 = SQLite.read(1, parcel);
            int size = list.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                parcel.writeInt(((Integer) list.get(i4)).intValue());
            }
            SQLite.serializer(i3, parcel);
        }
        SQLite.serializer(i2, parcel);
    }

    public zzoo(ArrayList arrayList) {
        this.write = arrayList;
    }

    public static zzoo write(OnFirstVisibleModifierKt... onFirstVisibleModifierKtArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(onFirstVisibleModifierKtArr[0].zza()));
        return new zzoo(arrayList);
    }
}
