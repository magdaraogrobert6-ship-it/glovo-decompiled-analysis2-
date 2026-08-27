package com.mapbox.navigation.core.accounts;

import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.internal.mlkit_vision_face.zzdr;
import com.mapbox.common.BillingService;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.SessionSKUIdentifier;
import com.mapbox.common.UserSKUIdentifier;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$ActiveGuidance;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$FreeDrive;
import com.mapbox.navigation.core.trip.session.NavigationSessionState$Idle;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.sentiance.core.model.events.E$b;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.getScrollToIndex;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BillingController$$ExternalSyntheticLambda1 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BillingController$$ExternalSyntheticLambda1(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public final void onNavigationSessionStateChanged(getScrollToIndex getscrolltoindex) {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        if (i2 != 0) {
            ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj)).b_(getscrolltoindex);
            int i3 = write + 87;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 20 / 0;
                return;
            }
            return;
        }
        E$b e$b = (E$b) obj;
        AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) e$b.MediaBrowserCompatMediaItem;
        getscrolltoindex.getClass();
        if (!getscrolltoindex.equals(NavigationSessionState$Idle.INSTANCE)) {
            ((BillingService) analyticsServiceImpl.locationProvider).triggerUserBillingEvent((SdkInformation) e$b.MediaDescriptionCompat, UserSKUIdentifier.NAV3_CORE_MAU, new Snapshotter$$ExternalSyntheticLambda0(17, e$b));
        }
        if (getscrolltoindex instanceof NavigationSessionState$Idle) {
            int i5 = read + 51;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                e$b.getRunningOrPausedSessionSkuId();
                throw null;
            }
            SessionSKUIdentifier runningOrPausedSessionSkuId = e$b.getRunningOrPausedSessionSkuId();
            if (runningOrPausedSessionSkuId != null) {
                ((BillingService) analyticsServiceImpl.locationProvider).pauseBillingSession(runningOrPausedSessionSkuId);
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                    int i6 = read + 27;
                    write = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId).concat(" has been paused because Nav SDK is in Idle state"), "BillingExplanation");
                        throw null;
                    }
                    LoggerProviderKt.logI(zzdr.access$getPublicName(runningOrPausedSessionSkuId).concat(" has been paused because Nav SDK is in Idle state"), "BillingExplanation");
                    int i7 = write + 79;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return;
                }
                return;
            }
            return;
        }
        if (!(getscrolltoindex instanceof NavigationSessionState$FreeDrive)) {
            if (getscrolltoindex instanceof NavigationSessionState$ActiveGuidance) {
                SessionSKUIdentifier sessionSKUIdentifier = SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP;
                SessionSKUIdentifier runningOrPausedSessionSkuId2 = e$b.getRunningOrPausedSessionSkuId();
                if (runningOrPausedSessionSkuId2 != sessionSKUIdentifier) {
                    e$b.beginBillingSession(sessionSKUIdentifier, 0L, "Nav SDK is in Active Guidance state");
                    return;
                } else {
                    ((BillingService) analyticsServiceImpl.locationProvider).resumeBillingSession(runningOrPausedSessionSkuId2, new BillingController$$ExternalSyntheticLambda3(e$b, sessionSKUIdentifier, 0L, "Nav SDK is in Active Guidance state"));
                    return;
                }
            }
            return;
        }
        int i9 = write + 101;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            SessionSKUIdentifier sessionSKUIdentifier2 = SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP;
            e$b.getRunningOrPausedSessionSkuId();
            throw null;
        }
        SessionSKUIdentifier sessionSKUIdentifier3 = SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP;
        SessionSKUIdentifier runningOrPausedSessionSkuId3 = e$b.getRunningOrPausedSessionSkuId();
        if (runningOrPausedSessionSkuId3 != sessionSKUIdentifier3) {
            e$b.beginBillingSession(sessionSKUIdentifier3, 3600000L, "Nav SDK is in free drive state");
        } else {
            ((BillingService) analyticsServiceImpl.locationProvider).resumeBillingSession(runningOrPausedSessionSkuId3, new BillingController$$ExternalSyntheticLambda3(e$b, sessionSKUIdentifier3, 3600000L, "Nav SDK is in free drive state"));
        }
    }
}
