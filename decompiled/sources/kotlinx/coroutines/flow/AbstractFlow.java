package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractFlow<T> implements Flow<T>, CancellableFlow<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.AbstractFlow$collect$1, reason: invalid class name */
    final class AnonymousClass1 extends ContinuationImpl {
        public SafeCollector RemoteActionCompatParcelizer;
        public int read;
        public /* synthetic */ Object write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return AbstractFlow.this.collect(null, this);
        }
    }

    public abstract Object collectSafely(SafeCollector safeCollector, ShortNewsContentCardView shortNewsContentCardView);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
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
        Object obj = anonymousClass1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.read;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = anonymousClass1.RemoteActionCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                safeCollector.releaseIntercepted();
                return createFromParcel.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        SafeCollector safeCollector2 = new SafeCollector(flowCollector, anonymousClass1.getContext());
        try {
            anonymousClass1.RemoteActionCompatParcelizer = safeCollector2;
            anonymousClass1.read = 1;
            if (collectSafely(safeCollector2, anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return createFromParcel.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th;
        }
    }
}
