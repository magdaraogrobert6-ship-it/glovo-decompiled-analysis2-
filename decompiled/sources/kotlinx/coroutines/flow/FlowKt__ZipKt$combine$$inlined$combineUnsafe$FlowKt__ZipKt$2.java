package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 implements Flow<Object> {
    public final /* synthetic */ Flow[] IconCompatParcelizer;
    public final /* synthetic */ r8lambdagdus9EWsajL31FKA79xR2Pb0c4E serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ r8lambdagdus9EWsajL31FKA79xR2Pb0c4E read;
        public /* synthetic */ FlowCollector serializer;
        public /* synthetic */ Object[] write;

        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((ShortNewsContentCardView) obj3, this.read);
            anonymousClass2.serializer = (FlowCollector) obj;
            anonymousClass2.write = (Object[]) obj2;
            return anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.RemoteActionCompatParcelizer
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
                goto L47
            L11:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r13)
                return r2
            L17:
                kotlinx.coroutines.flow.FlowCollector r1 = r12.serializer
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
                goto L3c
            L1d:
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r13)
                kotlinx.coroutines.flow.FlowCollector r1 = r12.serializer
                java.lang.Object[] r13 = r12.write
                r5 = 0
                r7 = r13[r5]
                r8 = r13[r4]
                r9 = r13[r3]
                r5 = 3
                r10 = r13[r5]
                r12.serializer = r1
                r12.RemoteActionCompatParcelizer = r4
                o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r6 = r12.read
                r11 = r12
                java.lang.Object r13 = r6.serializer(r7, r8, r9, r10, r11)
                if (r13 != r0) goto L3c
                goto L46
            L3c:
                r12.serializer = r2
                r12.RemoteActionCompatParcelizer = r3
                java.lang.Object r13 = r1.emit(r13, r12)
                if (r13 != r0) goto L47
            L46:
                return r0
            L47:
                o.createFromParcel r13 = o.createFromParcel.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShortNewsContentCardView shortNewsContentCardView, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e) {
            super(3, shortNewsContentCardView);
            this.read = r8lambdagdus9ewsajl31fka79xr2pb0c4e;
        }
    }

    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(Flow[] flowArr, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e) {
        this.IconCompatParcelizer = flowArr;
        this.serializer = r8lambdagdus9ewsajl31fka79xr2pb0c4e;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCombineInternal = CombineKt.combineInternal(shortNewsContentCardView, FlowKt__ZipKt$nullArrayFactory$1.write, new AnonymousClass2(null, this.serializer), flowCollector, this.IconCompatParcelizer);
        return objCombineInternal == CoroutineSingletons.COROUTINE_SUSPENDED ? objCombineInternal : createFromParcel.INSTANCE;
    }
}
