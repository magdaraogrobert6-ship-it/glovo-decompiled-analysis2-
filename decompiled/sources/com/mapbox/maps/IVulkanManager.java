package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public interface IVulkanManager {
    boolean init(long j);

    void release();

    void releaseSurface();

    void render(RenderCallback renderCallback);

    void resize(int i, int i2);

    void setAntialiasingSampleCount(int i);
}
