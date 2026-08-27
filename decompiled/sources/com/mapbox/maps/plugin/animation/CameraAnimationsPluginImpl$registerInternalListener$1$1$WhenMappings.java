package com.mapbox.maps.plugin.animation;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class CameraAnimationsPluginImpl$registerInternalListener$1$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CameraAnimationsPluginImpl.AnimationFinishStatus.values().length];
        try {
            iArr[CameraAnimationsPluginImpl.AnimationFinishStatus.CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraAnimationsPluginImpl.AnimationFinishStatus.ENDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
