package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.match.openlr.OpenLR;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class MatchableOpenLr implements Serializable {
    private final String id;
    private final OpenLR openlr;

    public String getId() {
        return this.id;
    }

    public OpenLR getOpenlr() {
        return this.openlr;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.openlr, this.id);
    }

    public MatchableOpenLr(OpenLR openLR, String str) {
        this.openlr = openLR;
        this.id = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[openlr: ");
        sb.append(RecordUtils.fieldToString(this.openlr));
        sb.append(", id: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.id, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchableOpenLr matchableOpenLr = (MatchableOpenLr) obj;
        return Objects.equals(this.openlr, matchableOpenLr.openlr) && Objects.equals(this.id, matchableOpenLr.id);
    }
}
