package com.mapbox.maps.plugin.annotation;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationConfig {
    public final AnnotationSourceOptions annotationSourceOptions;
    public final String layerId;

    public final int hashCode() {
        int iHashCode = this.layerId.hashCode();
        AnnotationSourceOptions annotationSourceOptions = this.annotationSourceOptions;
        return ((iHashCode * 961) + (annotationSourceOptions == null ? 0 : annotationSourceOptions.clusterOptions.hashCode())) * 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotationConfig)) {
            return false;
        }
        AnnotationConfig annotationConfig = (AnnotationConfig) obj;
        if (!this.layerId.equals(annotationConfig.layerId)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.annotationSourceOptions, annotationConfig.annotationSourceOptions}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "AnnotationConfig(belowLayerId=null, layerId=" + this.layerId + ", sourceId=null, annotationSourceOptions=" + this.annotationSourceOptions + ", slotName=null)";
    }

    public AnnotationConfig(String str, AnnotationSourceOptions annotationSourceOptions, int i) {
        annotationSourceOptions = (i & 8) != 0 ? null : annotationSourceOptions;
        this.layerId = str;
        this.annotationSourceOptions = annotationSourceOptions;
    }
}
