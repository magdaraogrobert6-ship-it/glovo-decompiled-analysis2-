package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class BannerInstruction implements Serializable {
    private final int index;
    private final BannerSection primary;
    private final float remainingStepDistance;
    private final BannerSection secondary;
    private final BannerSection sub;
    private final BannerSection view;

    public int getIndex() {
        return this.index;
    }

    public BannerSection getPrimary() {
        return this.primary;
    }

    public float getRemainingStepDistance() {
        return this.remainingStepDistance;
    }

    public BannerSection getSecondary() {
        return this.secondary;
    }

    public BannerSection getSub() {
        return this.sub;
    }

    public BannerSection getView() {
        return this.view;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.primary, this.view, this.secondary, this.sub, Float.valueOf(this.remainingStepDistance), Integer.valueOf(this.index));
    }

    public BannerInstruction(BannerSection bannerSection, BannerSection bannerSection2, BannerSection bannerSection3, BannerSection bannerSection4, float f, int i) {
        this.primary = bannerSection;
        this.view = bannerSection2;
        this.secondary = bannerSection3;
        this.sub = bannerSection4;
        this.remainingStepDistance = f;
        this.index = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[primary: ");
        sb.append(RecordUtils.fieldToString(this.primary));
        sb.append(", view: ");
        sb.append(RecordUtils.fieldToString(this.view));
        sb.append(", secondary: ");
        sb.append(RecordUtils.fieldToString(this.secondary));
        sb.append(", sub: ");
        sb.append(RecordUtils.fieldToString(this.sub));
        sb.append(", remainingStepDistance: ");
        getBitmapFromCache.write(this.remainingStepDistance, ", index: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.index, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerInstruction bannerInstruction = (BannerInstruction) obj;
        return Objects.equals(this.primary, bannerInstruction.primary) && Objects.equals(this.view, bannerInstruction.view) && Objects.equals(this.secondary, bannerInstruction.secondary) && Objects.equals(this.sub, bannerInstruction.sub) && PartialEq.compare(this.remainingStepDistance, bannerInstruction.remainingStepDistance) && this.index == bannerInstruction.index;
    }
}
