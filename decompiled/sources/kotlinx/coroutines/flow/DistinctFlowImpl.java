package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class DistinctFlowImpl<T> implements Flow<T> {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final Flow serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector serializer;
        public final /* synthetic */ createInAppMessageEventSubscriber write;

        public AnonymousClass2(createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
            this.write = createinappmessageeventsubscriber;
            this.serializer = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (shortNewsContentCardView instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) shortNewsContentCardView;
                int i = distinctFlowImpl$collect$2$emit$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, shortNewsContentCardView);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, shortNewsContentCardView);
            }
            Object obj2 = distinctFlowImpl$collect$2$emit$1.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = distinctFlowImpl$collect$2$emit$1.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            DistinctFlowImpl distinctFlowImpl = DistinctFlowImpl.this;
            Object objInvoke = distinctFlowImpl.read.invoke(obj);
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.write;
            Object obj3 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj3 == NullSurrogateKt.RemoteActionCompatParcelizer || !((Boolean) distinctFlowImpl.IconCompatParcelizer.invoke(obj3, objInvoke)).booleanValue()) {
                createinappmessageeventsubscriber.IconCompatParcelizer = objInvoke;
                distinctFlowImpl$collect$2$emit$1.RemoteActionCompatParcelizer = 1;
                if (this.serializer.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = NullSurrogateKt.RemoteActionCompatParcelizer;
        Object objCollect = this.serializer.collect(new AnonymousClass2(createinappmessageeventsubscriber, flowCollector), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public DistinctFlowImpl(Flow flow, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.serializer = flow;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
