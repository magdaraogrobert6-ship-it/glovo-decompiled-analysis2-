package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;

/* JADX INFO: loaded from: classes2.dex */
public interface WidgetRenderer {
    boolean getNeedRender();

    @MapboxExperimental
    WidgetPosition getPosition();

    float getRotation();

    void onSurfaceChanged(int i, int i2);

    void prepare();

    void release();

    void render();

    @MapboxExperimental
    void setPosition(WidgetPosition widgetPosition);

    void setRotation(float f);
}
