package com.incognia;

import android.location.Location;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class EventLocation {
    private final double latitude;
    private final double longitude;
    private final Long timestamp;

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final Long component3() {
        return this.timestamp;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final EventLocation copy(double d, double d2, Long l) {
        return new EventLocation(d, d2, l);
    }

    public int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        Long l = this.timestamp;
        return iRemoteActionCompatParcelizer + (l == null ? 0 : l.hashCode());
    }

    public EventLocation(Location location) {
        this(location.getLatitude(), location.getLongitude(), Long.valueOf(location.getTime()));
    }

    public static /* synthetic */ EventLocation copy$default(EventLocation eventLocation, double d, double d2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            d = eventLocation.latitude;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = eventLocation.longitude;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            l = eventLocation.timestamp;
        }
        return eventLocation.copy(d3, d4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventLocation)) {
            return false;
        }
        EventLocation eventLocation = (EventLocation) obj;
        if (Double.compare(this.latitude, eventLocation.latitude) != 0 || Double.compare(this.longitude, eventLocation.longitude) != 0) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, eventLocation.timestamp}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "EventLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ", timestamp=" + this.timestamp + ')';
    }

    public EventLocation(double d, double d2, Long l) {
        this.latitude = d;
        this.longitude = d2;
        this.timestamp = l;
    }

    public /* synthetic */ EventLocation(double d, double d2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : l);
    }

    public EventLocation(double d, double d2) {
        this(d, d2, null, 4, null);
    }
}
