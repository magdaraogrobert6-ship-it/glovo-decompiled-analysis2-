package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class IncidentCongestion implements Serializable {
    private final IncidentCongestionDescription description;
    private final Integer value;

    public IncidentCongestionDescription getDescription() {
        return this.description;
    }

    public Integer getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.value, this.description);
    }

    public IncidentCongestion(Integer num, IncidentCongestionDescription incidentCongestionDescription) {
        this.value = num;
        this.description = incidentCongestionDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[value: ");
        SweepGradientShader9KIMszodefault.read(this.value, ", description: ", sb);
        sb.append(RecordUtils.fieldToString(this.description));
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
        IncidentCongestion incidentCongestion = (IncidentCongestion) obj;
        return Objects.equals(this.value, incidentCongestion.value) && Objects.equals(this.description, incidentCongestion.description);
    }
}
