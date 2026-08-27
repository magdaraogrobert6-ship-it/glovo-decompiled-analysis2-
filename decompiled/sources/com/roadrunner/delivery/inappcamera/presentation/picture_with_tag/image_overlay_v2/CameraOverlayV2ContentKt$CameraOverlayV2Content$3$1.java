package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ ScrollState IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1(ScrollState scrollState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = scrollState;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        ScrollState scrollState = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1(scrollState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 0);
        }
        CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1 cameraOverlayV2ContentKt$CameraOverlayV2Content$3$1 = new CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1(scrollState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 1);
        int i5 = RemoteActionCompatParcelizer + 97;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return cameraOverlayV2ContentKt$CameraOverlayV2Content$3$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            ((CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = serializer + 11;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r5.RatingCompat.IconCompatParcelizer() == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r5.RatingCompat.IconCompatParcelizer() == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r8 = com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.serializer + 33;
        com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.RemoteActionCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if ((r8 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.RemoteActionCompatParcelizer
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L1e
            int r1 = r7.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r4 = r7.write
            androidx.compose.foundation.ScrollState r5 = r7.IconCompatParcelizer
            r6 = 16
            int r6 = r6 / 0
            if (r1 == 0) goto L3a
            goto L28
        L1e:
            int r1 = r7.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r4 = r7.write
            androidx.compose.foundation.ScrollState r5 = r7.IconCompatParcelizer
            if (r1 == 0) goto L3a
        L28:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            androidx.compose.foundation.gestures.DefaultScrollableState r8 = r5.RatingCompat
            boolean r8 = r8.IconCompatParcelizer()
            if (r8 == r2) goto L36
            goto L39
        L36:
            r4.invoke()
        L39:
            return r3
        L3a:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            androidx.compose.foundation.gestures.DefaultScrollableState r8 = r5.RatingCompat
            boolean r8 = r8.IconCompatParcelizer()
            if (r8 == r2) goto L48
            goto L56
        L48:
            int r8 = com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.serializer
            int r8 = r8 + 33
            int r1 = r8 % 128
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.RemoteActionCompatParcelizer = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L57
            r4.invoke()
        L56:
            return r3
        L57:
            r4.invoke()
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
