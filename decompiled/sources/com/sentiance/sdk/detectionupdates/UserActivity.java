package com.sentiance.sdk.detectionupdates;

import com.sentiance.sdk.DontObfuscate;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserActivity {
    private UserActivityType mActivityType;
    private StationaryInfo mStationaryInfo;
    private TripInfo mTripInfo;

    public UserActivityType getActivityType() {
        return this.mActivityType;
    }

    public StationaryInfo getStationaryInfo() {
        return this.mStationaryInfo;
    }

    public TripInfo getTripInfo() {
        return this.mTripInfo;
    }

    public int hashCode() {
        int iHashCode = this.mActivityType.hashCode();
        TripInfo tripInfo = this.mTripInfo;
        int iHashCode2 = tripInfo != null ? tripInfo.hashCode() : 0;
        StationaryInfo stationaryInfo = this.mStationaryInfo;
        return (((iHashCode * 31) + iHashCode2) * 31) + (stationaryInfo != null ? stationaryInfo.hashCode() : 0);
    }

    public UserActivity(UserActivityType userActivityType, TripInfo tripInfo, StationaryInfo stationaryInfo) {
        this.mActivityType = userActivityType;
        this.mTripInfo = tripInfo;
        this.mStationaryInfo = stationaryInfo;
    }

    public String toString() {
        String str;
        String str2 = "";
        if (this.mTripInfo != null) {
            str = ", " + this.mTripInfo.toString();
        } else {
            str = "";
        }
        if (this.mStationaryInfo != null) {
            str2 = ", " + this.mStationaryInfo.toString();
        }
        return "UserActivity{type=" + this.mActivityType.name() + str + str2 + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserActivity userActivity = (UserActivity) obj;
        if (this.mActivityType != userActivity.mActivityType) {
            return false;
        }
        TripInfo tripInfo = this.mTripInfo;
        TripInfo tripInfo2 = userActivity.mTripInfo;
        if (tripInfo != null) {
            if (!tripInfo.equals(tripInfo2)) {
                return false;
            }
        } else if (tripInfo2 != null) {
            return false;
        }
        StationaryInfo stationaryInfo = this.mStationaryInfo;
        StationaryInfo stationaryInfo2 = userActivity.mStationaryInfo;
        if (stationaryInfo != null) {
            if (!stationaryInfo.equals(stationaryInfo2)) {
                return false;
            }
        } else if (stationaryInfo2 != null) {
            return false;
        }
        return true;
    }
}
