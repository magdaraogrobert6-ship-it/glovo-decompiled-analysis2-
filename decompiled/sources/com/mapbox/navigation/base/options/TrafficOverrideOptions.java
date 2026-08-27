package com.mapbox.navigation.base.options;

import bo.app.af$$ExternalSyntheticOutline0;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TrafficOverrideOptions {
    public final ensureSubscribedToInAppMessageEventslambda7 heavyCongestionRange;
    public final ensureSubscribedToInAppMessageEventslambda7 lowCongestionRange;
    public final ensureSubscribedToInAppMessageEventslambda7 moderateCongestionRange;
    public final ensureSubscribedToInAppMessageEventslambda7 severeCongestionRange;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(80, Boolean.hashCode(false) * 31, 31);
        int iHashCode = this.lowCongestionRange.hashCode();
        int iHashCode2 = this.moderateCongestionRange.hashCode();
        return this.severeCongestionRange.hashCode() + ((this.heavyCongestionRange.hashCode() + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31);
    }

    public TrafficOverrideOptions(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda9, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda10) {
        this.lowCongestionRange = ensuresubscribedtoinappmessageeventslambda7;
        this.moderateCongestionRange = ensuresubscribedtoinappmessageeventslambda8;
        this.heavyCongestionRange = ensuresubscribedtoinappmessageeventslambda9;
        this.severeCongestionRange = ensuresubscribedtoinappmessageeventslambda10;
    }

    public final String toString() {
        return "TrafficOverrideOptions(isEnabled=false,highSpeedThresholdInKmPerHour=80lowCongestionRange=" + this.lowCongestionRange + "moderateCongestionRange=" + this.moderateCongestionRange + "heavyCongestionRange=" + this.heavyCongestionRange + "severeCongestionRange=" + this.severeCongestionRange + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TrafficOverrideOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        TrafficOverrideOptions trafficOverrideOptions = (TrafficOverrideOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.lowCongestionRange, trafficOverrideOptions.lowCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.moderateCongestionRange, trafficOverrideOptions.moderateCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.heavyCongestionRange, trafficOverrideOptions.heavyCongestionRange}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.severeCongestionRange, trafficOverrideOptions.severeCongestionRange}, getCieXyz.write())).booleanValue();
    }
}
