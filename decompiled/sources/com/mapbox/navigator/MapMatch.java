package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class MapMatch implements Serializable {
    private final int fetchedCandidateIndex;
    private final GraphPosition position;
    private final float proba;

    public int getFetchedCandidateIndex() {
        return this.fetchedCandidateIndex;
    }

    public GraphPosition getPosition() {
        return this.position;
    }

    public float getProba() {
        return this.proba;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.position, Float.valueOf(this.proba), Integer.valueOf(this.fetchedCandidateIndex));
    }

    public MapMatch(GraphPosition graphPosition, float f, int i) {
        this.position = graphPosition;
        this.proba = f;
        this.fetchedCandidateIndex = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[position: ");
        sb.append(RecordUtils.fieldToString(this.position));
        sb.append(", proba: ");
        getBitmapFromCache.write(this.proba, ", fetchedCandidateIndex: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.fetchedCandidateIndex, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapMatch mapMatch = (MapMatch) obj;
        return Objects.equals(this.position, mapMatch.position) && PartialEq.compare(this.proba, mapMatch.proba) && this.fetchedCandidateIndex == mapMatch.fetchedCandidateIndex;
    }
}
