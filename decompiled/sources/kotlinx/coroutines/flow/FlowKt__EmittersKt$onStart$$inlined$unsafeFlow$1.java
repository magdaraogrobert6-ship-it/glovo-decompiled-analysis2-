package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import o.ShortNewsContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int IconCompatParcelizer;
        public FlowCollector RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 serializer;
        public SafeCollector write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = flow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r8.collect(r2, r0) == r1) goto L27;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r8, o.ShortNewsContentCardView r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.IconCompatParcelizer = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L72
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L31:
            kotlinx.coroutines.flow.internal.SafeCollector r8 = r0.write
            kotlinx.coroutines.flow.FlowCollector r2 = r0.RemoteActionCompatParcelizer
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r4 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L3b
            goto L5e
        L3b:
            r9 = move-exception
            goto L78
        L3d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            o.TextAnnouncementContentCardView r9 = r0.getContext()
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            r2.<init>(r8, r9)
            o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r9 = r7.read     // Catch: java.lang.Throwable -> L75
            r0.serializer = r7     // Catch: java.lang.Throwable -> L75
            r0.RemoteActionCompatParcelizer = r8     // Catch: java.lang.Throwable -> L75
            r0.write = r2     // Catch: java.lang.Throwable -> L75
            r0.IconCompatParcelizer = r4     // Catch: java.lang.Throwable -> L75
            java.lang.Object r9 = r9.invoke(r2, r0)     // Catch: java.lang.Throwable -> L75
            if (r9 != r1) goto L5a
            goto L71
        L5a:
            r4 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L5e:
            r8.releaseIntercepted()
            kotlinx.coroutines.flow.Flow r8 = r4.IconCompatParcelizer
            r0.serializer = r5
            r0.RemoteActionCompatParcelizer = r5
            r0.write = r5
            r0.IconCompatParcelizer = r3
            java.lang.Object r8 = r8.collect(r2, r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        L75:
            r8 = move-exception
            r9 = r8
            r8 = r2
        L78:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
