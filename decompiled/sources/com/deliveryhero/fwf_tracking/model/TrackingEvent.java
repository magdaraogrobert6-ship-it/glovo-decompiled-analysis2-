package com.deliveryhero.fwf_tracking.model;

import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackingEvent {
    private final String eventAction;
    private final Map<String, String> params;

    public final String component1() {
        return this.eventAction;
    }

    public final Map<String, String> component2() {
        return this.params;
    }

    public final String getEventAction() {
        return this.eventAction;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.hashCode() + (this.eventAction.hashCode() * 31);
    }

    public String toString() {
        return "TrackingEvent(eventAction=" + this.eventAction + ", params=" + this.params + ")";
    }

    public TrackingEvent(String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        this.eventAction = str;
        this.params = map;
    }

    public final TrackingEvent copy(String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        return new TrackingEvent(str, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackingEvent copy$default(TrackingEvent trackingEvent, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingEvent.eventAction;
        }
        if ((i & 2) != 0) {
            map = trackingEvent.params;
        }
        return trackingEvent.copy(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingEvent)) {
            return false;
        }
        TrackingEvent trackingEvent = (TrackingEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventAction, trackingEvent.eventAction}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.params, trackingEvent.params}, getCieXyz.write())).booleanValue();
    }
}
