package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceAreaInfo implements Serializable {
    private final List<Amenity> amenities;
    private final String guideMapUri;
    private final String id;
    private final String name;
    private final ServiceAreaType type;

    public List<Amenity> getAmenities() {
        return this.amenities;
    }

    public String getGuideMapUri() {
        return this.guideMapUri;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ServiceAreaType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.name, this.amenities, this.guideMapUri);
    }

    public ServiceAreaInfo(String str, ServiceAreaType serviceAreaType, String str2, List<Amenity> list, String str3) {
        this.id = str;
        this.type = serviceAreaType;
        this.name = str2;
        this.amenities = list;
        this.guideMapUri = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", name: ");
        IconCompatParcelizer.read(sb, this.name, ", amenities: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.amenities, ", guideMapUri: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.guideMapUri, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceAreaInfo serviceAreaInfo = (ServiceAreaInfo) obj;
        return Objects.equals(this.id, serviceAreaInfo.id) && Objects.equals(this.type, serviceAreaInfo.type) && Objects.equals(this.name, serviceAreaInfo.name) && Objects.equals(this.amenities, serviceAreaInfo.amenities) && Objects.equals(this.guideMapUri, serviceAreaInfo.guideMapUri);
    }
}
