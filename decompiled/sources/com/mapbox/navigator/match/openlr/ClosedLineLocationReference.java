package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class ClosedLineLocationReference implements Serializable {
    private final LineAttributes lastLine;
    private final List<LocationReferencePoint> points;

    public LineAttributes getLastLine() {
        return this.lastLine;
    }

    public List<LocationReferencePoint> getPoints() {
        return this.points;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.points, this.lastLine);
    }

    public ClosedLineLocationReference(List<LocationReferencePoint> list, LineAttributes lineAttributes) {
        this.points = list;
        this.lastLine = lineAttributes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[points: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.points, ", lastLine: ");
        sb.append(RecordUtils.fieldToString(this.lastLine));
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
        ClosedLineLocationReference closedLineLocationReference = (ClosedLineLocationReference) obj;
        return Objects.equals(this.points, closedLineLocationReference.points) && Objects.equals(this.lastLine, closedLineLocationReference.lastLine);
    }
}
