package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class DisplayText implements Serializable {
    private final String language;
    private final String text;

    public String getLanguage() {
        return this.language;
    }

    public String getText() {
        return this.text;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.language, this.text);
    }

    public DisplayText(String str, String str2) {
        this.language = str;
        this.text = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[language: ");
        IconCompatParcelizer.read(sb, this.language, ", text: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.text, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayText displayText = (DisplayText) obj;
        return Objects.equals(this.language, displayText.language) && Objects.equals(this.text, displayText.text);
    }
}
