package com.google.android.gms.location;

import android.os.SystemClock;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.location.zzek;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 3;
        private long zzc = -1;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Builder setLoiteringDelay(int i) {
            this.zzi = i;
            return this;
        }

        public Builder setNotificationResponsiveness(int i) {
            this.zzh = i;
            return this;
        }

        public Builder setTransitionTypes(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setRequestId(String str) {
            accessgetSystemNavigationDowncp.serializer(str, "Request ID can't be set to null");
            this.zza = str;
            return this;
        }

        public Geofence build() {
            String str = this.zza;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Request ID not set.");
                return null;
            }
            int i = this.zzb;
            if (i == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Transitions types not set.");
                return null;
            }
            if ((i & 4) != 0 && this.zzi < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                return null;
            }
            long j = this.zzc;
            if (j == Long.MIN_VALUE) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expiration not set.");
                return null;
            }
            if (this.zzd == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Geofence region not set.");
                return null;
            }
            int i2 = this.zzh;
            if (i2 >= 0) {
                return new zzek(str, i, (short) 1, this.zze, this.zzf, this.zzg, j, i2, this.zzi);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Notification responsiveness should be nonnegative.");
            return null;
        }

        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = SystemClock.elapsedRealtime() + j;
            return this;
        }

        public Builder setCircularRegion(double d, double d2, float f) {
            boolean z = d >= -90.0d && d <= 90.0d;
            StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
            sb.append("Invalid latitude: ");
            sb.append(d);
            accessgetSystemNavigationDowncp.write(sb.toString(), z);
            boolean z2 = d2 >= -180.0d && d2 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(d2).length() + 19);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            accessgetSystemNavigationDowncp.write(sb2.toString(), z2);
            boolean z3 = f > 0.0f;
            StringBuilder sb3 = new StringBuilder(String.valueOf(f).length() + 16);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            accessgetSystemNavigationDowncp.write(sb3.toString(), z3);
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f;
            return this;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public @interface GeofenceTransition {
    }

    /* JADX INFO: loaded from: classes4.dex */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
