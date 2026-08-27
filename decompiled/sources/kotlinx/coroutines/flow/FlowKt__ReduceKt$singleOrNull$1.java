package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public createInAppMessageEventSubscriber serializer;
    public FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 write;

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        AbortFlowException e;
        Object obj2;
        this.IconCompatParcelizer = obj;
        int i = (this.read | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.read = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0 = this.write;
            createinappmessageeventsubscriber = this.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.write == r0) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(getContext());
            }
            obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj2 == symbol) {
                return null;
            }
            return obj2;
        }
        final createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
        createinappmessageeventsubscriberM3979m.IconCompatParcelizer = symbol;
        r0 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj3, ShortNewsContentCardView shortNewsContentCardView) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = createinappmessageeventsubscriberM3979m;
                Object obj4 = createinappmessageeventsubscriber2.IconCompatParcelizer;
                Symbol symbol2 = NullSurrogateKt.RemoteActionCompatParcelizer;
                if (obj4 == symbol2) {
                    createinappmessageeventsubscriber2.IconCompatParcelizer = obj3;
                    return createFromParcel.INSTANCE;
                }
                createinappmessageeventsubscriber2.IconCompatParcelizer = symbol2;
                throw new AbortFlowException(this);
            }
        };
        try {
            this.serializer = createinappmessageeventsubscriberM3979m;
            this.write = r0;
            this.read = 1;
            throw null;
        } catch (AbortFlowException e3) {
            createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            e = e3;
        }
        if (e.write == r0) {
            throw e;
        }
        JobKt.RemoteActionCompatParcelizer(getContext());
        obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj2 == symbol) {
            return null;
        }
        return obj2;
    }
}
