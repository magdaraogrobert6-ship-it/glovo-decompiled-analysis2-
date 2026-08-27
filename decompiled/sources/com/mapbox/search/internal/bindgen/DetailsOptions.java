package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class DetailsOptions implements Serializable {
    private final List<AttributeSet> attributeSets;
    private final String language;
    private final String worldview;

    public List<AttributeSet> getAttributeSets() {
        return this.attributeSets;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getWorldview() {
        return this.worldview;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.attributeSets, this.language, this.worldview);
    }

    public DetailsOptions(List<AttributeSet> list, String str, String str2) {
        this.attributeSets = list;
        this.language = str;
        this.worldview = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[attributeSets: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.attributeSets, ", language: ");
        IconCompatParcelizer.read(sb, this.language, ", worldview: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.worldview, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetailsOptions detailsOptions = (DetailsOptions) obj;
        return Objects.equals(this.attributeSets, detailsOptions.attributeSets) && Objects.equals(this.language, detailsOptions.language) && Objects.equals(this.worldview, detailsOptions.worldview);
    }
}
