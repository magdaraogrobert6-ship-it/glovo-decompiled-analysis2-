package com.mapbox.maps.coroutine;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
public final class MapboxMapExtKt$cameraChangedEvents$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ MapboxMap $this_cameraChangedEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$cameraChangedEvents$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4716invoke() {
            ((Cancelable) this.MediaMetadataCompat).cancel();
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4716invoke();
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(Object obj) {
            super(0, 0, Cancelable.class, obj, "cancel", "cancel()V");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        MapboxMapExtKt$cameraChangedEvents$1 mapboxMapExtKt$cameraChangedEvents$1 = new MapboxMapExtKt$cameraChangedEvents$1(this.$this_cameraChangedEvents, shortNewsContentCardView);
        mapboxMapExtKt$cameraChangedEvents$1.L$0 = obj;
        return mapboxMapExtKt$cameraChangedEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.L$0;
            NativeObserver nativeObserver$maps_sdk_release = this.$this_cameraChangedEvents.getNativeObserver$maps_sdk_release();
            MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0 mapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0 = new MapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1);
            ProducerCoroutine producerCoroutine = (ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
            producerCoroutine.getClass();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(NativeObserver.subscribeCameraChanged$default(nativeObserver$maps_sdk_release, mapboxMapExtKt$genericEvents$1$$ExternalSyntheticLambda0, new MapboxMapExtKt$cameraChangedEvents$1$cancelable$2(producerCoroutine), null, 4, null));
            this.label = 1;
            if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapExtKt$cameraChangedEvents$1(MapboxMap mapboxMap, ShortNewsContentCardView<? super MapboxMapExtKt$cameraChangedEvents$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$this_cameraChangedEvents = mapboxMap;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((MapboxMapExtKt$cameraChangedEvents$1) create(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
