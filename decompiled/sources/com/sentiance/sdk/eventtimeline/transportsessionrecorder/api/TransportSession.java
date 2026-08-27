package com.sentiance.sdk.eventtimeline.transportsessionrecorder.api;

import android.location.Location;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.SensorDataChunk;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.util.DateTime;
import java.util.Iterator;
import o.parseLong;
import o.parseObjectAsInteger;
import o.parsePayloadFieldsFromBundle;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class TransportSession {
    private final DateTime mEndDate;
    private final String mId;
    private final parsePayloadFieldsFromBundle mSessionDataLogger;
    private final DateTime mStartDate;
    private final TransportMode mTransportMode;

    public DateTime getEndDate() {
        return this.mEndDate;
    }

    public String getId() {
        return this.mId;
    }

    public DateTime getStartDate() {
        return this.mStartDate;
    }

    public TransportMode getTransportMode() {
        return this.mTransportMode;
    }

    public Iterator<SensorDataChunk> getAccelerometerData() {
        return new parseObjectAsInteger(this.mId, this.mSessionDataLogger);
    }

    public Iterator<Location> getLocationData() {
        return new parseLong(this.mId, this.mSessionDataLogger);
    }

    public TransportSession(String str, DateTime dateTime, DateTime dateTime2, TransportMode transportMode, parsePayloadFieldsFromBundle parsepayloadfieldsfrombundle) {
        this.mId = str;
        this.mStartDate = dateTime;
        this.mEndDate = dateTime2;
        this.mTransportMode = transportMode;
        this.mSessionDataLogger = parsepayloadfieldsfrombundle;
    }
}
