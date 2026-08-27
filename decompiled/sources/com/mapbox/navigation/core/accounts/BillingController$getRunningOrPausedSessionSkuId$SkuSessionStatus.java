package com.mapbox.navigation.core.accounts;

import com.mapbox.common.BillingSessionStatus;
import com.mapbox.common.SessionSKUIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus {
    public final SessionSKUIdentifier skuId;
    public final BillingSessionStatus status;

    public final int hashCode() {
        return this.status.hashCode() + (this.skuId.hashCode() * 31);
    }

    public BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus(SessionSKUIdentifier sessionSKUIdentifier, BillingSessionStatus billingSessionStatus) {
        sessionSKUIdentifier.getClass();
        this.skuId = sessionSKUIdentifier;
        this.status = billingSessionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus)) {
            return false;
        }
        BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus = (BillingController$getRunningOrPausedSessionSkuId$SkuSessionStatus) obj;
        return this.skuId == billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus.skuId && this.status == billingController$getRunningOrPausedSessionSkuId$SkuSessionStatus.status;
    }

    public final String toString() {
        return "SkuSessionStatus(skuId=" + this.skuId + ", status=" + this.status + ')';
    }
}
