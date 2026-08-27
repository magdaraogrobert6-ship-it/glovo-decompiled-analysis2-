package com.mapbox.navigation.ui.maps.building.model;

import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxBuildingHighlightOptions {
    public static int RemoteActionCompatParcelizer;
    public static int read;
    public final int fillExtrusionColor;

    public final int hashCode() {
        return Double.hashCode(0.6d) + (Integer.hashCode(this.fillExtrusionColor) * 31);
    }

    public MapboxBuildingHighlightOptions(int i) {
        this.fillExtrusionColor = i;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(this.fillExtrusionColor, ", fillExtrusionOpacity=0.6)", new StringBuilder("BuildingArrivalOptions(fillExtrusionColor="));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MapboxBuildingHighlightOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.fillExtrusionColor == ((MapboxBuildingHighlightOptions) obj).fillExtrusionColor;
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 8943926;
        read = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int iMyPid = Process.myPid();
        RemoteActionCompatParcelizer = iMyPid;
        return iMyPid;
    }
}
