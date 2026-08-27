package com.roadrunner.helpcenter.businessmetrics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.dump;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessMetricsTracker$runTimer$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ BusinessMetricsTracker RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BusinessMetricsTracker$runTimer$1(BusinessMetricsTracker businessMetricsTracker, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = businessMetricsTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 109;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.read;
        BusinessMetricsTracker businessMetricsTracker = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            return new BusinessMetricsTracker$runTimer$1(businessMetricsTracker, shortNewsContentCardView, 0);
        }
        BusinessMetricsTracker$runTimer$1 businessMetricsTracker$runTimer$1 = new BusinessMetricsTracker$runTimer$1(businessMetricsTracker, shortNewsContentCardView, 1);
        int i4 = serializer + 113;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return businessMetricsTracker$runTimer$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 93;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            return ((BusinessMetricsTracker$runTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((BusinessMetricsTracker$runTimer$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 27;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        BusinessMetricsTracker businessMetricsTracker = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            dump dumpVar = businessMetricsTracker.IconCompatParcelizer;
            this.IconCompatParcelizer = 1;
            Object objPostEvents = dumpVar.RemoteActionCompatParcelizer.postEvents(this);
            if (objPostEvents != coroutineSingletons) {
                objPostEvents = createfromparcel;
            }
            if (objPostEvents != coroutineSingletons) {
                return createfromparcel;
            }
            int i5 = serializer + 17;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.getClass();
            long jWrite = ((FirebaseRemoteConfigImpl) businessMetricsTracker.serializer).IconCompatParcelizer.write("web_dispatcher_chat_tracking_throttling_time");
            this.IconCompatParcelizer = 1;
            if (DelayKt.delay(jWrite * 1000, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = serializer + 29;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            int i10 = serializer + 87;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = businessMetricsTracker.read;
        ((inCompatibilityMode) businessMetricsTracker.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BusinessMetricsTracker$runTimer$1(businessMetricsTracker, shortNewsContentCardView, i3), 2);
        Timber.RemoteActionCompatParcelizer.getClass();
        return createfromparcel;
    }
}
