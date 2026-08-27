package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__MergeKt$flatMapConcat$$inlined$map$1 implements Flow<Flow<Object>> {
    public final /* synthetic */ Flow IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 read;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
        public final /* synthetic */ FlowCollector write;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int read;
            public FlowCollector serializer;
            public /* synthetic */ Object write;

            public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
                super(shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.write = obj;
                this.read |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            this.write = flowCollector;
            this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        
            if (r8.emit(r9, r0) == r1) goto L22;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, o.ShortNewsContentCardView r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.read
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 + r2
                r0.read = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.write
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.read
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L37
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                goto L57
            L2b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
                return r3
            L31:
                kotlinx.coroutines.flow.FlowCollector r8 = r0.serializer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                goto L4c
            L37:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
                kotlinx.coroutines.flow.FlowCollector r9 = r7.write
                r0.serializer = r9
                r0.read = r5
                o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r2 = r7.serializer
                java.lang.Object r8 = r2.invoke(r8, r0)
                if (r8 != r1) goto L49
                goto L56
            L49:
                r6 = r9
                r9 = r8
                r8 = r6
            L4c:
                r0.serializer = r3
                r0.read = r4
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L57
            L56:
                return r1
            L57:
                o.createFromParcel r8 = o.createFromParcel.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = ((AbstractFlow) this.IconCompatParcelizer).collect(new AnonymousClass2(flowCollector, this.read), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__MergeKt$flatMapConcat$$inlined$map$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        this.IconCompatParcelizer = flow;
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
