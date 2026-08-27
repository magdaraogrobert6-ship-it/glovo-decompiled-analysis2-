package com.mapbox.navigator.match.openlr;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class GridLocationReference implements Serializable {
    private final Point lowerLeft;
    private final int nCols;
    private final int nRows;
    private final Point upperRight;

    public Point getLowerLeft() {
        return this.lowerLeft;
    }

    public int getNCols() {
        return this.nCols;
    }

    public int getNRows() {
        return this.nRows;
    }

    public Point getUpperRight() {
        return this.upperRight;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.lowerLeft, this.upperRight, Integer.valueOf(this.nCols), Integer.valueOf(this.nRows));
    }

    public GridLocationReference(Point point, Point point2, int i, int i2) {
        this.lowerLeft = point;
        this.upperRight = point2;
        this.nCols = i;
        this.nRows = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[lowerLeft: ");
        c8$$ExternalSyntheticOutline0.m(this.lowerLeft, sb, ", upperRight: ");
        c8$$ExternalSyntheticOutline0.m(this.upperRight, sb, ", nCols: ");
        IconCompatParcelizer.write(this.nCols, ", nRows: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.nRows, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GridLocationReference gridLocationReference = (GridLocationReference) obj;
        return Objects.equals(this.lowerLeft, gridLocationReference.lowerLeft) && Objects.equals(this.upperRight, gridLocationReference.upperRight) && this.nCols == gridLocationReference.nCols && this.nRows == gridLocationReference.nRows;
    }
}
