package com.deliveryhero.selfServiceChat.domain.analytics;

import coil3.ExtrasKt;
import com.deliveryhero.customerchat.analytics.model.EventCreationRequest;
import com.deliveryhero.customerchat.eventTracking.AnalyticsImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accesssetDrawInvalidation;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ validateSizeN5eqBDc IconCompatParcelizer;
    public final /* synthetic */ WebChatEventsTrackerImpl RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(WebChatEventsTrackerImpl webChatEventsTrackerImpl, validateSizeN5eqBDc validatesizen5eqbdc, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = webChatEventsTrackerImpl;
        this.IconCompatParcelizer = validatesizen5eqbdc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        validateSizeN5eqBDc validatesizen5eqbdc = this.IconCompatParcelizer;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, i2);
        }
        int i3 = 2;
        if (i == 2) {
            return new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, i3);
        }
        int i4 = 3;
        if (i == 3) {
            return new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, i4);
        }
        int i5 = 4;
        if (i != 4) {
            return i != 5 ? new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, 6) : new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, 5);
        }
        return new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, i5);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i == 0) {
            return ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i == 1) {
            return ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i == 2) {
            return ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i == 3) {
            return ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 4) {
            return i != 5 ? ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        validateSizeN5eqBDc validatesizen5eqbdc = this.IconCompatParcelizer;
        WebChatEventsTrackerImpl webChatEventsTrackerImpl = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.read;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_FETCH_URL", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl.track(eventCreationRequestWrite, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl2 = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite2 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_USED_CACHED_URL", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl2.track(eventCreationRequestWrite2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl3 = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite3 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_FETCH_URL_FAILED", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl3.track(eventCreationRequestWrite3, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        if (i == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl4 = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite4 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_BRIDGE_HANDSHAKING_FAILED", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl4.track(eventCreationRequestWrite4, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
        }
        if (i == 4) {
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.read;
            if (i6 != 0) {
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl5 = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite5 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_BRIDGE_HANDSHAKING_SUCCESS", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl5.track(eventCreationRequestWrite5, this) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
        }
        if (i != 5) {
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnalyticsImpl analyticsImpl6 = webChatEventsTrackerImpl.serializer;
            EventCreationRequest eventCreationRequestWrite6 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_ERROR_RETRY_BUTTON_CLICKED", validatesizen5eqbdc, null);
            this.read = 1;
            return analyticsImpl6.track(eventCreationRequestWrite6, this) == coroutineSingletons6 ? coroutineSingletons6 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.read;
        if (i8 != 0) {
            if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AnalyticsImpl analyticsImpl7 = webChatEventsTrackerImpl.serializer;
        EventCreationRequest eventCreationRequestWrite7 = ((accesssetDrawInvalidation) webChatEventsTrackerImpl.IconCompatParcelizer).write("HELP_CENTER_MOBILE_SDK_LOADER_STARTED", validatesizen5eqbdc, null);
        this.read = 1;
        return analyticsImpl7.track(eventCreationRequestWrite7, this) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
    }
}
