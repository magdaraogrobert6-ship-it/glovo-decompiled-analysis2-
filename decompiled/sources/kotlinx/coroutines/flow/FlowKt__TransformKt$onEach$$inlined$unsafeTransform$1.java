package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements Flow<Object> {
    public final /* synthetic */ Flow RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector serializer;
        public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int RemoteActionCompatParcelizer;
            public FlowCollector read;
            public Object serializer;
            public /* synthetic */ Object write;

            public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
                super(shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.write = obj;
                this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            this.serializer = flowCollector;
            this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            if (r7.emit(r2, r0) == r1) goto L22;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, o.ShortNewsContentCardView r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.RemoteActionCompatParcelizer
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.RemoteActionCompatParcelizer = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.write
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.RemoteActionCompatParcelizer
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L5c
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
                return r5
            L31:
                kotlinx.coroutines.flow.FlowCollector r7 = r0.read
                java.lang.Object r2 = r0.serializer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L4f
            L39:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                r0.serializer = r7
                kotlinx.coroutines.flow.FlowCollector r8 = r6.serializer
                r0.read = r8
                r0.RemoteActionCompatParcelizer = r4
                o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r2 = r6.write
                java.lang.Object r2 = r2.invoke(r7, r0)
                if (r2 != r1) goto L4d
                goto L5b
            L4d:
                r2 = r7
                r7 = r8
            L4f:
                r0.serializer = r5
                r0.read = r5
                r0.RemoteActionCompatParcelizer = r3
                java.lang.Object r7 = r7.emit(r2, r0)
                if (r7 != r1) goto L5c
            L5b:
                return r1
            L5c:
                o.createFromParcel r7 = o.createFromParcel.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.RemoteActionCompatParcelizer.collect(new AnonymousClass2(flowCollector, this.write), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        this.RemoteActionCompatParcelizer = flow;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
