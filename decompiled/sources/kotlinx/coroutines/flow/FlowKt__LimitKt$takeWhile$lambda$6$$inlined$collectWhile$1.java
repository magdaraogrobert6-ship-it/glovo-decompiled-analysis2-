package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ FlowCollector IconCompatParcelizer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int IconCompatParcelizer;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public Object serializer;
        public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(FlowCollector flowCollector) {
        this.IconCompatParcelizer = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj2 = anonymousClass1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.IconCompatParcelizer;
        boolean z = true;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            anonymousClass1.write = this;
            anonymousClass1.serializer = obj;
            anonymousClass1.IconCompatParcelizer = 1;
            throw null;
        }
        if (i2 == 1) {
            Object obj3 = anonymousClass1.serializer;
            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = anonymousClass1.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            if (((Boolean) obj2).booleanValue()) {
                FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.IconCompatParcelizer;
                anonymousClass1.write = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
                anonymousClass1.serializer = null;
                anonymousClass1.IconCompatParcelizer = 2;
                if (flowCollector.emit(obj3, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
            } else {
                z = false;
            }
            if (z) {
                return createFromParcel.INSTANCE;
            }
            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
        }
        if (i2 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2 = anonymousClass1.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$2;
        if (z) {
            return createFromParcel.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
    }
}
