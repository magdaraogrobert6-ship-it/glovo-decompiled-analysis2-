package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object IconCompatParcelizer;
        public int read;
        public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 serializer;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
            return createFromParcel.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        AbortFlowException e;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.read = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.read;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = anonymousClass1.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.write == flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(anonymousClass1.getContext());
            }
            return createFromParcel.INSTANCE;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(flowCollector);
        try {
            anonymousClass1.serializer = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
            anonymousClass1.read = 1;
            throw null;
        } catch (AbortFlowException e3) {
            e = e3;
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
        }
        if (e.write == flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
            throw e;
        }
        JobKt.RemoteActionCompatParcelizer(anonymousClass1.getContext());
        return createFromParcel.INSTANCE;
    }
}
