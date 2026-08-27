package com.mapbox.maps.extension.observable.model;

import bo.app.d$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import o.onItemDismisslambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class TileID {

    @SerializedName("x")
    private final long x;

    @SerializedName("y")
    private final long y;

    @SerializedName("z")
    private final long zoom;

    public final int hashCode() {
        return Long.hashCode(this.y) + d$$ExternalSyntheticOutline0.m(Long.hashCode(this.zoom) * 31, 31, this.x);
    }

    public TileID(long j, long j2, long j3) {
        this.zoom = j;
        this.x = j2;
        this.y = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TileID)) {
            return false;
        }
        TileID tileID = (TileID) obj;
        return this.zoom == tileID.zoom && this.x == tileID.x && this.y == tileID.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TileID(zoom=");
        sb.append(this.zoom);
        sb.append(", x=");
        sb.append(this.x);
        sb.append(", y=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.y, ')');
    }
}
