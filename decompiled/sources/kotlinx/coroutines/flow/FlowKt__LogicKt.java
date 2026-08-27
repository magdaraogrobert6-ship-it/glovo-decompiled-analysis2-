package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;

/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class FlowKt__LogicKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$1, reason: invalid class name */
    final class AnonymousClass1<T> extends ContinuationImpl {
        public FlowKt__LogicKt$any$$inlined$collectWhile$1 RemoteActionCompatParcelizer;
        public /* synthetic */ Object read;
        public cancelPendingWebViewPause serializer;
        public int write;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return FlowKt__LogicKt.any(this);
        }

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object any(ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LogicKt$any$$inlined$collectWhile$1 flowKt__LogicKt$any$$inlined$collectWhile$1;
        cancelPendingWebViewPause cancelpendingwebviewpause;
        AbortFlowException e;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i = anonymousClass1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.write = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object obj = anonymousClass1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.write;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LogicKt$any$$inlined$collectWhile$1 = anonymousClass1.RemoteActionCompatParcelizer;
            cancelpendingwebviewpause = anonymousClass1.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.write == flowKt__LogicKt$any$$inlined$collectWhile$1) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(anonymousClass1.getContext());
            }
            return Boolean.valueOf(cancelpendingwebviewpause.IconCompatParcelizer);
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
        flowKt__LogicKt$any$$inlined$collectWhile$1 = new FlowKt__LogicKt$any$$inlined$collectWhile$1(cancelpendingwebviewpause2);
        try {
            anonymousClass1.serializer = cancelpendingwebviewpause2;
            anonymousClass1.RemoteActionCompatParcelizer = flowKt__LogicKt$any$$inlined$collectWhile$1;
            anonymousClass1.write = 1;
            throw null;
        } catch (AbortFlowException e3) {
            cancelpendingwebviewpause = cancelpendingwebviewpause2;
            e = e3;
        }
        if (e.write == flowKt__LogicKt$any$$inlined$collectWhile$1) {
            throw e;
        }
        JobKt.RemoteActionCompatParcelizer(anonymousClass1.getContext());
        return Boolean.valueOf(cancelpendingwebviewpause.IconCompatParcelizer);
    }
}
