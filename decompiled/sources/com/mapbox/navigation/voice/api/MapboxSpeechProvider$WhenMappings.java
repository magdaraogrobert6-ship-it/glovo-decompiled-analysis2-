package com.mapbox.navigation.voice.api;

import com.mapbox.common.ResourceLoadStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class MapboxSpeechProvider$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ResourceLoadStatus.values().length];
        try {
            iArr[ResourceLoadStatus.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResourceLoadStatus.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResourceLoadStatus.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
