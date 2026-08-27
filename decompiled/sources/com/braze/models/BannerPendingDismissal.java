package com.braze.models;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.o;
import bo.app.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.beforeInAppMessageViewClosed;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.onCloseClicked;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@Serializable
public final class BannerPendingDismissal {
    public static final p Companion = new p();
    private final String bannerId;
    private final long dismissalTimeMs;
    private final String stableKey;

    @getAppropriateFullView(serializer = "banner_id")
    public static /* synthetic */ void getBannerId$annotations() {
    }

    @getAppropriateFullView(serializer = "dismissal_time")
    public static /* synthetic */ void getDismissalTimeMs$annotations() {
    }

    @getAppropriateFullView(serializer = Banner.STABLE_KEY)
    public static /* synthetic */ void getStableKey$annotations() {
    }

    public final String component1() {
        return this.bannerId;
    }

    public final String component2() {
        return this.stableKey;
    }

    public final long component3() {
        return this.dismissalTimeMs;
    }

    public final String getBannerId() {
        return this.bannerId;
    }

    public final long getDismissalTimeMs() {
        return this.dismissalTimeMs;
    }

    public final String getStableKey() {
        return this.stableKey;
    }

    public int hashCode() {
        int iHashCode = this.bannerId.hashCode();
        String str = this.stableKey;
        return Long.hashCode(this.dismissalTimeMs) + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return c8$$ExternalSyntheticOutline0.m(this.dismissalTimeMs, ")", c8$$ExternalSyntheticOutline0.m("BannerPendingDismissal(bannerId=", this.bannerId, ", stableKey=", this.stableKey, ", dismissalTimeMs="));
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(BannerPendingDismissal bannerPendingDismissal, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, bannerPendingDismissal.bannerId);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || bannerPendingDismissal.stableKey != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, bannerPendingDismissal.stableKey);
        }
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, bannerPendingDismissal.dismissalTimeMs);
    }

    public static /* synthetic */ BannerPendingDismissal copy$default(BannerPendingDismissal bannerPendingDismissal, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerPendingDismissal.bannerId;
        }
        if ((i & 2) != 0) {
            str2 = bannerPendingDismissal.stableKey;
        }
        if ((i & 4) != 0) {
            j = bannerPendingDismissal.dismissalTimeMs;
        }
        return bannerPendingDismissal.copy(str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerPendingDismissal)) {
            return false;
        }
        BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.bannerId, bannerPendingDismissal.bannerId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stableKey, bannerPendingDismissal.stableKey}, getCieXyz.write())).booleanValue() && this.dismissalTimeMs == bannerPendingDismissal.dismissalTimeMs;
    }

    public final BannerPendingDismissal copy(String str, String str2, long j) {
        str.getClass();
        return new BannerPendingDismissal(str, str2, j);
    }

    public /* synthetic */ BannerPendingDismissal(int i, String str, String str2, long j, onCloseClicked oncloseclicked) {
        if (5 == (i & 5)) {
            this.bannerId = str;
            if ((i & 2) == 0) {
                this.stableKey = null;
            } else {
                this.stableKey = str2;
            }
            this.dismissalTimeMs = j;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, o.a.getDescriptor());
        throw null;
    }

    public BannerPendingDismissal(String str, String str2, long j) {
        str.getClass();
        this.bannerId = str;
        this.stableKey = str2;
        this.dismissalTimeMs = j;
    }

    public /* synthetic */ BannerPendingDismissal(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, j);
    }
}
