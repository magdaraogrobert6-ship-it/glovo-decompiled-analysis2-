package com.google.mlkit.common.model;

import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CustomRemoteModel {
    public static final ScaleBarSettings ScaleBarSettings(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ScaleBarSettings.Builder builder = new ScaleBarSettings.Builder();
        builder.enabled = true;
        builder.position = 8388659;
        builder.marginLeft = 4.0f;
        builder.marginTop = 4.0f;
        builder.marginRight = 4.0f;
        builder.marginBottom = 4.0f;
        builder.textColor = -16777216;
        builder.primaryColor = -16777216;
        builder.secondaryColor = -1;
        builder.borderWidth = 2.0f;
        builder.height = 2.0f;
        builder.textBarMargin = 8.0f;
        builder.textBorderWidth = 2.0f;
        builder.textSize = 8.0f;
        builder.isMetricUnits = true;
        builder.distanceUnits = DistanceUnits.METRIC;
        builder.refreshInterval = 15L;
        builder.showTextBorder = true;
        builder.ratio = 0.5f;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return new ScaleBarSettings(builder.enabled, builder.position, builder.marginLeft, builder.marginTop, builder.marginRight, builder.marginBottom, builder.textColor, builder.primaryColor, builder.secondaryColor, builder.borderWidth, builder.height, builder.textBarMargin, builder.textBorderWidth, builder.textSize, builder.isMetricUnits, builder.distanceUnits, builder.refreshInterval, builder.showTextBorder, builder.ratio, builder.useContinuousRendering);
    }
}
