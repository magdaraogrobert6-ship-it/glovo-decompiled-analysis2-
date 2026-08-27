package o;

import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SingleThreadCachedScheduler implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ ZoomableNode IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ SingleThreadCachedScheduler(ZoomableNode zoomableNode, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = zoomableNode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r4.getCoroutineScope(), null, null, new kotlinx.coroutines.rx2.RxConvertKt$asFlow$1(r4, (androidx.compose.ui.geometry.Offset) r7, (o.ShortNewsContentCardView) null, 12), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r7 = (androidx.compose.ui.geometry.Offset) r7;
        r1 = r4.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r1.invoke(r7);
        r7 = o.SingleThreadCachedScheduler.write + 53;
        o.SingleThreadCachedScheduler.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.SingleThreadCachedScheduler.RemoteActionCompatParcelizer
            int r1 = r1 + 49
            int r2 = r1 % 128
            o.SingleThreadCachedScheduler.write = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1c
            int r1 = r6.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode r4 = r6.IconCompatParcelizer
            int r5 = r2 / 0
            if (r1 == 0) goto L4c
            if (r1 == r2) goto L39
            goto L26
        L1c:
            int r1 = r6.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode r4 = r6.IconCompatParcelizer
            if (r1 == 0) goto L4c
            if (r1 == r2) goto L39
        L26:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            o.getContentViewGroupParentLayout r0 = r4.getCoroutineScope()
            kotlinx.coroutines.rx2.RxConvertKt$asFlow$1 r1 = new kotlinx.coroutines.rx2.RxConvertKt$asFlow$1
            r2 = 12
            r5 = 0
            r1.<init>(r4, r7, r5, r2)
            r7 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r0, r5, r5, r1, r7)
            return r3
        L39:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r1 = r4.RemoteActionCompatParcelizer
            if (r1 == 0) goto L4b
            r1.invoke(r7)
            int r7 = o.SingleThreadCachedScheduler.write
            int r7 = r7 + 53
            int r1 = r7 % 128
            o.SingleThreadCachedScheduler.RemoteActionCompatParcelizer = r1
            int r7 = r7 % r0
        L4b:
            return r3
        L4c:
            androidx.compose.ui.graphics.GraphicsLayerScope r7 = (androidx.compose.ui.graphics.GraphicsLayerScope) r7
            r7.getClass()
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r0 = r4.MediaDescriptionCompat
            float r0 = r0.RemoteActionCompatParcelizer()
            r7.setScaleX(r0)
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r0 = r4.MediaDescriptionCompat
            float r0 = r0.RemoteActionCompatParcelizer()
            r7.setScaleY(r0)
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r0 = r4.MediaDescriptionCompat
            androidx.compose.animation.core.Animatable r0 = r0.serializer
            java.lang.Object r0 = r0.write()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r7.setTranslationX(r0)
            com.roadrunner.rrds.compose.component.image.zoomable.ZoomState r0 = r4.MediaDescriptionCompat
            androidx.compose.animation.core.Animatable r0 = r0.RemoteActionCompatParcelizer
            java.lang.Object r0 = r0.write()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r7.setTranslationY(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SingleThreadCachedScheduler.invoke(java.lang.Object):java.lang.Object");
    }
}
