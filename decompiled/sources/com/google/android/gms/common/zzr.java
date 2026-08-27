package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o.accessgetTvZoomModecp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzq(2);
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final boolean serializer;
    public final long write;

    public final boolean IconCompatParcelizer() {
        return this.serializer;
    }

    public final String serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int read() {
        return accessgetTvZoomModecp.write(this.IconCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.serializer ? 1 : 0);
        SQLite.serializer(parcel, 2, this.RemoteActionCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(this.IconCompatParcelizer);
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(this.read);
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(this.write);
        SQLite.serializer(i2, parcel);
    }

    public zzr(int i, int i2, long j, String str, boolean z) {
        int i3;
        this.serializer = z;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = accessgetTvZoomModecp.write(i) - 1;
        int[] iArr = {1, 2, 3};
        for (int i4 = 0; i4 < 3; i4++) {
            i3 = iArr[i4];
            if (i3 == 0) {
                throw null;
            }
            if (i3 - 1 == i2) {
                this.read = i3 - 1;
                this.write = j;
            }
        }
        i3 = 1;
        this.read = i3 - 1;
        this.write = j;
    }

    public final int RemoteActionCompatParcelizer() {
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                if (i2 - 1 == this.read) {
                    return i2;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
