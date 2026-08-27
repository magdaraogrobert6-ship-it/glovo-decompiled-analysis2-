package com.mapbox.navigation.ui.components.maneuver.model;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxExitProperties {
    public final int exitLeftDrawable;
    public final int exitRightDrawable;
    public final int fallbackDrawable;

    public MapboxExitProperties(int i, int i2, int i3) {
        this.fallbackDrawable = i;
        this.exitLeftDrawable = i2;
        this.exitRightDrawable = i3;
    }
}
