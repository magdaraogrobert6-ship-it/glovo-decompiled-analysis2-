package com.mapbox.maps.plugin.animation;

import java.io.Serializable;
import java.util.Arrays;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimatorOptions {
    public final String owner;
    public final Object startValue;
    public final Object[] targets;

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.targets);
        String str = this.owner;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Object obj = this.startValue;
        return (((iHashCode * 31) + iHashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public CameraAnimatorOptions(Object[] objArr, Serializable serializable, String str) {
        this.targets = objArr;
        this.startValue = serializable;
        this.owner = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !CameraAnimatorOptions.class.equals(obj.getClass())) {
            return false;
        }
        CameraAnimatorOptions cameraAnimatorOptions = (CameraAnimatorOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraAnimatorOptions.owner, this.owner}, getCieXyz.write())).booleanValue() || !Arrays.equals(cameraAnimatorOptions.targets, this.targets)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraAnimatorOptions.startValue, this.startValue}, getCieXyz.write())).booleanValue();
    }
}
