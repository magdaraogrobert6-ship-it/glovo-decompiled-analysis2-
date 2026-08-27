package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.config.RemoteActionCompatParcelizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.accessgetSystemNavigationDowncp;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes4.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzao();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final boolean zzh;
    private final int zzi;

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.zza) * 1000;
    }

    public SleepClassifyEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = z;
        this.zzi = i8;
    }

    public static List<SleepClassifyEvent> extractEvents(Intent intent) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(intent);
        if (!hasEvents(intent)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bArr);
            arrayList2.add((SleepClassifyEvent) RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = this.zza;
        int i3 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i2);
        int confidence = getConfidence();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(confidence);
        int motion = getMotion();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(motion);
        int light = getLight();
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(light);
        int i4 = this.zze;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.zzf;
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.zzg;
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(i6);
        boolean z = this.zzh;
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        int i7 = this.zzi;
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeInt(i7);
        SQLite.serializer(i3, parcel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.zzc;
        int length3 = String.valueOf(i3).length();
        int i4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i4).length());
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(i, i2, " Conf:", " Motion:", sb);
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }
}
