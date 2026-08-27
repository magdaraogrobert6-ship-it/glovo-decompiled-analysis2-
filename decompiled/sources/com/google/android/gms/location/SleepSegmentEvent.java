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
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzap();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    public long getEndTimeMillis() {
        return this.zzb;
    }

    public long getStartTimeMillis() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzc;
    }

    public long getSegmentDurationMillis() {
        return this.zzb - this.zza;
    }

    public static List<SleepSegmentEvent> extractEvents(Intent intent) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(intent);
        if (!hasEvents(intent)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bArr);
            arrayList2.add((SleepSegmentEvent) RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SleepSegmentEvent)) {
            return false;
        }
        SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
        return this.zza == sleepSegmentEvent.getStartTimeMillis() && this.zzb == sleepSegmentEvent.getEndTimeMillis() && this.zzc == sleepSegmentEvent.getStatus() && this.zzd == sleepSegmentEvent.zzd && this.zze == sleepSegmentEvent.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = SQLite.read(20293, parcel);
        long startTimeMillis = getStartTimeMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 8);
        parcel.writeLong(startTimeMillis);
        long endTimeMillis = getEndTimeMillis();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(endTimeMillis);
        int status = getStatus();
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(status);
        int i3 = this.zzd;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.zze;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeInt(i4);
        SQLite.serializer(i2, parcel);
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        int i = this.zzc;
        StringBuilder sb = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i).length());
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, "startMillis=", j, ", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    public SleepSegmentEvent(long j, long j2, int i, int i2, int i3) {
        accessgetSystemNavigationDowncp.write("endTimeMillis must be greater than or equal to startTimeMillis", j <= j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }
}
