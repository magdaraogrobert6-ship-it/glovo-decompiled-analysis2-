package o;

import com.deliveryhero.performance.core.calculator.PerformanceClassCalculatorImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class transparentCopyui_graphics extends ContinuationImpl {
    public PerformanceClassCalculatorImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public Object serializer;
    public final /* synthetic */ PerformanceClassCalculatorImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public transparentCopyui_graphics(PerformanceClassCalculatorImpl performanceClassCalculatorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = performanceClassCalculatorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.write.load(this);
    }
}
