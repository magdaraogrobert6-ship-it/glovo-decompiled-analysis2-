package com.mapbox.common;

import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes4.dex */
public interface EventsServiceObserver {
    void didEncounterError(EventsServiceError eventsServiceError, Value value);

    void didSendEvents(Value value);
}
