package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationInfo implements Serializable {
    private final NotificationDetails details;
    private final Integer finalTemp;
    private final Integer geometryIndexEnd;
    private final Integer geometryIndexStart;
    private final String id;
    private final Integer initialTemp;
    private final String refreshType;
    private final String subType;
    private final String type;

    public NotificationDetails getDetails() {
        return this.details;
    }

    public Integer getFinalTemp() {
        return this.finalTemp;
    }

    public Integer getGeometryIndexEnd() {
        return this.geometryIndexEnd;
    }

    public Integer getGeometryIndexStart() {
        return this.geometryIndexStart;
    }

    public String getId() {
        return this.id;
    }

    public Integer getInitialTemp() {
        return this.initialTemp;
    }

    public String getRefreshType() {
        return this.refreshType;
    }

    public String getSubType() {
        return this.subType;
    }

    public String getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.subType, this.geometryIndexStart, this.geometryIndexEnd, this.refreshType, this.initialTemp, this.finalTemp, this.details);
    }

    public NotificationInfo(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, Integer num4, NotificationDetails notificationDetails) {
        this.id = str;
        this.type = str2;
        this.subType = str3;
        this.geometryIndexStart = num;
        this.geometryIndexEnd = num2;
        this.refreshType = str4;
        this.initialTemp = num3;
        this.finalTemp = num4;
        this.details = notificationDetails;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", type: ");
        IconCompatParcelizer.read(sb, this.type, ", subType: ");
        IconCompatParcelizer.read(sb, this.subType, ", geometryIndexStart: ");
        SweepGradientShader9KIMszodefault.read(this.geometryIndexStart, ", geometryIndexEnd: ", sb);
        SweepGradientShader9KIMszodefault.read(this.geometryIndexEnd, ", refreshType: ", sb);
        IconCompatParcelizer.read(sb, this.refreshType, ", initialTemp: ");
        SweepGradientShader9KIMszodefault.read(this.initialTemp, ", finalTemp: ", sb);
        SweepGradientShader9KIMszodefault.read(this.finalTemp, ", details: ", sb);
        sb.append(RecordUtils.fieldToString(this.details));
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
        NotificationInfo notificationInfo = (NotificationInfo) obj;
        return Objects.equals(this.id, notificationInfo.id) && Objects.equals(this.type, notificationInfo.type) && Objects.equals(this.subType, notificationInfo.subType) && Objects.equals(this.geometryIndexStart, notificationInfo.geometryIndexStart) && Objects.equals(this.geometryIndexEnd, notificationInfo.geometryIndexEnd) && Objects.equals(this.refreshType, notificationInfo.refreshType) && Objects.equals(this.initialTemp, notificationInfo.initialTemp) && Objects.equals(this.finalTemp, notificationInfo.finalTemp) && Objects.equals(this.details, notificationInfo.details);
    }
}
