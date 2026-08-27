package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class TurnLane implements Serializable {
    private final LaneAccessability access;
    private final boolean active;
    private final List<LaneIndication> indications;
    private final boolean valid;
    private final LaneIndication validIndication;

    public LaneAccessability getAccess() {
        return this.access;
    }

    public boolean getActive() {
        return this.active;
    }

    public List<LaneIndication> getIndications() {
        return this.indications;
    }

    public boolean getValid() {
        return this.valid;
    }

    public LaneIndication getValidIndication() {
        return this.validIndication;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public TurnLane(boolean z, boolean z2, LaneIndication laneIndication, List<LaneIndication> list, LaneAccessability laneAccessability) {
        this.valid = z;
        this.active = z2;
        this.validIndication = laneIndication;
        this.indications = list;
        this.access = laneAccessability;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[valid: ");
        MediaSessionCompatQueueItem.write(sb, this.valid, ", active: ");
        MediaSessionCompatQueueItem.write(sb, this.active, ", validIndication: ");
        sb.append(RecordUtils.fieldToString(this.validIndication));
        sb.append(", indications: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.indications, ", access: ");
        sb.append(RecordUtils.fieldToString(this.access));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        boolean z = this.valid;
        boolean z2 = this.active;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), this.validIndication, this.indications, this.access);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TurnLane turnLane = (TurnLane) obj;
        return this.valid == turnLane.valid && this.active == turnLane.active && Objects.equals(this.validIndication, turnLane.validIndication) && Objects.equals(this.indications, turnLane.indications) && Objects.equals(this.access, turnLane.access);
    }
}
