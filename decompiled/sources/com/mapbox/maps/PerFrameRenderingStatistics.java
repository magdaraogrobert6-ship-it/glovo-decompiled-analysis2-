package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class PerFrameRenderingStatistics implements Serializable {
    private final DurationStatistics shadowMapDurationStatistics;
    private final List<GroupPerformanceStatistics> topRenderGroups;
    private final List<GroupPerformanceStatistics> topRenderLayers;
    private final DurationStatistics uploadDurationStatistics;

    public DurationStatistics getShadowMapDurationStatistics() {
        return this.shadowMapDurationStatistics;
    }

    public List<GroupPerformanceStatistics> getTopRenderGroups() {
        return this.topRenderGroups;
    }

    public List<GroupPerformanceStatistics> getTopRenderLayers() {
        return this.topRenderLayers;
    }

    public DurationStatistics getUploadDurationStatistics() {
        return this.uploadDurationStatistics;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.topRenderGroups, this.topRenderLayers, this.shadowMapDurationStatistics, this.uploadDurationStatistics);
    }

    public PerFrameRenderingStatistics(List<GroupPerformanceStatistics> list, List<GroupPerformanceStatistics> list2, DurationStatistics durationStatistics, DurationStatistics durationStatistics2) {
        this.topRenderGroups = list;
        this.topRenderLayers = list2;
        this.shadowMapDurationStatistics = durationStatistics;
        this.uploadDurationStatistics = durationStatistics2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[topRenderGroups: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.topRenderGroups, ", topRenderLayers: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.topRenderLayers, ", shadowMapDurationStatistics: ");
        sb.append(RecordUtils.fieldToString(this.shadowMapDurationStatistics));
        sb.append(", uploadDurationStatistics: ");
        sb.append(RecordUtils.fieldToString(this.uploadDurationStatistics));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PerFrameRenderingStatistics.class != obj.getClass()) {
            return false;
        }
        PerFrameRenderingStatistics perFrameRenderingStatistics = (PerFrameRenderingStatistics) obj;
        return Objects.equals(this.topRenderGroups, perFrameRenderingStatistics.topRenderGroups) && Objects.equals(this.topRenderLayers, perFrameRenderingStatistics.topRenderLayers) && Objects.equals(this.shadowMapDurationStatistics, perFrameRenderingStatistics.shadowMapDurationStatistics) && Objects.equals(this.uploadDurationStatistics, perFrameRenderingStatistics.uploadDurationStatistics);
    }
}
