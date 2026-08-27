package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class EnergySource implements Serializable {
    private final Integer percentage;
    private final EnergySourceCategory source;

    public Integer getPercentage() {
        return this.percentage;
    }

    public EnergySourceCategory getSource() {
        return this.source;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.source, this.percentage);
    }

    public EnergySource(EnergySourceCategory energySourceCategory, Integer num) {
        this.source = energySourceCategory;
        this.percentage = num;
    }

    public String toString() {
        return "[source: " + RecordUtils.fieldToString(this.source) + ", percentage: " + RecordUtils.fieldToString(this.percentage) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnergySource energySource = (EnergySource) obj;
        return Objects.equals(this.source, energySource.source) && Objects.equals(this.percentage, energySource.percentage);
    }
}
