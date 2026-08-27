package com.roadrunner.rider.safety.lifecycle;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getCallbackId;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderSafetyLifecycleManager$initializeInternal$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RiderSafetyLifecycleManager write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderSafetyLifecycleManager$initializeInternal$1(RiderSafetyLifecycleManager riderSafetyLifecycleManager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = riderSafetyLifecycleManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 1;
        int i4 = read + 1;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.IconCompatParcelizer;
        RiderSafetyLifecycleManager riderSafetyLifecycleManager = this.write;
        if (i6 == 0) {
            return new RiderSafetyLifecycleManager$initializeInternal$1(riderSafetyLifecycleManager, shortNewsContentCardView, 0);
        }
        if (i6 == 1) {
            return new RiderSafetyLifecycleManager$initializeInternal$1(riderSafetyLifecycleManager, shortNewsContentCardView, i3);
        }
        RiderSafetyLifecycleManager$initializeInternal$1 riderSafetyLifecycleManager$initializeInternal$1 = new RiderSafetyLifecycleManager$initializeInternal$1(riderSafetyLifecycleManager, shortNewsContentCardView, i);
        int i7 = read + 77;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return riderSafetyLifecycleManager$initializeInternal$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 67;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return i4 != 1 ? ((RiderSafetyLifecycleManager$initializeInternal$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((RiderSafetyLifecycleManager$initializeInternal$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((RiderSafetyLifecycleManager$initializeInternal$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 23;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        RiderSafetyLifecycleManager riderSafetyLifecycleManager = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap = riderSafetyLifecycleManager.ResultReceiver;
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(riderSafetyLifecycleManager, shortNewsContentCardView, 28);
                this.RemoteActionCompatParcelizer = 1;
                if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("rider_safety_init_async_internal", authRepository$logoutUser$2, this) == coroutineSingletons) {
                    int i4 = read + 47;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    obj2 = coroutineSingletons;
                }
            } else if (i3 == 1) {
                int i6 = read + 41;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i8 = read + 89;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return obj2;
            }
            throw null;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.RemoteActionCompatParcelizer;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowSerializer = FlowKt.serializer(riderSafetyLifecycleManager.RemoteActionCompatParcelizer.write());
            RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(9, riderSafetyLifecycleManager);
            this.RemoteActionCompatParcelizer = 1;
            return flowSerializer.collect(anonymousClass1, this) == coroutineSingletons2 ? coroutineSingletons2 : obj2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.RemoteActionCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1Write = riderSafetyLifecycleManager.RemoteActionCompatParcelizer.write();
            this.RemoteActionCompatParcelizer = 1;
            obj = FlowKt.firstOrNull(getMapScope$invoke$$inlined$map$1Write, this);
            if (obj != coroutineSingletons3) {
            }
            return coroutineSingletons3;
        }
        int i11 = serializer + 83;
        int i12 = i11 % Fields.SpotShadowColor;
        read = i12;
        int i13 = i11 % 2;
        if (i10 != 1) {
            int i14 = i12 + 3;
            int i15 = i14 % Fields.SpotShadowColor;
            serializer = i15;
            int i16 = i14 % 2;
            if (i10 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = i15 + 47;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getCallbackId getcallbackid = (getCallbackId) obj;
        if (getcallbackid == null) {
            return obj2;
        }
        this.RemoteActionCompatParcelizer = 2;
        if (RiderSafetyLifecycleManager.access$invalidateTripStatus(riderSafetyLifecycleManager, getcallbackid, this) != coroutineSingletons3) {
            return obj2;
        }
        return coroutineSingletons3;
    }
}
