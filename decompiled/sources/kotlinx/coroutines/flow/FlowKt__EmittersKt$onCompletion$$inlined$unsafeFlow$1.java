package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY IconCompatParcelizer;
    public final /* synthetic */ Flow serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowCollector IconCompatParcelizer;
        public Object RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public int serializer;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(Flow flow, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.serializer = flow;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        ThrowingCollector throwingCollector;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        SafeCollector safeCollector;
        Throwable th;
        SafeCollector safeCollector2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.serializer = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                Flow flow = this.serializer;
                anonymousClass1.RemoteActionCompatParcelizer = this;
                anonymousClass1.IconCompatParcelizer = flowCollector;
                anonymousClass1.serializer = 1;
                if (flow.collect(flowCollector, anonymousClass1) != coroutineSingletons) {
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                    safeCollector = new SafeCollector(flowCollector, anonymousClass1.getContext());
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.IconCompatParcelizer;
                    anonymousClass1.RemoteActionCompatParcelizer = safeCollector;
                    anonymousClass1.IconCompatParcelizer = null;
                    anonymousClass1.serializer = 3;
                    if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return createFromParcel.INSTANCE;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                throwingCollector = new ThrowingCollector(th);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.IconCompatParcelizer;
                anonymousClass1.RemoteActionCompatParcelizer = th;
                anonymousClass1.IconCompatParcelizer = null;
                anonymousClass1.serializer = 2;
                if (FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(throwingCollector, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, th, anonymousClass1) == coroutineSingletons) {
                    throw th;
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Throwable th3 = (Throwable) anonymousClass1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw th3;
            }
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector2 = (SafeCollector) anonymousClass1.RemoteActionCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                safeCollector2.releaseIntercepted();
                return createFromParcel.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        }
        flowCollector = anonymousClass1.IconCompatParcelizer;
        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.RemoteActionCompatParcelizer;
        try {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            safeCollector = new SafeCollector(flowCollector, anonymousClass1.getContext());
            try {
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.IconCompatParcelizer;
                anonymousClass1.RemoteActionCompatParcelizer = safeCollector;
                anonymousClass1.IconCompatParcelizer = null;
                anonymousClass1.serializer = 3;
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
                    safeCollector2 = safeCollector;
                    safeCollector2.releaseIntercepted();
                    return createFromParcel.INSTANCE;
                }
            } catch (Throwable th5) {
                th = th5;
                safeCollector2 = safeCollector;
                safeCollector2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            throwingCollector = new ThrowingCollector(th);
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.IconCompatParcelizer;
            anonymousClass1.RemoteActionCompatParcelizer = th;
            anonymousClass1.IconCompatParcelizer = null;
            anonymousClass1.serializer = 2;
            if (FlowKt__EmittersKt.access$invokeSafely$FlowKt__EmittersKt(throwingCollector, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, th, anonymousClass1) == coroutineSingletons) {
                throw th;
            }
        }
        return coroutineSingletons;
    }
}
