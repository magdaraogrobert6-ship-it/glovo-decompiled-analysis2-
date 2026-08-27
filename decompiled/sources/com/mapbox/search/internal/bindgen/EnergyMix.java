package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes3.dex */
public class EnergyMix implements Serializable {
    private final String energyProductName;
    private final List<EnergySource> energySources;
    private final List<EnvironmentalImpact> environmentalImpact;
    private final Boolean isGreenEnergy;
    private final String supplierName;

    public String getEnergyProductName() {
        return this.energyProductName;
    }

    public List<EnergySource> getEnergySources() {
        return this.energySources;
    }

    public List<EnvironmentalImpact> getEnvironmentalImpact() {
        return this.environmentalImpact;
    }

    public Boolean getIsGreenEnergy() {
        return this.isGreenEnergy;
    }

    public String getSupplierName() {
        return this.supplierName;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.isGreenEnergy, this.energySources, this.environmentalImpact, this.supplierName, this.energyProductName);
    }

    public EnergyMix(Boolean bool, List<EnergySource> list, List<EnvironmentalImpact> list2, String str, String str2) {
        this.isGreenEnergy = bool;
        this.energySources = list;
        this.environmentalImpact = list2;
        this.supplierName = str;
        this.energyProductName = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[isGreenEnergy: ");
        getBitmapFromCache.write(sb, ", energySources: ", this.isGreenEnergy);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.energySources, ", environmentalImpact: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.environmentalImpact, ", supplierName: ");
        IconCompatParcelizer.read(sb, this.supplierName, ", energyProductName: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.energyProductName, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnergyMix energyMix = (EnergyMix) obj;
        return Objects.equals(this.isGreenEnergy, energyMix.isGreenEnergy) && Objects.equals(this.energySources, energyMix.energySources) && Objects.equals(this.environmentalImpact, energyMix.environmentalImpact) && Objects.equals(this.supplierName, energyMix.supplierName) && Objects.equals(this.energyProductName, energyMix.energyProductName);
    }
}
