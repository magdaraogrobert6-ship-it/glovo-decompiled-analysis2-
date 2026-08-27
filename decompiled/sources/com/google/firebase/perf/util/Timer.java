package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.zza;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new zza(16);
    public long read;
    public long serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Timer() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), SystemClock.elapsedRealtimeNanos() / 1000);
    }

    public final long read() {
        return new Timer().serializer - this.serializer;
    }

    public final void write() {
        this.read = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.serializer = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.read);
        parcel.writeLong(this.serializer);
    }

    public final long IconCompatParcelizer(Timer timer) {
        return timer.serializer - this.serializer;
    }

    public Timer(long j, long j2) {
        this.read = j;
        this.serializer = j2;
    }
}
