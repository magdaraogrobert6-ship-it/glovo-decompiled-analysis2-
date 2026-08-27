package com.mapbox.maps.plugin.logo.generated;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LogoSettingsKt {
    public static final LogoSettings LogoSettings(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        LogoSettings.Builder builder = new LogoSettings.Builder();
        builder.enabled = true;
        builder.position = 8388691;
        builder.marginLeft = 4.0f;
        builder.marginTop = 4.0f;
        builder.marginRight = 4.0f;
        builder.marginBottom = 4.0f;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return new LogoSettings(builder.enabled, builder.position, builder.marginLeft, builder.marginTop, builder.marginRight, builder.marginBottom);
    }
}
