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
final class FlowKt__ReduceKt$single$1<T> extends ContinuationImpl {
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public createInAppMessageEventSubscriber write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        int i = (this.RemoteActionCompatParcelizer | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (i == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = symbol;
            this.write = createinappmessageeventsubscriberM3979m;
            this.RemoteActionCompatParcelizer = 1;
            throw null;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj2 != symbol) {
            return obj2;
        }
        DrawableTransformation.write("Flow is empty");
        return null;
    }
}
