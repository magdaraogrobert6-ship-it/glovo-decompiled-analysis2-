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
public final class FlowKt__LogicKt$any$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ cancelPendingWebViewPause IconCompatParcelizer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LogicKt$any$$inlined$collectWhile$1 RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public int write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            FlowKt__LogicKt$any$$inlined$collectWhile$1.this.emit(null, this);
            return createFromParcel.INSTANCE;
        }
    }

    public FlowKt__LogicKt$any$$inlined$collectWhile$1(cancelPendingWebViewPause cancelpendingwebviewpause) {
        this.IconCompatParcelizer = cancelpendingwebviewpause;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.write = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj2 = anonymousClass1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            anonymousClass1.RemoteActionCompatParcelizer = this;
            anonymousClass1.write = 1;
            throw null;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        FlowKt__LogicKt$any$$inlined$collectWhile$1 flowKt__LogicKt$any$$inlined$collectWhile$1 = anonymousClass1.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (zBooleanValue) {
            flowKt__LogicKt$any$$inlined$collectWhile$1.IconCompatParcelizer.IconCompatParcelizer = true;
        }
        if (zBooleanValue) {
            throw new AbortFlowException(flowKt__LogicKt$any$$inlined$collectWhile$1);
        }
        return createFromParcel.INSTANCE;
    }
}
