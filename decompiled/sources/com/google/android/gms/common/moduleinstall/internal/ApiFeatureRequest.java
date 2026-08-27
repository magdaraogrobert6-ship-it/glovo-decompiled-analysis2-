package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.location.nlp.scan.FB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.TuplesKt;
import o.accessgetNumPad9cp;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zzd(27);
    public final boolean IconCompatParcelizer;
    public final List read;
    public final String serializer;
    public final String write;

    public static ApiFeatureRequest serializer(List list, boolean z) {
        TreeSet treeSet = new TreeSet(FB.RemoteActionCompatParcelizer);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((accessgetNumPad9cp) it.next()).write());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        Object[] objArr = {parcel, 1, this.read};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        SQLite.serializer(parcel, 3, this.serializer);
        SQLite.serializer(parcel, 4, this.write);
        SQLite.serializer(i2, parcel);
    }

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(arrayList);
        this.read = arrayList;
        this.IconCompatParcelizer = z;
        this.serializer = str;
        this.write = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.IconCompatParcelizer == apiFeatureRequest.IconCompatParcelizer && TuplesKt.write(this.read, apiFeatureRequest.read) && TuplesKt.write((Object) this.serializer, (Object) apiFeatureRequest.serializer) && TuplesKt.write((Object) this.write, (Object) apiFeatureRequest.write);
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        String str = this.serializer;
        String str2 = this.write;
        return Arrays.hashCode(new Object[]{Boolean.valueOf(z), this.read, str, str2});
    }
}
