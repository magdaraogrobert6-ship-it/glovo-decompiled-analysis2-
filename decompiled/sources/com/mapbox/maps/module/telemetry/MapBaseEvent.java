package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint
public abstract class MapBaseEvent {

    @SerializedName("created")
    private final String created;

    @SerializedName("event")
    private final String event;

    public final String getCreated() {
        return this.created;
    }

    public final String getEvent() {
        return this.event;
    }

    public abstract String getEventName();

    public MapBaseEvent(PhoneState phoneState) {
        phoneState.getClass();
        this.event = getEventName();
        this.created = phoneState.getCreated();
    }
}
