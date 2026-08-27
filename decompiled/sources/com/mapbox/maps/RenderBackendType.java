package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum RenderBackendType {
    OPEN_GL,
    VULKAN;

    private int getValue() {
        return ordinal();
    }
}
