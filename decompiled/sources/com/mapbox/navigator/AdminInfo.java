package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class AdminInfo implements Serializable {
    private final String iso_3166_1;
    private final String iso_3166_1_alpha3;

    public String getIso_3166_1() {
        return this.iso_3166_1;
    }

    public String getIso_3166_1_alpha3() {
        return this.iso_3166_1_alpha3;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.iso_3166_1_alpha3, this.iso_3166_1);
    }

    public AdminInfo(String str, String str2) {
        this.iso_3166_1_alpha3 = str;
        this.iso_3166_1 = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[iso_3166_1_alpha3: ");
        IconCompatParcelizer.read(sb, this.iso_3166_1_alpha3, ", iso_3166_1: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.iso_3166_1, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdminInfo adminInfo = (AdminInfo) obj;
        return Objects.equals(this.iso_3166_1_alpha3, adminInfo.iso_3166_1_alpha3) && Objects.equals(this.iso_3166_1, adminInfo.iso_3166_1);
    }
}
