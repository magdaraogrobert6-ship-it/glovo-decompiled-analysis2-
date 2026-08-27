package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class EnvironmentalImpact implements Serializable {
    private final Float amount;
    private final EnvironmentalImpactCategory category;

    public Float getAmount() {
        return this.amount;
    }

    public EnvironmentalImpactCategory getCategory() {
        return this.category;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.category, this.amount);
    }

    public EnvironmentalImpact(EnvironmentalImpactCategory environmentalImpactCategory, Float f) {
        this.category = environmentalImpactCategory;
        this.amount = f;
    }

    public String toString() {
        return "[category: " + RecordUtils.fieldToString(this.category) + ", amount: " + RecordUtils.fieldToString(this.amount) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentalImpact environmentalImpact = (EnvironmentalImpact) obj;
        return Objects.equals(this.category, environmentalImpact.category) && Objects.equals(this.amount, environmentalImpact.amount);
    }
}
