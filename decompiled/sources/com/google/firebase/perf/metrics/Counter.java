package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new zza(13);
    public final AtomicLong IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeLong(this.IconCompatParcelizer.get());
    }

    public Counter(Parcel parcel) {
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.IconCompatParcelizer = new AtomicLong(parcel.readLong());
    }

    public Counter(String str) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new AtomicLong(0L);
    }
}
