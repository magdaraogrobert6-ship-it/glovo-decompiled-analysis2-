package com.roadrunner.rider.state;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setOnAttributionChangedListener;
import o.setOnEventTrackingSucceededListener;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateRepositoryImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ setOnEventTrackingSucceededListener serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderStateRepositoryImpl$1(setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = setoneventtrackingsucceededlistener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = this.serializer;
        if (i4 != 0) {
            RiderStateRepositoryImpl$1 riderStateRepositoryImpl$1 = new RiderStateRepositoryImpl$1(setoneventtrackingsucceededlistener, shortNewsContentCardView, 1);
            int i5 = RemoteActionCompatParcelizer + 95;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return riderStateRepositoryImpl$1;
        }
        RiderStateRepositoryImpl$1 riderStateRepositoryImpl$2 = new RiderStateRepositoryImpl$1(setoneventtrackingsucceededlistener, shortNewsContentCardView, 0);
        int i7 = read + 13;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return riderStateRepositoryImpl$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 13;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((RiderStateRepositoryImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((RiderStateRepositoryImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RemoteActionCompatParcelizer + 87;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = createFromParcel.INSTANCE;
        setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener = this.serializer;
        int i3 = 1;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowSerializer = FlowKt.serializer(setoneventtrackingsucceededlistener.IconCompatParcelizer.write());
            setOnAttributionChangedListener setonattributionchangedlistener = new setOnAttributionChangedListener(setoneventtrackingsucceededlistener, i3);
            this.IconCompatParcelizer = 1;
            return flowSerializer.collect(setonattributionchangedlistener, this) == coroutineSingletons ? coroutineSingletons : obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = RemoteActionCompatParcelizer + 49;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowSerializer2 = FlowKt.serializer(setoneventtrackingsucceededlistener.RemoteActionCompatParcelizer.write());
            setOnAttributionChangedListener setonattributionchangedlistener2 = new setOnAttributionChangedListener(setoneventtrackingsucceededlistener, 0);
            this.IconCompatParcelizer = 1;
            if (flowSerializer2.collect(setonattributionchangedlistener2, this) == coroutineSingletons2) {
                int i7 = RemoteActionCompatParcelizer + 115;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                obj2 = coroutineSingletons2;
            }
        }
        int i9 = read + 75;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return obj2;
    }
}
