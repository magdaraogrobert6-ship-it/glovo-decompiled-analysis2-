package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class TollCollectionInfo implements Serializable {
    private final String id;
    private final String name;
    private final TollCollectionType type;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public TollCollectionType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type, this.name);
    }

    public TollCollectionInfo(String str, TollCollectionType tollCollectionType, String str2) {
        this.id = str;
        this.type = tollCollectionType;
        this.name = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", name: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TollCollectionInfo tollCollectionInfo = (TollCollectionInfo) obj;
        return Objects.equals(this.id, tollCollectionInfo.id) && Objects.equals(this.type, tollCollectionInfo.type) && Objects.equals(this.name, tollCollectionInfo.name);
    }
}
