package com.mapbox.maps.plugin.annotation;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationSourceOptions {
    public final ClusterOptions clusterOptions;

    public final int hashCode() {
        return this.clusterOptions.hashCode();
    }

    public AnnotationSourceOptions(ClusterOptions clusterOptions) {
        this.clusterOptions = clusterOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnnotationSourceOptions) && this.clusterOptions.equals(((AnnotationSourceOptions) obj).clusterOptions);
    }

    public final String toString() {
        return "AnnotationSourceOptions(maxZoom=null, buffer=null, lineMetrics=null, tolerance=null, clusterOptions=" + this.clusterOptions + ')';
    }
}
