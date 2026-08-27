package com.mapbox.navigation.ui.maps.internal.camera;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalViewportDataSourceOptions {
    public final OverviewMode overviewMode;

    public final int hashCode() {
        return this.overviewMode.hashCode() * 31;
    }

    public InternalViewportDataSourceOptions(OverviewMode overviewMode) {
        overviewMode.getClass();
        this.overviewMode = overviewMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InternalViewportDataSourceOptions) && this.overviewMode == ((InternalViewportDataSourceOptions) obj).overviewMode;
    }

    public final String toString() {
        return "InternalViewportDataSourceOptions(ignoreMinZoomWhenFramingManeuver=false, overviewMode=" + this.overviewMode + ", overviewAlternatives=false)";
    }
}
