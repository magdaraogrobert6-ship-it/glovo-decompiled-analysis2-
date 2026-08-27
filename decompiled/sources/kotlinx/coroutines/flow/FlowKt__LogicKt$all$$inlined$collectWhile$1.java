package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__LogicKt$all$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ cancelPendingWebViewPause read;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LogicKt$all$$inlined$collectWhile$1 RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public int serializer;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            FlowKt__LogicKt$all$$inlined$collectWhile$1.this.emit(null, this);
            return createFromParcel.INSTANCE;
        }
    }

    public FlowKt__LogicKt$all$$inlined$collectWhile$1(cancelPendingWebViewPause cancelpendingwebviewpause) {
        this.read = cancelpendingwebviewpause;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
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
        Object obj2 = anonymousClass1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            anonymousClass1.RemoteActionCompatParcelizer = this;
            anonymousClass1.serializer = 1;
            throw null;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        FlowKt__LogicKt$all$$inlined$collectWhile$1 flowKt__LogicKt$all$$inlined$collectWhile$1 = anonymousClass1.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (!zBooleanValue) {
            flowKt__LogicKt$all$$inlined$collectWhile$1.read.IconCompatParcelizer = true;
        }
        if (zBooleanValue) {
            return createFromParcel.INSTANCE;
        }
        throw new AbortFlowException(flowKt__LogicKt$all$$inlined$collectWhile$1);
    }
}
