package kotlinx.coroutines.flow.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.logUnregisterActivitylambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public int IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public logUnregisterActivitylambda1 MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public /* synthetic */ Object MediaSessionCompatQueueItem;
        public byte[] RatingCompat;
        public final /* synthetic */ Flow[] RemoteActionCompatParcelizer;
        public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
        public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
        public final /* synthetic */ FlowCollector write;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            public final /* synthetic */ BufferedChannel IconCompatParcelizer;
            public final /* synthetic */ AtomicInteger RemoteActionCompatParcelizer;
            public int read;
            public final /* synthetic */ int serializer;
            public final /* synthetic */ Flow[] write;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C00321<T> implements FlowCollector {
                public final /* synthetic */ BufferedChannel IconCompatParcelizer;
                public final /* synthetic */ int read;

                public C00321(BufferedChannel bufferedChannel, int i) {
                    this.IconCompatParcelizer = bufferedChannel;
                    this.read = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (kotlinx.coroutines.YieldKt.yield(r0) == r1) goto L21;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, o.ShortNewsContentCardView r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L13
                        r0 = r7
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.write
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 + r2
                        r0.write = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r5, r7)
                    L18:
                        java.lang.Object r7 = r0.IconCompatParcelizer
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.write
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L35
                        if (r2 == r4) goto L31
                        if (r2 != r3) goto L2a
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        goto L53
                    L2a:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
                        r6 = 0
                        return r6
                    L31:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        goto L4a
                    L35:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        int r7 = r5.read
                        o.isItemViewSwipeEnabled r2 = new o.isItemViewSwipeEnabled
                        r2.<init>(r7, r6)
                        r0.write = r4
                        kotlinx.coroutines.channels.BufferedChannel r6 = r5.IconCompatParcelizer
                        java.lang.Object r6 = r6.serializer(r2, r0)
                        if (r6 != r1) goto L4a
                        goto L52
                    L4a:
                        r0.write = r3
                        java.lang.Object r6 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r6 != r1) goto L53
                    L52:
                        return r1
                    L53:
                        o.createFromParcel r6 = o.createFromParcel.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1.C00321.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Flow[] flowArr, int i, AtomicInteger atomicInteger, BufferedChannel bufferedChannel, ShortNewsContentCardView shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.write = flowArr;
                this.serializer = i;
                this.RemoteActionCompatParcelizer = atomicInteger;
                this.IconCompatParcelizer = bufferedChannel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                return new AnonymousClass1(this.write, this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.read;
                AtomicInteger atomicInteger = this.RemoteActionCompatParcelizer;
                BufferedChannel bufferedChannel = this.IconCompatParcelizer;
                try {
                    if (i == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        Flow[] flowArr = this.write;
                        int i2 = this.serializer;
                        Flow flow = flowArr[i2];
                        C00321 c00321 = new C00321(bufferedChannel, i2);
                        this.read = 1;
                        if (flow.collect(c00321, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        bufferedChannel.IconCompatParcelizer((Throwable) null);
                    }
                    return createFromParcel.INSTANCE;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        bufferedChannel.IconCompatParcelizer((Throwable) null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, FlowCollector flowCollector, Flow[] flowArr) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = flowArr;
            this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            this.write = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(shortNewsContentCardView, this.read, this.serializer, this.write, this.RemoteActionCompatParcelizer);
            anonymousClass2.MediaSessionCompatQueueItem = obj;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:33:0x00bc A[DONT_INVERT, EDGE_INSN: B:33:0x00bc->B:19:0x007d BREAK  A[LOOP:0: B:26:0x009d->B:44:?]] */
        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00df  */
        /* JADX WARN: Code duplicated, block: B:43:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:26:0x009d->B:44:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.channels.BufferedChannel] */
        /* JADX WARN: Type inference failed for: r10v2, types: [o.logUnregisterActivitylambda1, o.onBackCancelledlambda3] */
        /* JADX WARN: Type inference failed for: r10v3, types: [o.logUnregisterActivitylambda1, o.onBackCancelledlambda3] */
        /* JADX WARN: Type inference failed for: r10v5, types: [o.logUnregisterActivitylambda1] */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00dc -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x00cc
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object combineInternal(ShortNewsContentCardView shortNewsContentCardView, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, FlowCollector flowCollector, Flow[] flowArr) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, flowCollector, flowArr);
        FlowCoroutine flowCoroutine = new FlowCoroutine(shortNewsContentCardView, shortNewsContentCardView.getContext());
        Object objStartUndspatched = MathKt.startUndspatched(flowCoroutine, true, flowCoroutine, anonymousClass2);
        return objStartUndspatched == CoroutineSingletons.COROUTINE_SUSPENDED ? objStartUndspatched : createFromParcel.INSTANCE;
    }
}
