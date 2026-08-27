package com.braze.ui.banners;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class BannerDismissSnapshot {
    public static final Companion Companion = new Companion(null);
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

    public int hashCode() {
        return this.trackingId.hashCode() + af$$ExternalSyntheticOutline0.m(this.placementId.hashCode() * 31, 31, this.stableKey);
    }

    public String toString() {
        String str = this.placementId;
        String str2 = this.stableKey;
        return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("BannerDismissSnapshot(placementId=", str, ", stableKey=", str2, ", trackingId="), this.trackingId, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BannerDismissSnapshot fromNullableFields(String str, String str2, String str3) {
            if (str == null || str2 == null || str3 == null) {
                return null;
            }
            return new BannerDismissSnapshot(str, str2, str3);
        }
    }

    public BannerDismissSnapshot(String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.placementId = str;
        this.stableKey = str2;
        this.trackingId = str3;
    }

    public final BannerDismissSnapshot copy(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new BannerDismissSnapshot(str, str2, str3);
    }

    public static /* synthetic */ BannerDismissSnapshot copy$default(BannerDismissSnapshot bannerDismissSnapshot, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerDismissSnapshot.placementId;
        }
        if ((i & 2) != 0) {
            str2 = bannerDismissSnapshot.stableKey;
        }
        if ((i & 4) != 0) {
            str3 = bannerDismissSnapshot.trackingId;
        }
        return bannerDismissSnapshot.copy(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDismissSnapshot)) {
            return false;
        }
        BannerDismissSnapshot bannerDismissSnapshot = (BannerDismissSnapshot) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.placementId, bannerDismissSnapshot.placementId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stableKey, bannerDismissSnapshot.stableKey}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingId, bannerDismissSnapshot.trackingId}, getCieXyz.write())).booleanValue();
    }
}
