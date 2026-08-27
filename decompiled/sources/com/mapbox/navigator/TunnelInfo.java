package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class TunnelInfo implements Serializable {
    private final String id;
    private final String name;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    public TunnelInfo(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", name: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TunnelInfo tunnelInfo = (TunnelInfo) obj;
        return Objects.equals(this.id, tunnelInfo.id) && Objects.equals(this.name, tunnelInfo.name);
    }
}
