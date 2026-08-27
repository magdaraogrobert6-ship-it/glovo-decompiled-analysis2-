package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.accessgetNumPadCommacp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements accessgetNumPadCommacp {
    public static final Parcelable.Creator<zag> CREATOR = new zzq(20);
    public final List IconCompatParcelizer;
    public final String serializer;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        Object[] objArr = {parcel, 1, this.IconCompatParcelizer};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 690290684, objArr, getQueryParameterslambda2.serializer(), -690290681, iSerializer);
        SQLite.serializer(parcel, 2, this.serializer);
        SQLite.serializer(i2, parcel);
    }

    public zag(ArrayList arrayList, String str) {
        this.IconCompatParcelizer = arrayList;
        this.serializer = str;
    }

    @Override // o.accessgetNumPadCommacp
    public final Status getStatus() {
        return this.serializer != null ? Status.IconCompatParcelizer : Status.serializer;
    }
}
