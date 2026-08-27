package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.config.RemoteActionCompatParcelizer;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzd();
    List zza;
    long zzb;
    long zzc;
    int zzd;
    Bundle zze;

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j = this.zzb;
        long j2 = this.zzc;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(j).length() + 24 + String.valueOf(j2).length() + 1);
        af$$ExternalSyntheticOutline0.m(sb, "ActivityRecognitionResult [probableActivities=", strValueOf, ", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IOException {
        int i2 = SQLite.read(20293, parcel);
        Object[] objArr = {parcel, 1, this.zza};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        long j = this.zzb;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.zzc;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(j2);
        int i3 = this.zzd;
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeInt(i3);
        SQLite.IconCompatParcelizer(parcel, 5, this.zze);
        SQLite.serializer(i2, parcel);
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zza.get(0);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    public static List zza(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return null;
        }
        Parcelable.Creator<ActivityRecognitionResult> creator = CREATOR;
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((byte[]) arrayList.get(i), creator));
        }
        return arrayList2;
    }

    public final int hashCode() {
        long j = this.zzb;
        long j2 = this.zzc;
        int i = this.zzd;
        return Arrays.hashCode(new Object[]{Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), this.zza, this.zze});
    }

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z = false;
        accessgetSystemNavigationDowncp.write("Must have at least 1 detected activity", (list == null || list.isEmpty()) ? false : true);
        if (j > 0 && j2 > 0) {
            z = true;
        }
        accessgetSystemNavigationDowncp.write("Must set times", z);
        this.zza = list;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
        this.zze = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && TuplesKt.write(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    public static ActivityRecognitionResult extractResult(Intent intent) {
        ActivityRecognitionResult activityRecognitionResult;
        Bundle extras;
        if (hasResult(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            } else {
                activityRecognitionResult = null;
            }
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return (ActivityRecognitionResult) listZza.get(listZza.size() - 1);
    }

    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (TuplesKt.write(Array.get(obj, i), Array.get(obj2, i))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(Collections.singletonList(detectedActivity), j, j2, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, null);
    }
}
