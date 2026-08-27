package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class HistoryRecord implements Serializable {
    private final GetStatusHistoryRecord getStatus;
    private final PushHistoryRecord pushHistory;
    private final SetRouteHistoryRecord setRoute;
    private final long timestampNanoseconds;
    private final HistoryRecordType type;
    private final UpdateLocationHistoryRecord updateLocation;

    public GetStatusHistoryRecord getGetStatus() {
        return this.getStatus;
    }

    public PushHistoryRecord getPushHistory() {
        return this.pushHistory;
    }

    public SetRouteHistoryRecord getSetRoute() {
        return this.setRoute;
    }

    public long getTimestampNanoseconds() {
        return this.timestampNanoseconds;
    }

    public HistoryRecordType getType() {
        return this.type;
    }

    public UpdateLocationHistoryRecord getUpdateLocation() {
        return this.updateLocation;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public HistoryRecord(long j, HistoryRecordType historyRecordType, UpdateLocationHistoryRecord updateLocationHistoryRecord, GetStatusHistoryRecord getStatusHistoryRecord, SetRouteHistoryRecord setRouteHistoryRecord, PushHistoryRecord pushHistoryRecord) {
        this.timestampNanoseconds = j;
        this.type = historyRecordType;
        this.updateLocation = updateLocationHistoryRecord;
        this.getStatus = getStatusHistoryRecord;
        this.setRoute = setRouteHistoryRecord;
        this.pushHistory = pushHistoryRecord;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timestampNanoseconds: ");
        af$$ExternalSyntheticOutline1.m(this.timestampNanoseconds, ", type: ", sb);
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", updateLocation: ");
        sb.append(RecordUtils.fieldToString(this.updateLocation));
        sb.append(", getStatus: ");
        sb.append(RecordUtils.fieldToString(this.getStatus));
        sb.append(", setRoute: ");
        sb.append(RecordUtils.fieldToString(this.setRoute));
        sb.append(", pushHistory: ");
        sb.append(RecordUtils.fieldToString(this.pushHistory));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.timestampNanoseconds;
        return Objects.hash(Long.valueOf(j), this.type, this.updateLocation, this.getStatus, this.setRoute, this.pushHistory);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HistoryRecord historyRecord = (HistoryRecord) obj;
        return this.timestampNanoseconds == historyRecord.timestampNanoseconds && Objects.equals(this.type, historyRecord.type) && Objects.equals(this.updateLocation, historyRecord.updateLocation) && Objects.equals(this.getStatus, historyRecord.getStatus) && Objects.equals(this.setRoute, historyRecord.setRoute) && Objects.equals(this.pushHistory, historyRecord.pushHistory);
    }
}
