package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes5.dex */
class GJCacheKey {
    private final Instant cutoverInstant;
    private final int minDaysInFirstWeek;
    private final DateTimeZone zone;

    public GJCacheKey(DateTimeZone dateTimeZone, Instant instant, int i) {
        this.zone = dateTimeZone;
        this.cutoverInstant = instant;
        this.minDaysInFirstWeek = i;
    }

    public int hashCode() {
        Instant instant = this.cutoverInstant;
        int iHashCode = instant == null ? 0 : instant.hashCode();
        int i = this.minDaysInFirstWeek;
        DateTimeZone dateTimeZone = this.zone;
        return ((((iHashCode + 31) * 31) + i) * 31) + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GJCacheKey)) {
            return false;
        }
        GJCacheKey gJCacheKey = (GJCacheKey) obj;
        Instant instant = this.cutoverInstant;
        Instant instant2 = gJCacheKey.cutoverInstant;
        if (instant == null) {
            if (instant2 != null) {
                return false;
            }
        } else if (!instant.equals(instant2)) {
            return false;
        }
        if (this.minDaysInFirstWeek != gJCacheKey.minDaysInFirstWeek) {
            return false;
        }
        DateTimeZone dateTimeZone = this.zone;
        DateTimeZone dateTimeZone2 = gJCacheKey.zone;
        if (dateTimeZone == null) {
            if (dateTimeZone2 != null) {
                return false;
            }
        } else if (!dateTimeZone.equals(dateTimeZone2)) {
            return false;
        }
        return true;
    }
}
