package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zze();
    private final int zza;
    private final int zzb;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        public Builder setActivityType(int i) {
            this.zza = i;
            return this;
        }

        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.zzb = i;
            return this;
        }

        public ActivityTransition build() {
            accessgetSystemNavigationDowncp.serializer("Activity type not set.", this.zza != -1);
            accessgetSystemNavigationDowncp.serializer("Activity transition type not set.", this.zzb != -1);
            return new ActivityTransition(this.zza, this.zzb);
        }
    }

    public ActivityTransition(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zza == activityTransition.zza && this.zzb == activityTransition.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(parcel);
        int i2 = SQLite.read(20293, parcel);
        int activityType = getActivityType();
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(activityType);
        int transitionType = getTransitionType();
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(transitionType);
        SQLite.serializer(i2, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int i = this.zza;
        int length = String.valueOf(i).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(i2).length() + 1);
        c8$$ExternalSyntheticOutline0.m(i, i2, "ActivityTransition [mActivityType=", ", mTransitionType=", sb);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0006  */
    public static void zza(int i) {
        boolean z;
        if (i >= 0) {
            z = i <= 1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        accessgetSystemNavigationDowncp.write(sb.toString(), z);
    }
}
