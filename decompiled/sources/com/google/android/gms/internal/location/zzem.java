package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import java.io.IOException;
import java.util.List;
import o.getNumPad3EK5gGoQ;
import o.getNumPad5EK5gGoQ;
import o.getNumPad7EK5gGoQ;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new zzq(7);
    public final String IconCompatParcelizer;
    public final PendingIntent RemoteActionCompatParcelizer;
    public final getNumPad7EK5gGoQ read;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        Object[] objArr = {parcel, 1, this.read};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 690290684, objArr, getQueryParameterslambda2.serializer(), -690290681, iSerializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, this.RemoteActionCompatParcelizer, i);
        SQLite.serializer(parcel, 3, this.IconCompatParcelizer);
        SQLite.serializer(i2, parcel);
    }

    public zzem(List list, PendingIntent pendingIntent, String str) {
        getNumPad7EK5gGoQ getnumpad7ek5ggoqSerializer;
        if (list == null) {
            getNumPad3EK5gGoQ getnumpad3ek5ggoq = getNumPad7EK5gGoQ.RemoteActionCompatParcelizer;
            getnumpad7ek5ggoqSerializer = getNumPad5EK5gGoQ.serializer;
        } else {
            getnumpad7ek5ggoqSerializer = getNumPad7EK5gGoQ.serializer(list);
        }
        this.read = getnumpad7ek5ggoqSerializer;
        this.RemoteActionCompatParcelizer = pendingIntent;
        this.IconCompatParcelizer = str;
    }
}
