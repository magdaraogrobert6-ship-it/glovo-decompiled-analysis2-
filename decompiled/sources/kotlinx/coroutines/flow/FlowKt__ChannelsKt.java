package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #0 {all -> 0x008b, blocks: (B:13:0x002f, B:22:0x0051, B:26:0x0066, B:28:0x006e, B:18:0x0043, B:21:0x004d), top: B:41:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r7, o.onBackCancelledlambda3 r8, boolean r9, o.ShortNewsContentCardView r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.IconCompatParcelizer = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.MediaSessionCompatQueueItem
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L35
            boolean r9 = r0.write
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r7 = r0.read
            o.onBackCancelledlambda3 r8 = r0.serializer
            kotlinx.coroutines.flow.FlowCollector r2 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L8b
        L32:
            r10 = r7
            r7 = r2
            goto L51
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r3
        L3b:
            boolean r9 = r0.write
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r7 = r0.read
            o.onBackCancelledlambda3 r8 = r0.serializer
            kotlinx.coroutines.flow.FlowCollector r2 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)     // Catch: java.lang.Throwable -> L8b
            goto L66
        L47:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            kotlinx.coroutines.flow.FlowKt.IconCompatParcelizer(r7)
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r10 = r8.MediaSessionCompatToken()     // Catch: java.lang.Throwable -> L8b
        L51:
            r0.RemoteActionCompatParcelizer = r7     // Catch: java.lang.Throwable -> L8b
            r0.serializer = r8     // Catch: java.lang.Throwable -> L8b
            r0.read = r10     // Catch: java.lang.Throwable -> L8b
            r0.write = r9     // Catch: java.lang.Throwable -> L8b
            r0.IconCompatParcelizer = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L8b
            if (r2 != r1) goto L62
            goto L82
        L62:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8b
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L83
            java.lang.Object r10 = r7.write()     // Catch: java.lang.Throwable -> L8b
            r0.RemoteActionCompatParcelizer = r2     // Catch: java.lang.Throwable -> L8b
            r0.serializer = r8     // Catch: java.lang.Throwable -> L8b
            r0.read = r7     // Catch: java.lang.Throwable -> L8b
            r0.write = r9     // Catch: java.lang.Throwable -> L8b
            r0.IconCompatParcelizer = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r1) goto L32
        L82:
            return r1
        L83:
            if (r9 == 0) goto L88
            r8.write(r3)
        L88:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        L8b:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto L93
            o.setNativeShader.IconCompatParcelizer(r8, r7)
        L93:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector, o.onBackCancelledlambda3, boolean, o.ShortNewsContentCardView):java.lang.Object");
    }
}
