package com.deliveryhero.selfServiceChat.ui;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.LayerSnapshotV22;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.VectorPropertyScaleX;
import o.VectorPropertyStrokeLineWidth;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isIdentityannotations;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Throwable RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(Throwable th, ShortNewsContentCardView shortNewsContentCardView, WebChatViewmodel webChatViewmodel, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = th;
        this.write = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        WebChatViewmodel webChatViewmodel = this.write;
        Throwable th = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, 3) : new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, 2);
        }
        return new WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1(th, shortNewsContentCardView, webChatViewmodel, i2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            ((WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i == 1) {
            ((WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i != 2) {
            ((WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((WebChatViewmodel$trackEvent$$inlined$exceptionHandler$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.IconCompatParcelizer;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatViewmodel webChatViewmodel = this.write;
        Throwable th = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isIdentityannotations isidentityannotations = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
            if (isidentityannotations != null) {
                isidentityannotations.serializer("WEB_CHAT_TRACKING_ERROR_EVENT", simpleItemTouchHelperCallback, th);
            }
            return createfromparcel;
        }
        int i2 = 2;
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = webChatViewmodel.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            do {
                obj2 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, new VectorPropertyStrokeLineWidth(th), false, 19)));
            webChatViewmodel.write(new WebChatViewmodel$startTimerForTimeout$1$1(webChatViewmodel, (ShortNewsContentCardView) null, i2));
            return createfromparcel;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isIdentityannotations isidentityannotations2 = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
            if (isidentityannotations2 != null) {
                isidentityannotations2.serializer("WEB_CHAT_TOKEN_UPDATE_FAILED_EVENT", simpleItemTouchHelperCallback, th);
            }
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        isIdentityannotations isidentityannotations3 = webChatViewmodel.RemoteActionCompatParcelizer.serializer;
        if (isidentityannotations3 != null) {
            isidentityannotations3.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "EVENT", "Exception in Web chat ViewModel", th);
        }
        return createfromparcel;
    }
}
