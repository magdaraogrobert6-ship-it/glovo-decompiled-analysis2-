package com.mapbox.maps.plugin.scalebar;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public final class SegmentsConfiguration {
    public List labelMarginsAndAnchor;
    public List labelTexts;
    public int rectCount;
    public float unitBarWidth;
    public float unitDistance;

    public final int hashCode() {
        return this.labelMarginsAndAnchor.hashCode() + c8$$ExternalSyntheticOutline0.m(this.labelTexts, af$$ExternalSyntheticOutline0.m(this.rectCount, af$$ExternalSyntheticOutline1.m(this.unitBarWidth, Float.hashCode(this.unitDistance) * 31, 31), 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentsConfiguration)) {
            return false;
        }
        SegmentsConfiguration segmentsConfiguration = (SegmentsConfiguration) obj;
        return Float.compare(this.unitDistance, segmentsConfiguration.unitDistance) == 0 && Float.compare(this.unitBarWidth, segmentsConfiguration.unitBarWidth) == 0 && this.rectCount == segmentsConfiguration.rectCount && this.labelTexts.equals(segmentsConfiguration.labelTexts) && this.labelMarginsAndAnchor.equals(segmentsConfiguration.labelMarginsAndAnchor);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentsConfiguration(unitDistance=");
        sb.append(this.unitDistance);
        sb.append(", unitBarWidth=");
        sb.append(this.unitBarWidth);
        sb.append(", rectCount=");
        sb.append(this.rectCount);
        sb.append(", labelTexts=");
        sb.append(this.labelTexts);
        sb.append(", labelMarginsAndAnchor=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.labelMarginsAndAnchor, ')');
    }
}
