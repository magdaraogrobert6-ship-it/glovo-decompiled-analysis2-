package com.google.android.gms.internal.oss_licenses;

import android.os.Parcel;
import android.os.Parcelable;
import o.onDeactivate;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg implements Comparable<zzg>, Parcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new onDeactivate();
    public final long RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.serializer;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzg zzgVar) {
        return this.serializer.compareTo(zzgVar.serializer);
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serializer);
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.read);
    }

    public /* synthetic */ zzg(Parcel parcel) {
        this.serializer = parcel.readString();
        this.RemoteActionCompatParcelizer = parcel.readLong();
        this.read = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            return this.serializer.equals(((zzg) obj).serializer);
        }
        return false;
    }

    public zzg(String str, long j, int i) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = j;
        this.read = i;
    }
}
