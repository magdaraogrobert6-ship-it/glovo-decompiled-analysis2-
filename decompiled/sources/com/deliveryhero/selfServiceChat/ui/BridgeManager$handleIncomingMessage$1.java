package com.deliveryhero.selfServiceChat.ui;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.VectorPainter;
import o.createFromParcel;
import o.obtainSizePxVpY3zN4;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class BridgeManager$handleIncomingMessage$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ obtainSizePxVpY3zN4 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BridgeManager$handleIncomingMessage$1(obtainSizePxVpY3zN4 obtainsizepxvpy3zn4, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = obtainsizepxvpy3zn4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.write;
        obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = this.IconCompatParcelizer;
        if (i == 0) {
            BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$1 = new BridgeManager$handleIncomingMessage$1(obtainsizepxvpy3zn4, shortNewsContentCardView, 0);
            bridgeManager$handleIncomingMessage$1.serializer = obj;
            return bridgeManager$handleIncomingMessage$1;
        }
        int i2 = 1;
        if (i != 1) {
            BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$2 = new BridgeManager$handleIncomingMessage$1(obtainsizepxvpy3zn4, shortNewsContentCardView, 2);
            bridgeManager$handleIncomingMessage$2.serializer = obj;
            return bridgeManager$handleIncomingMessage$2;
        }
        BridgeManager$handleIncomingMessage$1 bridgeManager$handleIncomingMessage$3 = new BridgeManager$handleIncomingMessage$1(obtainsizepxvpy3zn4, shortNewsContentCardView, i2);
        bridgeManager$handleIncomingMessage$3.serializer = obj;
        return bridgeManager$handleIncomingMessage$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        VectorPainter vectorPainter = (VectorPainter) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i != 0) {
            return i != 1 ? ((BridgeManager$handleIncomingMessage$1) create(vectorPainter, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((BridgeManager$handleIncomingMessage$1) create(vectorPainter, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((BridgeManager$handleIncomingMessage$1) create(vectorPainter, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.write;
        obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            VectorPainter vectorPainter = (VectorPainter) this.serializer;
            validateSizeN5eqBDc validatesizen5eqbdc = obtainSizePxVpY3zN4.read(obtainsizepxvpy3zn4);
            if (validatesizen5eqbdc == null) {
                return createfromparcel;
            }
            this.RemoteActionCompatParcelizer = 1;
            WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) vectorPainter;
            webChatEventsTrackerImpl.getClass();
            Object objIfTrackingEnabled = webChatEventsTrackerImpl.ifTrackingEnabled(this, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, null, 4));
            if (objIfTrackingEnabled != coroutineSingletons) {
                objIfTrackingEnabled = createfromparcel;
            }
            return objIfTrackingEnabled == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            VectorPainter vectorPainter2 = (VectorPainter) this.serializer;
            validateSizeN5eqBDc validatesizen5eqbdc2 = obtainSizePxVpY3zN4.read(obtainsizepxvpy3zn4);
            if (validatesizen5eqbdc2 == null) {
                return createfromparcel;
            }
            this.RemoteActionCompatParcelizer = 1;
            return ((WebChatEventsTrackerImpl) vectorPainter2).trackWebChatHandshakeFailedEvent(validatesizen5eqbdc2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        VectorPainter vectorPainter3 = (VectorPainter) this.serializer;
        validateSizeN5eqBDc validatesizen5eqbdc3 = obtainSizePxVpY3zN4.read(obtainsizepxvpy3zn4);
        if (validatesizen5eqbdc3 == null) {
            return createfromparcel;
        }
        this.RemoteActionCompatParcelizer = 1;
        return ((WebChatEventsTrackerImpl) vectorPainter3).trackWebChatHandshakeFailedEvent(validatesizen5eqbdc3, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
    }
}
