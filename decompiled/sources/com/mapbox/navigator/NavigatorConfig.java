package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes3.dex */
public class NavigatorConfig implements Serializable {
    private ElectronicHorizonOptions electronicHorizonOptions;
    private IncidentsOptions incidentsOptions;
    private Boolean noSignalSimulationEnabled;
    private PollingConfig polling;
    private RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute;
    private RoadObjectsMatcherOptions roadObjectsMatcherOptions;
    private Boolean useSensors;
    private Float voiceInstructionThreshold;

    public ElectronicHorizonOptions getElectronicHorizonOptions() {
        return this.electronicHorizonOptions;
    }

    public IncidentsOptions getIncidentsOptions() {
        return this.incidentsOptions;
    }

    public Boolean getNoSignalSimulationEnabled() {
        return this.noSignalSimulationEnabled;
    }

    public PollingConfig getPolling() {
        return this.polling;
    }

    public RerouteStrategyForMatchRoute getRerouteStrategyForMatchRoute() {
        return this.rerouteStrategyForMatchRoute;
    }

    public RoadObjectsMatcherOptions getRoadObjectsMatcherOptions() {
        return this.roadObjectsMatcherOptions;
    }

    public Boolean getUseSensors() {
        return this.useSensors;
    }

    public Float getVoiceInstructionThreshold() {
        return this.voiceInstructionThreshold;
    }

    public void setElectronicHorizonOptions(ElectronicHorizonOptions electronicHorizonOptions) {
        this.electronicHorizonOptions = electronicHorizonOptions;
    }

    public void setIncidentsOptions(IncidentsOptions incidentsOptions) {
        this.incidentsOptions = incidentsOptions;
    }

    public void setNoSignalSimulationEnabled(Boolean bool) {
        this.noSignalSimulationEnabled = bool;
    }

    public void setPolling(PollingConfig pollingConfig) {
        this.polling = pollingConfig;
    }

    public void setRerouteStrategyForMatchRoute(RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute) {
        this.rerouteStrategyForMatchRoute = rerouteStrategyForMatchRoute;
    }

    public void setRoadObjectsMatcherOptions(RoadObjectsMatcherOptions roadObjectsMatcherOptions) {
        this.roadObjectsMatcherOptions = roadObjectsMatcherOptions;
    }

    public void setUseSensors(Boolean bool) {
        this.useSensors = bool;
    }

    public void setVoiceInstructionThreshold(Float f) {
        this.voiceInstructionThreshold = f;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.voiceInstructionThreshold, this.electronicHorizonOptions, this.polling, this.incidentsOptions, this.noSignalSimulationEnabled, this.useSensors, this.rerouteStrategyForMatchRoute, this.roadObjectsMatcherOptions);
    }

    public NavigatorConfig(Float f, ElectronicHorizonOptions electronicHorizonOptions, PollingConfig pollingConfig, IncidentsOptions incidentsOptions, Boolean bool, Boolean bool2, RerouteStrategyForMatchRoute rerouteStrategyForMatchRoute, RoadObjectsMatcherOptions roadObjectsMatcherOptions) {
        this.voiceInstructionThreshold = f;
        this.electronicHorizonOptions = electronicHorizonOptions;
        this.polling = pollingConfig;
        this.incidentsOptions = incidentsOptions;
        this.noSignalSimulationEnabled = bool;
        this.useSensors = bool2;
        this.rerouteStrategyForMatchRoute = rerouteStrategyForMatchRoute;
        this.roadObjectsMatcherOptions = roadObjectsMatcherOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[voiceInstructionThreshold: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.voiceInstructionThreshold, sb, ", electronicHorizonOptions: ");
        sb.append(RecordUtils.fieldToString(this.electronicHorizonOptions));
        sb.append(", polling: ");
        sb.append(RecordUtils.fieldToString(this.polling));
        sb.append(", incidentsOptions: ");
        sb.append(RecordUtils.fieldToString(this.incidentsOptions));
        sb.append(", noSignalSimulationEnabled: ");
        getBitmapFromCache.write(sb, ", useSensors: ", this.noSignalSimulationEnabled);
        getBitmapFromCache.write(sb, ", rerouteStrategyForMatchRoute: ", this.useSensors);
        sb.append(RecordUtils.fieldToString(this.rerouteStrategyForMatchRoute));
        sb.append(", roadObjectsMatcherOptions: ");
        sb.append(RecordUtils.fieldToString(this.roadObjectsMatcherOptions));
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
        NavigatorConfig navigatorConfig = (NavigatorConfig) obj;
        return Objects.equals(this.voiceInstructionThreshold, navigatorConfig.voiceInstructionThreshold) && Objects.equals(this.electronicHorizonOptions, navigatorConfig.electronicHorizonOptions) && Objects.equals(this.polling, navigatorConfig.polling) && Objects.equals(this.incidentsOptions, navigatorConfig.incidentsOptions) && Objects.equals(this.noSignalSimulationEnabled, navigatorConfig.noSignalSimulationEnabled) && Objects.equals(this.useSensors, navigatorConfig.useSensors) && Objects.equals(this.rerouteStrategyForMatchRoute, navigatorConfig.rerouteStrategyForMatchRoute) && Objects.equals(this.roadObjectsMatcherOptions, navigatorConfig.roadObjectsMatcherOptions);
    }
}
