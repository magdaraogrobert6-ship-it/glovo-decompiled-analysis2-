package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.sentry.config.RemoteActionCompatParcelizer;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.accessgetSystemNavigationDowncp;
import o.getQueryParameterslambda2;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzi();
    private final List zza;
    private Bundle zzb;

    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        this.zzb = null;
        accessgetSystemNavigationDowncp.serializer(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                int i2 = i - 1;
                accessgetSystemNavigationDowncp.serializer(list.get(i).getElapsedRealTimeNanos() >= list.get(i2).getElapsedRealTimeNanos(), "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(list.get(i).getElapsedRealTimeNanos()), Long.valueOf(list.get(i2).getElapsedRealTimeNanos()));
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) throws IOException {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = SQLite.read(20293, parcel);
        Object[] objArr = {parcel, 1, getTransitionEvents()};
        int iSerializer = getQueryParameterslambda2.serializer();
        SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -36608637, objArr, getQueryParameterslambda2.serializer(), 36608644, iSerializer);
        SQLite.IconCompatParcelizer(parcel, 2, this.zzb);
        SQLite.serializer(i2, parcel);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((ActivityTransitionResult) obj).zza);
    }

    public static ActivityTransitionResult extractResult(Intent intent) {
        if (hasResult(intent)) {
            return (ActivityTransitionResult) RemoteActionCompatParcelizer.serializer(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
        }
        return null;
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
