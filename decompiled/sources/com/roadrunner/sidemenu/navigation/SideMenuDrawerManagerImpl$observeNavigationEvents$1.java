package com.roadrunner.sidemenu.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.CallOptions$Builder;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.reactive.FlowSubscription$consumeFlow$2;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public final class SideMenuDrawerManagerImpl$observeNavigationEvents$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CallOptions$Builder serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SideMenuDrawerManagerImpl$observeNavigationEvents$1(CallOptions$Builder callOptions$Builder, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = callOptions$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        CallOptions$Builder callOptions$Builder = this.serializer;
        if (i4 == 0) {
            return new SideMenuDrawerManagerImpl$observeNavigationEvents$1(callOptions$Builder, shortNewsContentCardView, 0);
        }
        SideMenuDrawerManagerImpl$observeNavigationEvents$1 sideMenuDrawerManagerImpl$observeNavigationEvents$1 = new SideMenuDrawerManagerImpl$observeNavigationEvents$1(callOptions$Builder, shortNewsContentCardView, 1);
        int i5 = IconCompatParcelizer + 27;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sideMenuDrawerManagerImpl$observeNavigationEvents$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((SideMenuDrawerManagerImpl$observeNavigationEvents$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SideMenuDrawerManagerImpl$observeNavigationEvents$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 63;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CallOptions$Builder callOptions$Builder = this.serializer;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SharedFlowImpl sharedFlowImpl = ((r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM) callOptions$Builder.serializer).write;
            FlowSubscription$consumeFlow$2 flowSubscription$consumeFlow$2 = new FlowSubscription$consumeFlow$2(25, callOptions$Builder);
            this.write = 1;
            sharedFlowImpl.getClass();
            if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, flowSubscription$consumeFlow$2, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i5 = read + 111;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.write;
        if (i7 != 0) {
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i8 = read + 59;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        supportsColorMatrixQuery supportscolormatrixquery = (supportsColorMatrixQuery) callOptions$Builder.RemoteActionCompatParcelizer;
        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
        SideMenuDrawerManagerImpl$observeNavigationEvents$1 sideMenuDrawerManagerImpl$observeNavigationEvents$1 = new SideMenuDrawerManagerImpl$observeNavigationEvents$1(callOptions$Builder, shortNewsContentCardView, i3);
        this.write = 1;
        if (UrlUtils.repeatOnLifecycle(supportscolormatrixquery, tocolorlong8_81lla, sideMenuDrawerManagerImpl$observeNavigationEvents$1, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i10 = read + 23;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return coroutineSingletons2;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
