package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class LightRouteLine {
    private final String featureId;
    private final String routeId;

    public final String component1() {
        return this.routeId;
    }

    public final String component2() {
        return this.featureId;
    }

    public final String getFeatureId() {
        return this.featureId;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        int iHashCode = this.routeId.hashCode();
        String str = this.featureId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public LightRouteLine(String str, String str2) {
        str.getClass();
        this.routeId = str;
        this.featureId = str2;
    }

    public static /* synthetic */ LightRouteLine copy$default(LightRouteLine lightRouteLine, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lightRouteLine.routeId;
        }
        if ((i & 2) != 0) {
            str2 = lightRouteLine.featureId;
        }
        return lightRouteLine.copy(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightRouteLine)) {
            return false;
        }
        LightRouteLine lightRouteLine = (LightRouteLine) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeId, lightRouteLine.routeId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.featureId, lightRouteLine.featureId}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LightRouteLine(routeId=");
        sb.append(this.routeId);
        sb.append(", featureId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.featureId, ')');
    }

    public final LightRouteLine copy(String str, String str2) {
        str.getClass();
        return new LightRouteLine(str, str2);
    }
}
