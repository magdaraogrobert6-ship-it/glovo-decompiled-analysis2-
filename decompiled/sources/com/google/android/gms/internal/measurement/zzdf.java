package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new zza(8);
    public final Intent IconCompatParcelizer;
    public final String read;
    public final int serializer;

    public final int hashCode() {
        return this.serializer;
    }

    public static zzdf IconCompatParcelizer(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.serializer);
        SQLite.serializer(parcel, 2, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, this.IconCompatParcelizer, i);
        SQLite.serializer(i2, parcel);
    }

    public zzdf(int i, String str, Intent intent) {
        this.serializer = i;
        this.read = str;
        this.IconCompatParcelizer = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.serializer == zzdfVar.serializer && Objects.equals(this.read, zzdfVar.read) && Objects.equals(this.IconCompatParcelizer, zzdfVar.IconCompatParcelizer);
    }
}
