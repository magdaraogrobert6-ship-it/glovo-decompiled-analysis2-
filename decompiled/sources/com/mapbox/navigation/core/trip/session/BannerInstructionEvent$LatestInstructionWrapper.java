package com.mapbox.navigation.core.trip.session;

import com.mapbox.api.directions.v5.models.BannerInstructions;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerInstructionEvent$LatestInstructionWrapper {
    public final BannerInstructions latestBannerInstructions;
    public final int latestInstructionIndex;

    public final int hashCode() {
        return this.latestBannerInstructions.hashCode() + (Integer.hashCode(this.latestInstructionIndex) * 31);
    }

    public BannerInstructionEvent$LatestInstructionWrapper(int i, BannerInstructions bannerInstructions) {
        bannerInstructions.getClass();
        this.latestInstructionIndex = i;
        this.latestBannerInstructions = bannerInstructions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerInstructionEvent$LatestInstructionWrapper)) {
            return false;
        }
        BannerInstructionEvent$LatestInstructionWrapper bannerInstructionEvent$LatestInstructionWrapper = (BannerInstructionEvent$LatestInstructionWrapper) obj;
        if (this.latestInstructionIndex != bannerInstructionEvent$LatestInstructionWrapper.latestInstructionIndex) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.latestBannerInstructions, bannerInstructionEvent$LatestInstructionWrapper.latestBannerInstructions}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "LatestInstructionWrapper(latestInstructionIndex=" + this.latestInstructionIndex + ", latestBannerInstructions=" + this.latestBannerInstructions + ')';
    }
}
