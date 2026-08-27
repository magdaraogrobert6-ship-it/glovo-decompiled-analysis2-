package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class ChargingStatusSchedule implements Serializable {
    private final String periodBegin;
    private final String periodEnd;
    private final ChargingStatus status;

    public String getPeriodBegin() {
        return this.periodBegin;
    }

    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public ChargingStatus getStatus() {
        return this.status;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.periodBegin, this.periodEnd, this.status);
    }

    public ChargingStatusSchedule(String str, String str2, ChargingStatus chargingStatus) {
        this.periodBegin = str;
        this.periodEnd = str2;
        this.status = chargingStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[periodBegin: ");
        IconCompatParcelizer.read(sb, this.periodBegin, ", periodEnd: ");
        IconCompatParcelizer.read(sb, this.periodEnd, ", status: ");
        sb.append(RecordUtils.fieldToString(this.status));
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
        ChargingStatusSchedule chargingStatusSchedule = (ChargingStatusSchedule) obj;
        return Objects.equals(this.periodBegin, chargingStatusSchedule.periodBegin) && Objects.equals(this.periodEnd, chargingStatusSchedule.periodEnd) && Objects.equals(this.status, chargingStatusSchedule.status);
    }
}
