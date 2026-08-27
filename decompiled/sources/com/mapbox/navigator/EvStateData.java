package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes4.dex */
public class EvStateData implements Serializable {
    private final Integer auxiliaryConsumption;
    private final List<CurveElement> energyConsumptionCurve;
    private final HashMap<String, String> evAdditionalParameters;
    private final List<CurveElement> evBatteryChargePowerAtTemp;
    private final List<CurveElement> evBatteryChargePowerOptimalTemp;
    private final List<Float> evBatteryHeating;
    private final Float evBatteryTemp;
    private final List<CurveElement> evCurveBlendingRatio;
    private final List<CurveElement> evFreeflowConsumptionCurve;
    private final int evInitialCharge;
    private final Integer evPreConditioningTime;
    private final List<CurveElement> evUnconditionedChargingCurve;

    public Integer getAuxiliaryConsumption() {
        return this.auxiliaryConsumption;
    }

    public List<CurveElement> getEnergyConsumptionCurve() {
        return this.energyConsumptionCurve;
    }

    public HashMap<String, String> getEvAdditionalParameters() {
        return this.evAdditionalParameters;
    }

    public List<CurveElement> getEvBatteryChargePowerAtTemp() {
        return this.evBatteryChargePowerAtTemp;
    }

    public List<CurveElement> getEvBatteryChargePowerOptimalTemp() {
        return this.evBatteryChargePowerOptimalTemp;
    }

    public List<Float> getEvBatteryHeating() {
        return this.evBatteryHeating;
    }

    public Float getEvBatteryTemp() {
        return this.evBatteryTemp;
    }

    public List<CurveElement> getEvCurveBlendingRatio() {
        return this.evCurveBlendingRatio;
    }

    public List<CurveElement> getEvFreeflowConsumptionCurve() {
        return this.evFreeflowConsumptionCurve;
    }

    public int getEvInitialCharge() {
        return this.evInitialCharge;
    }

    public Integer getEvPreConditioningTime() {
        return this.evPreConditioningTime;
    }

    public List<CurveElement> getEvUnconditionedChargingCurve() {
        return this.evUnconditionedChargingCurve;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public EvStateData(List<CurveElement> list, List<CurveElement> list2, List<CurveElement> list3, Integer num, Integer num2, List<CurveElement> list4, HashMap<String, String> map, Float f, List<CurveElement> list5, List<CurveElement> list6, List<Float> list7) {
        this.energyConsumptionCurve = list;
        this.evFreeflowConsumptionCurve = list2;
        this.evCurveBlendingRatio = list3;
        this.auxiliaryConsumption = num;
        this.evPreConditioningTime = num2;
        this.evUnconditionedChargingCurve = list4;
        this.evAdditionalParameters = map;
        this.evBatteryTemp = f;
        this.evBatteryChargePowerAtTemp = list5;
        this.evBatteryChargePowerOptimalTemp = list6;
        this.evBatteryHeating = list7;
        this.evInitialCharge = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[evInitialCharge: ");
        IconCompatParcelizer.write(this.evInitialCharge, ", energyConsumptionCurve: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.energyConsumptionCurve, ", evFreeflowConsumptionCurve: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evFreeflowConsumptionCurve, ", evCurveBlendingRatio: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evCurveBlendingRatio, ", auxiliaryConsumption: ");
        SweepGradientShader9KIMszodefault.read(this.auxiliaryConsumption, ", evPreConditioningTime: ", sb);
        SweepGradientShader9KIMszodefault.read(this.evPreConditioningTime, ", evUnconditionedChargingCurve: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evUnconditionedChargingCurve, ", evAdditionalParameters: ");
        sb.append(RecordUtils.fieldToString(this.evAdditionalParameters));
        sb.append(", evBatteryTemp: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.evBatteryTemp, sb, ", evBatteryChargePowerAtTemp: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evBatteryChargePowerAtTemp, ", evBatteryChargePowerOptimalTemp: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.evBatteryChargePowerOptimalTemp, ", evBatteryHeating: ");
        return MediaSessionCompatQueueItem.read(this.evBatteryHeating, sb, "]");
    }

    public int hashCode() {
        int i = this.evInitialCharge;
        return Objects.hash(Integer.valueOf(i), this.energyConsumptionCurve, this.evFreeflowConsumptionCurve, this.evCurveBlendingRatio, this.auxiliaryConsumption, this.evPreConditioningTime, this.evUnconditionedChargingCurve, this.evAdditionalParameters, this.evBatteryTemp, this.evBatteryChargePowerAtTemp, this.evBatteryChargePowerOptimalTemp, this.evBatteryHeating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvStateData evStateData = (EvStateData) obj;
        return this.evInitialCharge == evStateData.evInitialCharge && Objects.equals(this.energyConsumptionCurve, evStateData.energyConsumptionCurve) && Objects.equals(this.evFreeflowConsumptionCurve, evStateData.evFreeflowConsumptionCurve) && Objects.equals(this.evCurveBlendingRatio, evStateData.evCurveBlendingRatio) && Objects.equals(this.auxiliaryConsumption, evStateData.auxiliaryConsumption) && Objects.equals(this.evPreConditioningTime, evStateData.evPreConditioningTime) && Objects.equals(this.evUnconditionedChargingCurve, evStateData.evUnconditionedChargingCurve) && Objects.equals(this.evAdditionalParameters, evStateData.evAdditionalParameters) && Objects.equals(this.evBatteryTemp, evStateData.evBatteryTemp) && Objects.equals(this.evBatteryChargePowerAtTemp, evStateData.evBatteryChargePowerAtTemp) && Objects.equals(this.evBatteryChargePowerOptimalTemp, evStateData.evBatteryChargePowerOptimalTemp) && Objects.equals(this.evBatteryHeating, evStateData.evBatteryHeating);
    }

    public EvStateData(int i, List<CurveElement> list, List<CurveElement> list2, List<CurveElement> list3, Integer num, Integer num2, List<CurveElement> list4, HashMap<String, String> map, Float f, List<CurveElement> list5, List<CurveElement> list6, List<Float> list7) {
        this.evInitialCharge = i;
        this.energyConsumptionCurve = list;
        this.evFreeflowConsumptionCurve = list2;
        this.evCurveBlendingRatio = list3;
        this.auxiliaryConsumption = num;
        this.evPreConditioningTime = num2;
        this.evUnconditionedChargingCurve = list4;
        this.evAdditionalParameters = map;
        this.evBatteryTemp = f;
        this.evBatteryChargePowerAtTemp = list5;
        this.evBatteryChargePowerOptimalTemp = list6;
        this.evBatteryHeating = list7;
    }
}
