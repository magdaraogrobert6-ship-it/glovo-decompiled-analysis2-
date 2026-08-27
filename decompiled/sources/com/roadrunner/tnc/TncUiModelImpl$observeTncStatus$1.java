package com.roadrunner.tnc;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.dispatchChildDetached;
import o.displayInAppMessagelambda1;
import o.getContentViewGroupParentLayout;
import o.getItemAnimator;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.refreshFeatureFlagslambda0;
import o.removeSingleSubscriptionlambda100;

/* JADX INFO: loaded from: classes3.dex */
public final class TncUiModelImpl$observeTncStatus$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ refreshFeatureFlagslambda0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TncUiModelImpl$observeTncStatus$1(refreshFeatureFlagslambda0 refreshfeatureflagslambda0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = refreshfeatureflagslambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 81;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0 = this.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            return new TncUiModelImpl$observeTncStatus$1(refreshfeatureflagslambda0, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 != 1) {
            return new TncUiModelImpl$observeTncStatus$1(refreshfeatureflagslambda0, shortNewsContentCardView, i);
        }
        TncUiModelImpl$observeTncStatus$1 tncUiModelImpl$observeTncStatus$1 = new TncUiModelImpl$observeTncStatus$1(refreshfeatureflagslambda0, shortNewsContentCardView, i6);
        int i7 = write + 93;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return tncUiModelImpl$observeTncStatus$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return i4 != 1 ? ((TncUiModelImpl$observeTncStatus$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((TncUiModelImpl$observeTncStatus$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((TncUiModelImpl$observeTncStatus$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 55;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        refreshFeatureFlagslambda0 refreshfeatureflagslambda0 = this.RemoteActionCompatParcelizer;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i5 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.IconCompatParcelizer;
            if (i6 != 0) {
                int i7 = serializer + 93;
                write = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0 ? i6 != 1 : i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = refreshfeatureflagslambda0.RatingCompat.IconCompatParcelizer.read;
                removeSingleSubscriptionlambda100 removesinglesubscriptionlambda100 = new removeSingleSubscriptionlambda100(refreshfeatureflagslambda0, i4);
                this.IconCompatParcelizer = 1;
                if (mutableStateFlow.collect(removesinglesubscriptionlambda100, this) == coroutineSingletons) {
                    obj2 = coroutineSingletons;
                }
            }
            int i8 = serializer + 95;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return obj2;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (i3 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.IconCompatParcelizer;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SharedFlowImpl sharedFlowImpl = refreshfeatureflagslambda0.MediaSessionCompatToken.RemoteActionCompatParcelizer;
                removeSingleSubscriptionlambda100 removesinglesubscriptionlambda101 = new removeSingleSubscriptionlambda100(refreshfeatureflagslambda0, i);
                this.IconCompatParcelizer = 1;
                sharedFlowImpl.getClass();
                if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, removesinglesubscriptionlambda101, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            DrawableTransformation.read();
            return null;
        }
        dispatchChildDetached dispatchchilddetached = refreshfeatureflagslambda0.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.IconCompatParcelizer;
        if (i10 != 0) {
            int i11 = serializer + 105;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        RiderStateRepositoryImpl riderStateRepositoryImpl = (RiderStateRepositoryImpl) dispatchchilddetached;
        if (!riderStateRepositoryImpl.write()) {
            BuildersKt.RemoteActionCompatParcelizer(refreshfeatureflagslambda0.RemoteActionCompatParcelizer, null, null, new TncUiModelImpl$observeTncStatus$1(refreshfeatureflagslambda0, shortNewsContentCardView, i4), 3);
            return obj2;
        }
        Flow flow = riderStateRepositoryImpl.read(displayInAppMessagelambda1.serializer(getItemAnimator.class));
        removeSingleSubscriptionlambda100 removesinglesubscriptionlambda102 = new removeSingleSubscriptionlambda100(refreshfeatureflagslambda0, i5);
        this.IconCompatParcelizer = 1;
        if (flow.collect(removesinglesubscriptionlambda102, this) != coroutineSingletons3) {
            return obj2;
        }
        int i13 = write + 97;
        serializer = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return coroutineSingletons3;
    }
}
