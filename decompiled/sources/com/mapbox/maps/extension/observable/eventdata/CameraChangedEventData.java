package com.mapbox.maps.extension.observable.eventdata;

import com.google.gson.annotations.SerializedName;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class CameraChangedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public CameraChangedEventData(long j, Long l) {
        this.begin = j;
        this.end = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraChangedEventData)) {
            return false;
        }
        CameraChangedEventData cameraChangedEventData = (CameraChangedEventData) obj;
        if (this.begin != cameraChangedEventData.begin) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, cameraChangedEventData.end}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "CameraChangedEventData(begin=" + this.begin + ", end=" + this.end + ')';
    }
}
