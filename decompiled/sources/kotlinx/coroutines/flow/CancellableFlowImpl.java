package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
final class CancellableFlowImpl<T> implements CancellableFlow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;

        public AnonymousClass2(FlowCollector flowCollector) {
            this.RemoteActionCompatParcelizer = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (shortNewsContentCardView instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) shortNewsContentCardView;
                int i = cancellableFlowImpl$collect$2$emit$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.serializer = i - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, shortNewsContentCardView);
                }
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, shortNewsContentCardView);
            }
            Object obj2 = cancellableFlowImpl$collect$2$emit$1.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = cancellableFlowImpl$collect$2$emit$1.serializer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                JobKt.RemoteActionCompatParcelizer(cancellableFlowImpl$collect$2$emit$1.getContext());
                cancellableFlowImpl$collect$2$emit$1.serializer = 1;
                if (this.RemoteActionCompatParcelizer.emit(obj, cancellableFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        new AnonymousClass2(flowCollector);
        throw null;
    }
}
