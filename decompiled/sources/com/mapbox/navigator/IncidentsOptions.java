package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class IncidentsOptions implements Serializable {
    private final String apiUrl;
    private final String graph;

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getGraph() {
        return this.graph;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.graph, this.apiUrl);
    }

    public IncidentsOptions(String str, String str2) {
        this.graph = str;
        this.apiUrl = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[graph: ");
        IconCompatParcelizer.read(sb, this.graph, ", apiUrl: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.apiUrl, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentsOptions incidentsOptions = (IncidentsOptions) obj;
        return Objects.equals(this.graph, incidentsOptions.graph) && Objects.equals(this.apiUrl, incidentsOptions.apiUrl);
    }
}
