package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.logUnregisterActivitylambda1;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ logUnregisterActivitylambda1 $channel;
    final /* synthetic */ WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, logUnregisterActivitylambda1 logunregisteractivitylambda1, Context context, ShortNewsContentCardView<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = logunregisteractivitylambda1;
        this.$applicationContext = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, shortNewsContentCardView);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:7:0x0014, B:16:0x0043, B:20:0x0053, B:22:0x005b, B:12:0x0028, B:15:0x003d), top: B:30:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r4.emit(r5, r8) == r0) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L19
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r1 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L80
        L17:
            r9 = r4
            goto L43
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            r9 = 0
            return r9
        L20:
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r1 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L80
            goto L53
        L2c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            android.content.ContentResolver r1 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r5 = r8.$contentObserver
            r6 = 0
            r1.registerContentObserver(r4, r6, r5)
            o.logUnregisterActivitylambda1 r1 = r8.$channel     // Catch: java.lang.Throwable -> L80
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r1 = r1.MediaSessionCompatToken()     // Catch: java.lang.Throwable -> L80
        L43:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L80
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L80
            r8.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r4 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L80
            if (r4 != r0) goto L50
            goto L75
        L50:
            r7 = r4
            r4 = r9
            r9 = r7
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L80
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto L76
            r1.write()     // Catch: java.lang.Throwable -> L80
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L80
            float r9 = androidx.compose.ui.platform.WindowRecomposer_androidKt.access$readAnimationScale(r9)     // Catch: java.lang.Throwable -> L80
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L80
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L80
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L80
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L80
            r8.label = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L80
            if (r9 != r0) goto L17
        L75:
            return r0
        L76:
            android.content.ContentResolver r9 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r8.$contentObserver
            r9.unregisterContentObserver(r0)
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        L80:
            r9 = move-exception
            android.content.ContentResolver r0 = r8.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r8.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(FlowCollector<? super Float> flowCollector, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(flowCollector, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
