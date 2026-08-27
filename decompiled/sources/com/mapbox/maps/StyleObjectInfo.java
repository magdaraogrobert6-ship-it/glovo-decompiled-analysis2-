package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleObjectInfo implements Serializable {
    private final String id;
    private final String type;

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.type);
    }

    public StyleObjectInfo(String str, String str2) {
        this.id = str;
        this.type = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", type: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.type, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StyleObjectInfo.class != obj.getClass()) {
            return false;
        }
        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) obj;
        return Objects.equals(this.id, styleObjectInfo.id) && Objects.equals(this.type, styleObjectInfo.type);
    }
}
