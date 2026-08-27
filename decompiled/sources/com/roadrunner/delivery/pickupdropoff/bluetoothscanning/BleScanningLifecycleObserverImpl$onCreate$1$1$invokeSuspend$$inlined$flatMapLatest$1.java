package com.roadrunner.delivery.pickupdropoff.bluetoothscanning;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getStartEllipsisgIe3tQ8annotations;
import o.isInsideContent;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final class BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ accessisRenderNodeCompatiblecp IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ BleScanningLifecycleObserverImpl read;
    public /* synthetic */ Object serializer;
    public /* synthetic */ FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = bleScanningLifecycleObserverImpl;
        this.IconCompatParcelizer = accessisrendernodecompatiblecp;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = this.read;
        BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1 bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1 = new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1(this.IconCompatParcelizer, bleScanningLifecycleObserverImpl, (ShortNewsContentCardView) obj3);
        bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1.write = (FlowCollector) obj;
        bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1.serializer = obj2;
        Object objInvokeSuspend = bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaDescriptionCompat + 107;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r1
  0x0043: PHI (r1v12 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r1v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r1v13 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r5
  0x0021: PHI (r5v1 int) = (r5v0 int), (r5v7 int) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        FlowCollector flowCollector;
        isInsideContent isinsidecontent;
        Flow flowRemoteActionCompatParcelizer;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = MediaDescriptionCompat + 51;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        int i7 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 % 2 != 0) {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.RemoteActionCompatParcelizer;
            int i8 = 35 / 0;
            if (i != 0) {
                i2 = MediaDescriptionCompat + 57;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0 ? i != 1 : i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = MediaDescriptionCompat + 1;
                MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                flowCollector = this.write;
                isinsidecontent = (isInsideContent) this.serializer;
                if (isinsidecontent == null) {
                    i4 = MediaDescriptionCompat + 1;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        FlowKt.serializer();
                        throw null;
                    }
                    flowRemoteActionCompatParcelizer = FlowKt.serializer();
                } else {
                    BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = this.read;
                    getStartEllipsisgIe3tQ8annotations getstartellipsisgie3tq8annotations = bleScanningLifecycleObserverImpl.ParcelableVolumeInfo;
                    getstartellipsisgie3tq8annotations.getClass();
                    flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(bleScanningLifecycleObserverImpl, shortNewsContentCardView, i7), FlowKt.write(new DeliveryNotesUiModelImpl.AnonymousClass1(getstartellipsisgie3tq8annotations, shortNewsContentCardView, 25))), new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(null, bleScanningLifecycleObserverImpl, isinsidecontent, this.IconCompatParcelizer, 0));
                }
                this.write = null;
                this.serializer = null;
                this.RemoteActionCompatParcelizer = 1;
                if (FlowKt.emitAll(flowCollector, flowRemoteActionCompatParcelizer, this) == coroutineSingletons) {
                    i3 = MediaSessionCompatQueueItem + 85;
                    MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            }
        } else {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                i2 = MediaDescriptionCompat + 57;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            flowCollector = this.write;
            isinsidecontent = (isInsideContent) this.serializer;
            if (isinsidecontent == null) {
                i4 = MediaDescriptionCompat + 1;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    FlowKt.serializer();
                    throw null;
                }
                flowRemoteActionCompatParcelizer = FlowKt.serializer();
            } else {
                BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl2 = this.read;
                getStartEllipsisgIe3tQ8annotations getstartellipsisgie3tq8annotations2 = bleScanningLifecycleObserverImpl2.ParcelableVolumeInfo;
                getstartellipsisgie3tq8annotations2.getClass();
                flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(bleScanningLifecycleObserverImpl2, shortNewsContentCardView, i7), FlowKt.write(new DeliveryNotesUiModelImpl.AnonymousClass1(getstartellipsisgie3tq8annotations2, shortNewsContentCardView, 25))), new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(null, bleScanningLifecycleObserverImpl2, isinsidecontent, this.IconCompatParcelizer, 0));
            }
            this.write = null;
            this.serializer = null;
            this.RemoteActionCompatParcelizer = 1;
            if (FlowKt.emitAll(flowCollector, flowRemoteActionCompatParcelizer, this) == coroutineSingletons) {
                i3 = MediaSessionCompatQueueItem + 85;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i11 = MediaSessionCompatQueueItem + 75;
        MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
