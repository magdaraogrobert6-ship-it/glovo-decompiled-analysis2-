package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 implements Flow<Object> {
    public final /* synthetic */ r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM IconCompatParcelizer;
    public final /* synthetic */ Flow[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
        public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
        public final /* synthetic */ r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM read;
        public /* synthetic */ Object[] serializer;
        public int write;

        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((ShortNewsContentCardView) obj3, this.read);
            anonymousClass2.RemoteActionCompatParcelizer = (FlowCollector) obj;
            anonymousClass2.serializer = (Object[]) obj2;
            return anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r1.emit(r14, r13) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r13.write
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
                goto L4a
            L11:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r14)
                return r2
            L17:
                kotlinx.coroutines.flow.FlowCollector r1 = r13.RemoteActionCompatParcelizer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
                goto L3f
            L1d:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r14)
                kotlinx.coroutines.flow.FlowCollector r1 = r13.RemoteActionCompatParcelizer
                java.lang.Object[] r14 = r13.serializer
                r5 = 0
                r7 = r14[r5]
                r8 = r14[r4]
                r9 = r14[r3]
                r5 = 3
                r10 = r14[r5]
                r5 = 4
                r11 = r14[r5]
                r13.RemoteActionCompatParcelizer = r1
                r13.write = r4
                o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r6 = r13.read
                r12 = r13
                java.lang.Object r14 = r6.read(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L3f
                goto L49
            L3f:
                r13.RemoteActionCompatParcelizer = r2
                r13.write = r3
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto L4a
            L49:
                return r0
            L4a:
                o.createFromParcel r14 = o.createFromParcel.INSTANCE
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim) {
            super(3, shortNewsContentCardView);
            this.read = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim;
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(Flow[] flowArr, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim) {
        this.RemoteActionCompatParcelizer = flowArr;
        this.IconCompatParcelizer = r8lambdahlfuu54mfvlmnthbk7uy9j3wgim;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, FlowKt__ZipKt$nullArrayFactory$1.write, new AnonymousClass2(null, this.IconCompatParcelizer), flowCollector, this.RemoteActionCompatParcelizer);
        return objCombineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objCombineInternal : createFromParcel.INSTANCE;
    }
}
