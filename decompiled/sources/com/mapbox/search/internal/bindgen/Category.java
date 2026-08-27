package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class Category implements Serializable {
    private final String icon;
    private final String id;
    private final String name;

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.icon, this.name);
    }

    public Category(String str, String str2, String str3) {
        this.id = str;
        this.icon = str2;
        this.name = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", icon: ");
        IconCompatParcelizer.read(sb, this.icon, ", name: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.name, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Category category = (Category) obj;
        return Objects.equals(this.id, category.id) && Objects.equals(this.icon, category.icon) && Objects.equals(this.name, category.name);
    }
}
