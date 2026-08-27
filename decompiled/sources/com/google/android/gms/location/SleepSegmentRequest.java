package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final int CLASSIFY_EVENTS_ONLY = 2;
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzaq();
    public static final int SEGMENT_AND_CLASSIFY_EVENTS = 0;
    public static final int SEGMENT_EVENTS_ONLY = 1;
    private final List zza;
    private final int zzb;

    public int getRequestedDataType() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    public SleepSegmentRequest(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IOException {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        List list = this.zza;
        int i2 = SQLite.read(20293, parcel);
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -36608637, new Object[]{parcel, 1, list}, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        int requestedDataType = getRequestedDataType();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(requestedDataType);
        SQLite.serializer(i2, parcel);
    }

    public static SleepSegmentRequest getDefaultSleepSegmentRequest() {
        return new SleepSegmentRequest(null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return TuplesKt.write(this.zza, sleepSegmentRequest.zza) && this.zzb == sleepSegmentRequest.zzb;
    }

    public SleepSegmentRequest(int i) {
        this(null, i);
    }
}
