package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public final class CumulativeRenderingStatistics implements Serializable {
    private final Long drawCalls;
    private final Long fboSwitchCount;
    private final Long graphicsPrograms;
    private final Double graphicsProgramsCreationTimeMillis;
    private final Long textureBytes;
    private final Long vertexBytes;

    public Long getDrawCalls() {
        return this.drawCalls;
    }

    public Long getFboSwitchCount() {
        return this.fboSwitchCount;
    }

    public Long getGraphicsPrograms() {
        return this.graphicsPrograms;
    }

    public Double getGraphicsProgramsCreationTimeMillis() {
        return this.graphicsProgramsCreationTimeMillis;
    }

    public Long getTextureBytes() {
        return this.textureBytes;
    }

    public Long getVertexBytes() {
        return this.vertexBytes;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.drawCalls, this.textureBytes, this.vertexBytes, this.graphicsPrograms, this.graphicsProgramsCreationTimeMillis, this.fboSwitchCount);
    }

    public CumulativeRenderingStatistics(Long l, Long l2, Long l3, Long l4, Double d, Long l5) {
        this.drawCalls = l;
        this.textureBytes = l2;
        this.vertexBytes = l3;
        this.graphicsPrograms = l4;
        this.graphicsProgramsCreationTimeMillis = d;
        this.fboSwitchCount = l5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[drawCalls: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.drawCalls, sb, ", textureBytes: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.textureBytes, sb, ", vertexBytes: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.vertexBytes, sb, ", graphicsPrograms: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.graphicsPrograms, sb, ", graphicsProgramsCreationTimeMillis: ");
        af$$ExternalSyntheticOutline1.m(this.graphicsProgramsCreationTimeMillis, sb, ", fboSwitchCount: ");
        sb.append(RecordUtils.fieldToString(this.fboSwitchCount));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CumulativeRenderingStatistics.class != obj.getClass()) {
            return false;
        }
        CumulativeRenderingStatistics cumulativeRenderingStatistics = (CumulativeRenderingStatistics) obj;
        return Objects.equals(this.drawCalls, cumulativeRenderingStatistics.drawCalls) && Objects.equals(this.textureBytes, cumulativeRenderingStatistics.textureBytes) && Objects.equals(this.vertexBytes, cumulativeRenderingStatistics.vertexBytes) && Objects.equals(this.graphicsPrograms, cumulativeRenderingStatistics.graphicsPrograms) && Objects.equals(this.graphicsProgramsCreationTimeMillis, cumulativeRenderingStatistics.graphicsProgramsCreationTimeMillis) && Objects.equals(this.fboSwitchCount, cumulativeRenderingStatistics.fboSwitchCount);
    }
}
