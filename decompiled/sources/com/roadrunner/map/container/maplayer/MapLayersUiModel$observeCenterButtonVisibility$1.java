package com.roadrunner.map.container.maplayer;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.dh;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class MapLayersUiModel$observeCenterButtonVisibility$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ dh RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapLayersUiModel$observeCenterButtonVisibility$1(dh dhVar, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = dhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        dh dhVar = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            return new MapLayersUiModel$observeCenterButtonVisibility$1(dhVar, shortNewsContentCardView, 1);
        }
        MapLayersUiModel$observeCenterButtonVisibility$1 mapLayersUiModel$observeCenterButtonVisibility$1 = new MapLayersUiModel$observeCenterButtonVisibility$1(dhVar, shortNewsContentCardView, 0);
        int i5 = serializer + 51;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mapLayersUiModel$observeCenterButtonVisibility$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return ((com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = ((com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer + 109;
        com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 12
            int r3 = r3 / 0
            if (r1 == 0) goto L3b
            goto L27
        L1d:
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L3b
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1 r5 = (com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer
            int r6 = r6 + 109
            int r1 = r6 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer = r1
            int r6 = r6 % r0
            return r5
        L3b:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1 r5 = (com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r7 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r1 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer + 107;
        r6 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r7 != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r6 = r6 + 99;
        com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if ((r6 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
        r9 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
        r9 = r6.IconCompatParcelizer.serializer();
        r0 = new o.e3(r6, 1);
        r8.read = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r9.collect(r0, r8) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r7 = r8.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r7 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
        r9 = r6.ComponentActivity.read;
        r2 = new o.e3(r6, 0);
        r8.read = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r9.collect(r2, r8) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        r9 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer + 99;
        com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if ((r9 % 2) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r9 = 60 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        o.DrawableTransformation.read();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        r7 = r8.read;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1d
            int r1 = r8.write
            o.dh r6 = r8.RemoteActionCompatParcelizer
            r7 = 44
            int r7 = r7 / r3
            if (r1 == 0) goto L6c
            goto L23
        L1d:
            int r1 = r8.write
            o.dh r6 = r8.RemoteActionCompatParcelizer
            if (r1 == 0) goto L6c
        L23:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r7 = r8.read
            if (r7 == 0) goto L51
            int r1 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer
            int r1 = r1 + 107
            int r6 = r1 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L37
            if (r7 != 0) goto L4d
            goto L39
        L37:
            if (r7 != r5) goto L4d
        L39:
            int r6 = r6 + 99
            int r1 = r6 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L49
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r9 = 35
            int r9 = r9 / r3
            goto L69
        L49:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L69
        L4d:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
            goto L6b
        L51:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl r9 = r6.IconCompatParcelizer
            kotlinx.coroutines.flow.Flow r9 = r9.serializer()
            o.e3 r0 = new o.e3
            r0.<init>(r6, r5)
            r8.read = r5
            java.lang.Object r9 = r9.collect(r0, r8)
            if (r9 != r1) goto L69
            r4 = r1
            goto L6b
        L69:
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
        L6b:
            return r4
        L6c:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r7 = r8.read
            if (r7 == 0) goto L7c
            if (r7 == r5) goto L78
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r2)
            goto La3
        L78:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto La0
        L7c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.E r9 = r6.ComponentActivity
            kotlinx.coroutines.flow.StateFlow r9 = r9.read
            o.e3 r2 = new o.e3
            r2.<init>(r6, r3)
            r8.read = r5
            java.lang.Object r9 = r9.collect(r2, r8)
            if (r9 != r1) goto La0
            int r9 = com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.serializer
            int r9 = r9 + 99
            int r2 = r9 % 128
            com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.IconCompatParcelizer = r2
            int r9 = r9 % r0
            if (r9 == 0) goto L9e
            r9 = 60
            int r9 = r9 / r3
        L9e:
            r4 = r1
            goto La3
        La0:
            o.DrawableTransformation.read()
        La3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.container.maplayer.MapLayersUiModel$observeCenterButtonVisibility$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
