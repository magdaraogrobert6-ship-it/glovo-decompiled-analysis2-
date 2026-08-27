package com.mapbox.navigation.core.reroute;

import com.huawei.location.lite.common.util.APKUtil;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RerouteStateV2$Failed extends APKUtil {
    public final String message;
    public final List preRouterReasons;
    public final List reasons;
    public final Throwable throwable;

    public final int hashCode() {
        int iHashCode = this.message.hashCode();
        Throwable th = this.throwable;
        int iHashCode2 = th != null ? th.hashCode() : 0;
        List list = this.reasons;
        return this.preRouterReasons.hashCode() + (((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31);
    }

    public RerouteStateV2$Failed(String str, Throwable th, List list, List list2) {
        this.message = str;
        this.throwable = th;
        this.reasons = list;
        this.preRouterReasons = list2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failed(message='");
        sb.append(this.message);
        sb.append("', throwable=");
        sb.append(this.throwable);
        sb.append(", reasons=");
        sb.append(this.reasons);
        sb.append(", preRouterReasons=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.preRouterReasons, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RerouteStateV2$Failed.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RerouteStateV2$Failed rerouteStateV2$Failed = (RerouteStateV2$Failed) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, rerouteStateV2$Failed.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, rerouteStateV2$Failed.throwable}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.preRouterReasons, rerouteStateV2$Failed.preRouterReasons}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.reasons, rerouteStateV2$Failed.reasons}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ RerouteStateV2$Failed(List list, int i, String str) {
        this(str, null, (i & 4) != 0 ? null : list, instance_delegatelambda0.write);
    }
}
