package com.roadrunner.rrds.compose.component.image.zoomable;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getSessionParameters;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.scheduleFutureWithReturn;

/* JADX INFO: loaded from: classes3.dex */
public final class DetectZoomableGesturesKt$detectZoomableGestures$4 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public final /* synthetic */ StringsKt__StringsKt$$ExternalSyntheticLambda1 IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public final /* synthetic */ scheduleFutureWithReturn MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public final /* synthetic */ scheduleFutureWithReturn MediaSessionCompatQueueItem;
    public int PlaybackStateCompat;
    public /* synthetic */ Object RatingCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ getSessionParameters read;
    public final /* synthetic */ SlotTreeKt$$ExternalSyntheticLambda0 serializer;
    public final /* synthetic */ getSessionParameters write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectZoomableGesturesKt$detectZoomableGestures$4(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getSessionParameters getsessionparameters, scheduleFutureWithReturn schedulefuturewithreturn, getSessionParameters getsessionparameters2, StringsKt__StringsKt$$ExternalSyntheticLambda1 stringsKt__StringsKt$$ExternalSyntheticLambda1, SlotTreeKt$$ExternalSyntheticLambda0 slotTreeKt$$ExternalSyntheticLambda0, scheduleFutureWithReturn schedulefuturewithreturn2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.read = getsessionparameters;
        this.MediaDescriptionCompat = schedulefuturewithreturn;
        this.write = getsessionparameters2;
        this.IconCompatParcelizer = stringsKt__StringsKt$$ExternalSyntheticLambda1;
        this.serializer = slotTreeKt$$ExternalSyntheticLambda0;
        this.MediaSessionCompatQueueItem = schedulefuturewithreturn2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 37;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            objInvokeSuspend = ((DetectZoomableGesturesKt$detectZoomableGestures$4) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 83 / 0;
        } else {
            objInvokeSuspend = ((DetectZoomableGesturesKt$detectZoomableGestures$4) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = MediaSessionCompatToken + 51;
        MediaSessionCompatResultReceiverWrapper = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        DetectZoomableGesturesKt$detectZoomableGestures$4 detectZoomableGesturesKt$detectZoomableGestures$4 = new DetectZoomableGesturesKt$detectZoomableGestures$4(this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, this.read, this.MediaDescriptionCompat, this.write, this.IconCompatParcelizer, this.serializer, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
        detectZoomableGesturesKt$detectZoomableGestures$4.RatingCompat = obj;
        int i2 = MediaSessionCompatToken + 27;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return detectZoomableGesturesKt$detectZoomableGestures$4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.access$detectGesture(r2, r11.write, r11.read, r11.IconCompatParcelizer, r11.serializer, r11.MediaMetadataCompat, r11.RemoteActionCompatParcelizer, r11.MediaBrowserCompatMediaItem, r11) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Object r1 = r11.RatingCompat
            r2 = r1
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r11.PlaybackStateCompat
            r4 = 1
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L2b
            if (r3 == r4) goto L27
            if (r3 != r0) goto L21
            int r1 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4.MediaSessionCompatToken
            int r1 = r1 + r5
            int r2 = r1 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4.MediaSessionCompatResultReceiverWrapper = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L7e
        L21:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r6
        L27:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L39
        L2b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r11.RatingCompat = r2
            r11.PlaybackStateCompat = r4
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.IconCompatParcelizer(r2, r6, r11, r0)
            if (r12 != r1) goto L39
            goto L7d
        L39:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r11.MediaMetadataCompat
            if (r3 != 0) goto L5c
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r11.RemoteActionCompatParcelizer
            if (r3 != 0) goto L5c
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r3 = r11.MediaBrowserCompatMediaItem
            if (r3 == 0) goto L54
            int r3 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4.MediaSessionCompatToken
            int r3 = r3 + 121
            int r4 = r3 % 128
            com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4.MediaSessionCompatResultReceiverWrapper = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L5c
            int r5 = r5 / r5
            goto L5c
        L54:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5f
        L5c:
            r12.consume()
        L5f:
            o.scheduleFutureWithReturn r12 = r11.MediaDescriptionCompat
            r12.invoke()
            r11.RatingCompat = r6
            r11.PlaybackStateCompat = r0
            o.getSessionParameters r3 = r11.write
            o.getSessionParameters r4 = r11.read
            kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1 r5 = r11.IconCompatParcelizer
            androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0 r6 = r11.serializer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r7 = r11.MediaMetadataCompat
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8 = r11.RemoteActionCompatParcelizer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r9 = r11.MediaBrowserCompatMediaItem
            r10 = r11
            java.lang.Object r12 = com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt.access$detectGesture(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r1) goto L7e
        L7d:
            return r1
        L7e:
            o.scheduleFutureWithReturn r12 = r11.MediaSessionCompatQueueItem
            r12.invoke()
            o.createFromParcel r12 = o.createFromParcel.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
