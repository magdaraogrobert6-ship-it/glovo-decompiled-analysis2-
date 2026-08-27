package com.braze.ui.banners;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class PendingBannerDismissSnapshot {
    private final String placementId;
    private final String stableKey;
    private final String trackingId;

    public final String component1() {
        return this.placementId;
    }

    public final String component2() {
        return this.stableKey;
    }

    public final String component3() {
        return this.trackingId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final PendingBannerDismissSnapshot copy(String str, String str2, String str3) {
        return new PendingBannerDismissSnapshot(str, str2, str3);
    }

    public String toString() {
        String str = this.placementId;
        String str2 = this.stableKey;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("PendingBannerDismissSnapshot(placementId=", str, ", stableKey=", str2, ", trackingId="), this.trackingId, ")");
    }

    public PendingBannerDismissSnapshot(String str, String str2, String str3) {
        this.placementId = str;
        this.stableKey = str2;
        this.trackingId = str3;
    }

    public static /* synthetic */ PendingBannerDismissSnapshot copy$default(PendingBannerDismissSnapshot pendingBannerDismissSnapshot, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingBannerDismissSnapshot.placementId;
        }
        if ((i & 2) != 0) {
            str2 = pendingBannerDismissSnapshot.stableKey;
        }
        if ((i & 4) != 0) {
            str3 = pendingBannerDismissSnapshot.trackingId;
        }
        return pendingBannerDismissSnapshot.copy(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingBannerDismissSnapshot)) {
            return false;
        }
        PendingBannerDismissSnapshot pendingBannerDismissSnapshot = (PendingBannerDismissSnapshot) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.placementId, pendingBannerDismissSnapshot.placementId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stableKey, pendingBannerDismissSnapshot.stableKey}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingId, pendingBannerDismissSnapshot.trackingId}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        String str = this.placementId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.stableKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.trackingId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
