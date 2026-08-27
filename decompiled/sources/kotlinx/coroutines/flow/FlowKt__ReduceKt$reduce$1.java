package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {
    public createInAppMessageEventSubscriber IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        int i = (this.read | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.read = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (i == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = symbol;
            this.IconCompatParcelizer = createinappmessageeventsubscriberM3979m;
            this.read = 1;
            throw null;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj2 != symbol) {
            return obj2;
        }
        DrawableTransformation.write("Empty flow can't be reduced");
        return null;
    }
}
