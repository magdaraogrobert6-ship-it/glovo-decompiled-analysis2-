package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class Amenity implements Serializable {
    private final String brand;
    private final String name;
    private final AmenityType type;

    public String getBrand() {
        return this.brand;
    }

    public String getName() {
        return this.name;
    }

    public AmenityType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.name, this.brand);
    }

    public Amenity(AmenityType amenityType, String str, String str2) {
        this.type = amenityType;
        this.name = str;
        this.brand = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", name: ");
        IconCompatParcelizer.read(sb, this.name, ", brand: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.brand, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Amenity amenity = (Amenity) obj;
        return Objects.equals(this.type, amenity.type) && Objects.equals(this.name, amenity.name) && Objects.equals(this.brand, amenity.brand);
    }
}
