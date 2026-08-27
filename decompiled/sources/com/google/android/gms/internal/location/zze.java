package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zzq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o.getCieXyz;
import o.getNumPad7EK5gGoQ;
import o.getQueryParameterslambda2;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzq(8);
    public final getNumPad7EK5gGoQ IconCompatParcelizer;
    public final zze MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        int length = str.length();
        String str2 = this.write;
        StringBuilder sb = new StringBuilder(length + 18 + (str2 != null ? str2.length() : 0));
        sb.append(this.read);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.serializer;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, o.getNumPad5EK5gGoQ] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public zze(int i, String str, String str2, String str3, ArrayList arrayList, zze zzeVar) {
        str.getClass();
        if (zzeVar != null && zzeVar.MediaDescriptionCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            throw null;
        }
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3 == null ? zzeVar != null ? zzeVar.serializer : null : str3;
        if (arrayList == 0) {
            arrayList = zzeVar != null ? zzeVar.IconCompatParcelizer : 0;
            if (arrayList == 0) {
                arrayList = getNumPad7EK5gGoQ.RemoteActionCompatParcelizer();
                arrayList.getClass();
            }
        }
        getNumPad7EK5gGoQ getnumpad7ek5ggoqSerializer = getNumPad7EK5gGoQ.serializer(arrayList);
        getnumpad7ek5ggoqSerializer.getClass();
        this.IconCompatParcelizer = getnumpad7ek5ggoqSerializer;
        this.MediaDescriptionCompat = zzeVar;
    }

    static {
        Process.myUid();
        Process.myPid();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (this.read != zzeVar.read) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, zzeVar.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, zzeVar.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, zzeVar.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, zzeVar.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, zzeVar.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        parcel.getClass();
        int i2 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(this.read);
        SQLite.serializer(parcel, 3, this.RemoteActionCompatParcelizer);
        SQLite.serializer(parcel, 4, this.write);
        SQLite.serializer(parcel, 6, this.serializer);
        SQLite.RemoteActionCompatParcelizer(parcel, 7, this.MediaDescriptionCompat, i);
        Object[] objArr = {parcel, 8, this.IconCompatParcelizer};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.serializer(i2, parcel);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.serializer;
        zze zzeVar = this.MediaDescriptionCompat;
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), this.RemoteActionCompatParcelizer, this.write, str, zzeVar});
    }
}
