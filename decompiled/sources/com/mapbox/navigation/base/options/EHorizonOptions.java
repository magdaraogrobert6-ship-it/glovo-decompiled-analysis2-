package com.mapbox.navigation.base.options;

import bo.app.af$$ExternalSyntheticOutline0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class EHorizonOptions {
    public final AlertServiceOptions alertServiceOptions;

    public EHorizonOptions(AlertServiceOptions alertServiceOptions) {
        this.alertServiceOptions = alertServiceOptions;
    }

    public final String toString() {
        return "EHorizonOptions(length=500.0, expansion=0, branchLength=50.0, minTimeDeltaBetweenUpdates=null, alertServiceOptions=" + this.alertServiceOptions + ", enableEnhancedDataAlongEH=false)";
    }

    public final int hashCode() {
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(50.0d, af$$ExternalSyntheticOutline0.m(0, Double.hashCode(500.0d) * 31, 31), 961);
        return Boolean.hashCode(false) + ((this.alertServiceOptions.hashCode() + iRemoteActionCompatParcelizer) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EHorizonOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.alertServiceOptions.equals(((EHorizonOptions) obj).alertServiceOptions);
    }
}
