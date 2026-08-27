package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new com.google.android.gms.common.api.zzd(22);
    public List IconCompatParcelizer;
    public final int write;

    public final List IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.write);
        Object[] objArr = {parcel, 2, this.IconCompatParcelizer};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.serializer(i2, parcel);
    }

    public TelemetryData(int i, List list) {
        this.write = i;
        this.IconCompatParcelizer = list;
    }

    public final void serializer(MethodInvocation methodInvocation) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new ArrayList();
        }
        this.IconCompatParcelizer.add(methodInvocation);
    }
}
