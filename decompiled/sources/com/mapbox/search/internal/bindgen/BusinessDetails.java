package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class BusinessDetails implements Serializable {
    private final ImageInfo logo;
    private final String name;
    private final String website;

    public ImageInfo getLogo() {
        return this.logo;
    }

    public String getName() {
        return this.name;
    }

    public String getWebsite() {
        return this.website;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.website, this.logo);
    }

    public BusinessDetails(String str, String str2, ImageInfo imageInfo) {
        this.name = str;
        this.website = str2;
        this.logo = imageInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", website: ");
        IconCompatParcelizer.read(sb, this.website, ", logo: ");
        sb.append(RecordUtils.fieldToString(this.logo));
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
        BusinessDetails businessDetails = (BusinessDetails) obj;
        return Objects.equals(this.name, businessDetails.name) && Objects.equals(this.website, businessDetails.website) && Objects.equals(this.logo, businessDetails.logo);
    }
}
