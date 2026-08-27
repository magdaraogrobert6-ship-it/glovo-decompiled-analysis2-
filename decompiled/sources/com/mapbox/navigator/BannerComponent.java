package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class BannerComponent implements Serializable {
    private final String abbr;
    private final Integer abbrPriority;
    private final Boolean active;
    private final String activeDirection;
    private final List<String> directions;
    private final String imageBaseUrl;
    private final String imageURL;
    private final Shield shield;
    private final BannerComponentSubType subType;
    private final String text;
    private final String type;

    public String getAbbr() {
        return this.abbr;
    }

    public Integer getAbbrPriority() {
        return this.abbrPriority;
    }

    public Boolean getActive() {
        return this.active;
    }

    public String getActiveDirection() {
        return this.activeDirection;
    }

    public List<String> getDirections() {
        return this.directions;
    }

    public String getImageBaseUrl() {
        return this.imageBaseUrl;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public Shield getShield() {
        return this.shield;
    }

    public BannerComponentSubType getSubType() {
        return this.subType;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.text, this.abbr, this.abbrPriority, this.imageBaseUrl, this.active, this.directions, this.activeDirection, this.imageURL, this.subType, this.shield);
    }

    public BannerComponent(String str, String str2, String str3, Integer num, String str4, Boolean bool, List<String> list, String str5, String str6, BannerComponentSubType bannerComponentSubType, Shield shield) {
        this.type = str;
        this.text = str2;
        this.abbr = str3;
        this.abbrPriority = num;
        this.imageBaseUrl = str4;
        this.active = bool;
        this.directions = list;
        this.activeDirection = str5;
        this.imageURL = str6;
        this.subType = bannerComponentSubType;
        this.shield = shield;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        IconCompatParcelizer.read(sb, this.type, ", text: ");
        IconCompatParcelizer.read(sb, this.text, ", abbr: ");
        IconCompatParcelizer.read(sb, this.abbr, ", abbrPriority: ");
        SweepGradientShader9KIMszodefault.read(this.abbrPriority, ", imageBaseUrl: ", sb);
        IconCompatParcelizer.read(sb, this.imageBaseUrl, ", active: ");
        getBitmapFromCache.write(sb, ", directions: ", this.active);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.directions, ", activeDirection: ");
        IconCompatParcelizer.read(sb, this.activeDirection, ", imageURL: ");
        IconCompatParcelizer.read(sb, this.imageURL, ", subType: ");
        sb.append(RecordUtils.fieldToString(this.subType));
        sb.append(", shield: ");
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
        BannerComponent bannerComponent = (BannerComponent) obj;
        return Objects.equals(this.type, bannerComponent.type) && Objects.equals(this.text, bannerComponent.text) && Objects.equals(this.abbr, bannerComponent.abbr) && Objects.equals(this.abbrPriority, bannerComponent.abbrPriority) && Objects.equals(this.imageBaseUrl, bannerComponent.imageBaseUrl) && Objects.equals(this.active, bannerComponent.active) && Objects.equals(this.directions, bannerComponent.directions) && Objects.equals(this.activeDirection, bannerComponent.activeDirection) && Objects.equals(this.imageURL, bannerComponent.imageURL) && Objects.equals(this.subType, bannerComponent.subType) && Objects.equals(this.shield, bannerComponent.shield);
    }
}
