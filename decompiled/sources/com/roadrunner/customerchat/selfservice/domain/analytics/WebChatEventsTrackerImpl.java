package com.roadrunner.customerchat.selfservice.domain.analytics;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.Bullet;
import o.accessanalyzeComponents58bKbWc;
import o.createFromParcel;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerOnChangedCallback;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatEventsTrackerImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final registerOnChangedCallback IconCompatParcelizer;
    public final InitializeAppStartupItemsImpl read;
    public final isOpenInternalroom_runtime serializer;
    public final AnalyticsImpl write;

    public WebChatEventsTrackerImpl(AnalyticsImpl analyticsImpl, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, registerOnChangedCallback registeronchangedcallback) {
        analyticsImpl.getClass();
        initializeAppStartupItemsImpl.getClass();
        isopeninternalroom_runtime.getClass();
        registeronchangedcallback.getClass();
        this.write = analyticsImpl;
        this.read = initializeAppStartupItemsImpl;
        this.serializer = isopeninternalroom_runtime;
        this.IconCompatParcelizer = registeronchangedcallback;
    }

    public final Object trackWebChatHandshakeFailedEvent(Bullet bullet, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        Object objIfTrackingEnabled = ifTrackingEnabled(new WebChatEventsTrackerImpl$trackHelpCenterUrlFetchEvent$2(this, bullet, null, 2), suspendLambda);
        if (objIfTrackingEnabled != CoroutineSingletons.COROUTINE_SUSPENDED) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = MediaDescriptionCompat + 67;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return createfromparcel;
        }
        int i4 = RemoteActionCompatParcelizer + 9;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objIfTrackingEnabled;
    }

    public final Object ifTrackingEnabled(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.IconCompatParcelizer).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_CHAT_TRACKING_ENABLED.getFirebaseFlagName())) {
            ((inCompatibilityMode) this.serializer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ExecuteDatabaseRequest$invoke$2(6, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm), suspendLambda);
            if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i4 = MediaDescriptionCompat + 105;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objWithContext;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i6 = MediaDescriptionCompat + 69;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
