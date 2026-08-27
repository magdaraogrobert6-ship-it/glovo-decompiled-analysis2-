package com.mapbox.maps.extension.observable.eventdata;

import com.google.gson.annotations.SerializedName;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class MapLoadedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public MapLoadedEventData(long j, Long l) {
        this.begin = j;
        this.end = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLoadedEventData)) {
            return false;
        }
        MapLoadedEventData mapLoadedEventData = (MapLoadedEventData) obj;
        if (this.begin != mapLoadedEventData.begin) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, mapLoadedEventData.end}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "MapLoadedEventData(begin=" + this.begin + ", end=" + this.end + ')';
    }
}
