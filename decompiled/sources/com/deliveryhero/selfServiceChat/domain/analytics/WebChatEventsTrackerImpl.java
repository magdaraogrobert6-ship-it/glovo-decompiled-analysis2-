package com.deliveryhero.selfServiceChat.domain.analytics;

import coil3.ExtrasKt;
import com.deliveryhero.customerchat.eventTracking.AnalyticsImpl;
import com.deliveryhero.customerchat.fwf.FeatureFlagProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.VectorNode;
import o.VectorPainter;
import o.createFromParcel;
import o.getDrawInvalidation;
import o.obtainInnerShadowRenderereZhPAX0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setOutlineSpotShadowColor;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatEventsTrackerImpl implements VectorPainter {
    public final getDrawInvalidation IconCompatParcelizer;
    public final FeatureFlagProvider RemoteActionCompatParcelizer;
    public final AnalyticsImpl serializer;
    public final setOutlineSpotShadowColor write;

    public WebChatEventsTrackerImpl(AnalyticsImpl analyticsImpl, getDrawInvalidation getdrawinvalidation, FeatureFlagProvider featureFlagProvider, setOutlineSpotShadowColor setoutlinespotshadowcolor) {
        this.serializer = analyticsImpl;
        this.IconCompatParcelizer = getdrawinvalidation;
        this.RemoteActionCompatParcelizer = featureFlagProvider;
        this.write = setoutlinespotshadowcolor;
    }

    public final Object trackWebChatHandshakeFailedEvent(validateSizeN5eqBDc validatesizen5eqbdc, SuspendLambda suspendLambda) {
        Object objIfTrackingEnabled = ifTrackingEnabled(suspendLambda, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(this, validatesizen5eqbdc, null, 3));
        return objIfTrackingEnabled == CoroutineSingletons.COROUTINE_SUSPENDED ? objIfTrackingEnabled : createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object ifTrackingEnabled(ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        VectorNode vectorNode;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        if (shortNewsContentCardView instanceof VectorNode) {
            vectorNode = (VectorNode) shortNewsContentCardView;
            int i = vectorNode.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorNode.serializer = i - Integer.MIN_VALUE;
            } else {
                vectorNode = new VectorNode(this, shortNewsContentCardView);
            }
        } else {
            vectorNode = new VectorNode(this, shortNewsContentCardView);
        }
        Object userFeatureFlags = vectorNode.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorNode.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 2;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(userFeatureFlags);
            vectorNode.IconCompatParcelizer = this;
            vectorNode.RemoteActionCompatParcelizer = (SuspendLambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            vectorNode.serializer = 1;
            userFeatureFlags = this.RemoteActionCompatParcelizer.getUserFeatureFlags(vectorNode);
            if (userFeatureFlags != coroutineSingletons) {
                webChatEventsTrackerImpl = this;
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(userFeatureFlags);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) vectorNode.RemoteActionCompatParcelizer;
        webChatEventsTrackerImpl = vectorNode.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(userFeatureFlags);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        obtainInnerShadowRenderereZhPAX0 obtaininnershadowrendererezhpax0 = (obtainInnerShadowRenderereZhPAX0) userFeatureFlags;
        if (obtaininnershadowrendererezhpax0 == null) {
            obtaininnershadowrendererezhpax0 = new obtainInnerShadowRenderereZhPAX0();
        }
        if (obtaininnershadowrendererezhpax0.write()) {
            setOutlineSpotShadowColor setoutlinespotshadowcolor = webChatEventsTrackerImpl.write;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            ExecuteDatabaseRequest$invoke$2 executeDatabaseRequest$invoke$2 = new ExecuteDatabaseRequest$invoke$2(i3, shortNewsContentCardView2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            vectorNode.IconCompatParcelizer = null;
            vectorNode.RemoteActionCompatParcelizer = null;
            vectorNode.serializer = 2;
            if (BuildersKt.withContext(defaultIoScheduler, executeDatabaseRequest$invoke$2, vectorNode) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
