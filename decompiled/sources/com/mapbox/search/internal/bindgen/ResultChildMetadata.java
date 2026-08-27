package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ResultChildMetadata implements Serializable {
    private final String category;
    private final Point coordinates;
    private final String mapboxId;
    private final String name;

    public String getCategory() {
        return this.category;
    }

    public Point getCoordinates() {
        return this.coordinates;
    }

    public String getMapboxId() {
        return this.mapboxId;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.category, this.coordinates, this.mapboxId, this.name);
    }

    public ResultChildMetadata(String str, Point point, String str2, String str3) {
        this.category = str;
        this.coordinates = point;
        this.mapboxId = str2;
        this.name = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[category: ");
        IconCompatParcelizer.read(sb, this.category, ", coordinates: ");
        c8$$ExternalSyntheticOutline0.m(this.coordinates, sb, ", mapboxId: ");
        IconCompatParcelizer.read(sb, this.mapboxId, ", name: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultChildMetadata resultChildMetadata = (ResultChildMetadata) obj;
        return Objects.equals(this.category, resultChildMetadata.category) && Objects.equals(this.coordinates, resultChildMetadata.coordinates) && Objects.equals(this.mapboxId, resultChildMetadata.mapboxId) && Objects.equals(this.name, resultChildMetadata.name);
    }
}
