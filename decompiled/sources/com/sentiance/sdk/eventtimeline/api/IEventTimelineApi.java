package com.sentiance.sdk.eventtimeline.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.event.Event;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface IEventTimelineApi {
    Event getTimelineEvent(String str);

    List<Event> getTimelineEvents(Date date, Date date2);

    List<Event> getTimelineEventsIncludingProvisionalOnes(Date date, Date date2);

    List<Event> getTimelineUpdates(Date date);

    List<Event> getTimelineUpdatesIncludingProvisionalEvents(Date date);

    void setPotentialVehicleTransportStartListener(PotentialVehicleTransportStartListener potentialVehicleTransportStartListener);

    void setProvisionalAwareTimelineUpdateListener(EventTimelineUpdateListener eventTimelineUpdateListener);

    void setTimelineUpdateListener(EventTimelineUpdateListener eventTimelineUpdateListener);

    void setTransportTags(Map<String, String> map);

    TripLocationUpdatesStartResult startReceivingTripLocationUpdates(int i, TripLocationUpdatesListener tripLocationUpdatesListener);

    void stopReceivingTripLocationUpdates();
}
