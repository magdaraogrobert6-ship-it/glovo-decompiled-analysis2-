package com.roadrunner.delivery.accept.acknowledgment.implementation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidView;
import o.ShortNewsContentCardView;
import o.UrlAnnotationSaverlambda0;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ UrlAnnotationSaverlambda0 RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1(UrlAnnotationSaverlambda0 urlAnnotationSaverlambda0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = urlAnnotationSaverlambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 13;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        UrlAnnotationSaverlambda0 urlAnnotationSaverlambda0 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return new DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1(urlAnnotationSaverlambda0, shortNewsContentCardView, 1);
        }
        DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 = new DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1(urlAnnotationSaverlambda0, shortNewsContentCardView, 0);
        int i5 = read + 67;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 7;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        UrlAnnotationSaverlambda0 urlAnnotationSaverlambda0 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.serializer;
            if (i4 != 0) {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = read + 23;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MetricsBatchProcessor metricsBatchProcessor = urlAnnotationSaverlambda0.serializer;
            this.serializer = 1;
            accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) metricsBatchProcessor.RemoteActionCompatParcelizer;
            Object objCollect = FlowKt.collect(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AcknowledgeCurrentDeliveries$invoke$4(metricsBatchProcessor, null), FlowKt.serializer(new HeatmapDataStore$get$$inlined$map$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((StateProviderImpl) ((AndroidView) accessrequireviewfactoryholder)).RemoteActionCompatParcelizer, new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessrequireviewfactoryholder)).MediaBrowserCompatMediaItem, 28), new GetBubbleUiState.AnonymousClass2(metricsBatchProcessor, null, 2))), metricsBatchProcessor, 6))), this);
            if (objCollect != coroutineSingletons) {
                objCollect = obj2;
            }
            return objCollect == coroutineSingletons ? coroutineSingletons : obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1 = new DeliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1(urlAnnotationSaverlambda0, shortNewsContentCardView, i3);
            this.serializer = 1;
            if (BuildersKt.withContext(defaultIoScheduler, deliveryAcknowledgmentLifecycleObserverImpl$onCreate$1$1, this) == coroutineSingletons2) {
                int i8 = read + 7;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                obj2 = coroutineSingletons2;
            }
        } else if (i7 == 1) {
            int i10 = write + 27;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i11 = write + 41;
        read = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return obj2;
    }
}
