package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingData implements Serializable {
    private final int capacity;
    private final int forDisabilities;

    public int getCapacity() {
        return this.capacity;
    }

    public int getForDisabilities() {
        return this.forDisabilities;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public ParkingData(int i, int i2) {
        this.capacity = i;
        this.forDisabilities = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[capacity: ");
        IconCompatParcelizer.write(this.capacity, ", forDisabilities: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.forDisabilities, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.capacity), Integer.valueOf(this.forDisabilities));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParkingData parkingData = (ParkingData) obj;
        return this.capacity == parkingData.capacity && this.forDisabilities == parkingData.forDisabilities;
    }
}
