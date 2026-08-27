package com.mapbox.maps.extension.style.types;

import com.huawei.location.Vw$Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class StyleTransition {
    public final Long delay;
    public final Long duration;

    public final int hashCode() {
        Long l = this.duration;
        int iHashCode = l != null ? l.hashCode() : 0;
        Long l2 = this.delay;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public StyleTransition(Vw$Vw vw$Vw) {
        this.duration = vw$Vw.getDuration();
        this.delay = vw$Vw.getDelay();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StyleTransition)) {
            return false;
        }
        StyleTransition styleTransition = (StyleTransition) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.delay, styleTransition.delay}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duration, styleTransition.duration}, getCieXyz.write())).booleanValue();
    }
}
