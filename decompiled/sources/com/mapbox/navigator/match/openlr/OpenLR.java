package com.mapbox.navigator.match.openlr;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class OpenLR implements Serializable {
    private final String base64Encoded;
    private final Standard standard;

    public String getBase64Encoded() {
        return this.base64Encoded;
    }

    public Standard getStandard() {
        return this.standard;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.base64Encoded, this.standard);
    }

    public OpenLR(String str, Standard standard) {
        this.base64Encoded = str;
        this.standard = standard;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[base64Encoded: ");
        IconCompatParcelizer.read(sb, this.base64Encoded, ", standard: ");
        sb.append(RecordUtils.fieldToString(this.standard));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenLR openLR = (OpenLR) obj;
        return Objects.equals(this.base64Encoded, openLR.base64Encoded) && Objects.equals(this.standard, openLR.standard);
    }
}
