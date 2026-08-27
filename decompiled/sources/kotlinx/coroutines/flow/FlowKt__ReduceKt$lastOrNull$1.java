package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ReduceKt$lastOrNull$1<T> extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        int i = (this.write | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.write = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            this.read = c8$$ExternalSyntheticOutline0.m3979m(obj);
            this.write = 1;
            throw null;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return createinappmessageeventsubscriber.IconCompatParcelizer;
    }
}
