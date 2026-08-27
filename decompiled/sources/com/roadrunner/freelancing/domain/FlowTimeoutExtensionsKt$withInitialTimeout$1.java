package com.roadrunner.freelancing.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowTimeoutExtensionsKt$withInitialTimeout$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int serializer = 1;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowTimeoutExtensionsKt$withInitialTimeout$1(long j, AtomicBoolean atomicBoolean, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = j;
        this.IconCompatParcelizer = atomicBoolean;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowTimeoutExtensionsKt$withInitialTimeout$1(Flow flow, long j, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = flow;
        this.read = j;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((FlowTimeoutExtensionsKt$withInitialTimeout$1) create(flowCollector, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((FlowTimeoutExtensionsKt$withInitialTimeout$1) create(flowCollector, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 75;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        if (i4 != 0) {
            Object obj3 = this.RemoteActionCompatParcelizer;
            FlowTimeoutExtensionsKt$withInitialTimeout$1 flowTimeoutExtensionsKt$withInitialTimeout$1 = new FlowTimeoutExtensionsKt$withInitialTimeout$1(this.read, (AtomicBoolean) obj2, obj3, shortNewsContentCardView);
            flowTimeoutExtensionsKt$withInitialTimeout$1.write = obj;
            return flowTimeoutExtensionsKt$withInitialTimeout$1;
        }
        FlowTimeoutExtensionsKt$withInitialTimeout$1 flowTimeoutExtensionsKt$withInitialTimeout$2 = new FlowTimeoutExtensionsKt$withInitialTimeout$1((Flow) obj2, this.read, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        flowTimeoutExtensionsKt$withInitialTimeout$2.write = obj;
        int i5 = MediaMetadataCompat + 27;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return flowTimeoutExtensionsKt$withInitialTimeout$2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 13;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        Object obj3 = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i6 = 1;
        if (i5 == 0) {
            FlowCollector flowCollector = (FlowCollector) this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.MediaDescriptionCompat;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ChannelLimitedFlowMerge channelLimitedFlowMergeIconCompatParcelizer = FlowKt.IconCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MapLayersUiModel$1(atomicBoolean, shortNewsContentCardView, 8), (Flow) obj3), FlowKt.read(new FlowTimeoutExtensionsKt$withInitialTimeout$1(this.read, atomicBoolean, this.RemoteActionCompatParcelizer, (ShortNewsContentCardView) null)));
            StateProviderImpl$special$$inlined$map$7$2 stateProviderImpl$special$$inlined$map$7$2 = new StateProviderImpl$special$$inlined$map$7$2(flowCollector, i6);
            this.write = null;
            this.MediaDescriptionCompat = 1;
            return channelLimitedFlowMergeIconCompatParcelizer.collect(stateProviderImpl$special$$inlined$map$7$2, this) == coroutineSingletons ? coroutineSingletons : obj2;
        }
        FlowCollector flowCollector2 = (FlowCollector) this.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.MediaDescriptionCompat;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.write = flowCollector2;
            this.MediaDescriptionCompat = 1;
            if (DelayKt.delay(this.read, this) == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            }
            i = RatingCompat + 63;
            MediaMetadataCompat = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i9 = 21 / 0;
            }
            return obj2;
        }
        if (i8 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else if (i8 == 2) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i10 = MediaMetadataCompat + 117;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            obj2 = null;
        }
        i = RatingCompat + 63;
        MediaMetadataCompat = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i12 = 21 / 0;
        }
        return obj2;
        if (!((AtomicBoolean) obj3).get()) {
            int i13 = MediaMetadataCompat + 93;
            RatingCompat = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                this.write = null;
                this.MediaDescriptionCompat = 3;
                if (flowCollector2.emit(this.RemoteActionCompatParcelizer, this) == coroutineSingletons2) {
                    obj2 = coroutineSingletons2;
                }
            } else {
                this.write = null;
                this.MediaDescriptionCompat = 2;
                if (flowCollector2.emit(this.RemoteActionCompatParcelizer, this) == coroutineSingletons2) {
                    obj2 = coroutineSingletons2;
                }
            }
        }
        i = RatingCompat + 63;
        MediaMetadataCompat = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i14 = 21 / 0;
        }
        return obj2;
    }
}
