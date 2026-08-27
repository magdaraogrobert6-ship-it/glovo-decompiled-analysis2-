package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public class EvSearchOptions implements Serializable {
    private final ChargingStatus availability;
    private final List<ConnectorType> connectorTypes;
    private final List<String> excludeOperators;
    private final Float maxChargingPower;
    private final Float minChargingPower;
    private final List<String> operators;

    public ChargingStatus getAvailability() {
        return this.availability;
    }

    public List<ConnectorType> getConnectorTypes() {
        return this.connectorTypes;
    }

    public List<String> getExcludeOperators() {
        return this.excludeOperators;
    }

    public Float getMaxChargingPower() {
        return this.maxChargingPower;
    }

    public Float getMinChargingPower() {
        return this.minChargingPower;
    }

    public List<String> getOperators() {
        return this.operators;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.connectorTypes, this.operators, this.minChargingPower, this.maxChargingPower, this.availability, this.excludeOperators);
    }

    public EvSearchOptions(List<ConnectorType> list, List<String> list2, Float f, Float f2, ChargingStatus chargingStatus, List<String> list3) {
        this.connectorTypes = list;
        this.operators = list2;
        this.minChargingPower = f;
        this.maxChargingPower = f2;
        this.availability = chargingStatus;
        this.excludeOperators = list3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[connectorTypes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.connectorTypes, ", operators: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.operators, ", minChargingPower: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.minChargingPower, sb, ", maxChargingPower: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.maxChargingPower, sb, ", availability: ");
        sb.append(RecordUtils.fieldToString(this.availability));
        sb.append(", excludeOperators: ");
        return MediaSessionCompatQueueItem.read(this.excludeOperators, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvSearchOptions evSearchOptions = (EvSearchOptions) obj;
        return Objects.equals(this.connectorTypes, evSearchOptions.connectorTypes) && Objects.equals(this.operators, evSearchOptions.operators) && Objects.equals(this.minChargingPower, evSearchOptions.minChargingPower) && Objects.equals(this.maxChargingPower, evSearchOptions.maxChargingPower) && Objects.equals(this.availability, evSearchOptions.availability) && Objects.equals(this.excludeOperators, evSearchOptions.excludeOperators);
    }
}
