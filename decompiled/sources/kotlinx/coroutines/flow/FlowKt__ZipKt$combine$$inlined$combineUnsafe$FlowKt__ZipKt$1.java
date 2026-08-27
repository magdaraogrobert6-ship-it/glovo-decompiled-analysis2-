package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 implements Flow<Object> {
    public final /* synthetic */ Flow[] RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
        public int IconCompatParcelizer;
        public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
        public final /* synthetic */ r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds serializer;
        public /* synthetic */ Object[] write;

        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((ShortNewsContentCardView) obj3, this.serializer);
            anonymousClass2.RemoteActionCompatParcelizer = (FlowCollector) obj;
            anonymousClass2.write = (Object[]) obj2;
            return anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.IconCompatParcelizer
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L43
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
                return r2
            L17:
                kotlinx.coroutines.flow.FlowCollector r1 = r7.RemoteActionCompatParcelizer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                goto L38
            L1d:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
                kotlinx.coroutines.flow.FlowCollector r1 = r7.RemoteActionCompatParcelizer
                java.lang.Object[] r8 = r7.write
                r5 = 0
                r5 = r8[r5]
                r6 = r8[r4]
                r8 = r8[r3]
                r7.RemoteActionCompatParcelizer = r1
                r7.IconCompatParcelizer = r4
                o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r4 = r7.serializer
                java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                if (r8 != r0) goto L38
                goto L42
            L38:
                r7.RemoteActionCompatParcelizer = r2
                r7.IconCompatParcelizer = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L43
            L42:
                return r0
            L43:
                o.createFromParcel r8 = o.createFromParcel.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
            super(3, shortNewsContentCardView);
            this.serializer = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(Flow[] flowArr, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        this.RemoteActionCompatParcelizer = flowArr;
        this.write = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, FlowKt__ZipKt$nullArrayFactory$1.write, new AnonymousClass2(null, this.write), flowCollector, this.RemoteActionCompatParcelizer);
        return objCombineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objCombineInternal : createFromParcel.INSTANCE;
    }
}
