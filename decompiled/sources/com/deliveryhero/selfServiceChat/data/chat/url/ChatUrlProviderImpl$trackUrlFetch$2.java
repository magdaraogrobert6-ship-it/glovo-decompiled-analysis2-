package com.deliveryhero.selfServiceChat.data.chat.url;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl;
import com.deliveryhero.selfServiceChat.domain.analytics.WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.VectorPainter;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatUrlProviderImpl$trackUrlFetch$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ ChatUrlProviderImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ validateSizeN5eqBDc write;

    /* JADX INFO: renamed from: com.deliveryhero.selfServiceChat.data.chat.url.ChatUrlProviderImpl$trackUrlFetch$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ ChatUrlProviderImpl IconCompatParcelizer;
        public int read;
        public final /* synthetic */ validateSizeN5eqBDc serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(ChatUrlProviderImpl chatUrlProviderImpl, validateSizeN5eqBDc validatesizen5eqbdc, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = chatUrlProviderImpl;
            this.serializer = validatesizen5eqbdc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.write;
            validateSizeN5eqBDc validatesizen5eqbdc = this.serializer;
            ChatUrlProviderImpl chatUrlProviderImpl = this.IconCompatParcelizer;
            return i != 0 ? new AnonymousClass1(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 1) : new AnonymousClass1(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 0);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.write;
            validateSizeN5eqBDc validatesizen5eqbdc = this.serializer;
            ChatUrlProviderImpl chatUrlProviderImpl = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i2 = 1;
            if (i != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
                VectorPainter vectorPainter = chatUrlProviderImpl.MediaSessionCompatQueueItem;
                this.read = 1;
                WebChatEventsTrackerImpl webChatEventsTrackerImpl = (WebChatEventsTrackerImpl) vectorPainter;
                Object objIfTrackingEnabled = webChatEventsTrackerImpl.ifTrackingEnabled(this, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl, validatesizen5eqbdc, shortNewsContentCardView, i2));
                if (objIfTrackingEnabled != coroutineSingletons) {
                    objIfTrackingEnabled = createfromparcel;
                }
                return objIfTrackingEnabled == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
            VectorPainter vectorPainter2 = chatUrlProviderImpl.MediaSessionCompatQueueItem;
            this.read = 1;
            WebChatEventsTrackerImpl webChatEventsTrackerImpl2 = (WebChatEventsTrackerImpl) vectorPainter2;
            Object objIfTrackingEnabled2 = webChatEventsTrackerImpl2.ifTrackingEnabled(this, new WebChatEventsTrackerImpl$trackHelpcenterURLFetchEvent$2(webChatEventsTrackerImpl2, validatesizen5eqbdc, shortNewsContentCardView, 0));
            if (objIfTrackingEnabled2 != coroutineSingletons2) {
                objIfTrackingEnabled2 = createfromparcel;
            }
            return objIfTrackingEnabled2 == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatUrlProviderImpl$trackUrlFetch$2(ChatUrlProviderImpl chatUrlProviderImpl, validateSizeN5eqBDc validatesizen5eqbdc, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = chatUrlProviderImpl;
        this.write = validatesizen5eqbdc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        validateSizeN5eqBDc validatesizen5eqbdc = this.write;
        ChatUrlProviderImpl chatUrlProviderImpl = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ChatUrlProviderImpl$trackUrlFetch$2 chatUrlProviderImpl$trackUrlFetch$2 = new ChatUrlProviderImpl$trackUrlFetch$2(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 1);
            chatUrlProviderImpl$trackUrlFetch$2.serializer = obj;
            return chatUrlProviderImpl$trackUrlFetch$2;
        }
        ChatUrlProviderImpl$trackUrlFetch$2 chatUrlProviderImpl$trackUrlFetch$3 = new ChatUrlProviderImpl$trackUrlFetch$2(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 0);
        chatUrlProviderImpl$trackUrlFetch$3.serializer = obj;
        return chatUrlProviderImpl$trackUrlFetch$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((ChatUrlProviderImpl$trackUrlFetch$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((ChatUrlProviderImpl$trackUrlFetch$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.read;
        validateSizeN5eqBDc validatesizen5eqbdc = this.write;
        ChatUrlProviderImpl chatUrlProviderImpl = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.serializer, null, null, new AnonymousClass1(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 1), 3);
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.serializer, null, null, new AnonymousClass1(chatUrlProviderImpl, validatesizen5eqbdc, shortNewsContentCardView, 0), 3);
    }
}
