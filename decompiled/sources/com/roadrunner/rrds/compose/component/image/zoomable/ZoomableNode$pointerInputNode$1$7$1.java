package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ZoomableNode$pointerInputNode$1$7$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ ZoomableNode MediaDescriptionCompat;
    public final /* synthetic */ Offset RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ Offset write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableNode$pointerInputNode$1$7$1(ZoomableNode zoomableNode, Offset offset, float f, Offset offset2, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaDescriptionCompat = zoomableNode;
        this.RemoteActionCompatParcelizer = offset;
        this.serializer = f;
        this.write = offset2;
        this.read = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ZoomableNode$pointerInputNode$1$7$1 zoomableNode$pointerInputNode$1$7$1 = new ZoomableNode$pointerInputNode$1$7$1(this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 41;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return zoomableNode$pointerInputNode$1$7$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((ZoomableNode$pointerInputNode$1$7$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaSessionCompatQueueItem + 39;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            int i3 = RatingCompat + 77;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ZoomState zoomState = this.MediaDescriptionCompat.MediaDescriptionCompat;
        long jM487unboximpl = this.RemoteActionCompatParcelizer.m487unboximpl();
        long jM487unboximpl2 = this.write.m487unboximpl();
        this.IconCompatParcelizer = 1;
        zoomState.getClass();
        Object objCoroutineScope = YieldKt.coroutineScope(new ZoomState$applyGesture$2(zoomState, this.serializer, jM487unboximpl2, jM487unboximpl, this.read, null), this);
        if (objCoroutineScope != coroutineSingletons) {
            int i5 = RatingCompat + 27;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            objCoroutineScope = createfromparcel;
        }
        if (objCoroutineScope != coroutineSingletons) {
            return createfromparcel;
        }
        int i7 = MediaSessionCompatQueueItem + 89;
        RatingCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 56 / 0;
        }
        return coroutineSingletons;
    }
}
