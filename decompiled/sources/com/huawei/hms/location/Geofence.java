package com.huawei.hms.location;

import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.api.entity.location.fence.GeofenceEntity;

/* JADX INFO: loaded from: classes4.dex */
public interface Geofence {
    public static final int CONVERSIONS_MAX = 7;
    public static final int CONVERSIONS_MIN = 0;
    public static final long DEFAULT_DURATION = -2;
    public static final int DEFAULT_INTERVAL = 0;
    public static final int DWELL_GEOFENCE_CONVERSION = 4;
    public static final int ENTER_GEOFENCE_CONVERSION = 1;
    public static final int EXIT_GEOFENCE_CONVERSION = 2;
    public static final long GEOFENCE_NEVER_EXPIRE = -1;

    public static final class Builder {
        private double latitude;
        private double longitude;
        private float radius;
        private String uniqueId = null;
        private int conversions = 0;
        private long validDuration = -2;
        private int notificationInterval = 0;
        private int dwellDelayTime = -1;

        public Builder setConversions(int i) {
            this.conversions = i;
            return this;
        }

        public Builder setDwellDelayTime(int i) {
            this.dwellDelayTime = i;
            return this;
        }

        public Builder setNotificationInterval(int i) {
            this.notificationInterval = i;
            return this;
        }

        public Builder setUniqueId(String str) {
            this.uniqueId = str;
            return this;
        }

        public Geofence build() {
            String str;
            if (TextUtils.isEmpty(this.uniqueId)) {
                str = "uniqueId not set.";
            } else {
                int i = this.conversions;
                if (i <= 0 || i > 7) {
                    str = "invalid conversions.";
                } else if ((i & 4) == 0 || this.dwellDelayTime >= 0) {
                    long j = this.validDuration;
                    if (j != -2) {
                        int i2 = this.notificationInterval;
                        if (i2 >= 0) {
                            return new GeofenceEntity(this.uniqueId, i, this.latitude, this.longitude, this.radius, j, i2, this.dwellDelayTime);
                        }
                        str = "notificationInterval should be nonnegative.";
                    } else {
                        str = "validDuration not set.";
                    }
                } else {
                    str = "Non-negative dwellDelayTime needs to be set when conversions include DWELL_GEOFENCE_CONVERSION.";
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
            return null;
        }

        public Builder setRoundArea(double d, double d2, float f) {
            this.latitude = d;
            this.longitude = d2;
            this.radius = f;
            return this;
        }

        public Builder setValidContinueTime(long j) {
            if (j < 0) {
                j = -1;
            }
            this.validDuration = j;
            return this;
        }
    }

    String getUniqueId();
}
