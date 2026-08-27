package com.mapbox.maps.extension.observable.eventdata;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.MapLoadErrorType;
import com.mapbox.maps.extension.observable.model.TileID;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class MapLoadingErrorEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    private final Long end;

    @SerializedName("message")
    private final String message;

    @SerializedName("source-id")
    private final String sourceId;

    @SerializedName("tile-id")
    private final TileID tileId;

    @SerializedName("type")
    private final MapLoadErrorType type;

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.begin);
        Long l = this.end;
        int iM = af$$ExternalSyntheticOutline0.m((this.type.hashCode() + (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.message);
        String str = this.sourceId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        TileID tileID = this.tileId;
        return ((iM + iHashCode2) * 31) + (tileID != null ? tileID.hashCode() : 0);
    }

    public MapLoadingErrorEventData(long j, Long l, MapLoadErrorType mapLoadErrorType, String str, String str2, TileID tileID) {
        mapLoadErrorType.getClass();
        this.begin = j;
        this.end = l;
        this.type = mapLoadErrorType;
        this.message = str;
        this.sourceId = str2;
        this.tileId = tileID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLoadingErrorEventData)) {
            return false;
        }
        MapLoadingErrorEventData mapLoadingErrorEventData = (MapLoadingErrorEventData) obj;
        if (this.begin != mapLoadingErrorEventData.begin) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.end, mapLoadingErrorEventData.end}, getCieXyz.write())).booleanValue() || this.type != mapLoadingErrorEventData.type) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, mapLoadingErrorEventData.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceId, mapLoadingErrorEventData.sourceId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tileId, mapLoadingErrorEventData.tileId}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "MapLoadingErrorEventData(begin=" + this.begin + ", end=" + this.end + ", type=" + this.type + ", message=" + this.message + ", sourceId=" + this.sourceId + ", tileId=" + this.tileId + ')';
    }
}
