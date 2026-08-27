package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class LocalizedString implements Serializable {
    private final String language;
    private final String value;

    public String getLanguage() {
        return this.language;
    }

    public String getValue() {
        return this.value;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.language, this.value);
    }

    public LocalizedString(String str, String str2) {
        this.language = str;
        this.value = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[language: ");
        IconCompatParcelizer.read(sb, this.language, ", value: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.value, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalizedString localizedString = (LocalizedString) obj;
        return Objects.equals(this.language, localizedString.language) && Objects.equals(this.value, localizedString.value);
    }
}
