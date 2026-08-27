package com.sentiance.sdk.detectionupdates;

import android.location.Location;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.venuemapper.PointOfInterest;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class StationaryInfo {
    private final Location mLocation;
    private final List<PointOfInterest> mPointsOfInterest;

    public Location getLocation() {
        return this.mLocation;
    }

    public List<PointOfInterest> getPointsOfInterest() {
        return this.mPointsOfInterest;
    }

    public int hashCode() {
        return this.mPointsOfInterest.hashCode() + (this.mLocation.hashCode() * 31);
    }

    public StationaryInfo(Location location, List<PointOfInterest> list) {
        this.mLocation = location;
        this.mPointsOfInterest = list;
    }

    private boolean areSameLocation(Location location, Location location2) {
        return location.getLatitude() == location2.getLatitude() && location.getLongitude() == location2.getLongitude() && location.getAccuracy() == location2.getAccuracy() && location.getTime() == location2.getTime();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StationaryInfo{mLocation=");
        sb.append(this.mLocation);
        sb.append(", mPointsOfInterest=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.mPointsOfInterest, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StationaryInfo stationaryInfo = (StationaryInfo) obj;
        if (areSameLocation(this.mLocation, stationaryInfo.mLocation)) {
            return this.mPointsOfInterest.equals(stationaryInfo.mPointsOfInterest);
        }
        return false;
    }
}
