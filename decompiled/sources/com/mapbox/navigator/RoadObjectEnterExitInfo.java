package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class RoadObjectEnterExitInfo implements Serializable {
    private final boolean enterFromStartOrExitFromEnd;
    private final String roadObjectId;
    private final RoadObjectType type;

    public boolean getEnterFromStartOrExitFromEnd() {
        return this.enterFromStartOrExitFromEnd;
    }

    public String getRoadObjectId() {
        return this.roadObjectId;
    }

    public RoadObjectType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.roadObjectId;
        boolean z = this.enterFromStartOrExitFromEnd;
        return Objects.hash(str, Boolean.valueOf(z), this.type);
    }

    public RoadObjectEnterExitInfo(String str, boolean z, RoadObjectType roadObjectType) {
        this.roadObjectId = str;
        this.enterFromStartOrExitFromEnd = z;
        this.type = roadObjectType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[roadObjectId: ");
        IconCompatParcelizer.read(sb, this.roadObjectId, ", enterFromStartOrExitFromEnd: ");
        MediaSessionCompatQueueItem.write(sb, this.enterFromStartOrExitFromEnd, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
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
        RoadObjectEnterExitInfo roadObjectEnterExitInfo = (RoadObjectEnterExitInfo) obj;
        return Objects.equals(this.roadObjectId, roadObjectEnterExitInfo.roadObjectId) && this.enterFromStartOrExitFromEnd == roadObjectEnterExitInfo.enterFromStartOrExitFromEnd && Objects.equals(this.type, roadObjectEnterExitInfo.type);
    }
}
