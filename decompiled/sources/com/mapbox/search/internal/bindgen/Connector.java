package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class Connector implements Serializable {
    private final ConnectorFormat format;
    private final String id;
    private final String lastUpdated;
    private final int maxAmperage;
    private final Integer maxElectricPower;
    private final int maxVoltage;
    private final PowerType powerType;
    private final ConnectorType standard;
    private final List<String> tariffIds;
    private final String termsAndConditions;

    public ConnectorFormat getFormat() {
        return this.format;
    }

    public String getId() {
        return this.id;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public int getMaxAmperage() {
        return this.maxAmperage;
    }

    public Integer getMaxElectricPower() {
        return this.maxElectricPower;
    }

    public int getMaxVoltage() {
        return this.maxVoltage;
    }

    public PowerType getPowerType() {
        return this.powerType;
    }

    public ConnectorType getStandard() {
        return this.standard;
    }

    public List<String> getTariffIds() {
        return this.tariffIds;
    }

    public String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.id;
        ConnectorType connectorType = this.standard;
        ConnectorFormat connectorFormat = this.format;
        PowerType powerType = this.powerType;
        int i = this.maxVoltage;
        int i2 = this.maxAmperage;
        return Objects.hash(str, connectorType, connectorFormat, powerType, Integer.valueOf(i), Integer.valueOf(i2), this.maxElectricPower, this.tariffIds, this.termsAndConditions, this.lastUpdated);
    }

    public Connector(String str, ConnectorType connectorType, ConnectorFormat connectorFormat, PowerType powerType, int i, int i2, Integer num, List<String> list, String str2, String str3) {
        this.id = str;
        this.standard = connectorType;
        this.format = connectorFormat;
        this.powerType = powerType;
        this.maxVoltage = i;
        this.maxAmperage = i2;
        this.maxElectricPower = num;
        this.tariffIds = list;
        this.termsAndConditions = str2;
        this.lastUpdated = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", standard: ");
        sb.append(RecordUtils.fieldToString(this.standard));
        sb.append(", format: ");
        sb.append(RecordUtils.fieldToString(this.format));
        sb.append(", powerType: ");
        sb.append(RecordUtils.fieldToString(this.powerType));
        sb.append(", maxVoltage: ");
        IconCompatParcelizer.write(this.maxVoltage, ", maxAmperage: ", sb);
        IconCompatParcelizer.write(this.maxAmperage, ", maxElectricPower: ", sb);
        SweepGradientShader9KIMszodefault.read(this.maxElectricPower, ", tariffIds: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.tariffIds, ", termsAndConditions: ");
        IconCompatParcelizer.read(sb, this.termsAndConditions, ", lastUpdated: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.lastUpdated, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Connector connector = (Connector) obj;
        return Objects.equals(this.id, connector.id) && Objects.equals(this.standard, connector.standard) && Objects.equals(this.format, connector.format) && Objects.equals(this.powerType, connector.powerType) && this.maxVoltage == connector.maxVoltage && this.maxAmperage == connector.maxAmperage && Objects.equals(this.maxElectricPower, connector.maxElectricPower) && Objects.equals(this.tariffIds, connector.tariffIds) && Objects.equals(this.termsAndConditions, connector.termsAndConditions) && Objects.equals(this.lastUpdated, connector.lastUpdated);
    }
}
