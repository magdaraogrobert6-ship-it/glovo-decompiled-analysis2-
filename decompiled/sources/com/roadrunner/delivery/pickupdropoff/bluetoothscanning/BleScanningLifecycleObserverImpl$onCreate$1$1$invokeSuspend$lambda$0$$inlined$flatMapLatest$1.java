package com.roadrunner.delivery.pickupdropoff.bluetoothscanning;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.createFromParcel;
import o.getClipgIe3tQ8;
import o.isInsideContent;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final class BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ isInsideContent IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ BleScanningLifecycleObserverImpl MediaDescriptionCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ accessisRenderNodeCompatiblecp serializer;
    public /* synthetic */ FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(ShortNewsContentCardView shortNewsContentCardView, BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl, isInsideContent isinsidecontent, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, int i) {
        super(3, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.MediaDescriptionCompat = bleScanningLifecycleObserverImpl;
        this.IconCompatParcelizer = isinsidecontent;
        this.serializer = accessisrendernodecompatiblecp;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        if (i3 != 0) {
            BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1 bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1 = new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(shortNewsContentCardView, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.serializer, 1);
            bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1.write = flowCollector;
            bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1.read = obj2;
            return bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(createfromparcel2);
        }
        BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1 bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$2 = new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(shortNewsContentCardView, this.MediaDescriptionCompat, this.IconCompatParcelizer, this.serializer, 0);
        bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$2.write = flowCollector;
        bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$2.read = obj2;
        Object objInvokeSuspend = bleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$2.invokeSuspend(createfromparcel2);
        int i4 = MediaMetadataCompat + 79;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowRemoteActionCompatParcelizer;
        Flow flowSerializer;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.MediaBrowserCompatMediaItem;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowCollector flowCollector = this.write;
            if (((Boolean) this.read).booleanValue()) {
                flowSerializer = FlowKt.read(new PerseusLogger$w$1(this.MediaDescriptionCompat, this.IconCompatParcelizer, this.serializer, null, 25));
            } else {
                int i4 = MediaMetadataCompat + 7;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                flowSerializer = FlowKt.serializer();
                int i6 = MediaSessionCompatQueueItem + 87;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            this.write = null;
            this.read = null;
            this.MediaBrowserCompatMediaItem = 1;
            return FlowKt.emitAll(flowCollector, flowSerializer, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.MediaBrowserCompatMediaItem;
        if (i8 != 0) {
            int i9 = MediaMetadataCompat + 87;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0 ? i8 != 1 : i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i10 = MediaSessionCompatQueueItem + 69;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FlowCollector flowCollector2 = this.write;
        boolean zBooleanValue = ((Boolean) this.read).booleanValue();
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl = this.MediaDescriptionCompat;
        if (zBooleanValue) {
            getClipgIe3tQ8 getclipgie3tq8 = bleScanningLifecycleObserverImpl.MediaSessionCompatToken;
            getclipgie3tq8.getClass();
            flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new BleScanningLifecycleObserverImpl$onCreate$1$1$2$1(bleScanningLifecycleObserverImpl, null, 1), FlowKt.serializer(FlowKt.read(new PerseusLogger$w$1(getclipgie3tq8, (ShortNewsContentCardView) null, 26)))), new BleScanningLifecycleObserverImpl$onCreate$1$1$invokeSuspend$lambda$0$$inlined$flatMapLatest$1(null, bleScanningLifecycleObserverImpl, this.IconCompatParcelizer, this.serializer, 1));
        } else {
            flowRemoteActionCompatParcelizer = FlowKt.read(new SwitcherUiModelImpl$1(bleScanningLifecycleObserverImpl, (ShortNewsContentCardView) null, 15));
        }
        this.write = null;
        this.read = null;
        this.MediaBrowserCompatMediaItem = 1;
        return FlowKt.emitAll(flowCollector2, flowRemoteActionCompatParcelizer, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
