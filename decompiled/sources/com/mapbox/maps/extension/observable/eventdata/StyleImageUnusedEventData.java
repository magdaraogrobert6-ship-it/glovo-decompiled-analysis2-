package com.mapbox.maps.extension.observable.eventdata;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class StyleImageUnusedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    @SerializedName("id")
    private final String id;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        return this.id.hashCode() + (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31);
    }

    public StyleImageUnusedEventData(String str, long j, Long l) {
        this.begin = j;
        this.end = l;
        this.id = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleImageUnusedEventData)) {
            return false;
        }
        StyleImageUnusedEventData styleImageUnusedEventData = (StyleImageUnusedEventData) obj;
        if (this.begin != styleImageUnusedEventData.begin) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, styleImageUnusedEventData.end}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, styleImageUnusedEventData.id}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StyleImageUnusedEventData(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.id, ')');
    }
}
