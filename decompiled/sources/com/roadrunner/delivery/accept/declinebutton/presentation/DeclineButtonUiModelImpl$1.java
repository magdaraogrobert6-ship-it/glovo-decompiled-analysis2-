package com.roadrunner.delivery.accept.declinebutton.presentation;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineButtonClickEventRetriever;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.TrackingEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BoringLayoutFactory;
import o.ShortNewsContentCardView;
import o.accesstoNestedScrollSource;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.hasSameLayoutAffectingAttributes;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeclineButtonUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ BoringLayoutFactory RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeclineButtonUiModelImpl$1(BoringLayoutFactory boringLayoutFactory, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = boringLayoutFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        BoringLayoutFactory boringLayoutFactory = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            return new DeclineButtonUiModelImpl$1(boringLayoutFactory, shortNewsContentCardView, 0);
        }
        DeclineButtonUiModelImpl$1 declineButtonUiModelImpl$1 = new DeclineButtonUiModelImpl$1(boringLayoutFactory, shortNewsContentCardView, 1);
        int i4 = serializer + 103;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return declineButtonUiModelImpl$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((DeclineButtonUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((DeclineButtonUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 27;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        BoringLayoutFactory boringLayoutFactory = this.RemoteActionCompatParcelizer;
        Object obj3 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DeclineButtonClickEventRetriever declineButtonClickEventRetriever = boringLayoutFactory.RemoteActionCompatParcelizer;
                this.write = 1;
                obj = declineButtonClickEventRetriever.invoke(this);
                if (obj == coroutineSingletons) {
                    int i4 = IconCompatParcelizer + 31;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = serializer + 31;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    obj3.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            TrackingEvent trackingEvent = (TrackingEvent) obj;
            if (trackingEvent == null) {
                return obj2;
            }
            boringLayoutFactory.IconCompatParcelizer.serializer(trackingEvent);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            hasSameLayoutAffectingAttributes hassamelayoutaffectingattributes = boringLayoutFactory.MediaBrowserCompatMediaItem;
            StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2 = ((StateProviderImpl) ((accesstoNestedScrollSource) hassamelayoutaffectingattributes.write)).MediaBrowserCompatMediaItem;
            FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$1 = new FlowLiveDataConversions$asLiveData$1$1(11, boringLayoutFactory);
            this.write = 1;
            Object objCollect = stateProviderImpl$special$$inlined$map$2.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(new ThumbNode$onAttach$1$1(flowLiveDataConversions$asLiveData$1$1, 15, hassamelayoutaffectingattributes), 11), this);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = obj2;
            }
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = obj2;
            }
            if (objCollect == coroutineSingletons2) {
                int i8 = IconCompatParcelizer + 61;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                obj2 = coroutineSingletons2;
            }
        } else if (i7 == 1) {
            int i10 = serializer + 39;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj3.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i11 = IconCompatParcelizer + 111;
        serializer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return obj2;
    }
}
