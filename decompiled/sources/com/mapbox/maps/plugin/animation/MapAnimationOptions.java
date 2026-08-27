package com.mapbox.maps.plugin.animation;

import android.animation.TimeInterpolator;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapAnimationOptions {
    public final Long duration;
    public final TimeInterpolator interpolator;
    public final String owner;

    public final int hashCode() {
        String str = this.owner;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.duration.hashCode();
        TimeInterpolator timeInterpolator = this.interpolator;
        return ((iHashCode2 + (iHashCode * 31)) * 961) + (timeInterpolator != null ? timeInterpolator.hashCode() : 0);
    }

    public MapAnimationOptions(String str, Long l, TimeInterpolator timeInterpolator) {
        this.owner = str;
        this.duration = l;
        this.interpolator = timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MapAnimationOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        MapAnimationOptions mapAnimationOptions = (MapAnimationOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.owner, mapAnimationOptions.owner}, getCieXyz.write())).booleanValue() || !this.duration.equals(mapAnimationOptions.duration)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.interpolator, mapAnimationOptions.interpolator}, getCieXyz.write())).booleanValue();
    }
}
