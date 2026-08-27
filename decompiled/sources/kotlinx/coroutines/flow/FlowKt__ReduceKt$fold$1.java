package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public createInAppMessageEventSubscriber write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        int i = (this.IconCompatParcelizer | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.IconCompatParcelizer = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = null;
            this.write = createinappmessageeventsubscriberM3979m;
            this.IconCompatParcelizer = 1;
            throw null;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createinappmessageeventsubscriber.IconCompatParcelizer;
    }
}
