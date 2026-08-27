package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzg();
    private final List zza;
    private final String zzb;
    private final List zzc;
    private String zzd;

    public final ActivityTransitionRequest zza(String str) {
        this.zzd = str;
        return this;
    }

    public int hashCode() {
        int iHashCode = this.zza.hashCode();
        String str = this.zzb;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        List list = this.zzc;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        String str2 = this.zzd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List list = this.zzc;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(list);
        String str = this.zzd;
        int length = strValueOf.length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + strValueOf2.length() + 18 + String.valueOf(str).length() + 1);
        c8$$ExternalSyntheticOutline0.m(sb, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str2);
        c8$$ExternalSyntheticOutline0.m(sb, "', mClients=", strValueOf2, ", mAttributionTag=", str);
        sb.append("]");
        return sb.toString();
    }

    public void serializeToIntentExtra(Intent intent) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(intent);
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", bArrMarshall);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IOException {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        List list = this.zza;
        int i2 = SQLite.read(20293, parcel);
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -36608637, new Object[]{parcel, 1, list}, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.serializer(parcel, 2, this.zzb);
        Object[] objArr = {parcel, 3, this.zzc};
        int iSerializer3 = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer3);
        SQLite.serializer(parcel, 4, this.zzd);
        SQLite.serializer(i2, parcel);
    }

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        accessgetSystemNavigationDowncp.serializer(list, "transitions can't be null");
        accessgetSystemNavigationDowncp.write("transitions can't be empty.", !list.isEmpty());
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            accessgetSystemNavigationDowncp.write(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        this.zzc = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.zzd = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
        return TuplesKt.write(this.zza, activityTransitionRequest.zza) && TuplesKt.write((Object) this.zzb, (Object) activityTransitionRequest.zzb) && TuplesKt.write((Object) this.zzd, (Object) activityTransitionRequest.zzd) && TuplesKt.write(this.zzc, activityTransitionRequest.zzc);
    }

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null, null);
    }
}
