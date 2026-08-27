package com.mapbox.maps.extension.observable.eventdata;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.SourceDataType;
import com.mapbox.maps.extension.observable.model.TileID;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class SourceDataLoadedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    @SerializedName("id")
    private final String id;

    @SerializedName("loaded")
    private final Boolean loaded;

    @SerializedName("tile-id")
    private final TileID tileID;

    @SerializedName("type")
    private final SourceDataType type;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        int iM = af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31, 31, this.id);
        int iHashCode2 = this.type.hashCode();
        Boolean bool = this.loaded;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        TileID tileID = this.tileID;
        return ((((iHashCode2 + iM) * 31) + iHashCode3) * 31) + (tileID != null ? tileID.hashCode() : 0);
    }

    public SourceDataLoadedEventData(long j, Long l, String str, SourceDataType sourceDataType, Boolean bool, TileID tileID) {
        sourceDataType.getClass();
        this.begin = j;
        this.end = l;
        this.id = str;
        this.type = sourceDataType;
        this.loaded = bool;
        this.tileID = tileID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceDataLoadedEventData)) {
            return false;
        }
        SourceDataLoadedEventData sourceDataLoadedEventData = (SourceDataLoadedEventData) obj;
        if (this.begin != sourceDataLoadedEventData.begin) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, sourceDataLoadedEventData.end}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, sourceDataLoadedEventData.id}, getCieXyz.write())).booleanValue() || this.type != sourceDataLoadedEventData.type) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.loaded, sourceDataLoadedEventData.loaded}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tileID, sourceDataLoadedEventData.tileID}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SourceDataLoadedEventData(begin=" + this.begin + ", end=" + this.end + ", id=" + this.id + ", type=" + this.type + ", loaded=" + this.loaded + ", tileID=" + this.tileID + ')';
    }
}
