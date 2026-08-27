package com.mapbox.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FlattenListOfPoints implements Serializable {
    private final double[] altitudes;
    private BoundingBox[] boundingBoxes;
    private final double[] flattenLngLatPoints;

    public double[] getAltitudes() {
        return this.altitudes;
    }

    public double[] getFlattenLngLatArray() {
        return this.flattenLngLatPoints;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.flattenLngLatPoints)), Integer.valueOf(Arrays.hashCode(this.altitudes)), Integer.valueOf(Arrays.hashCode(this.boundingBoxes)));
    }

    public List<Point> points() {
        double[] dArr;
        double[] dArr2 = this.flattenLngLatPoints;
        if (dArr2.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(dArr2.length / 2);
        for (int i = 0; i < this.flattenLngLatPoints.length / 2; i++) {
            double[] dArr3 = this.altitudes;
            if (dArr3 == null || Double.isNaN(dArr3[i])) {
                double[] dArr4 = this.flattenLngLatPoints;
                int i2 = i * 2;
                dArr = new double[]{dArr4[i2], dArr4[i2 + 1]};
            } else {
                double[] dArr5 = this.flattenLngLatPoints;
                int i3 = i * 2;
                dArr = new double[]{dArr5[i3], dArr5[i3 + 1], this.altitudes[i]};
            }
            BoundingBox[] boundingBoxArr = this.boundingBoxes;
            arrayList.add(new Point("Point", boundingBoxArr != null ? boundingBoxArr[i] : null, dArr));
        }
        return arrayList;
    }

    public int size() {
        return this.flattenLngLatPoints.length / 2;
    }

    public String toString() {
        int length = (this.flattenLngLatPoints.length / 2) - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append("Point{type=Point, bbox=");
            BoundingBox[] boundingBoxArr = this.boundingBoxes;
            if (boundingBoxArr != null) {
                sb.append(boundingBoxArr[i]);
            } else {
                sb.append("null");
            }
            sb.append(", coordinates=[");
            int i2 = i * 2;
            sb.append(this.flattenLngLatPoints[i2]);
            sb.append(", ");
            sb.append(this.flattenLngLatPoints[i2 + 1]);
            double[] dArr = this.altitudes;
            if (dArr != null && !Double.isNaN(dArr[i])) {
                sb.append(", ");
                sb.append(this.altitudes[i]);
            }
            sb.append("]}");
            if (i == length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public FlattenListOfPoints(List<Point> list) {
        double[] dArr = null;
        if (list.isEmpty()) {
            this.flattenLngLatPoints = new double[0];
            this.altitudes = null;
            this.boundingBoxes = null;
            return;
        }
        double[] dArr2 = new double[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            Point point = list.get(i);
            int i2 = i * 2;
            dArr2[i2] = point.longitude();
            dArr2[i2 + 1] = point.latitude();
            if (point.hasAltitude()) {
                if (dArr == null) {
                    dArr = new double[list.size()];
                    for (int i3 = 0; i3 < i; i3++) {
                        dArr[i3] = Double.NaN;
                    }
                }
                dArr[i] = point.altitude();
            } else if (dArr != null) {
                dArr[i] = Double.NaN;
            }
            if (point.bbox() != null) {
                if (this.boundingBoxes == null) {
                    this.boundingBoxes = new BoundingBox[list.size()];
                }
                this.boundingBoxes[i] = point.bbox();
            }
        }
        this.flattenLngLatPoints = dArr2;
        this.altitudes = dArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FlattenListOfPoints)) {
            return false;
        }
        FlattenListOfPoints flattenListOfPoints = (FlattenListOfPoints) obj;
        return Objects.deepEquals(this.flattenLngLatPoints, flattenListOfPoints.flattenLngLatPoints) && Objects.deepEquals(this.altitudes, flattenListOfPoints.altitudes) && Objects.deepEquals(this.boundingBoxes, flattenListOfPoints.boundingBoxes);
    }

    public FlattenListOfPoints(double[] dArr, double[] dArr2) {
        this.flattenLngLatPoints = dArr;
        this.altitudes = dArr2;
    }
}
