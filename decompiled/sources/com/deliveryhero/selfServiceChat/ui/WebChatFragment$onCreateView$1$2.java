package com.deliveryhero.selfServiceChat.ui;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatFragment$onCreateView$1$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatFragment serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatFragment$onCreateView$1$2(WebChatFragment webChatFragment, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = webChatFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        WebChatFragment webChatFragment = this.serializer;
        if (i == 0) {
            return new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, 3) : new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, 2);
        }
        return new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, i2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            return ((WebChatFragment$onCreateView$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((WebChatFragment$onCreateView$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebChatFragment$onCreateView$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((WebChatFragment$onCreateView$1$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatFragment webChatFragment = this.serializer;
        int i2 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
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
            toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.CREATED;
            WebChatFragment$onCreateView$1$2 webChatFragment$onCreateView$1$2 = new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, i2);
            this.RemoteActionCompatParcelizer = 1;
            return UrlUtils.repeatOnLifecycle(webChatFragment, tocolorlong8_81lla, webChatFragment$onCreateView$1$2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.RemoteActionCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = webChatFragment.IconCompatParcelizer().MediaMetadataCompat;
                WebChatFragment$onCreateView$1$2$1$1 webChatFragment$onCreateView$1$2$1$1 = new WebChatFragment$onCreateView$1$2$1$1(webChatFragment, 0);
                this.RemoteActionCompatParcelizer = 1;
                sharedFlowImpl.getClass();
                if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, webChatFragment$onCreateView$1$2$1$1, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        int i5 = 2;
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.RemoteActionCompatParcelizer;
            if (i6 != 0) {
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.CREATED;
            WebChatFragment$onCreateView$1$2 webChatFragment$onCreateView$1$3 = new WebChatFragment$onCreateView$1$2(webChatFragment, shortNewsContentCardView, i5);
            this.RemoteActionCompatParcelizer = 1;
            return UrlUtils.repeatOnLifecycle(webChatFragment, tocolorlong8_81lla2, webChatFragment$onCreateView$1$3, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateFlow stateFlow = webChatFragment.IconCompatParcelizer().r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            WebChatFragment$onCreateView$1$2$1$1 webChatFragment$onCreateView$1$2$1$2 = new WebChatFragment$onCreateView$1$2$1$1(webChatFragment, 1);
            this.RemoteActionCompatParcelizer = 1;
            if (stateFlow.collect(webChatFragment$onCreateView$1$2$1$2, this) == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }
}
