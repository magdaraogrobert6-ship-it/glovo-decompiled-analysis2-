package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class TileRegion implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final String id;
    private final long requiredResourceCount;

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public String getId() {
        return this.id;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        long j = this.requiredResourceCount;
        long j2 = this.completedResourceCount;
        long j3 = this.completedResourceSize;
        return Objects.hash(str, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), this.expires, this.extraData);
    }

    public TileRegion(String str, long j, long j2, long j3, Date date, Value value) {
        this.id = str;
        this.requiredResourceCount = j;
        this.completedResourceCount = j2;
        this.completedResourceSize = j3;
        this.expires = date;
        this.extraData = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", requiredResourceCount: ");
        af$$ExternalSyntheticOutline1.m(this.requiredResourceCount, ", completedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceCount, ", completedResourceSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceSize, ", expires: ", sb);
        sb.append(RecordUtils.fieldToString(this.expires));
        sb.append(", extraData: ");
        sb.append(RecordUtils.fieldToString(this.extraData));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegion tileRegion = (TileRegion) obj;
        return Objects.equals(this.id, tileRegion.id) && this.requiredResourceCount == tileRegion.requiredResourceCount && this.completedResourceCount == tileRegion.completedResourceCount && this.completedResourceSize == tileRegion.completedResourceSize && Objects.equals(this.expires, tileRegion.expires) && Objects.equals(this.extraData, tileRegion.extraData);
    }
}
