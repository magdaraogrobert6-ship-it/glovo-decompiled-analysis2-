package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class BannerSection implements Serializable {
    private final List<BannerComponent> components;
    private final Integer degrees;
    private final String drivingSide;
    private final String modifier;
    private final String text;
    private final String type;

    public List<BannerComponent> getComponents() {
        return this.components;
    }

    public Integer getDegrees() {
        return this.degrees;
    }

    public String getDrivingSide() {
        return this.drivingSide;
    }

    public String getModifier() {
        return this.modifier;
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
        return Objects.hash(this.text, this.type, this.modifier, this.degrees, this.drivingSide, this.components);
    }

    public BannerSection(String str, String str2, String str3, Integer num, String str4, List<BannerComponent> list) {
        this.text = str;
        this.type = str2;
        this.modifier = str3;
        this.degrees = num;
        this.drivingSide = str4;
        this.components = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[text: ");
        IconCompatParcelizer.read(sb, this.text, ", type: ");
        IconCompatParcelizer.read(sb, this.type, ", modifier: ");
        IconCompatParcelizer.read(sb, this.modifier, ", degrees: ");
        SweepGradientShader9KIMszodefault.read(this.degrees, ", drivingSide: ", sb);
        IconCompatParcelizer.read(sb, this.drivingSide, ", components: ");
        return MediaSessionCompatQueueItem.read(this.components, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerSection bannerSection = (BannerSection) obj;
        return Objects.equals(this.text, bannerSection.text) && Objects.equals(this.type, bannerSection.type) && Objects.equals(this.modifier, bannerSection.modifier) && Objects.equals(this.degrees, bannerSection.degrees) && Objects.equals(this.drivingSide, bannerSection.drivingSide) && Objects.equals(this.components, bannerSection.components);
    }
}
