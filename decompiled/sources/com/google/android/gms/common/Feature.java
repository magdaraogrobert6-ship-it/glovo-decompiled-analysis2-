package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import kotlin.TuplesKt;
import o.accessgetGreencp;

/* JADX INFO: loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zza(5);
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final boolean write;

    public final long IconCompatParcelizer() {
        long j = this.IconCompatParcelizer;
        return j == -1 ? this.RemoteActionCompatParcelizer : j;
    }

    public final String toString() {
        accessgetGreencp accessgetgreencp = new accessgetGreencp(this);
        accessgetgreencp.IconCompatParcelizer(this.read, "name");
        accessgetgreencp.IconCompatParcelizer(Long.valueOf(IconCompatParcelizer()), "version");
        accessgetgreencp.IconCompatParcelizer(Boolean.valueOf(this.write), "is_fully_rolled_out");
        return accessgetgreencp.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 1, this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        long jIconCompatParcelizer = IconCompatParcelizer();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(jIconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.write ? 1 : 0);
        SQLite.serializer(i2, parcel);
    }

    public Feature(String str, int i, long j, boolean z) {
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = j;
        this.write = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return TuplesKt.write((Object) this.read, (Object) feature.read) && IconCompatParcelizer() == feature.IconCompatParcelizer() && this.write == feature.write;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.read, Long.valueOf(IconCompatParcelizer()), Boolean.valueOf(this.write)});
    }

    public Feature(String str, long j) {
        this(str, -1, j, false);
    }
}
