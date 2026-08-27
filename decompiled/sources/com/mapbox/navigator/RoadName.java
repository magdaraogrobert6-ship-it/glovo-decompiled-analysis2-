package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class RoadName implements Serializable {
    private final String imageBaseUrl;
    private final String language;
    private final Shield shield;
    private final String text;

    public String getImageBaseUrl() {
        return this.imageBaseUrl;
    }

    public String getLanguage() {
        return this.language;
    }

    public Shield getShield() {
        return this.shield;
    }

    public String getText() {
        return this.text;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.text, this.language, this.imageBaseUrl, this.shield);
    }

    public RoadName(String str, String str2, String str3, Shield shield) {
        this.text = str;
        this.language = str2;
        this.imageBaseUrl = str3;
        this.shield = shield;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[text: ");
        IconCompatParcelizer.read(sb, this.text, ", language: ");
        IconCompatParcelizer.read(sb, this.language, ", imageBaseUrl: ");
        IconCompatParcelizer.read(sb, this.imageBaseUrl, ", shield: ");
        sb.append(RecordUtils.fieldToString(this.shield));
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
        RoadName roadName = (RoadName) obj;
        return Objects.equals(this.text, roadName.text) && Objects.equals(this.language, roadName.language) && Objects.equals(this.imageBaseUrl, roadName.imageBaseUrl) && Objects.equals(this.shield, roadName.shield);
    }
}
