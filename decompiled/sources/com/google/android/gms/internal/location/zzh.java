package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public final String IconCompatParcelizer;
    public final DeviceOrientationRequest RemoteActionCompatParcelizer;
    public final List read;
    public static final List write = Collections.EMPTY_LIST;
    public static final DeviceOrientationRequest serializer = new DeviceOrientationRequest.Builder(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
    public static final Parcelable.Creator<zzh> CREATOR = new zzq(9);

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.RemoteActionCompatParcelizer);
        String strValueOf2 = String.valueOf(this.read);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        c8$$ExternalSyntheticOutline0.m(sb, "DeviceOrientationRequestInternal[deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return d$$ExternalSyntheticOutline0.m(sb, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, this.RemoteActionCompatParcelizer, i);
        Object[] objArr = {parcel, 2, this.read};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.RemoteActionCompatParcelizer = deviceOrientationRequest;
        this.read = list;
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return TuplesKt.write(this.RemoteActionCompatParcelizer, zzhVar.RemoteActionCompatParcelizer) && TuplesKt.write(this.read, zzhVar.read) && TuplesKt.write((Object) this.IconCompatParcelizer, (Object) zzhVar.IconCompatParcelizer);
    }
}
