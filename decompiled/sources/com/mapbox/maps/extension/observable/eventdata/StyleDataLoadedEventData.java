package com.mapbox.maps.extension.observable.eventdata;

import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.StyleDataType;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class StyleDataLoadedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    @SerializedName("type")
    private final StyleDataType type;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        return this.type.hashCode() + (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31);
    }

    public StyleDataLoadedEventData(long j, Long l, StyleDataType styleDataType) {
        styleDataType.getClass();
        this.begin = j;
        this.end = l;
        this.type = styleDataType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleDataLoadedEventData)) {
            return false;
        }
        StyleDataLoadedEventData styleDataLoadedEventData = (StyleDataLoadedEventData) obj;
        if (this.begin != styleDataLoadedEventData.begin) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, styleDataLoadedEventData.end}, getCieXyz.write())).booleanValue() && this.type == styleDataLoadedEventData.type;
    }

    public final String toString() {
        return "StyleDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", type=" + this.type + ')';
    }
}
