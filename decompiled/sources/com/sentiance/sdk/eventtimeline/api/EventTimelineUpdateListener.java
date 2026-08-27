package com.sentiance.sdk.eventtimeline.api;

import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.event.Event;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface EventTimelineUpdateListener {
    void onEventTimelineUpdated(Event event);
}
