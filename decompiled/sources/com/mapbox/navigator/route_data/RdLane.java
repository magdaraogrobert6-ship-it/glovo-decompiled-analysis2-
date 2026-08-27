package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class RdLane implements Serializable {
    private final boolean active;
    private final List<RdLaneIndication> indications;
    private final boolean valid;
    private final RdLaneIndication validIndication;

    public boolean getActive() {
        return this.active;
    }

    public List<RdLaneIndication> getIndications() {
        return this.indications;
    }

    public boolean getValid() {
        return this.valid;
    }

    public RdLaneIndication getValidIndication() {
        return this.validIndication;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdLane(boolean z, boolean z2, RdLaneIndication rdLaneIndication, List<RdLaneIndication> list) {
        this.valid = z;
        this.active = z2;
        this.validIndication = rdLaneIndication;
        this.indications = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[valid: ");
        MediaSessionCompatQueueItem.write(sb, this.valid, ", active: ");
        MediaSessionCompatQueueItem.write(sb, this.active, ", validIndication: ");
        sb.append(RecordUtils.fieldToString(this.validIndication));
        sb.append(", indications: ");
        return MediaSessionCompatQueueItem.read(this.indications, sb, "]");
    }

    public int hashCode() {
        boolean z = this.valid;
        boolean z2 = this.active;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), this.validIndication, this.indications);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdLane rdLane = (RdLane) obj;
        return this.valid == rdLane.valid && this.active == rdLane.active && Objects.equals(this.validIndication, rdLane.validIndication) && Objects.equals(this.indications, rdLane.indications);
    }
}
