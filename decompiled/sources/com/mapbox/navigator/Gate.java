package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public class Gate implements Serializable {
    private final double distance;
    private final int id;
    private final Position position;
    private final double probability;

    public double getDistance() {
        return this.distance;
    }

    public int getId() {
        return this.id;
    }

    public Position getPosition() {
        return this.position;
    }

    public double getProbability() {
        return this.probability;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Gate(int i, Position position, double d, double d2) {
        this.id = i;
        this.position = position;
        this.probability = d;
        this.distance = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.write(this.id, ", position: ", sb);
        sb.append(RecordUtils.fieldToString(this.position));
        sb.append(", probability: ");
        m1$$ExternalSyntheticOutline0.m(this.probability, ", distance: ", sb);
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(this.distance, "]", sb);
    }

    public int hashCode() {
        int i = this.id;
        return Objects.hash(Integer.valueOf(i), this.position, Double.valueOf(this.probability), Double.valueOf(this.distance));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Gate gate = (Gate) obj;
        return this.id == gate.id && Objects.equals(this.position, gate.position) && PartialEq.compare(this.probability, gate.probability) && PartialEq.compare(this.distance, gate.distance);
    }
}
