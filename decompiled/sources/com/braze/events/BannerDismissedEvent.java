package com.braze.events;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BannerDismissedEvent {
    private final String placementId;

    public final String component1() {
        return this.placementId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return this.placementId.hashCode();
    }

    public BannerDismissedEvent(String str) {
        str.getClass();
        this.placementId = str;
    }

    public static /* synthetic */ BannerDismissedEvent copy$default(BannerDismissedEvent bannerDismissedEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerDismissedEvent.placementId;
        }
        return bannerDismissedEvent.copy(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDismissedEvent)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.placementId, ((BannerDismissedEvent) obj).placementId}, getCieXyz.write())).booleanValue();
    }

    public final BannerDismissedEvent copy(String str) {
        str.getClass();
        return new BannerDismissedEvent(str);
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m("BannerDismissedEvent(placementId=", this.placementId, ")");
    }
}
